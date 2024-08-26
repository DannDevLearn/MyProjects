package arreglos.practice;

/**
 *  Given an array of random numbers,
 *  Push all the zero’s of a given array to the end of the array.
 *  For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
 *  it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
 *  The order of all other elements should be same.
 *  Expected time complexity is O(n) and extra space is O(1).
 * */
public class MoveZeros {
    public static void main(String[] args) {
        int[] arr =  {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        int count = 0;
        int len = arr.length;

        System.out.print("[");
        for(int i: arr)
            System.out.print(i+ ", ");
        System.out.print("] \n");

        for (int i=0; i<len; i++)
            if(arr[i] != 0)
                arr[count++] = arr[i];

        while(count<len)
            arr[count++] = 0;

        System.out.println("------------------------");
        System.out.print("[");
        for(int i: arr)
            System.out.print(i +", ");
        System.out.print("]");

    }
}
