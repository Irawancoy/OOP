package Inheritance;

public class Programmer extends Person {
     String technology;

     public Programmer() {
          super();
     }

     public Programmer(String name, String address, String technology) {
          super();
          super.name = name;
          super.address = address;
          this.technology = technology;
     }

     void hacking() {
          System.out.println("I can hacking a website");
     }
     
     void coding() {
          System.out.println("I can create a application using " + technology + " technology");
     }

     void greeting() {
          super.greeting();
          // System.out.println("Hello my name is " + name + ".");
          // System.out.println("I, come from " + address + ".");
          System.out.println("My job is a " + technology + " programmer");
  
     }

}
