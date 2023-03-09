package example.model;

public class Tiger extends Mamalia implements  Scratch {

    public void move(){
        System.out.println("I move with legs");
    }

    // implement interface method from interface Scratch
    public void scratch() {
        System.out.println("i can scratch");
    }

    // implement interface method from interface Claw super interface from Scratch
    public  void touch() {
        System.out.println("i can touch");

    }

    // some basic functionality
    public String toString(){
        return "Tiger , with name : " + this.getName();
    }

    public boolean equals(Object o) {
        // check memory location
        if (o == this) return true;

        if(!(o instanceof  Tiger)) return false;

        Tiger tiger = (Tiger) o;
        if (tiger.getName().equals(this.getName())) {
            return true;
        }

        return false;
    }

    public int hashCode() {
        int result = this.getName() != null ? this.getName().hashCode() : 0;
        return result;
    }

}
