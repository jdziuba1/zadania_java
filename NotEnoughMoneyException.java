package zad3;

public class NotEnoughMoneyException extends Throwable {
    String message;

    public NotEnoughMoneyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

