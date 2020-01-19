package lesson10;

public class Main {
    public static void main(String[] args) {
        Matrix matrix=new Matrix(2,2);
        Matrix matrix2=new Matrix(2,2);
        matrix2.setValueAt(0,0,7);
        matrix2.setValueAt(0,1,2);
        matrix2.setValueAt(1,0,8);
        matrix2.setValueAt(1,1,2);
        matrix.fillMatrix(Math.random()*100);
        matrix.printToConsole();
        System.out.println("матрица до трансп");
        matrix2.printToConsole();
        System.out.println("Матрица трнсп");
        IMatrix a=matrix2.transpose();
        a.printToConsole();
        System.out.println("Проверка, квадратная ли матрица");
        System.out.println(matrix.isSquareMatrix());
        System.out.println(matrix.isIdentityMatrix());
        System.out.println(matrix.isNullMatrix());
        matrix2.mul(6);
        matrix2.printToConsole();
        matrix2.mul(matrix);
        matrix2.printToConsole();
        matrix.sub(matrix2);
        matrix.printToConsole();
        matrix.add(matrix2);
        matrix.printToConsole();
    }
}
