package LLD_Session_2;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Toyota");

        Bike bike = new Bike("Honda");

        car.start();
        car.accelerate(20);

        bike.start();
        bike.accelerate(30);

        System.out.println(car.getSpeed());
        System.out.println(bike.getSpeed());
    }
}