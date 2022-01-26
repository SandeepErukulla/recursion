public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        reverseArray(0,arr.length-1, arr);
        for(int i: arr) {
            System.out.println(i);
        }
        reverseArray2(0, arr);
        for(int i: arr) {
            System.out.println(i);
        }
    }
    private static void reverseArray(int l, int r, int[] arr) {
        if(l>=r) return;
        int temp=arr[l];
        arr[l] = arr[r];
        arr[r]=temp;
        reverseArray(l+1,r-1,arr);
    }

    //Time Complexity: O(N/2)
    //internal stack space: O(N/2)
    private static void reverseArray2(int l, int[] arr) {
        if(l>=arr.length/2) return;
        int temp=arr[l];
        arr[l] = arr[arr.length-l-1];
        arr[arr.length-l-1]=temp;
        reverseArray2(l+1,arr);
    }
}
