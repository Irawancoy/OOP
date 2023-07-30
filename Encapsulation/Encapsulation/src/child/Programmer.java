package child;
import parent.Person;

public class Programmer extends Person {
     private String technology;

     public Programmer() {
          super();
     }

     public Programmer(String name, String address, String technology) {
          super(name, address);
          this.technology = technology;
     }

     void hacking() {
          System.out.println("I can hacking a website");
     }
     
     void coding() {
          System.out.println("I can create a application using " + technology + " technology");
     }

     public void greeting() {
          super.greeting();
          // System.out.println("Hello my name is " + name + ".");
          // System.out.println("I, come from " + address + ".");
          System.out.println("My job is a " + technology + " programmer");

     }
     
     // getter and setter
     public String getTechnology() {
          return this.technology;
     }

     public void setTechnology(String technology) {
          this.technology = technology;
     }

}
