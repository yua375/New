package Lesson5;

public class Human {
    int countOfHands;
    int getCountOfFoot;
    boolean isMan;

    public Human() {

    }

    public Human(int countOfHands, int getCountOfFoot, boolean isMan) {
        this.countOfHands = countOfHands;
        this.getCountOfFoot = getCountOfFoot;
        this.isMan = isMan;
    }

    public void say() {
        System.out.println("Hello, I'm man - " + isMan);
    }
  //  public int sumCount()fHandsAndFeet()
}
