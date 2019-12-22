package lesson10;

import java.util.Objects;

public class Matrix implements IMatrix {
    private double[][] numbers;

    public Matrix() {
        numbers=new double[1][1];
    }

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }

    public Matrix(int colRow,int colCol){
        numbers=new double[colRow][colCol];
    }

    @Override
    public int getRows() {
        return this.numbers.length;
    }

    @Override
    public int getColumns() {
        return this.numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        //необходимо сделать проверку больше ли индекс полученных чисел по отношению к заданным числам в классе main
        return this.numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
//        for(int i=0;i<rowIndex;i++){
//            for(int j=0;j<colIndex;j++){
//                value=Math.random();
//            }
//        }
        this.numbers[rowIndex][colIndex]=value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if(this.getRows()!=otherMatrix.getRows()||this.getColumns()!=otherMatrix.getColumns())    {

        }
        for(int i=0;i<this.numbers.length;i++){
                for(int j=0;j<numbers[i].length;j++){
                    numbers[i][j]=numbers[i][j]+otherMatrix.getValueAt(i,j);
                }
            }
            return otherMatrix;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                numbers[i][j]=numbers[i][j]-otherMatrix.getValueAt(i,j);
            }
        }
        return this;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                numbers[i][j]*=numbers[i][j]*otherMatrix.getValueAt(i,j);
            }
        }return this;
    }

    @Override
    public IMatrix mul(double value) {
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                this.numbers[i][j]=numbers[i][j]*value;
            }
        }return this;
    }

    @Override
    public IMatrix transpose() {
        double[][] transpose=new double[this.numbers[this.numbers.length-1].length][this.numbers.length];
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                transpose[j][i]=numbers[i][j];
            }
        }return this;
    }

    @Override
    public void fillMatrix(double value) {
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                this.numbers[i][j]=value;
            }
        }
    }

    @Override
    public double determinant() {
        Matrix equal=new Matrix();
        double determinant = 0;
        if(equal.getRows()==equal.getColumns()){
            for(int i=0;i<numbers.length;i++){
                for(int j=0;j<numbers[i].length;j++){
                    if(i==j){
                        determinant*=numbers[i][j];
                    }
                }
            }
        }
        return determinant;
    }

    @Override
    public boolean isNullMatrix() {
        Matrix nullMatrix=new Matrix();
        boolean a= nullMatrix.equals(numbers.length);
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                 if(a){
                     a=true;
                 }else{
                     a=false;
                 }
            }
        }
        return a;
    }

    @Override
    public boolean isIdentityMatrix() {
        boolean proverka=true;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                if(i==j && this.numbers[i][j]==1){
                    if(i!=j && this.numbers[i][j]==0){
                        proverka=true;
                    }
                }
            }
        }return proverka;
    }

    @Override
    public boolean isSquareMatrix() {
        Matrix sverka=new Matrix();
        boolean proverka;
        if(sverka.getColumns()==sverka.getRows()){
            proverka=false;
        }else{
            proverka=true;
        }
        return proverka;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
