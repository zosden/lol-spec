package kymmel.jaagup.lol.spec.exceptions;

public class PacketParseException extends Exception {
    public PacketParseException() {
        super();
    }

    public PacketParseException(String message) {
        super(message);
    }

    public PacketParseException(String message, Throwable cause) {
        super(message, cause);
    }

    public PacketParseException(Throwable cause) {
        super(cause);
    }

    protected PacketParseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
