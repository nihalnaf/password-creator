public class MustBeBetweenFourAndSixteenException extends Exception{
    private String password;

    public MustBeBetweenFourAndSixteenException(String password) {
        this.password = password;
    }

    public String toString() {
        return "Your password must be 4-16 characters in length.";
    }
}
