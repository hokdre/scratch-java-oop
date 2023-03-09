public class DasarClassPersonInheritance extends  DasarClassPerson{
    // Java is not have field overiding
    // becarefull when declare same field name
    // when casting the field will be using parent field
    // String name;
    String religion;

    // constructor
    // we can call parent class constructor
    DasarClassPersonInheritance(){
        // call parent constructor
        super("empty name", "empty address");
    }

    DasarClassPersonInheritance(String religion) {
        super("empty name", "empty address");
        this.religion = religion;
    }

    DasarClassPersonInheritance(String name, String address, String religion) {
       super(name, address);
       this.religion = religion;
    }

    void sayReligion() {
        System.out.println("my religion is " + this.religion);
    }

    // overide
    void sayAddress() {
        // super to access parent class
        super.sayAddress();

        System.out.println("we overide method");
    }

}
