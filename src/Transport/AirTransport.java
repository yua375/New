package Transport;

public class AirTransport extends Transport{
    private int wingspan;
    private int distanceForFly;

    public AirTransport(int power, int maxSpeed, String brand, int weight, int wingspan, int distanceForFly) {
        super(power, maxSpeed, brand, weight);
        this.wingspan = wingspan;
        this.distanceForFly = distanceForFly;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getDistanceForFly() {
        return distanceForFly;
    }

    public void setDistanceForFly(int distanceForFly) {
        this.distanceForFly = distanceForFly;
    }

    @Override
    public String toString() {
        return "AirTransport{" +
                "wingspan=" + wingspan +
                ", distanceForFly=" + distanceForFly +
                '}';
    }
}
