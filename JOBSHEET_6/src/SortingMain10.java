public class SortingMain10 {
    public static void main(String[] args) {
        int[] a = {34, 7, 23, 32, 5, 62};
        int[] b = {30, 20, 2, 8, 14};
        int[] c = {40, 10, 4, 9, 3};

        Sorting10 sorting = new Sorting10(a);
        Sorting10 sorting2 = new Sorting10(b);
        Sorting10 sorting3 = new Sorting10(c);

        System.out.println("Original array");
        sorting.print();
        sorting.bubbleSort();
        System.out.println("Sorted array (Bubble sort): ");
        sorting.print();

        System.out.println("Original array");
        sorting2.print();
        sorting2.bubbleSort();
        System.out.println("Sorted array (Bubble sort): ");
        sorting2.print();

        System.out.println("Original array");
        sorting3.print();
        sorting3.bubbleSort();
        System.out.println("Sorted array (Bubble sort): ");
        sorting3.print();
    }
}
