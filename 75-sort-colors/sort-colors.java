class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int right = n-1;
        int left = 0;
        int mid = 0;

        for(int i =0;i<n;i++){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                left++;
                
                mid++;

            }else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
               
                right--;
                
            }
            else{
                mid++;
            }
        }


        


        
    }
}