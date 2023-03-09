package example.application;

import example.model.FatalErr;
import example.model.RuntineErr;
import example.model.ValidationException;

import java.io.BufferedReader;
import java.io.FileReader;

public class ExeceptionApplication {
    public static void main(String[] args) {
        // Compile Exeception
        // catch exception one by one
        try {
            validate();
        }catch(ValidationException e) {
            System.out.println("Err : " + e.getMessage());
        }catch (NullPointerException e) {
            e.printStackTrace();

            System.out.println("we can add multiple catch depend on error we get");
        } finally {
            System.out.println("always executed in end");
        }

        // catch exception multi by one
        try {
            validate();
        }catch(ValidationException | NullPointerException e) {
            e.printStackTrace();
            System.out.println("Err : " + e.getMessage());
        }catch(IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Err : " + e.getMessage());
        } finally {
            System.out.println("always executed in end");
        }


        // runtime err
        // in runtime err we don't need try catch
        // but your app will be crash, so still recommended to try catch
        // we can use centralize try catch for runtime err
        validateRuntimeErr();


        // fatal err is runtime err
        // in runtime err we don't RECOMMENDED use try catch
        validateFatalErr();


        // Auto close Resource, java 7+
        // the resource must implement AutoCloseable
        try (BufferedReader reader = new BufferedReader(new FileReader("./sample.csv"))) {
            // do something
        }catch(Throwable e) {
            // reader will be auto close, be cause implement AutoCloseable interface
            // so we dont need finally
        }
    }

    // We can mark method that can throws Exception
    public static void validate() throws ValidationException {
        throw new ValidationException("empty name");
    }

    // Runtime exception is optionally to mark as throw or not
    public static void validateRuntimeErr() throws RuntineErr  {
        throw new RuntineErr("empty name");
    }

    // Runtime exception is optionally to mark as throw or not
    public static void validateFatalErr() throws FatalErr {
        throw new FatalErr("empty name");
    }
}
