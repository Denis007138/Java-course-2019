package lesson9;

public class Homework {
    public static void main(String[] args) {
        FractionNumberImpl fractionNumber1 = new FractionNumberImpl(4, 5);
        FractionNumberImpl fractionNumber2 = new FractionNumberImpl(5, 16);
        FractionNumberOperationImpl calc = new FractionNumberOperationImpl();
        FractionNumberImpl sum = calc.add(fractionNumber1, fractionNumber2);
        FractionNumberImpl sub = calc.sub(fractionNumber1, fractionNumber2);
        FractionNumberImpl multiply = calc.mul(fractionNumber1, fractionNumber2);
        FractionNumberImpl div = calc.div(fractionNumber1, fractionNumber2);
        System.out.println("Сумма= " + sum);
        System.out.println("Разность= " + sub);
        System.out.println("Умножение= " + multiply);
        System.out.println("Деление= " + div);
    }
}

