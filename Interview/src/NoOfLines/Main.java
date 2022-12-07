package NoOfLines;

import java.util.Scanner;

public class Main {
    public static int func(int x, int y){
        int co = 0;
        if(x<y){
            co+=1;
        }
        return co;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 2;
        int x = 0;
        int y = 0;
        for(int i=0;i<n;i++){
             x = sc.nextInt();
             y = sc.nextInt();
        }
        int ans = func(x,y);
        System.out.println(ans);
    }
}
