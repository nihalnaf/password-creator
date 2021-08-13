public class MustHaveLetterException extends Exception{
    private String password;

    public MustHaveLetterException(String password) {
        this.password = password;
    }

    public String toString() {
        return "Your password must contain at least one letter.";
    }
}
