package ordenamiento;

import java.util.Random;

public class QSort2Way {

    private int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low -1);

        for (int j=low; j<high; j++){
            if (arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        QSort2Way sorter = new QSort2Way();
        int[] array = new int[100_000];
        Random rand = new Random();

        for( int i=0; i<array.length; i++)
            array[i] = rand.nextInt(100);

        System.out.println("Array original:");
        sorter.printArray(array);

        long start = System.currentTimeMillis();
        sorter.quickSort(array, 0, array.length - 1);
        long end = System.currentTimeMillis();

        System.out.println("Array ordenado:");
        sorter.printArray(array);
        System.out.println("Time: " + (end - start));
    }

}
