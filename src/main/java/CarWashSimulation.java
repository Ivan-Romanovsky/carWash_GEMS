import java.util.ArrayDeque;
import java.util.Queue;

public class CarWashSimulation {
    private final int numberOfPosts;
    private final int carWashRatePerMinute = 30;
    private final Queue<Car> waitingQueue = new ArrayDeque<>();
    private final CarWashPost[] posts;

    private int totalRevenue;

    public CarWashSimulation(int numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
        this.posts = new CarWashPost[numberOfPosts];
        for (int i = 0; i < numberOfPosts; i++) {
            posts[i] = new CarWashPost();
        }
    }

    public int getTotalRevenue() {
        return totalRevenue;
    }

    public void addCar(Car car) {
        waitingQueue.add(car);
    }

    public void runSimulation(int simulationDuration) {
        for (int currentTime = 0; currentTime < simulationDuration; currentTime++) {
            for (CarWashPost posts : posts) {
                if (posts.isFree()) {
                    Car car = waitingQueue.poll();
                    if (car != null) {
                        posts.assignCar(car);
                    }
                }
                if (!posts.isFree()) {
                    Car car = posts.getAssignedCar();
                    car.updateTimeLeft(1);
                    if (car.getTimeLeft() == 0) {
                        totalRevenue += car.getType().getTimeCost() * carWashRatePerMinute;
                        posts.releaseCar();
                    }
                }
            }
        }
    }
}






