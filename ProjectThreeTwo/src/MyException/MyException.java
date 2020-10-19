package MyException;

public class MyException extends Exception{
    private String reason;

    public MyException(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
