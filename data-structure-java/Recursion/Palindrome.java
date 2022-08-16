package Recursion;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");  
            String str= sc.nextLine();
            System.out.print(checkPalindrome(str,0));
        }
    }

    public static boolean checkPalindrome(String str, int index) {
        int endInd = str.length()-index-1;
        if(index>=endInd) return true;
        if(str.charAt(index)!=str.charAt(endInd)) return false;
        return checkPalindrome(str,index+1);
    }  
}