package lesson6.homework;

public class Rectangle {
    private int a;
    private int b;

    public void setA(int sideA) {
        this.a = sideA;
    }

    public void setB(int sideB) {
        this.b = sideB;
    }

    public void print() {
        System.out.printf("Прямоугольник со сторонами:%d,%d", this.a, this.b);
        System.out.println();
    }

    public int perimeterOfRectangle() {
        return 2 * (this.a + this.b);
    }

    public int squareOfRectangle() {
        return this.a * this.b;
    }
}
