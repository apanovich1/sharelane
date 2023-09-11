
/*Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух
отдельных строках. Посчитайте среднее арифметическое элементов каждого
массива и сообщите, для какого из массивов это значение оказалось больше
(либо сообщите, что их средние арифметические равны).
*/
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = new int[]{37,1,2,3,4};
        int[] secondArray = new int[] {90,1,2,3,4};

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        double sumForFirst = 0.0;

        for(int i = 0; i < firstArray.length; i++) {
            sumForFirst += firstArray[i];
        }

        double averageNumFirst = sumForFirst / firstArray.length;
        System.out.println("average of first array"+ " " +averageNumFirst);
        double sumForSecond = 0.0;

        for (int j = 0; j < secondArray.length; j++) {
            sumForSecond += secondArray[j];
        }

        double averageNumSecond = sumForSecond / secondArray.length;
        System.out.println("average of second array"+" " + averageNumSecond);

        if(averageNumFirst>averageNumSecond){
            System.out.println("average value of first array > average value of second array");
        }
        if(averageNumFirst<averageNumSecond){
            System.out.println("average value of first array < average value of second array");
        }
        else if (averageNumFirst==averageNumSecond) {
            System.out.println("values are equal");
        }
    }
}