import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        int sum = 0;

        while (true) {
            System.out.print("Enter another number (or the same number to stop): ");
            int number = scanner.nextInt();

            if (number == userInput) {
                break; // Exit the loop if the user enters the same number
            }

            sum += number; // Add the entered number to the sum
        }

        scanner.close();

        System.out.println("Sum of numbers located before " + userInput + " is: " + sum);
    }

}



