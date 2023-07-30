package child;
import parent.Person;


public class Doctor extends Person {
     private String specialist;

     public Doctor() {
          super();//sebenarnya sudah otomatis disediakan java compiler
     }
     
     public Doctor(String name, String address, String specialist) {
          super(name, address);
          this.specialist = specialist;
     }

     void surgery() {
          System.out.println("I can surgery operation Patiens");
     }

     // overriding
     public void greeting() {
          System.out.println("Hello my name is " + getName() + ".");
          System.out.println("I, come from " + getAddress() + ".");
          System.out.println("My occupation is a " + specialist + " doctor");
     }

     // getter and setter
     public String getSpecialist() {
          return this.specialist;
     }

     public void setSpecialist(String specialist) {
          this.specialist = specialist;
     }
}
