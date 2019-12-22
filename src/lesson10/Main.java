package lesson10;

public class Main {
    public static void main(String[] args) {
        Matrix matrix=new Matrix(4,4);
        matrix.setValueAt(0,0,2);
        matrix.setValueAt(1,1,5);
        matrix.setValueAt(1,2,6);
        matrix.setValueAt(1,3,6);
        Matrix matrix2=new Matrix(5,4);
        matrix2.setValueAt(1,3,6);
        //matrix2.setValueAt(0,0,6);
        //matrix2.add(matrix);
        //matrix.add(matrix);
        //matrix.sub(matrix);
        //matrix2.mul(matrix);
        //matrix2.mul(7);
        //matrix.transpose();
        matrix2.printToConsole();
        System.out.println(matrix2.isNullMatrix());


    }
}
