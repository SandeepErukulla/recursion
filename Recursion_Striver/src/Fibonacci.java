public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
    //Time Complexity: O(2^n)
    public static int fibonacci(int n) {
        if(n<=1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
