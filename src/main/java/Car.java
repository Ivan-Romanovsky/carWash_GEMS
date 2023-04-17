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


    public enum CarType {
        PASSENGER_CAR(5),
        JEEP(8),
        MINIBUS(10);

        private final int timeCost;

        CarType(int washTime) {
            this.timeCost = washTime;
        }

        public int getTimeCost() {
            return timeCost;
        }
    }
}


