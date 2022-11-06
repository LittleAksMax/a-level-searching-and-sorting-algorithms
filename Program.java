public class Program {
    static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        var bubble = new BubbleSort();
        var insertion = new InsertionSort();
        var selection = new SelectionSort();
        var merge = new MergeSort();

        var linear = new LinearSearch();
        var binary = new BinarySearch();

        int[] array = new int[] { 6, 2, 3, 1, 1, 10, 3, 16 };

        printList(array);

        System.out.println(linear.search(array, 10, -1)); // -> 5
        System.out.println(linear.search(array, 7, -1));  // -> -1
        System.out.println(linear.search(array, 4, -1));  // -> -1

//        bubble.sort(array);
//        insertion.sort(array);
//        selection.sort(array);
        merge.sort(array);                            // -> 1 1 2 3 3 6 10 16

        printList(array);

        // we can now do a binary search on the sorted list
        System.out.println(binary.search(array, 10, -1)); // -> 6
        System.out.println(binary.search(array, 7, -1));  // -> -1
        System.out.println(binary.search(array, 4, -1));  // -> -1
    }
}