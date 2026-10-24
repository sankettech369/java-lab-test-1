//exp 2
class MyPoint {
    int x, y;

    // Default constructor
    MyPoint() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Set x and y
    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Return x and y as an array
    int[] getXY() {
        return new int[]{x, y};
    }

    // Return point as a string
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Distance to given coordinates
    double distance(int x, int y) {
        return Math.sqrt(
            Math.pow(this.x - x, 2) +
            Math.pow(this.y - y, 2)
        );
    }

    // Distance to another point
    double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    // Distance from origin
    double distance() {
        return distance(0, 0);
    }
}


public class testmypoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(3, 4);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        p1.setXY(1, 2);

        int[] xy = p1.getXY();
        System.out.println("X = " + xy[0] + ", Y = " + xy[1]);

        System.out.println("Distance between coordinates: "
                + p1.distance(4, 6));

        System.out.println("Distance between points: "
                + p1.distance(p2));

        System.out.println("Distance from origin: "
                + p2.distance());
    }
}
