public class UserRegistration {
    public static boolean registerUser(String login, String password, String confirmPassword) {
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true; // Регистрация успешна
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false; // Регистрация не удалась
        }
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Неверный логин");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Неверный пароль");
        }
    }
}

