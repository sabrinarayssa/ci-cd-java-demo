import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, CI/CD with GitHub Actions!");

        System.out.println("Sorted Array: " + Arrays.toString(sortArray(new int[]{5, 3, 1, 8, 1, 2})));
    }

    public static int[] sortArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }
}
