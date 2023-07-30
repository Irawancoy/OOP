package AbstractClassMethod;
import childs.Item;
import parents.Product;

public class MainApp {
     //tidak dapat langsung diinisialisasi menjadi object karena abstract class//
     //Product product1 = new Product();

     //dapat membuat object Product dari instansiasi Child Class Item
     Product product2 = new Item();
}
