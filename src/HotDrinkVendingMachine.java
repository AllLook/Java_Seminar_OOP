import java.util.List;

public class HotDrinkVendingMachine extends Ets{
    public HotDrinkVendingMachine(String name, double price, double wight, double volume) {
        super(name, price, wight, volume);
    }
    private  double volume2 = getVolume();
    private double price2 = getPrice();

    void getProduct(String name, double volume, double temperature, double price, List<Product> productList){
        for (Product i :  productList) { // текущий продукт из лист

                if(name.equals(i.getName()) && volume == volume2 && price == price2){ // обьект состоит из характеристик как достать из него характерристики чтобы сравнить с данными значениями? == не работает
                    System.out.print(i);
                }
            }

        }


    }


