class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList <String> str = new ArrayList <>();
        solve ("",0,0,n,str);
        return str;
  
        
    }
    void solve (String curr , int open , int close , int n , List<String> str){
        if (curr.length()==2*n){
            str.add(curr);
            return ;

        } 
        if (open<n){
            solve (curr+"(",open+1, close,n,str);

        }
        if (open> close ){
            solve (curr+")", open, close+1,n,str);

        }
    }

}