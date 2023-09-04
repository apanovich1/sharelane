/*Напишите программу, где пользователь вводит любое целое
положительное число. А программа суммирует все числа от 1 до
введенного  пользователем числа. Для ввода числа воспользуйтесь
классом Scanner.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        int sum = 0;
        for(int i = 0;i<userInput;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}




