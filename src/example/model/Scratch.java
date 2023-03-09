package example.model;

/*
* By Default interface is public and abstract method
* It's can extends from other interface and can more than 1 parents
* The method can have overloading too.
* Adding new functionality in interface can make concrete class be broken, there's default method to prevent it(java 8+).
 */

public interface Scratch  extends Claw {
   // we can difine constant in here
    // but that is an anti pattern
    // the Constant Interface Antipattern, see Effective Java, Item 17
    public static final String a = "claw";

    void scratch();

    default void seek(){
        System.out.println("i can seek");
    }
}
