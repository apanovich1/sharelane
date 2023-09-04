/*. Напишите программу, которая будет принимать на вход
число и на выход будет выводить сообщение четное число или нет.
Для определения четности числа используйте операцию получения
остатка от деления - операция выглядит так: '% 2').
*/
public class Main {

    public static void main() {
        isEven(10);
    }
    public static boolean isEven(int number){
        double residue ;
        if (number % 2 ==0){
            return true;
        }
        else {
            return false;
        }
    }
}