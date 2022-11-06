
public class MergeSort implements ISort {

    private void merge(int[] arr, int low, int mid, int high) {
        int leftIdx, rightIdx, mergedIdx;
        leftIdx = rightIdx = 0;
        mergedIdx = low;

        // copy halves into respective arrays
        int leftLength = mid - low + 1;
        int rightLength = high - mid;

        int[] left = new int[leftLength];
        int[] right = new int[rightLength];

        for (int i = low; i <= mid; i++) {
            left[i - low] = arr[i];
        }

        for (int i = mid + 1; i <= high; i++) {
            right[i - mid - 1] = arr[i];
        }

        // merge
        while (leftIdx < leftLength && rightIdx < rightLength) {
            if (left[leftIdx] <= right[rightIdx]) {
                arr[mergedIdx] = left[leftIdx];
                leftIdx++;
            } else {
                arr[mergedIdx] = right[rightIdx];
                rightIdx++;
            }
            mergedIdx++;
        }

        while (leftIdx < leftLength) {
            arr[mergedIdx] = left[leftIdx];
            mergedIdx++;
            leftIdx++;
        }

        while (rightIdx < rightLength) {
            arr[mergedIdx] = right[rightIdx];
            mergedIdx++;
            rightIdx++;
        }
    }

    private void mergeSort(int[] arr, int low, int high) {
        // return if length of sublist is 1
        if (high - low + 1 == 1) {
            return;
        }

        // get midpoint of sublist
        int mid = (low + high) / 2;

        // call recursively on left half
        mergeSort(arr, low, mid);
        // call recursively on right half
        mergeSort(arr, mid + 1, high);
        // merge left and right half
        merge(arr, low, mid, high);
    }

    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

}