package PrimeOrNot;

public class Main {
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for(int i = 2; i < num / 2; ++i) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int n = 22;
        if(isPrime(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
