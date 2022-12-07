package MaxDiffBw2eleOfArray;

public class Main {

    //O(n)/O(n)
    static int maxDiff(int[] arr, int arr_size) {
        int max_diff = arr[1] - arr[0];
        int i, j;
        for (i = 0; i < arr_size; i++) {
            for (j = i + 1; j < arr_size; j++) {
                if (arr[j] - arr[i] > max_diff)
                    max_diff = arr[j] - arr[i];
            }
        }
        return max_diff;
    }

    //O(n)/O(1)
    static int maxDiffer (int[] arr, int n) {
        int diff = arr[1] - arr[0];
        int curr_sum = diff;
        int max_sum = curr_sum;

        for(int i = 1; i < n - 1; i++) {
            // Calculate current diff
            diff = arr[i + 1] - arr[i];
            // Calculate current sum
            if (curr_sum > 0)
                curr_sum += diff;
            else
                curr_sum = diff;
            // Update max sum, if needed
            if (curr_sum > max_sum)
                max_sum = curr_sum;
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 90, 10, 110};
        System.out.println("Maximum difference is " + maxDiff(arr, 5));
        System.out.println(maxDiffer(arr,5));
    }
}
