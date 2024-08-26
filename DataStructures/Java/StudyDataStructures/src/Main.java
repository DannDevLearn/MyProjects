import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5,6};

        for (int i : ar){
            if (i == 4)
                continue;
            System.out.println(i);
        }

    }
}