/*
    14. Longest Common Prefix
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".

    Example 1:
    Input: ["flower","flow","flight"]
    Output: "fl"

    Example 2:
    Input: ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
*/


class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)    
            return "";
        String res = strs[0];
        for(int i=1; i<strs.length; i++){
            while(!strs[i].startsWith(res))
                res = res.substring(0,res.length()-1);
        }
        return res;
    }
}


public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println("harry".substring(0, 1));
        System.out.println("harry".substring(0, 2));
        System.out.println("harry".substring(0, 0)); // return ""
    }
}

// //Very brave answer lol -> Runtime: 6 ms, faster than 5.85%; Memory Usage: 38.7 MB, less than 60.92%
// class Solution {
//     public String findInPair(String str1, String str2) {
//         int len1 = str1.length(), len2 = str2.length(), len;
//         if(len1 < len2)
//             len = len1;
//         else
//             len = len2;
//         String res = "";
//         for(int i=0; i<len; i++) {
//             if(str1.charAt(i) == str2.charAt(i))
//                 res += str1.charAt(i);
//             else
//                 break;
//         }
//         return res;
//     }
    
//     public String longestCommonPrefix(String[] strs) {
//         if(strs.length == 0)
//             return "";
//         else if(strs.length == 1)
//             return strs[0];
//         String[] res = new String[strs.length-1];
//         res[0] = this.findInPair(strs[0], strs[1]);
//         int shortest = 0;
//         for(int i=1; i<strs.length-1; i++) {
//             res[i] = this.findInPair(strs[i], strs[i+1]);
//             if(res[i] == "")
//                 return "";
//             else if(res[i].length() < res[shortest].length())
//                 shortest = i;
//         }
//         return res[shortest];
//     }
// }