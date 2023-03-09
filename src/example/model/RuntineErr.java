package example.model;

/*
* Runtime Execption is not mandatory to execute in try catch
 */
public class RuntineErr extends  RuntimeException {
    public RuntineErr(String message) {
        super(message);
    }
}
