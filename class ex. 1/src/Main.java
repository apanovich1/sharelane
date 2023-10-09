/*1. Создать класс CreditCard c полями номер счета,
текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную  карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.

Тестовый сценарий для проверки:
1. Положите деньги на первые две карточки и снимите с третьей.
2. Выведите на экран текущее состояние всех трех карточек*/
public class Main {
    public static void main(String[] args) {
        CreditCard firstCard = new CreditCard();
        firstCard.accountNumber = 123;
        firstCard.accountSum = 34;
        firstCard.displayInfo();
        firstCard.ChargeCreditCard();
        firstCard.displayInfo();

        CreditCard secondCard = new CreditCard();
        secondCard.accountNumber = 345;
        secondCard.accountSum= 56;
        secondCard.ChargeCreditCard();
        secondCard.displayInfo();

        CreditCard thirdCard = new CreditCard();
        thirdCard.accountNumber = 678;
        thirdCard.accountSum=67;
        thirdCard.Withdrawal();
        thirdCard.displayInfo();
    }
}