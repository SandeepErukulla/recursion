import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//problem link: https://leetcode.com/problems/combination-sum-ii/
//YouTube link: https://youtu.be/G1fRTGRxXU8

public class CombinationsumII {

    public static void main(String[] args) {
        int[] arr=new int[] {10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>> ans = combinationSum2(arr,target);
        for(List<Integer> i: ans) {
                System.out.print(i+" ");
        }

    }

    /*    Time complexity: O(2^n * k)
    Space Complexity:  K*X
    k -> average length
     x -> no. of combinations*/

    public static List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        findCombinations(0,arr,target,ans,new ArrayList<>());
        return ans;
    }

    public static void findCombinations(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(target==0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i=index;i<arr.length;i++) {
            if(i>index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            ds.add(arr[i]);
            findCombinations(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }

    }
}
