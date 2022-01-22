public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(0,"madam"));
    }

    public static boolean palindrome(int l, String name) {
        if(l>=name.length()/2) return true;
        if(name.charAt(l)!=name.charAt(name.length()-l-1)) {
            return false;
        }
        return palindrome(l+1, name);
    }
}
