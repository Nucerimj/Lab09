import java.util.Random;

public class Lab_09_ArrayStuff {

    public static void main(String[] args) {
        Random rnd = new Random();

        // 1. Initialize dataPoints array with random values
        int[] dataPoints = new int[100];
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Display dataPoints values
        System.out.print("DataPoints values: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Calculate sum and average
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        // Part a: Prompt and input an int value between 1 and 100 from the user
        int userValue = SafeInput.getRangedInt("Enter a value between 1 and 100: ", 1, 100);

        // Part b: Count how many times the user's value is found within the array
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.println("The user's value " + userValue + " was found " + count + " times in the array.");

        // Part c: Find the first position of the user's value within the array
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                System.out.println("The value " + userValue + " was found at array index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The value " + userValue + " was not found in the array.");
        }

        // Part d: Find minimum and maximum values
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            } else if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("Minimum value in dataPoints: " + min);
        System.out.println("Maximum value in dataPoints: " + max);

        // Part e: Call getAverage method
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    // Part e: Static method to calculate average of an int array
    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}
