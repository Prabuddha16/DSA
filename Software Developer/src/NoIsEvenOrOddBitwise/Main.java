package NoIsEvenOrOddBitwise;

public class Main {
    static boolean isEvenOdd(int n) {
        //incre by 1 then even, decre by 1 odd
        if ((n ^ 1) == n + 1)
            return true;
        else
            return false;
    }
    static boolean isOdd(int n)
    {
        // n&1 is 1, then odd, else even
        return ((n & 1)==1);
    }

    static boolean isEven(int n)
    {

        // n|1 is greater than n, then even, else odd
        if ((n | 1) > n)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        int n = 100;
        System.out.print(isEvenOdd(n) == true ? "Even" : "Odd");
        System.out.print(isOdd(n) == true ? "Even" : "Odd");
        System.out.print(isEven(n) == true ? "Even" : "Odd");
    }
}
