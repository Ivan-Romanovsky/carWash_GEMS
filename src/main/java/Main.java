public class Main {
    public static void main(String[] args) {
        CarWashSimulation carWash = new CarWashSimulation(2); // create a car wash with 3 stations

        // add some cars to the waiting queue
        carWash.addCar(new Car(Car.CarType.PASSENGER_CAR));
        carWash.addCar(new Car(Car.CarType.JEEP));
        carWash.addCar(new Car(Car.CarType.MINIBUS));
        carWash.addCar(new Car(Car.CarType.PASSENGER_CAR));
        carWash.addCar(new Car(Car.CarType.JEEP));

        // simulate the car wash operation for 30 minutes
        carWash.runSimulation(21);

        // print the total revenue earned by the car wash
        System.out.println("Total revenue: " + carWash.getTotalRevenue() + " rubles");
    }
}
