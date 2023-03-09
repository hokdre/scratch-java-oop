package example.model;

/*
* Error is runtime err, but not recommended to try catch
* this is fatal err
* */
public class FatalErr  extends  Error {
    public FatalErr(String message) {
        super(message);
    }
}
