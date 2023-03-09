package example.application;

import example.model.Claw;

public class AnnonClassApplication {
    public static void main(String[] args) {

        // annon class =  instante object from interface
        Claw c = new Claw() {
            @Override
            public void touch() {
                System.out.println("touch");
            }
        };
    }
}
