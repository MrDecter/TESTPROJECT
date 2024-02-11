package ErrorHandlng;

public class DogIsNotReadyException extends Exception{
    public DogIsNotReadyException(String message) {
        super(message);
    }
}
