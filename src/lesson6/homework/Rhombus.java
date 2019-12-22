package lesson6.homework;

public class Rhombus {
    private int a;
    private int diag1;
    private int diag2;

    public void setA(int sideA) {
        this.a = sideA;
    }

    public void setDiag1(int diagonal1) {
        this.diag1 = diagonal1;
    }

    public void setDiag2(int diagonal2) {
        this.diag2 = diagonal2;
    }

    public void print() {
        System.out.printf("Стороны ромба равны %d,диагонали ромба %d,%d", this.a, this.diag1, this.diag2);
        System.out.println();
    }

    public int perimeterOfRhombus() {
        return 4 * this.a;
    }

    public int squareOfRhombus() {
        return (int) (this.diag1 * this.diag2 * 0.5);
    }
}
