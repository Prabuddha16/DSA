package Factorial;

public class Main {

    //recursive o(n)/o(n)
    static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n-1);
    }

    //iterative o(n)/o(1)
    static int fact(int n) {
        int res = 1;
        for (int i=2; i<=n; i++)
            res *= i;
        return res;
    }

    //ternary operator o(n)/o(n)
    int factor(int n) {
        return (n == 1 || n == 0) ? 1 : n * factor(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of "+ num + " is " + factorial(num));
        System.out.println(fact(num));
    }
}
