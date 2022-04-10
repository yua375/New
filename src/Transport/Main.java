package Transport;

public class Main {
    public static void main(String[] args) {
        Car car;
        car = new Car(80, 150, "Audi",1100, 4, 8, "sedan", 5);
        car.getKilometersWithMaxSpeed(5);

        MilitaryPlane militaryPlane = new MilitaryPlane(800, 920, "Airbus", 43000, 45, 6200, false, 2);
        militaryPlane.getCountOfRacket();
        militaryPlane.isInExistEjection();
        militaryPlane.startRacket();
        militaryPlane.startRacket();
        militaryPlane.startRacket();


    }
}
