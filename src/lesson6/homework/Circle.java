package lesson6.homework;

public class Circle {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void print() {
        System.out.printf("Радиус круга равен %d", this.radius);
        System.out.println();
    }

    public double perimetr() {
        return 2 * this.radius * Math.PI;
    }

    public double square() {
        return this.radius * this.radius * Math.PI;
    }
}
