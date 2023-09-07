/*Создайте массив целых чисел. Удалите все вхождения заданного
числа из массива. Пусть число задается с консоли (класс Scanner).
Если такого числа нет - выведите сообщения об этом.
В результате должен быть новый массив без указанного числа.
*/
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] basicArray = new int[11];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 0 to 10: ");
        int userInput = scanner.nextInt();

        GetNewArray(basicArray, userInput);
    }
    public static void GetNewArray(int[] basicArray, int userInput) {
        int[] newArray = new int [basicArray.length -1];
        for(int i=0,k=0;i<basicArray.length;i++) {
            if (i != userInput) {
                newArray[k] = i;
                k++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}