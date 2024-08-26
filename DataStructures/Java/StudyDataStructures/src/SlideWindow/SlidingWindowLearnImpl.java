package SlideWindow;
/**
 * Aprendiendo como implemnetar un sliding windows pero con un tamaño fijo
 *
 *Problema con tamaño estatico o fijo
 *
 *  Given an array of integer, find the maximum sum if a subarray with
 *  a fixed window size;
 *  an input array = [2,1,5,1,3,2]
 *          k = 3
 *  Output = 9
 *
 *
 * Ahora vamos con sliding window dynamic
 * Problema con tamaño dinamico
 *
 *  Given an array of positive integers and an integer K, find the length of the
 *  longest subarray whose sum is less than K.
 *
 *
 * */
public class SlidingWindowLearnImpl {
    public static void main(String[] args) {

        int[] numbers = {2,1,5,1,3,2};
        int key = 3;
        System.out.println("Fixed: " +fixedWindowSize(numbers, key));

        int[] arr = {1,2,3,4,5};
        int maxSumKey = 11;
        System.out.println("Dynamic: " +dynamicSize(arr, maxSumKey));
    }

    private static int fixedWindowSize(int[] numbers, int k){
        int maxSum = 0;
        int curWindowSum = 0;

        for ( int i=0; i<k; i++)
            curWindowSum += numbers[i];

        for (int i=k; i<numbers.length; i++){
            curWindowSum += numbers[i] - numbers[i-k];
            maxSum = Math.max(maxSum, curWindowSum);
        }

        /*
        Aqui solo evitamos poner un for extra
        *   for (int i=0; i<numbers.length; i++){
            curWindowSum += numbers[i];
            if (i >= k-1) {
                maxSum = Math.max(maxSum, curWindowSum);
                curWindowSum -= numbers[i - (k-1)];
            }
        }
        * */

        return maxSum;
    }

    private static int dynamicSize(int[] numbers, int k) {
        int left = 0;
        int sum = numbers[0];
        int maxLen = 0;

        for (int right=0; right<numbers.length; right++){

            while (sum >= k){
                sum -= numbers[left];
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            sum += numbers[right];
        }
        return maxLen;
    }
}
