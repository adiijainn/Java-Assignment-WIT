
abstract class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    abstract void start();

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

interface FuelEfficient {
    void calculateMileage();
}

class Car extends Vehicle implements FuelEfficient {
    Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void start() {
        System.out.println("Car Started...");
    }

    @Override
    public void calculateMileage() {
        System.out.println("Mileage: 18 km/l");
    }
}

public class Cars{
    public static void main(String[] args) {
        Vehicle v = new Car("Honda", 80);
        v.displayInfo();
        v.start();

        FuelEfficient fe = (FuelEfficient) v;
        fe.calculateMileage();
    }
}
