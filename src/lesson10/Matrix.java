package lesson10;

import java.util.Arrays;

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
        if(rowIndex>numbers.length || colIndex>numbers[0].length) {
            return 0;
        }
        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        this.numbers[rowIndex][colIndex]=value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        for(int i=0;i<this.numbers.length;i++){
                for(int j=0;j<numbers[i].length;j++){
                    numbers[i][j]=numbers[i][j]+otherMatrix.getValueAt(i,j);
                }
            }
            return this;
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
        double[][] transpose=new double[this.numbers.length][this.numbers[0].length];
        Matrix matrix=new Matrix(transpose);
        for(int i=0;i<this.numbers.length;i++){
            for(int j=0;j<this.numbers.length;j++){
                transpose[j][i]=numbers[i][j];
            }
        }return matrix;
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
        //разобрать структуру кода позже
        if(!this.isSquareMatrix()){
            return 0;
        }else{
            double[][] matrix=new double[this.numbers.length][this.numbers.length];
            for(int i=0;i<this.numbers.length;i++){
                for(int j=0;j<this.numbers.length;j++){
                    matrix[i][j]=numbers[i][j];
                }
            }
            double x;
            for(int z=0;z<matrix.length;z++){
                for(int i=1;i<matrix.length;i++){
                    if(i-1>=z){
                        x=matrix[i][z]/matrix[z][z];
                        for(int j=0;j<matrix.length;j++){
                            matrix[i][j]-=matrix[z][j]*x;
                        }
                    }
                }
            }
            double det=1;
            for (int i=0;i<matrix.length;i++){
                det*=matrix[i][i];
            }
            return  det;
        }
    }

    @Override
    public boolean isNullMatrix() {
        double[][] matrixIsNull=new double[numbers[0].length][numbers.length];
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                matrixIsNull[i][j]=0;
            }
        }
        return Arrays.deepEquals(this.numbers, matrixIsNull);
    }

    @Override
    public boolean isIdentityMatrix() {
        double[][] matrixIsIdentityMatrix=new double[numbers[0].length][numbers.length];
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(i==j){
                    matrixIsIdentityMatrix[i][j]=1;
                }
            }
        }
        return Arrays.deepEquals(this.numbers, matrixIsIdentityMatrix);
    }

    @Override
    public boolean isSquareMatrix() {
        if(this.numbers.length==this.numbers[0].length){
            return true;
        }else{
            return false;
        }
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
