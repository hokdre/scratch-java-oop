package example.model;

/*
* Throw execption or error
* we extends from class Throwable
 */
public class ValidationException  extends  Throwable {
    public ValidationException(String message) {
        super(message);
    }
}
