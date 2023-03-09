package example.model;

/*
*
 * Inner Class??
 *  when a object is not make sense when parent object is not created we can user inner class
 *  inner class can access outer class properties and methods
 * * */

public class Company {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    // inner class can access outside class
    public class Employe {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void sayCompanyName(){
            System.out.println( "Company name " + Company.this.getName());
        }
    }

    // static classs
    public static class EmployeStatic {

    }
}
