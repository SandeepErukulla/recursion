public class PrintName5Times {

    public static void main(String[] args) {
        print(1,"sandeep");
    }

    public static void print(int count, String name) {
        if (count>5) {
            return;
        }
        count++;
        System.out.println(name);
        print(count,name);
    }
}
