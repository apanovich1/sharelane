/* Создайте и заполните массив случайным числами и выведете
максимальное, минимальное и среднее значение. Для генерации случайного
числа используйте метод Math.random(). Пусть будет возможность создавать
массив произвольного размера. Пусть размер массива вводится с консоли.
*/
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the array size: ");
                int arraySize = scanner.nextInt();

                double[] array = new double[arraySize];

                for (int i = 0; i < arraySize; i++) {
                    array[i] = Math.random();
                }
                System.out.println(Arrays.toString(array));
                System.out.println(getMin(array));
                System.out.println(getMax(array));
                System.out.println(getAverage(array,arraySize));
                }
            public static double getMin(double[] array) {
                double minNum = array[0];

                for (int i = 0; i < array.length; ++i) {
                    if (array[i] < minNum) {
                        minNum = array[i];
                    }
                }
                return minNum;
            }
            public static double getMax(double[] array){
                double maxNum = array[0];
                for (int i = 0; i < array.length; ++i) {
                    if (array[i] > maxNum) {
                        maxNum = array[i];
                    }
                }
                return maxNum;
            }
            public static double getAverage(double[] array, int arraySize){
                double sum = 0.0; // Initialize sum to 0

                for (int i = 0; i < arraySize; i++) {
                    sum += array[i];
                }

                double averageNum = sum / arraySize;

                return averageNum;
            }
        }
