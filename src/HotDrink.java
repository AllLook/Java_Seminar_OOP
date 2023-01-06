public class HotDrink extends Product {
    public double temperature;

    public HotDrink(String name, double price, double temperature) {
        super(name, price);
        this.temperature = temperature;
    }


    public double setTemperature(int temperature) {
        return temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "temperature = " + temperature +
                "name = " + getName() + " price = " + getPrice() +
                '}';
    }
}
