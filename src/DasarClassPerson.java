public class DasarClassPerson {
    String name;
    String address;
    final String country = "indonesia"; // constant cannot change

    // constructor
    // can be overloading
    // can call other constructor from one constructor using this
    DasarClassPerson(){}

    DasarClassPerson(String name, String address) {
        this.name = name;
        this.address = address;
    }

    DasarClassPerson(String name) {
        this(name, null);
    }

    void sayName() {
        System.out.println("my name is " + this.name);
    }

    void sayAddress() {
        System.out.println("my address is " + this.name);
    }
}
