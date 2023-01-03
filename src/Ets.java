public class Ets extends Product {

    private double wight;
    private double volume;

    public Ets(String name, double price, double wight, double volume) { // из класса родителя передаем поля, без полной пеередачи всех полей из обоих классов не работает?
        super(name, price);
        this.wight = wight;
        this.volume = volume;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
