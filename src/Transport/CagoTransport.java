package Transport;

public class CagoTransport extends GroundTransport{
    private int loadCapacity;

    public CagoTransport(int power, int maxSpeed, String brand, int weight, int countOfWheels, int consumptionFuel, int loadCapacity) {
        super(power, maxSpeed, brand, weight, countOfWheels, consumptionFuel);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void loadCargo(double cargo) {
        if (loadCapacity > cargo ) {
            System.out.println("Машина подходит");
        } else {
            System.out.println("Нужна другая машина");
        }

//        System.out.println(loadCapacity > cargo ? "Машина подходит" : "Найти другую");

    }
}
