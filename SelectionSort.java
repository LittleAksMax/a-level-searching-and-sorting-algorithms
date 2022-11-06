
public class SelectionSort extends SwapSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }

            swap(arr, i, minIdx);
        }
    }

}