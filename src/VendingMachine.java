import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    List<Product> productList = new ArrayList<>(); // создаем лист продуктов на типе  главного класса

    List<Product> initProducts(List<Product> productList) { // в метод передаем лист
        Product product1 = new Product("Шоколад", 150);// если создаем обьект на базе родительского класса то обязательно передать все поля которые в нем определены?
        Product product2 = new Ets("Chips", 1.0, 40.0, 100.0); // создаем обьекты с их характеристиками,эти характеристики можно перебрать через for?
        productList.add(product1); // добавляем в лист
        productList.add(product2);
        return productList;// возвращаем лист из обьектов с характеристиками

    }


}
