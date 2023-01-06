import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] args) {
      VendingMachine productList = new VendingMachine(); // создаем обьект из VendingMachine
      List<Product> listProduct = productList.getProductList();// получаем лист который заполняется в VendingMachine но он пуст,почему, он же заполнен в VendingMachine?
      HotDrink tempProduct = new HotDrink("Кола",  100 ,  10.0 );// экземпляр HotDrink
      HotDrinkVendingMachine temp_product = new HotDrinkVendingMachine("Cola", 100.0, 50.0, 20);// экземпляр HotDrinkVendingMachine
      System.out.print(tempProduct);
      System.out.print(listProduct);

      temp_product.getProduct("шоколад", 100.0, 10.0, 100.0, listProduct);// вызываем функцию поиска нужного товара

        }

        }

