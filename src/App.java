import java.util.Scanner;

public class App {

    // Calculate the average of an array of doubles
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) sum += num;
        return array.length > 0 ? sum / array.length : 0.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        // Read ten double values
        System.out.println("Enter ten double values:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Display the average
        System.out.println("The average is: " + average(numbers));
        input.close();
    }
}