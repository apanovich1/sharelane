public class Main {
    public static void main(String[] args) {
        String login = "myuser";
        String password = "mypassword123";
        String confirmPassword = "mypassword1235";

        boolean result = UserRegistration.registerUser(login, password, confirmPassword);
        System.out.println("Registration successful: " + result);
    }
}
