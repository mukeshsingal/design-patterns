package Behavioral.InterpretorPattern.Unit;

public class Days extends Expression {

    @Override
    public String days(double quantity) {
        return Double.toString(quantity);
    }

    @Override
    public String hours(double quantity) {
        return Double.toString(quantity * 24);
    }

    @Override
    public String minutes(double quantity) {
        return Double.toString(quantity * 24 * 60);
    }

    @Override
    public String seconds(double quantity) {
        return Double.toString(quantity * 24 * 60 * 60);
    }
}
