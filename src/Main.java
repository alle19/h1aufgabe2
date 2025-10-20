import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4,8, 3, 10, 17};
        System.out.println("Array: " +Arrays.toString(numbers));

        int max = ArrayOperationen.findMax(numbers);
        System.out.println("Max: " +max);

        int min = ArrayOperationen.findMin(numbers);
        System.out.println("Min: " +min);

        int maxSum = ArrayOperationen.findMaxSum(numbers);
        System.out.println("MaxSum: " +maxSum);

        int minSum = ArrayOperationen.findMinSum(numbers);
        System.out.println("MinSum: " +minSum);
    }
}
