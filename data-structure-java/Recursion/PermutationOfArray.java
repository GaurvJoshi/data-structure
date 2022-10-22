package Recursion;
import java.util.*;

public class PermutationOfArray {
    public static void permutate(List<Integer> arr, int[] flag, int[] nums) {
        if (arr.size() == nums.length) {
            System.out.print(arr);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (flag[i] == 1) {
                continue;
            }
            arr.add(nums[i]);
            flag[i] = 1;
            permutate(arr, flag, nums);
            arr.remove(arr.size() - 1);
            flag[i] = 0;
        }
    }

    public static void swap(int[] nums, int ind1, int ind2) {
        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;
    }

    public static void swappermutate(int[] nums, int ind) {
        if (ind == nums.length) {
            for (int i = 0; i < ind; i++) {
                System.out.print(nums[i]);
            }
            System.out.println('\n');
            return;
        }
        for (int i = ind; i < nums.length; i++) {
            swap(nums, ind, i);
            swappermutate(nums, ind+1);
            swap(nums, ind, i);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] flags = new int[nums.length];
        Arrays.fill(flags,0);
        permutate(new ArrayList<>(), flags, nums);
        swappermutate(nums, 0);

    }
}