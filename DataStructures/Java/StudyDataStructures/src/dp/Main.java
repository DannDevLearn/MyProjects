package dp;

public class Main {
    public static void main(String[] args) {
        int[] valItems = {1500, 3000, 2000};
        int[] wItems = {1,4,3};
        int capacity = 4;
        System.out.println(KnapsackProblem.knapsack(capacity, wItems, valItems));
    }
}
