public class ArrayOperationen {

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] numbers){
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public  static int findMaxSum(int[] numbers){
        int sum = 0;
        int min =findMin(numbers);
        for (int num : numbers) {
            sum += num;
        }
        return sum - min;
    }

    public static int findMinSum(int[] numbers){
        int sum = 0;
        int max = findMax(numbers);
        for (int num : numbers) {
            sum += num;
        }
        return sum - max;
    }

}
