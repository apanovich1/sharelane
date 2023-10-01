/*1. Создать класс CreditCard c полями номер счета,
текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную  карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.

Тестовый сценарий для проверки:
1. Положите деньги на первые две карточки и снимите с третьей.
2. Выведите на экран текущее состояние всех трех карточек*/
import java.util.Scanner;
public class CreditCard {
    int accountNumber;
    double accountSum;
    void ChargeCreditCard(){
        //double initialSum = accountSum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Charge: ");
        int chargeNum = scanner.nextInt();
        double resultCharge = accountSum + chargeNum;
        System.out.println("account sum after charge = "+resultCharge);
    }
    void Withdrawal(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Withdrawal: ");
        int withdrawalNum = scanner.nextInt();
        double resultWithdrawal = accountSum - withdrawalNum;
        System.out.println("account sum after Withdrawal = "+resultWithdrawal);
    }
    void displayInfo(){
        System.out.println("initial account sum = "+ accountSum);
    }
}

