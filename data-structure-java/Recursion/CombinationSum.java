package Recursion;

import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> combination(int[] arr,int target,List<List<Integer>> result,List<Integer>seq,int ind){
        if (ind == arr.length && target > 0)
        {
            return result;
        }
        if(target<0){
            return result;
        }
        if (target == 0) {
            List<Integer> seqClone = new ArrayList<Integer>();
            for (int i = 0; i < seq.size(); i++) {
                seqClone.add(seq.get(i));
            }
            result.add(seqClone);
            return result;
        }
        seq.add(arr[ind]);
        combination(arr, target - arr[ind], result, seq, ind);
        seq.remove(seq.size() - 1);
        combination(arr, target, result, seq, ind + 1);
        return result;
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> seq = new ArrayList<Integer>();
        return combination(candidates, target, result, seq, 0);
    }
    
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7 };
        System.out.println(combinationSum(arr,7));
        
    }
}
