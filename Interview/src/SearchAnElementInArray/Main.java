package SearchAnElementInArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {34, 2, 23, 100, 60};
        int key = 2;
        boolean flag = false;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                flag = true;
                break;
            }
        }

        if(flag)
            System.out.println("Search Found");
        else
            System.out.println("Search Not Found");
    }
}
