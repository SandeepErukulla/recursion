import java.util.ArrayList;
import java.util.List;

public class CountSubSequencesWithSumK {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,1};
        System.out.println(countSequencesumK(0,0,arr,2));
    }
//Time Complexity - O(2^n)
    public static int countSequencesumK(int index, int sum, int[] arr, int k) {
        if(index==arr.length) {
            if(sum==k) {
                return 1;
            }
            return 0;
        }
        sum+=arr[index];
        int l = countSequencesumK(index+1,sum,arr,k);
        sum-=arr[index];
        int r = countSequencesumK(index+1,sum,arr,k);
        return l+r;
    }
}
