package lesson9;

public class Homework {
    public static void main(String[] args) {
        FractionNumberImpl fractionNumber1 = new FractionNumberImpl(1, 8);
        FractionNumberImpl fractionNumber2 = new FractionNumberImpl(32, 16);
        FractionNumberOperationImpl calc = new FractionNumberOperationImpl();
        double summ = calc.add(fractionNumber1, fractionNumber2);
        double sub = calc.sub(fractionNumber1, fractionNumber2);
        double multiply = calc.mul(fractionNumber1, fractionNumber2);
        double div = calc.div(fractionNumber1, fractionNumber2);
        System.out.println("Сумма= " + summ);
        System.out.println("Разность= " + sub);
        System.out.println("Умножение= " + multiply);
        System.out.println("Деление= " + div);
    }
}

