import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSequences {
    public static void main(String[] args) {
        int[] arr= new int[] {3,1,2};
        List<Integer> list= new ArrayList<>();
        printAllSubsequences(0,arr,list);
    }
    //Time Complexity: O(2^n * n)
    // Space Complexity: O(N)
    public static void printAllSubsequences(int index, int[] arr, List<Integer> list) {
        if(index==arr.length) {
            if(list.size()==0) System.out.println("{}");
            for(int i: list) System.out.print(i+" ");
            System.out.println(" ");
            return;
        }
        list.add(arr[index]);
        printAllSubsequences(index+1, arr, list);
        list.remove(list.size()-1);
        printAllSubsequences(index+1, arr, list);
    }

}
