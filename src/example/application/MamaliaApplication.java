package example.application;

import example.model.Mamalia;
import example.model.Tiger;

public class MamaliaApplication {
    public static void main(String[] args) {
        // abstract class cannot be instante
       // Mamalia mamal = new Mamalia();
        
        Tiger tiger = new Tiger();
        tiger.BreastFeed();

    }
}
