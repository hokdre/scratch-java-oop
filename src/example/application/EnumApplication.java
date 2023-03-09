package example.application;

import example.model.Gender;

public class EnumApplication {
    public static void main(String[] args) {

        // enum
       Gender g = Gender.MALE;

       // convert to string
        String male = g.name();

        // convert string to enum
        // becarefull when using this, if the value is not correct will be return err IllegalArgumentExecption
        Gender m = Gender.valueOf("MALE");

        // get all options
        for (var gender : Gender.values()) {
            System.out.println(gender.name());
        }
    }
}
