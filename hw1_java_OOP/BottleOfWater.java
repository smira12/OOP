package hw1_java_OOP;

public class BottleOfWater extends Product{
    private int volume;

    public int getVolume() {
        return volume;
    }

    public BottleOfWater(String name, double price, int volume){
        super(name, price);
        this.volume = volume;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - объем: %d", brand, name, price, volume);

    }
}
