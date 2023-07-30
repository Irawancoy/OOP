package JavaOOPExample;
public class Person {
     String name;
     String address;
     final String country = "Indonesia";

     // Constructor Default
     Person() {
          System.out.println("\n//Constructor Default");
     }
       // Constructor 1Parameter
     Person(String paramName) {
          System.out.println("\n//Constructor 1Parameter");
          name = paramName;
     }
     // Constructor Parameter
     Person(String name, String address) {
          // this(name);
          this.name = name;
          System.out.println("\n//Constructor Parameter");
          // name = paramName;
          this.address = address;
     }
     
   



     void sayHello(String paramName) {
          System.out.println("Hello " + paramName + ", My name is " + name + ".");
     }
     
     String sayAddres() {
          return "I, come from " + address + ".";
     }
}
