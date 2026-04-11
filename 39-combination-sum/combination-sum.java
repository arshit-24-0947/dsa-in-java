class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sidechick = new ArrayList<>();
        int index=0;
        solve(index,candidates, sidechick , result , target);
        return result;


        
    }
    void solve (int index,int []candidates,List<Integer> sidechick ,List<List<Integer>> result ,int target){
        int sum =0;
        for (int i =0;i<sidechick.size();i++){
            sum= sum+sidechick.get(i);
        }
        
        if (sum == target){
            result.add(new ArrayList<>(sidechick));
            return;
            
        }
        if (sum > target || index == candidates.length){
            return;
        } 
        // take it 
        sidechick.add(candidates[index]);
        solve(index,candidates, sidechick , result , target);
        // backtrack 
        sidechick.remove(sidechick.size()-1);
        
        // take another 
        solve(index+1,candidates, sidechick , result , target);
    }
}