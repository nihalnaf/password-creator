public class MustHaveNumberException extends Exception{
    private String password;

    public MustHaveNumberException(String password) {
        this.password = password;
    }

    public String toString() {
        return "Your password must contain at least one number.";
    }
}
