package childs;
import parents.Person;


public class Doctor extends Person {
     public String specialist;

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
          System.out.println("Hello my name is " + name + ".");
          System.out.println("I, come from " + address + ".");
          System.out.println("My occupation is a " + specialist + " doctor");
     }
}
