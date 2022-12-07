package Print100Primes;

public class Main {
    public static void main(String[] args) {
        int i=2,fct_count,prm_count = 0;
        System.out.println("First 100 prime numbers are :");
        while(prm_count!=100){ // print 100 prime numbers
            fct_count=0;
            for (int j = i; j >= 1; j--) { // find the factors of number i
                if (i % j == 0) {
                    fct_count = fct_count + 1; // a factor found, increment the factor count
                }
            }
            if (fct_count == 2){ // only 2 factors, it's prime so print i and increment the prime number count
                System.out.print("" + i + " ");
                prm_count = prm_count + 1;
            }
            i= i+1;
        }
    }
}
