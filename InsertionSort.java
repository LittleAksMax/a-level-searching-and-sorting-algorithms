
public class InsertionSort extends SwapSort {
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int cur = arr[i];
            int j = i;

            // order of conditions in while loop is important
            while (j > 0 && cur < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = cur;
        }
    }
}