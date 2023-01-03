import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine{ // в задании нужно реализовать интерфейс VendingMachine,но это не интерфейс, implements тут не работает

    void getProduct(String name, double volume, double temperature, List<Product> productList){
        //List<VendingMachine> vm = (List<VendingMachine>) new VendingMachine(); так не работает, этот лист сделать из того
        //List<VendingMachine> vm = new ArrayList<>();
        //vm.add(new VendingMachine());// передаем в vm массив обьектов типа VendingMach из класса VendingMachine
        for (Product i :  productList) { // текущий продукт из лист

                if(i.equals(name) && i.equals(volume) && i.equals(temperature)){ // обьект состоит из характеристик как достать из него характерристики чтобы сравнить с данными значениями? == не работает
                    System.out.print(i);
                }
            }

        }


    }


