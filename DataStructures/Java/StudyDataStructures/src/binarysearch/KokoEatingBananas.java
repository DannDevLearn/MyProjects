package binarysearch;

import java.util.Arrays;

/**
 *  875. Koko Eating Bananas
 *
 *  Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The
 *  guards have gone and will come back in h hours.
 *
 * Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of
 * bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all
 * of them instead and will not eat any more bananas during this hour.
 *
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 *
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 *
 * Example 1:
 *
 * Input: piles = [3,6,7,11], h = 8
 * Output: 4
 * Example 2:
 *
 * Input: piles = [30,11,23,4,20], h = 5
 * Output: 30
 * Example 3:
 *
 * Input: piles = [30,11,23,4,20], h = 6
 * Output: 23
 * */

public class KokoEatingBananas {
    public static void main(String[] args) {

        int[] pile = {3,6,7,11};
        int h = 8;
        System.out.println(solution(pile, h));
    }

    private static int solution(int[] piles, int h){
        int low = 1;
        int high = Arrays.stream(piles).max().orElse(0);

        while (low < high){
            int mid = low + (high-low)/2;

            if( isPossible(mid, piles, h) )
                high = mid;
            else
                low = mid+1;
        }

        return low;
    }

    private static boolean isPossible(int maxPiles, int[]piles, int h){
        int hours = 0;
        for(int pile:piles){
            int time = pile/maxPiles;
            hours += time;
            if(pile%maxPiles != 0) hours++;
        }
        return hours <= h;
    }
}
