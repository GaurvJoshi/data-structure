package Recursion;

import java.util.*;
// import java.io.*;
public class Subsequence {
    public static void createSubsequence(int ind,int [] arr, ArrayList<Integer> seq)
    {
        if (ind == arr.length) {
            System.out.print(seq);
            return;
        }
            createSubsequence(ind + 1, arr, seq);
            seq.add(arr[ind]);
            createSubsequence(ind + 1, arr, seq);
            seq.remove(seq.size() - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> seq = new ArrayList<Integer>();
        createSubsequence(0,arr,seq);
    }
}