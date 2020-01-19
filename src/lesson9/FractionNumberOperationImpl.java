package lesson9;

public class FractionNumberOperationImpl implements FractionNumberOperation {
    @Override
    public FractionNumberImpl add(FractionNumber a, FractionNumber b) throws NullPointerException {
        FractionNumberImpl c=new FractionNumberImpl();
        //dividend-числитель
        //divisor-знаменатель
        c.setDividend((a.getDividend() * b.getDivisor()) + (b.getDividend() * a.getDivisor()));
        c.setDivisor(a.getDivisor()*b.getDivisor());
        c.value();
        return c;
    }

    @Override
    public FractionNumberImpl sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        FractionNumberImpl c=new FractionNumberImpl();
        c.setDividend((a.getDividend() * b.getDivisor()) - (b.getDividend() * a.getDivisor()));
        c.setDivisor(a.getDivisor()*b.getDivisor());
        c.value();
        return c;
    }

    @Override
    public FractionNumberImpl mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        FractionNumberImpl c=new FractionNumberImpl();
        c.setDividend(a.getDividend()*b.getDividend());
        c.setDivisor(a.getDivisor()*b.getDivisor());
        c.value();
        return c;
    }

    @Override
    public FractionNumberImpl div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        FractionNumberImpl c=new FractionNumberImpl();
        c.setDividend(a.getDividend()*b.getDivisor());
        c.setDivisor(a.getDivisor()*b.getDividend());
        c.value();
        return c;
    }

}
