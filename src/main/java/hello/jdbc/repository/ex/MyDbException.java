package hello.jdbc.repository.ex;

public class MyDbException extends RuntimeException {
    public MyDbException() {
        super();
    }

    public MyDbException(Throwable cause) {
        super(cause);
    }

    public MyDbException(String message) {
        super(message);
    }

    public MyDbException(String message, Throwable cause) {
        super(message, cause);
    }
}
