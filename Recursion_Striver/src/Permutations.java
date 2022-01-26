import java.util.ArrayList;
import java.util.List;

/*
Problem link: https://leetcode.com/problems/permutations/
YouTube link: https://youtu.be/YK78FU5Ffjw
YouTube link: https://youtu.be/f2ic2Rsc9pU
*/

public class Permutations {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3};
        List<List<Integer>> ansList = new ArrayList<>();
        permutation(nums, new boolean[nums.length],new ArrayList<>(), ansList);
        System.out.println(ansList);
        ansList.clear();
        permutationApproach2(0,nums,ansList);
        System.out.println(ansList);
    }
    // Time complexity: O(n! * n)
    // Space complexity: O(n) + O(n)
    public static void permutation(int[] nums, boolean[] map, List<Integer> ds, List<List<Integer>> ansList) {
        if(ds.size()==nums.length) {
            ansList.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++) {
            if(!map[i]) {
                ds.add(nums[i]);
                map[i]=true;
                permutation(nums,map,ds,ansList);
                ds.remove(ds.size()-1);
                map[i]=false;
            }
        }
    }
    // Time complexity: O(n! * n)
    // Space complexity: O(n)
    public static void permutationApproach2(int index, int[] nums, List<List<Integer>> ansList) {
        if(index==nums.length) {
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++) {
                ds.add(nums[i]);
            }
            ansList.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index;i<nums.length;i++) {
            swap(i,index,nums);
            permutationApproach2(index+1,nums,ansList);
            swap(i,index,nums);
        }
    }

    public static void swap(int i, int j, int[] nums) {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
