package example.model;

/*
* When we need some option type we can declare enum class
* Enum is expected cannot be instancetiate
* Enum class can have constructor or not
 */
public enum Gender {
    MALE("male/laki-laki"),
    FEMALE("female/perempuan"),
    OTHERS("other/tidak diketahui");

    private String description;

    // constructor cannot be public
    Gender(String description){
        this.description = description;
    }

    public void getDescription(){
        System.out.println(this.description);
    }
}
