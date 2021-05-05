public class Calculator implements ICalculator{
    @Override
    public double sum(Double val1, Double val2) {
        return val1 + val2;
    }

    @Override
    public double subtract(Double val1, Double val2) {
        return val1 - val2;
    }
}
