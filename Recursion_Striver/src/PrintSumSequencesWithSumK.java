import java.util.ArrayList;
import java.util.List;

public class PrintSumSequencesWithSumK {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,1};
        List<Integer> list=new ArrayList<>();
        OneSequencesumK(0,0,arr,2,list);
    }

    public static void sumK(int index, int sum, int[] arr, int k, List<Integer> list) {
        if(index==arr.length) {
            if(sum==k) {
                for(int i: list) System.out.print(i+" ");
                System.out.println(" ");
            }
            return;
        }
        list.add(arr[index]);
        sum+=arr[index];
        sumK(index+1,sum,arr,k,list);
        list.remove(list.size()-1);
        sum-=arr[index];
        sumK(index+1,sum,arr,k,list);
    }

    public static boolean OneSequencesumK(int index, int sum, int[] arr, int k, List<Integer> list) {
        if(index==arr.length) {
            if(sum==k) {
                for(int i: list) System.out.print(i+" ");
                System.out.println(" ");
                return true;
            }
            return false;
        }
        list.add(arr[index]);
        sum+=arr[index];
        if(OneSequencesumK(index+1,sum,arr,k,list)==true) return true;
        list.remove(list.size()-1);
        sum-=arr[index];
        if(OneSequencesumK(index+1,sum,arr,k,list)==true) return true;
        return false;
    }

}
