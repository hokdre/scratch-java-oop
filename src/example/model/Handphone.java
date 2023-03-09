package example.model;

public class Handphone extends  Product {
    public Handphone(String name, int price) {
        super(name, price);
    }

    public void Ring() {
        System.out.println("Ring");
    }
}
