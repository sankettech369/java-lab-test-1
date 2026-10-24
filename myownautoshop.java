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

        Ford ford1 = new Ford(150, 30000, "Black", 2024, 2000);
        Ford ford2 = new Ford(140, 25000, "White", 2023, 1500);

        Car car = new Car(100, 15000, "Blue");

        System.out.printf("Sedan Sale Price: %.2f%n", sedan.getSalePrice());
        System.out.printf("Ford 1 Sale Price: %.2f%n", ford1.getSalePrice());
        System.out.printf("Ford 2 Sale Price: %.2f%n", ford2.getSalePrice());
        System.out.printf("Car Sale Price: %.2f%n", car.getSalePrice());
    }
}