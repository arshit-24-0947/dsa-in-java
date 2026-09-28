// class Solution {
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         List<Integer> combination = new ArrayList<>();
//         List<List<Integer>> result = new ArrayList<>();

//         solve();
        
//     }
//     public void solve(){
//         sum =0;
//         for (int i : combination){
//             sum = sum+i; 
//         }
//         if (sum >= target){
//             if (sum == taget){
//                 result.add(new ArrayList<>(combination));
//             }
//             return;
//         }

//         for (int i : candidates ){
//             combination.add(i)
//             solve(index)
//             // backtrack 
//             combination.remove(combination.size()-1);


//         }


//     }
// }
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        solve(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    public void solve(int[] candidates, int target, int start,
                      List<Integer> combination, List<List<Integer>> result) {
        int sum = 0;
        for (int x : combination) {
            sum += x;
        }

        if (sum >= target) {
            if (sum == target) {
                result.add(new ArrayList<>(combination));
            }
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            combination.add(candidates[i]);                 // CHOOSE
            solve(candidates, target, i, combination, result);   // EXPLORE (i → reuse allowed)
            combination.remove(combination.size() - 1);     // UN-CHOOSE
        }
    }
}