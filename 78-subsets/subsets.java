class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solve(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void solve(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // base case 
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // NOT TAKE
        solve(index + 1, nums, current, result);

        // TAKE
        current.add(nums[index]);
        solve(index + 1, nums, current, result);
        current.remove(current.size() - 1); 
    }
}
