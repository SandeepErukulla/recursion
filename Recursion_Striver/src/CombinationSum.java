import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] arr = new int[] {2,3,6,7};
        List<Integer> list = new ArrayList<>();
        combinationSumK(0,arr,7,0,list);
    }

    public static void combinationSumK(int index, int[] arr, int k, int sum, List<Integer> list) {
        if(index==arr.length) {
            if(sum==k) {
                for(int i: list) System.out.print(i+" ");
                System.out.println(" ");
            }
            return;
        }
        if(sum<=k) {
            sum+=arr[index];
            list.add(arr[index]);
            combinationSumK(index, arr,k,sum,list);
            sum-=arr[index];
            list.remove(list.size()-1);
        }

        combinationSumK(index+1, arr,k,sum,list);
    }
}
