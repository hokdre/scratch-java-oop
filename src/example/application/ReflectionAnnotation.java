package example.application;

import example.model.NotBlank;
import example.model.RuntineErr;

import java.lang.reflect.Field;

public class ReflectionAnnotation {

    public static void validationWithReflection(Object object) {
        // get class structure
        Class aClass = object.getClass();

        // get all field from class
        Field[] fields = aClass.getFields();

        for (var field : fields) {
            // if field marked with annotation
            if(field.getAnnotation(NotBlank.class) != null){
                try {
                    // get value
                    // we can type checking in here
                    // but currently just cast it to string
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()) {
                        throw new RuntineErr(field.getName() + "is Empty");
                    }
                }catch(Throwable e) {
                   e.printStackTrace();
                }
            }
        }
    }
}
