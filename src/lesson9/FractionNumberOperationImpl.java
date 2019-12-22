package lesson9;

public class FractionNumberOperationImpl implements FractionNumberOperation {
    @Override
    public double add(FractionNumber a, FractionNumber b) throws NullPointerException {
        double ADivivsor = a.getDivisor();
        double BDivisor = b.getDivisor();
        //dividend-числитель
        //divisor-знаменатель
        //return ((double) a.getDividend() * (a.getDivisor()*b.getDivisor() / a.getDivisor()) + b.getDividend() * (a.getDivisor()*b.getDivisor() / b.getDivisor())) / (a.getDivisor() * b.getDivisor());
        return ((double) a.getDividend() * (Math.max(ADivivsor, BDivisor) / a.getDivisor()) + b.getDividend() * (Math.max(ADivivsor, BDivisor) / b.getDivisor())) / (Math.max(ADivivsor, BDivisor));
    }

    @Override
    public double sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        double ADivivsor = a.getDivisor();
        double BDivisor = b.getDivisor();
        //return ((double) a.getDividend() * (a.getDivisor()*b.getDivisor() / a.getDivisor()) + b.getDividend() * (a.getDivisor()*b.getDivisor() / b.getDivisor())) / (a.getDivisor() * b.getDivisor());
        return ((double) a.getDividend() * (Math.max(ADivivsor, BDivisor) / a.getDivisor()) - b.getDividend() * (Math.max(ADivivsor, BDivisor) / b.getDivisor())) / (Math.max(ADivivsor, BDivisor));
    }

    @Override
    public double mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        return ((double) (a.getDividend() * b.getDividend()) / (a.getDivisor() * b.getDivisor()));
    }

    @Override
    public double div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        return ((double) (a.getDividend() * b.getDivisor()) / (b.getDividend() * a.getDivisor()));
    }

}
