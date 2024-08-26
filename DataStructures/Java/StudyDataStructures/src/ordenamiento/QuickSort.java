package ordenamiento;

public class QuickSort {
    public static void main(String[] args) {
//        int[] arr = new int[100_000];
//        Random rand = new Random();
        int[] arr = {10, 7, 8, 9, 1, 5};
//        for( int i=0; i<arr.length; i++)
//            arr[i] = rand.nextInt(100);

        System.out.println("Before Array");
        printArray(arr);

        System.out.println("\n-----Sorting Array-----");
        long start = System.currentTimeMillis();
        quicksort(arr, 0, arr.length-1);
        long end = System.currentTimeMillis();
        System.out.println("-----Finished----------");

        System.out.println("After Array");
        printArray(arr);
        System.out.println("\n------Time------");
        System.out.println(end - start);
    }

    private static void printArray(int[] arr){
        System.out.print("[");
        for (int i: arr)
            System.out.printf("%s ", i);
        System.out.print("]");
    }

    public static void quicksort(int[] arr, int lowIdx, int highIdx) {
        if (lowIdx >= highIdx)
            return;

        int pivot = arr[highIdx];
        int left = lowIdx;
        int right = highIdx - 1;

        while (left <= right) {
            while (left <= right && arr[left] <= pivot)
                left++;
            while (left <= right && arr[right] > pivot)
                right--;

            if (left < right)
                swap(arr, left, right);

        }

        swap(arr, left, highIdx);

        quicksort(arr, lowIdx, left - 1);
        quicksort(arr, left + 1, highIdx);
    }

    private static void swap(int[] arr, int idx1, int idx2) {
        int aux = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = aux;
    }
}
