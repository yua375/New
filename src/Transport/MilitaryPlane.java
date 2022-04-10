package Transport;

public class MilitaryPlane extends AirTransport{
    private boolean inExistEjection;
    private int countOfRacket;

    public MilitaryPlane(int power, int maxSpeed, String brand, int weight, int wingspan, int distanceForFly, boolean inExistEjection, int countOfRacket) {
        super(power, maxSpeed, brand, weight, wingspan, distanceForFly);
        this.inExistEjection = inExistEjection;
        this.countOfRacket = countOfRacket;
    }

    public boolean isInExistEjection() {
        return inExistEjection;
    }

    public void setInExistEjection(boolean inExistEjection) {
        this.inExistEjection = inExistEjection;
    }

    public int getCountOfRacket() {
        return countOfRacket;
    }

    public void setCountOfRacket(int countOfRacket) {
        this.countOfRacket = countOfRacket;
    }

    public void startRacket() {
        if (countOfRacket > 0) {
            System.out.println("Пуск ракеты");
            countOfRacket--;
        } else {
            System.out.println("Ракет нет");
        }
    }

}
