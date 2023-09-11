/*Шахматная доска. Создать программу для раскраски шахматной доски с помощью цикла.
Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам циклам значения
B(Black) или W(White). Результат работы программы:
*/
public class Main {
    public static void main(String[] args) {
        int rows = 8;
        int cols = 8;
        String[][] array = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = "w";
                } else {
                    array[i][j] = "b";
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}










