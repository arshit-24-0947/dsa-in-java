// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int [] ans = new int[2];
        
//         for (int i =0;i<nums.length-1;i++){
//             for (int j=i+1;j<nums.length;j++){
//                 if (nums[i]+nums[j]==target){
//                     ans[0]= i;
//                     ans[1]= j;
//                     break;
//                 }
//             }

//         }
//         return ans;
        
//     }
// }
// class Solution {
//     public int[] twoSum(int[] nums, int target) {

//         for (int i = 0; i < nums.length - 1; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[]{i, j};
//                 }
//             }
//         }

//         return new int[]{};
//     }
// }
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}