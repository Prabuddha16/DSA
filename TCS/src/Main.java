import java.util.Scanner;

public class Main {
    public  static int solution(int[] arr, int n){
        int ans = 0;
        if(n%2==0){
            int m = n/2;
            m=m-1;
            for(int i=0;i<n;i++){
                if(arr[m]>0){
                    ans = arr[m];
                }else{
                    ans = arr[--m];
                }
            }
        }else{
            int p = (n+1)/2;
            p=p-1;
            for(int i=0;i<n;i++){
                if(arr[p]>0){
                    ans = arr[p];
                }else{
                    ans = arr[--p];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = solution(arr,n);
        System.out.println(res);
    }
}
