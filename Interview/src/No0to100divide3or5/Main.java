package No0to100divide3or5;
//O(n)/O(1)
public class Main {
    static void result(int N)
    {
        for (int num = 0; num < N; num++)
        {
            if (num % 3 == 0 && num % 5 == 0)
                System.out.println("RajaSoftware");
            else if (num%3==0) {
                System.out.println("Raja");
            }else if(num%5==0){
                System.out.println("Software");
            }
        }
    }

    public static void main(String []args) {
        int N = 1000;
        result(N);
        // method-2 lcm of 3 and 5 is 15
        for (int i = 0; i < N; i++) {
            if (i % 15 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
