package Transport;

public class Car extends GroundTransport {
    private String bodyType;
    private int countOfPassenger;

    public Car(int power, int maxSpeed, String brand, int weight, int countOfWheels, int consumptionFuel, String bodyType, int countOfPassenger) {
        super(power, maxSpeed, brand, weight, countOfWheels, consumptionFuel);
        this.bodyType = bodyType;
        this.countOfPassenger = countOfPassenger;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getCountOfPassenger() {
        return countOfPassenger;
    }

    public void setCountOfPassenger(int countOfPassenger) {
        this.countOfPassenger = countOfPassenger;
    }

    public void getKilometersWithMaxSpeed(int time) {
        int allDistance = time * getMaxSpeed();
        System.out.println("Затрачено топлива - " + getSpendFuel(allDistance));
    }

    private double getSpendFuel(int allDistance) {
        return allDistance / getConsumptionFuel();

    }
}
