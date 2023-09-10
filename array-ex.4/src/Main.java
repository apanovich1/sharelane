
/*Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух
отдельных строках. Посчитайте среднее арифметическое элементов каждого
массива и сообщите, для какого из массивов это значение оказалось больше
(либо сообщите, что их средние арифметические равны).
*/
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = new int[]{0,1,2,3,4};
        int[] secondArray = new int[] {5,6,7,8,9};

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        double sum = 0.0;

        for(int i = 0; i < firstArray.length; i++) {
            sum += firstArray[i];
        }

        double averageNumFirst = sum / firstArray.length;
        System.out.println("average of first array"+ averageNumFirst);

        for (int j = 0; j < secondArray.length; j++) {
            sum += secondArray[j];
        }

        double averageNumSecond = sum / secondArray.length;
        System.out.println("average of second array"+averageNumSecond);

        if(averageNumFirst>averageNumSecond){
            System.out.println("average value of first array > average value of second array");
        }
        if(averageNumFirst<averageNumSecond){
            System.out.println("average value of first array < average value of second array");
        }
        else{
            System.out.println("values are equal");
        }
    }
}