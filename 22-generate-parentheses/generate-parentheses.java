class Solution {
    public List<String> generateParenthesis(int n) {
        int left =n;
        int right =n;
        ArrayList <String> result = new ArrayList<>();
        String str="";
        gen(left , right ,result , str,n);
        return result ;
        
    }
    public void gen(int left, int right, ArrayList <String> result, String str,int n){
        if (str.length()==2*n){
            result.add(str);
            return;

        }
        if (left>0) {
            gen(left-1, right, result, str+'(',n);
        }
        if (right>left){
            gen(left, right-1, result, str+')',n);

        }
    }              
}