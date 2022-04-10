package Transport;

public class GroundTransport extends Transport{
    private int countOfWheels;
    private int consumptionFuel;

    public GroundTransport(int power, int maxSpeed, String brand, int weight, int countOfWheels, int consumptionFuel) {
        super(power, maxSpeed, brand, weight);
        this.countOfWheels = countOfWheels;
        this.consumptionFuel = consumptionFuel;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    public int getConsumptionFuel() {
        return consumptionFuel;
    }

    public void setConsumptionFuel(int consumptionFuel) {
        this.consumptionFuel = consumptionFuel;
    }

    @Override
    public String toString() {
        return "GroundTransport{" +
                "countOfWheels=" + countOfWheels +
                ", consumptionFuel=" + consumptionFuel +
                '}';
    }
}
