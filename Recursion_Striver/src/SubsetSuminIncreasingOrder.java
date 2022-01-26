import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Problem link: https://practice.geeksforgeeks.org/problems/subset-sums2234/1
//YouTube link: https://youtu.be/rYkfBRtMJr8

public class SubsetSuminIncreasingOrder {

/*     Time Complexity: O(2^n + 2^nlog(2^n)
    Space Complexity: O(2^n)*/

    public static void main(String[] args) {
        int[] arr = new int[]{5,2,1};
        List<Integer> list = new ArrayList<>();
        sum(0,arr,0,list);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void sum(int index, int[] arr,int sum, List<Integer> list) {
        if(index==arr.length) {
                list.add(sum);
                return;
        }

        sum(index+1,arr,sum+arr[index], list);
        sum(index+1,arr,sum, list);
    }
}
