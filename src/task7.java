/**
 * Reverses the elements of an integer array recursively within the specified range.
 * @param arr The integer array to be reversed.
 * @param start The starting index of the range.
 * @param end The ending index of the range.
 * If start is greater than or equal to end, the range is reversed
 * Swap elements at start and end indices
 * Recursively reverse the remaining array
 * Reverse the array recursively
 * Output the reversed array
 */
import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        reverse(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
