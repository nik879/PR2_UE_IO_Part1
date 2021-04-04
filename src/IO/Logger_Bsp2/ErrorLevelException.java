package IO.Logger_Bsp2;

public class ErrorLevelException extends Throwable {
    public ErrorLevelException() {
    }

    public ErrorLevelException(String message) {
        super(message);
    }

    public ErrorLevelException(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorLevelException(Throwable cause) {
        super(cause);
    }

    public ErrorLevelException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
