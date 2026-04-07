class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> arr= new ArrayList<>();
        solve(nums ,arr, result ,0);
        return result;
    }
    
    void solve (int[]nums , List<Integer>arr,List<List<Integer>>result ,int index){
        if(index==nums.length){
            result.add(new ArrayList<>(arr));
            return;
        }
        // take it 
        arr.add(nums[index]);
        solve(nums,arr,result,index+1);
        // backtrack 
        arr.remove(arr.size()-1);
        // dont take it 
        solve(nums,arr,result,index+1);
        
    }
        

    
    
}
