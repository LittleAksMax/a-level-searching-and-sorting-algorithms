
public class BubbleSort extends SwapSort {

    public void sort(int[] arr) {
        boolean swap;
        for (int i = 0; i < arr.length - 1; i++) {
            swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    swap(arr, j, j + 1);
                    swap = true;
                }
            }

            if (!swap) {
                return;
            }
        }
    }

}