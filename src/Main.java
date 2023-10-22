import strategy.BubbleSort;
import strategy.MergeSort;
import strategy.Sorter;
import strategy.SortingStrategy;

public class Main {
    public static void main(String[] args) {
        int[] arrayToSort = {5, 2, 9, 3, 6};

        SortingStrategy MergeSort = new MergeSort();
        Sorter sorter = new Sorter(MergeSort);
        sorter.performSort(arrayToSort);

        // Após a ordenação
        for (int num : arrayToSort) {
            System.out.print(num + " ");
        }
    }
}
