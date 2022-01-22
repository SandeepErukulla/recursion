public class printNto1 {

    public static void main(String[] args) {
        print(10);
    }
    private static void print(int n) {
        if(n==0) return;
        System.out.println(n);
        n--;
        print(n);
    }

}
