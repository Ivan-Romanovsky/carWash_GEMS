import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarWashSimulationTest {
    @Test
    public void testSeveralTypesCar() {
        CarWashSimulation carWash = new CarWashSimulation(2);

        carWash.addCar(new Car(Car.CarType.PASSENGER_CAR));
        carWash.addCar(new Car(Car.CarType.JEEP));
        carWash.addCar(new Car(Car.CarType.MINIBUS));
        carWash.addCar(new Car(Car.CarType.PASSENGER_CAR));
        carWash.addCar(new Car(Car.CarType.JEEP));

        carWash.runSimulation(21);
        assertEquals(carWash.getTotalRevenue(), 1080);
    }

    @Test
    public void testSingleCar() {

        CarWashSimulation carWash = new CarWashSimulation(2);

        carWash.addCar(new Car(Car.CarType.PASSENGER_CAR));
        carWash.runSimulation(10);
        assertEquals(carWash.getTotalRevenue(), 150);
    }

    @Test
    public void testEmptySimulation() {
        CarWashSimulation carWash = new CarWashSimulation(3);

        carWash.runSimulation(60);
        assertEquals(carWash.getTotalRevenue(), 0);

    }


}