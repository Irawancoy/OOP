package Inheritance;

public class MainApp {
     public static void main(String[] args) {
          // constructor default
          Person person1 = new Person();
          person1.name = "Hendra";
          person1.address = "Garut";

          // constructor parameter
          Person person2 = new Person("Hendri", "Tegal");

          // constructor default
          Teacher teacher1 = new Teacher();
          teacher1.name = "Budi";
          teacher1.address = "Bandung";
          teacher1.subject = "Matematika";

          // constructor parameter
          Teacher teacher2 = new Teacher("Bodi", "Tegal", "Fisika");
       
          // constructor default
          Doctor doctor1 = new Doctor();
          doctor1.name = "Elis";
          doctor1.address = "Jakarta";
          doctor1.specialist = "Dentis";

          // constructor parameter
          Doctor doctor2 = new Doctor("Joko", "Tegal", "Cardiologist");
          
          // constructor default
          Programmer programmer1 = new Programmer();
          programmer1.name = "Rizki";
          programmer1.address = "Surabaya";
          programmer1.technology = "Javascript";

          // constructor parameter
          Programmer programmer2 = new Programmer("Rizka", "Tegal", "Java");

          person1.greeting();
          System.out.println();
          person2.greeting();
          System.out.println();

          teacher1.greeting();
          System.out.println();
          teacher2.greeting();
          System.out.println();

          doctor1.greeting();
          System.out.println();
          doctor2.greeting();
          System.out.println();

          programmer1.greeting();
          System.out.println();
          programmer2.greeting();
          

     }
}
