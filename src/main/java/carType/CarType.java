package carType;

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
