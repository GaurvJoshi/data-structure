package Recursion;
// Number at n place in the series 0,1,1,2,3
// Time Complexity - 0(2**n)
public class Fibonnaci {
    public static int fib(int n) {
        if (n < 2)
            return n;
        return fib(n-1) + fib(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
