package SelectionSort;
/*
    Time Complexity : O(N^2)
    Space Complexity : O(1)
    Where 'N' is the length of the given array.
 */

public class Main {
    public static void selectionSort(int[] arr, int n) {
        int minVal;
        for (int i = 0; i < n - 1; i++) {
            minVal = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minVal]) {
                    minVal = j;
                }
            int temp = arr[minVal];
            arr[minVal] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,5,4,8,6};
        int n = arr.length;
        selectionSort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
