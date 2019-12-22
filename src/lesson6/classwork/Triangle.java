package lesson6.classwork;

public class Triangle {
    private int a;
    private int b;
    private int c;
    private String color;

    public void setColor(String newColor) {
        color = newColor;
    }

    public void setA(int sideA) {
        this.a = sideA;
    }

    public void setB(int sideB) {
        this.b = sideB;
    }

    public void setC(int sideC) {
        this.c = sideC;
    }

    public void print() {
        System.out.printf("Треугольник со сторонами:%d,%d,%d", this.a, this.b, this.c);
        System.out.println();
    }

    public int perimetr() {
        return this.a + this.b + this.c;
    }

    //дз
    public double square() {
        double perimetr = this.a + this.b + this.c;
        double square = Math.sqrt((perimetr / 2) * (perimetr - this.a) * (perimetr - this.b) * (perimetr - this.c));
        return square;
    }
}
