public class CarMain {

    public static void main(String[] args) {
        Car mazdaCx5 = new Car("Mazda", 120, 2200);
        Car bmwm3 = new Car("BMW M3", 220, 1800);

        testTheCar(mazdaCx5);
        testTheCar(bmwm3);
    }

    public static void testTheCar(Car car) {
        System.out.println("Name: " + car.getName() + "\n" +
                "HP: " + car.getHp() + "\n" +
                "Weight: " + car.getWeight());
        car.getEngine().startEngine();
        car.getWheel().steer();
        car.getEngine().stopEngine();
    }
}
