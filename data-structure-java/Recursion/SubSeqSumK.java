package Recursion;
import java.util.*;

public class SubSeqSumK {
    public static int count(int[] nums,int k,int ind,ArrayList<Integer> seq){
        if(ind==nums.length){
            int sum = 0;
            for(int i = 0;i<seq.size();i++){
                sum+=seq.get(i);
            }
            if(sum==k) return 1;
            else return 0;
        }
        seq.add(nums[ind]);
        int left = count(nums,k,ind+1,seq);
        seq.remove(seq.size()-1);
        int right = count(nums,k,ind+1,seq);
        return left+right;
    }

    public static int subarraySum(int[] nums, int k) {
        ArrayList<Integer> seq = new ArrayList<Integer>();
        return count(nums, k, 0, seq);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(subarraySum(nums,2));
    }
}