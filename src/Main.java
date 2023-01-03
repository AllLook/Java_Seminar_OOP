import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] args) {
        //List<VendingMachine> vm = new ArrayList<>();
        //vm.add(new VendingMachine()); // добавляет в List обьекты класса со всеми их оределенными в этих классах переменными и методами этих классов?
        //vm.add(new DrinksVendingMachine());
        // for(VendingMachine i : vm){
        //i.restore();

      HotDrink temperature  = new HotDrink();// экземпляр HotDrink
      temperature.setTemperature(10);// задаем значение температуры
      HotDrinkVendingMachine temp_product = new HotDrinkVendingMachine();// экземпляр HotDrinkVendingMachine

      temp_product.getProduct("шоколад", 100, temperature.getTemperature(),List<Product> productList);// вызываем функцию поиска нужного товара

        }

        }

