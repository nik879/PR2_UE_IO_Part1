package IO.adressbuch_bsp1;

public class AddressLoadWrongFormatException extends AddressLoadException {
    public AddressLoadWrongFormatException() {
    }

    public AddressLoadWrongFormatException(String message) {
        super(message);
    }

    public AddressLoadWrongFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public AddressLoadWrongFormatException(Throwable cause) {
        super(cause);
    }

    public AddressLoadWrongFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
