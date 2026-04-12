class Solution {
    public List<List<Integer>> combinationSum3(int reach, int sum) {
        List<Integer> sidechick = new ArrayList<>();
        List<List<Integer>> mainchick = new ArrayList<>();


        solve(1,sum,reach,sidechick, mainchick);
        return mainchick;
        
    }
    void solve (int start, int sum,int reach,List<Integer> sidechick , List<List<Integer>> mainchick){
        
        if (reach==sidechick.size()){
            int plus =0;
            for(int i=0;i<sidechick.size();i++){
                plus= plus+ sidechick.get(i);
                
            }
            if (plus== sum){
                mainchick.add(new ArrayList <>(sidechick));

            }
            
            return;
        }
        if (start>9){return;}
        // add 
        sidechick.add(start);
        solve(start+1,sum,reach,sidechick,mainchick);

        // backtrack 
        sidechick.remove(sidechick.size()-1);

        //add another 
        solve(start+1,sum,reach,sidechick,mainchick);



    }
}