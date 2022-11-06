public class LinearSearch implements ISearch {
    public int search(int[] arr, int n, int defaultIndex) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return defaultIndex;
    }
}