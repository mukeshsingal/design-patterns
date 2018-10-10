package Behavioral.InterpretorPattern.Unit;

public class Hours extends Expression {
    @Override
    public String hours(double quantity) {
        return Double.toString(quantity);
    }

    @Override
    public String days(double quantity) {
        return Double.toString(quantity / 24);
    }

    @Override
    public String minutes(double quantity) {
        return Double.toString(quantity * (60));
    }

    @Override
    public String seconds(double quantity) {
        return Double.toString(quantity * 3600);
    }
}
