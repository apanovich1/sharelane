public class Phone {
    String number;
    String model;
    double weight;

    // конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // конструктор с двумя параметрами
    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    // конструктор без параметров
    public Phone() {
        this("", "", 0.0); // Вызываем конструктор с тремя параметрами, устанавливая все значения по умолчанию
    }

    // вывод информации о телефоне
    public void displayInfo() {
        System.out.println("Номер: " + number);
        System.out.println("Модель: " + model);
        System.out.println("Вес: " + weight + " грамм");
    }

    // перегруженный метод receiveCall
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Вам звонит " + callerName + " (" + callerNumber + ")");
    }

    // отправка сообщений
    public void sendMessage(String... numbers) {
        System.out.println("Отправить сообщение на следующие номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }
}
