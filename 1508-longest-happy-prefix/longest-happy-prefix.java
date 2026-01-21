// class Solution {

//     public String longestPrefix(String s) {

//         // making prefix
//         ArrayList<String> arr1 = new ArrayList<>();

//         for (int i = 0; i < 1; i++) {
//             String str = "";

//             for (int j = 0; j < s.length() - 1; j++) {
//                 str = s.substring(0, j + 1);
//                 arr1.add(str);
//             }
//         }

//         // making suffix
//         ArrayList<String> arr2 = new ArrayList<>();

//         for (int i = 0; i < 1; i++) {
//             String str = "";
//             int k = s.length() - 1;

//             for (int j = 0; j < s.length() - 1; j++) {
//                 str = s.substring(k, s.length());
//                 arr2.add(str);
//                 k--;
//             }
//         }

//         // finding biggest common element
//         Collections.reverse(arr1);

//         for (int i = 0; i < arr1.size(); i++) {
//             if (arr2.contains(arr1.get(i))) {
//                 return arr1.get(i);
//             }
//         }

//         return "";
//     }
// }
// class Solution {
//     public String longestPrefix(String s) {
//         int n = s.length();

//         for (int len = n - 1; len > 0; len--) {
//             if (s.substring(0, len).equals(s.substring(n - len, n))) {
//                 return s.substring(0, len);
//             }
//         }
//         return "";
//     }
// }
class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = new int[n];

        int len = 0;
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                lps[i] = ++len;
                i++;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }

        return s.substring(0, lps[n - 1]);
    }
}
