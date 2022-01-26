import java.util.*;

// Problem link: https://leetcode.com/problems/subsets-ii/
//YouTube link: https://youtu.be/RIn3gOkbhQE

public class SubSetSumII {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,2};
        System.out.println(subsetsWithDupUsingRecursion(nums));
        System.out.println(subsetsWithDupUsingPowerSet(nums));
    }

    public static List<List<Integer>> subsetsWithDupUsingPowerSet(int[] nums) {
        int n=nums.length;
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i=0;i<(1 << n);i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<n;j++) {
                if((i & (1<<j))!=0) {
                    list.add(nums[j]);
                }
            }
            Collections.sort(list);
            set.add(list);
        }
        List<List<Integer>> res = new ArrayList<>(set);
        return res;

    }

    public static List<List<Integer>> subsetsWithDupUsingRecursion(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        findnumsUsingRecursion(0,nums,ansList, new ArrayList<>());
        return ansList;

    }

/*    Time Complexity: O(2^n * n)
        Space COmplexity: O(2^n) * O(k) */

    public static void findnumsUsingRecursion(int index, int[] nums,List<List<Integer>> ansList, List<Integer> ds ) {
        ansList.add(new ArrayList<>(ds));
        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i - 1]) continue;
            ds.add(nums[i]);
            findnumsUsingRecursion(i + 1, nums, ansList, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
