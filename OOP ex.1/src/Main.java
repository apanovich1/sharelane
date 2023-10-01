public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("123-456-789", "iPhone 12", 164.0);
        Phone phone2 = new Phone("987-654-321", "Samsung Galaxy S21");
        Phone phone3 = new Phone();

        System.out.println("Телефон 1:");
        phone1.displayInfo();

        System.out.println("Телефон 2:");
        phone2.displayInfo();

        System.out.println("Телефон 3:");
        phone3.displayInfo();

        phone1.receiveCall("John", "555-123-456");

        phone2.sendMessage("555-111-222", "555-333-444");
    }
} 