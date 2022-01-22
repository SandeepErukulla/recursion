public class PrintNto1UsingBackTracking {
    public static void main(String[] args) {
        print(1,10);
    }
    private static void print(int i,int n) {
        if(i>n) return;
        print(i+1,n);
        System.out.println(i);
    }
}
