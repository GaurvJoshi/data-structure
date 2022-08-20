package Recursion;

import java.util.*;

public class CombinationSum {
    public static void combination(int[] arr,int target,List<List<Integer>> result,List<Integer>seq,int ind){
        if (ind == arr.length){
            if(target==0){
                result.add(new ArrayList<>(seq));
            }
            return;
        }
        if(arr[ind]<=target){
            seq.add(arr[ind]);
            combination(arr, target - arr[ind], result, seq, ind);
            seq.remove(seq.size() - 1);
        }
        combination(arr, target, result, seq, ind + 1);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        combination(candidates, target, result, new ArrayList<Integer>(), 0);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7 };
        System.out.println(combinationSum(arr,7));
        
    }
}
