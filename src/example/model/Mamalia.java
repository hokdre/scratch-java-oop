package example.model;

/*
* Take a ways
* 1. abstract cannot be instiante
* 2. abstract method means, enforce the child class to overwrite. why?
* in some cases give default method in the super class, can be wrong.
* Example : move method in mamalia, Tiger move with legs and Whale move with fin.
* give default method in mamal will gone wrong
*
* What different abstract class vs interface?
* Basicly, in inheritence concept, we will get all behavior from super class (instead of we can overide it)
* we cannot reject it.
* and one class is just can extends from 1 super class
* in other hand, one class can implements multi interface,
* in other means we can add some functionality to our object by implement interface
*
*  Conclussion:
* Base class describe "is-a" tight relation ship object, that mean that object must have that properties
* Interface describe "is" or "has a" loosely relation ship object, that mean some additional behavior to that object
*
* Example :
* Base Class Mamalia : BreastFeed()
* Interface Scratch()
* Class Tiger extends Mamalia implements Scratch
* Class Whale extends Mamalia
 */
public abstract class Mamalia {
    // Enclaptulation :
    // prevent our properties to be accessed or update with invalid.
    // boolean : isXxx(), setXxx()
    // primitif : getXxx(), setXxx()
    // Object : getXxx(), setXxx()
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    // why abstract?
    // we enforce our child class to implement it
    // because tiger maybe move with legs
    // but whale is move with fin
    public abstract void move();

    public void hunting(){
        move();
    }
    public void BreastFeed(){
        System.out.println("can feed");
    }

    public void touch() {

    }
}
