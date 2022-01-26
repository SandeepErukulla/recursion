import java.util.*;
//Problem link: https://leetcode.com/problems/palindrome-partitioning/
//Youtube link: https://youtu.be/WBgsABoClE0
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(0,s,path,res);
        return res;

    }
    void func(int index,String s, List<String> path, List<List<String>> res) {
        if(index==s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<s.length();i++) {
            if(isPalindrome(s,index,i)) {
                path.add(s.substring(index,i+1));
                func(i+1,s,path,res);
                path.remove(path.size()-1);
            }
        }

    }
    boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) return false;
        }
        return true;
    }
}
