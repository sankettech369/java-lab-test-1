// exp 4
class Car {
    int speed;
    double regularPrice;
    String color;

    Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    double getSalePrice() {
        return regularPrice;
    }
}

class Truck extends Car {
    int weight;

    Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.90;
        } else {
            return regularPrice * 0.80;
        }
    }
}

class Ford extends Car {
    int year;
    int manufacturerDiscount;

    Ford(int speed, double regularPrice, String color,
         int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    double getSalePrice() {
        return regularPrice - manufacturerDiscount;
    }
}

class Sedan extends Car {
    int length;

    Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    double getSalePrice() {
        if (length > 20) {
            return regularPrice * 0.95;
        } else {
            return regularPrice * 0.90;
        }
    }
}

public class myownautoshop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(120, 20000, "Red", 18);

        Ford ford = new Ford(150, 30000, "Black", 2024, 2000);
        Truck truck = new Truck(120, 30000, "Blue", 2500);

        Car car = new Car(100, 15000, "Blue");

        System.out.printf("Sedan Sale Price: %.2f%n", sedan.getSalePrice());
        System.out.printf("Ford  Sale Price: %.2f%n", ford.getSalePrice());
        System.out.printf("Truck Sale Price: %.2f%n", truck.getSalePrice());
        System.out.printf("Car Sale Price: %.2f%n", car.getSalePrice());
    }
}