interface CircleOps {
    double circleArea();
    double circlePerimeter();
}

interface RectangleOps {
    double rectangleArea();
    double rectanglePerimeter();
}

interface ShapeOps extends CircleOps, RectangleOps {
    void displaySummary();
}

class ShapeBase {
    String shapeName;

    ShapeBase(String shapeName) {
        this.shapeName = shapeName;
    }
}

class ShapeCalculator extends ShapeBase implements ShapeOps {
    double radius;
    double length;
    double width;

    ShapeCalculator(double radius, double length, double width) {
        super("Circle and Rectangle");
        this.radius = radius;
        this.length = length;
        this.width = width;
    }

    public double circleArea() {
        return Math.PI * radius * radius;
    }

    public double circlePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double rectangleArea() {
        return length * width;
    }

    public double rectanglePerimeter() {
        return 2 * (length + width);
    }

    public void displaySummary() {
        System.out.println("Shape Summary");
        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + circleArea());
        System.out.println("Circle Perimeter: " + circlePerimeter());
        System.out.println("Rectangle Length: " + length);
        System.out.println("Rectangle Width: " + width);
        System.out.println("Rectangle Area: " + rectangleArea());
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter());
    }
}

public class ShapesDemo {

    static void showCircle(CircleOps c) {
        System.out.println("Circle Area: " + c.circleArea());
        System.out.println("Circle Perimeter: " + c.circlePerimeter());
    }

    static void showRectangle(RectangleOps r) {
        System.out.println("Rectangle Area: " + r.rectangleArea());
        System.out.println("Rectangle Perimeter: " + r.rectanglePerimeter());
    }

    static void showShape(ShapeOps s) {
        s.displaySummary();
    }

    public static void main(String[] args) {
        ShapeCalculator obj = new ShapeCalculator(5, 10, 4);

        System.out.println("Using CircleOps reference:");
        showCircle(obj);

        System.out.println("\nUsing RectangleOps reference:");
        showRectangle(obj);

        System.out.println("\nUsing ShapeOps reference:");
        showShape(obj);
    }
}
