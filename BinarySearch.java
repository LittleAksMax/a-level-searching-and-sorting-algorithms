public class BinarySearch implements ISearch {
    private int binarySearch(int[] arr, int n, int defaultIndex, int low, int high) {
        if (high < low) {
            return defaultIndex;
        }

        int mid = (low + high) / 2;

        if (n == arr[mid]) {
            return mid;
        } else if (n < arr[mid]) {
            return binarySearch(arr, n, defaultIndex, low, mid - 1);
        } else {
            return binarySearch(arr, n, defaultIndex, mid + 1, high);
        }
    }

    public int search(int[] arr, int n, int defaultIndex) {
        return binarySearch(arr, n, defaultIndex, 0, arr.length - 1);
    }
}