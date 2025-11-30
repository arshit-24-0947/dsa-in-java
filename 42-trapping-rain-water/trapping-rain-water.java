class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        // 1) find index of global maximum
        int max = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[max]) max = i;
        }

        int water = 0;

        // 2) scan from left up to max
        int i = 0;
        while (i < max) {
            int j = i + 1;
            // find next j where height[j] >= height[i], but don't pass max
            while (j <= max && height[j] < height[i]) j++;
            if (j > max) j = max; // safety / clamp

            int width = j - i - 1;
            if (width > 0) {
                int boundaryHeight = Math.min(height[i], height[j]);
                int boxes = 0;
                for (int k = i + 1; k < j; k++) boxes += height[k];
                water += boundaryHeight * width - boxes;
            }
            i = j; // move to next boundary
        }

        // 3) scan from right down to max
        i = height.length - 1;
        while (i > max) {
            int j = i - 1;
            // find next j where height[j] >= height[i], but don't go below max
            while (j >= max && height[j] < height[i]) j--;
            if (j < max) j = max; // clamp

            int width = i - j - 1;
            if (width > 0) {
                int boundaryHeight = Math.min(height[i], height[j]);
                int boxes = 0;
                for (int k = j + 1; k < i; k++) boxes += height[k];
                water += boundaryHeight * width - boxes;
            }
            i = j; // move to next boundary from right
        }

        return water;
    }
}
