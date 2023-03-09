package example.model;

/*
* Acess Modifier :
* 1. public : class, package, subclass (can different package), world
* 2. protected : class, package, subclass(can different package)
* 3. no modifier : class, package
* 4. private : class
* */

public class Product {
    private String name;
    private int price;

    public Product(){}

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
