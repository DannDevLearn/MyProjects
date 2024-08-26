package numbers;
/**
 *  Given and Integer non-negative return an integer inverse
 *  Input 456
 *  Output 654
 * */
public class InvertNumber {
    public static void main(String[] args) {
        int num = 406;
        System.out.println(solution(num));
    }

    private static int solution(int number){

        int result = 0;

        while (number / 10 != 0){
            result = (result * 10) + (number % 10);
            number /= 10;
        }
        result = (result*10) + number;
        return result;
    }
}
