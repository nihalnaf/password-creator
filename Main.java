import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean good = false;

        do {
            System.out.print("Enter a password: ");
            String password = scanner.next();
            try {
                checkForDigits(password);
                checkForLength(password);
                checkForLetter(password);
                System.out.println("The password is valid.");
                good = true;
            } catch (MustHaveNumberException e) {
                System.out.println(e);
            } catch (MustBeBetweenFourAndSixteenException e) {
                System.out.println(e);
            } catch (MustHaveLetterException e) {
                System.out.println(e);
            }
        } while (good == false);
    }

    public static void checkForDigits(String password) throws MustHaveNumberException {
        int digit = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digit++;
            }
        }

        if (digit == 0) {
            throw new MustHaveNumberException(password);
        }
    }
    public static void checkForLength(String password) throws MustBeBetweenFourAndSixteenException {
        if (password.length() < 4 || password.length() > 16) {
            throw new MustBeBetweenFourAndSixteenException(password);
        }
    }
    public static void checkForLetter(String password) throws MustHaveLetterException {
        int letters = 0;
        for (int i = 0; i < password.length(); i ++) {
            if (Character.isLetter(password.charAt(i))) {
                letters ++;
            }
        }

        if (letters == 0) {
            throw new MustHaveLetterException(password);
        }
    }
}
