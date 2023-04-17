public class CarWashPost {
        private Car assignedCar;

        public boolean isFree() {
            return assignedCar == null;
        }

        public void assignCar(Car car) {
            assignedCar = car;
        }

        public Car getAssignedCar() {
            return assignedCar;
        }

        public void releaseCar() {
            assignedCar = null;
        }
    }


