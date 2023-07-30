package Encapsulation;

import parent.Person;
import child.Doctor;
import child.Programmer;
import child.Teacher;


public class MainApp {
     public static void main(String[] args) {
          Person person1 = new Person();
          person1.setName("Rizki");
          person1.setAddress("Bandung");

          Person person2 = new Programmer();
          person2.setName("Rizky");
          person2.setAddress("Bandung");
          ((Programmer) person2).setTechnology(".Net Core");

          Person person3 = new Teacher();
          person3.setName("Joko");
          person3.setAddress("Tegal");
          ((Teacher) person3).setSubject("Matematika");

          Person person4 = new Doctor();
          person4.setName("Eko");
          person4.setAddress("Surabaya");
          ((Doctor) person4).setSpecialist("Pedistrician");
          
          // sayHello(person1);
          sayHello(person2);
          sayHello(person3);
          sayHello(person4);
          System.out.println();
          System.out.println(person1.getName());
          System.out.println(person1.getAddress());

     }
     static void sayHello(Person person) {
          String message;
          if (person instanceof Programmer) {
               Programmer programmer = (Programmer) person;
               message = "Hello, " + programmer.getName() + ". Seorang Programmer " + programmer.getTechnology() + ".";
          } else if (person instanceof Teacher) {
               Teacher teacher = (Teacher) person;
               message = "Hello, " + teacher.getName() + ". Seorang Guru " + teacher.getSubject() + ".";
          } else if (person instanceof Doctor) {
               Doctor doctor = (Doctor) person;
               message = "Hello, " + doctor.getName() + ". Seorang Dokter " + doctor.getSpecialist() + ".";
          } else {
               message = "Hello, " + person.getName() + ".";
          }
          System.out.println(message);
     }
}
