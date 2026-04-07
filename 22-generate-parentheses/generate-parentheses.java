class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList <String> arr = new ArrayList <>();
        solve (n, "", arr,0,0);
        return arr;
             
    }
    void solve (int n, String str,List <String> arr ,int open ,int close){
        if (str.length()==2*n){
            arr.add(str);
            return;
        }
        if (open<n){
            solve(n,str+"(",arr,open+1,close);
        }
        if(close<open){
            solve(n,str+")",arr,open,close+1);

        }
    }
}