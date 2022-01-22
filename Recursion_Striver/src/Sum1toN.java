public class Sum1toN {
    public static void main(String[] args) {
        printParameterisedRecursion(0,4);
        System.out.println(printFunctionalRecursion(10));
    }
    private static void printParameterisedRecursion(int sum,int n) {
        if(n<1) {
            System.out.println(sum);
            return;
        }
        sum+=n;
        printParameterisedRecursion(sum,n-1);
    }

    private static int printFunctionalRecursion(int n) {
        if(n<1) {
            return n;
        }
        return n+printFunctionalRecursion(n-1);
    }
}
