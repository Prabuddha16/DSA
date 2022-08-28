package Pattern.Triangle;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            boolean k = true;
            for(int j=1; j<=(2*n)-1;j++){
                if(j >= (n + 1 )- i && j <= (n - 1) + i && k){
                    System.out.print("*");
                    k = false;
                }else{
                    System.out.print(" ");
                    k = true;
                }
            }
            System.out.println();
        }
    }
}
