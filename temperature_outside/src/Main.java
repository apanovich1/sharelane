/*Для введенного числа t (температура на улице) вывести
Если t>–5, то вывести «Тепло».
Если –5>= t > –20, то вывести «Нормально».
Если –20>= t, то вывести «Холодно».
*/
public class Main {

    public static void main(String[] args) {
        GetTemperature(-1000);
    }
    public static void GetTemperature(int temp){
        if(temp>-5){
            System.out.println("тепло");
        }
        if(temp>-20 && temp<=-5){
            System.out.println("нормально");
        }
        if(temp< -20){
            System.out.println("холодно");
        }
    }
}