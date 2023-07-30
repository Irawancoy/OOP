package Encapsulation;

public class Categories {
     // menggunakan access modifier private pada field atau atribute
     private int id;
     private String name;
     private boolean expensive;

     public Categories(int id, String name, boolean expensive) {
          super();
          this.id = id;
          this.name = name;
          this.expensive = expensive;
     }

     public Categories() {
          super();
     }

     // contoh getter dan setter pada tipe data boolean//
     // getter
     public boolean isExpensive() {
          return this.expensive;
     }
     // setter
     public void setExpensive(boolean expensive) {
          this.expensive = expensive;
     }

     // contoh getter dan setter pada tipe data object//
     // getter
     public String getName() {
          return this.name;
     }
     // setter
     public void setName(String name) {
          this.name = name;
     }

     // contoh getter dan setter pada tipe data primitive(integer)//
     // getter
     public int getId() {
          return this.id;
     }
     // setter
     public void setId(int id) {
          this.id = id;
     }


     
}
