package Behavioral.InterpretorPattern.Unit;

public class Seconds extends Expression {
    @Override
    public String hours(double quantity) {
        return Double.toString(quantity / (60 * 60));
    }

    @Override
    public String days(double quantity) {
        return Double.toString(quantity / (60 * 60 * 24));
    }

    @Override
    public String minutes(double quantity) {
        return Double.toString(quantity / (60));
    }

    @Override
    public String seconds(double quantity) {
        return Double.toString(quantity);
    }
}
