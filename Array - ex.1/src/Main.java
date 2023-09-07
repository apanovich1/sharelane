/**Создайте массив целых чисел. Напишете программу, которая
 выводит сообщение о том, входит ли заданное число в массив или нет.
 Пусть число для поиска задается с консоли (класс Scanner).
 */
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args)
    {
        Integer array[] = { 0,1,2,3,4,5,6,7,8,9,10 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        VerifyNumber(array, userInput);
    }
    private static void VerifyNumber(Integer[] array, int userInput)
    {
        boolean test
                = Arrays.asList(array)
                .contains(userInput);

        System.out.println(test);
    }
}
