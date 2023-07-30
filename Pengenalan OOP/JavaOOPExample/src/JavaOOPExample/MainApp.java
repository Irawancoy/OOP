package JavaOOPExample;

public class MainApp {
     public static void main(String[] args) {
          // Constructor Default
          Person person1 = new Person();
          person1.name="Eko";
          person1.address = "Tegal";
          System.out.println(person1.name);
          System.out.println(person1.address);
          System.out.println(person1.country);
          person1.sayHello("Padepokan 79");
          
          // Constructor Default
          Person person2 = new Person();
          person2.name = "Joko";
          person2.address = "Surabaya";
          person2.sayHello("Padepokan 79");
          System.out.println(person2.sayAddres());

          // Constructor Parameter
          Person person3 = new Person("Eko", "Tegal");
          person3.sayHello("Padepokan 79");
          System.out.println(person3.sayAddres());

          // Constructor 1Parameter
          Person person4 = new Person("Budi");
          person4.address = "Bandung";
          person4.sayHello("Padepokan 79");
          System.out.println(person4.sayAddres());

     }
}
