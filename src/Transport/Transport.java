package Transport;

public class Transport {
    private int power;
    private int maxSpeed;
    private String brand;
    private int weight;

    public Transport(int power, int maxSpeed, String brand, int weight) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                '}';
    }
}
