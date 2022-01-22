public class print1toN {
    public static void main(String[] args) {
        print(1,10);
    }

    private static void print(int count, int n) {
        if(n<count) return;
        System.out.println(count);
        count++;
        print(count, n);
    }
}
