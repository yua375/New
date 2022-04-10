package Transport;

public class PassengerPlaneTransport extends AirTransport {
    private int countOfPassenger;
    private boolean InExistBusiness;

    public int getCountOfPassenger() {
        return countOfPassenger;
    }

    public void setCountOfPassenger(int countOfPassenger) {
        this.countOfPassenger = countOfPassenger;
    }

    public boolean isInExistBusiness() {
        return InExistBusiness;
    }

    public void setInExistBusiness(boolean inExistBusiness) {
        InExistBusiness = inExistBusiness;
    }

    public PassengerPlaneTransport(int power, int maxSpeed, String brand, int weight, int wingspan, int distanceForFly, int countOfPassenger, boolean inExistBusiness) {
        super(power, maxSpeed, brand, weight, wingspan, distanceForFly);
        this.countOfPassenger = countOfPassenger;
        InExistBusiness = inExistBusiness;


    }

    public void loadPassenger(int enteredPassengerCount) {
        if (countOfPassenger >= enteredPassengerCount) {
            System.out.println("Самолёт подходит");
        } else {
            System.out.println("Мало места");

        }
    }
}
