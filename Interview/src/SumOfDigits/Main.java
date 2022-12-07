package SumOfDigits;

public class Main {

    //O(|n|)/O(1)
    static int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n/10;
        }
        return sum;
    }

    //O(|n|)/O(1)
    static int singleline(int n)
    {
        int sum;
        for (sum = 0; n > 0; sum += n % 10, n /= 10);
        return sum;
    }

    //recursive O(logn)/O(logn) base10
    static int sumDigits(int no)
    {
        return no == 0 ? 0 : no%10 + sumDigits(no/10) ;
    }
    public static void main(String[] args) {
        int n = 687;
        System.out.println(getSum(n));
        System.out.println(singleline(n));
        System.out.println(sumDigits(n));
    }
}
