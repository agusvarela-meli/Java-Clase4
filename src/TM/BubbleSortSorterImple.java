package TM;

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T>{

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (c.compare(arr[j + 1], arr[j]) > 0) { //arr[j+1] > arr[j]
                    T aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
