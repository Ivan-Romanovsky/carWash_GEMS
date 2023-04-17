import carType.CarType;
public class Car {
    private final CarType type;
    private int timeLeft;

    public Car(CarType type) {
        this.type = type;
        this.timeLeft = type.getTimeCost();
    }

    public CarType getType() {
        return type;
    }

    public int getTimeLeft() {
        return timeLeft;
    }

    public void updateTimeLeft(int amount) {
        timeLeft -= amount;
    }

}


