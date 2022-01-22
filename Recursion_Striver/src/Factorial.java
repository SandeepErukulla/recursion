public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialFunctionalRecursion(5));
        factorialParametrisedRecursion(1,5);
    }
    private static int factorialFunctionalRecursion(int n) {
        if(n<2) return 1;
        return n*factorialFunctionalRecursion(n-1);
    }
    private static void factorialParametrisedRecursion(int result, int n) {
        if(n<2) {
            System.out.println(result);
            return;
        }
        factorialParametrisedRecursion(result*n, n-1);
    }
}
