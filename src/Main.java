public class Main {
    public static void main(String[] args) {
        // 1. dasar class
        DasarClassPerson p = new DasarClassPerson();
        p.name = "andre";
        p.address = "palembang";
        // p.country = "usa"; will throw error cause contry is final

        // overloading
        p = new DasarClassPerson("andre");
        p.sayName();
        p.sayAddress();


        // 2. inheritance
        // we just know overide method, overide field is not exists
        // so make sure carefully to declare variable name in parent and child
        // if the name is same, while casting will be use parent field (field hiding)
        DasarClassPersonInheritance p1 = new DasarClassPersonInheritance("Budhist");
        p1.sayName();
        p1.sayAddress();
        p1.sayReligion();

        // 3. polymorfisme
        DasarClassPerson p2 = new DasarClassPersonInheritance();
        p2.sayAddress(); // will call overide method because we construct object using child class
        DasarClassPersonInheritance p3 = (DasarClassPersonInheritance) p2;

        DasarClassPerson d = new DasarClassPerson();
        // this is will be throw err ClassCastException
        DasarClassPersonInheritance d1 = (DasarClassPersonInheritance) d;

        Custome c = new Custome();
        // throw error in compile because custome not have any relation
        // DasarClassPersonInheritance p3 = (DasarClassPersonInheritance) c;

        Object o = new Object();
        // all object will coming from Class Object
        // this is will throw runtime error ClassCastException, not compile error
        DasarClassPersonInheritance p4 = (DasarClassPersonInheritance) o;
        p4.sayReligion();

        // safe way to cast before casting a class we need check type
        if (p2 instanceof DasarClassPersonInheritance) {
            DasarClassPersonInheritance p5 = (DasarClassPersonInheritance) p2;
        }


    }
}