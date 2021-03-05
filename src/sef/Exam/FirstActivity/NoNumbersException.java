package FirstActivity;

public class NoNumbersException extends Exception {
    public String toString() {
        return "No numbers allowed";
    }

    public String getMessage() {
        return "No numbers allowed";
    }
}
