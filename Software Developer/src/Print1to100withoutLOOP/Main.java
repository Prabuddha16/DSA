package Print1to100withoutLOOP;

public class Main {
    static void printNos(int n)
    {
        if(n > 0)
        {
            printNos(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args)
    {
        printNos(100);
    }
}
