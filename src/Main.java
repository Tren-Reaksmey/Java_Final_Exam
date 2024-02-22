import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maximum=100;
        int[] numbers = new int[maximum];
        Scanner sc = new Scanner(System.in);
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Enter number: ");
                numbers[i] = sc.nextInt();
                if (numbers[i] < 0) break;
            }
        System.out.println(maximum);
        System.out.println("Numbers entered:");
        for (int i = 0; i < numbers.length && numbers[i] >= 0; i++) System.out.print(numbers[i] + " ");
    }
}
