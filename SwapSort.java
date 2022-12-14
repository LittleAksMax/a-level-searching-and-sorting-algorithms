
public abstract class SwapSort implements ISort {
    protected void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public abstract void sort(int[] arr);
}