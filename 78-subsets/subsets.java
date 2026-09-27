class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        int index =0;
        solve(nums, index, subset, result);
        return result;
    

        
    }
    public void solve(int[]nums, int index,List<Integer> subset,List<List<Integer>> result  ){
        if(index==nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        //left
        solve(nums, index+1, subset, result);



        //right
        subset.add(nums[index]);      
        solve (nums, index+1,subset,result);

        subset.remove(subset.size() - 1); 


    }
}