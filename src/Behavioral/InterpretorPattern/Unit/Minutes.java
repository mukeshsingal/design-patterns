package Behavioral.InterpretorPattern.Unit;

public class Minutes extends Expression {
    @Override
    public String hours(double quantity) {
        return String.valueOf(quantity / 60);
    }

    @Override
    public String days(double quantity) {
        return String.valueOf(quantity / (60 * 24));

    }

    @Override
    public String minutes(double quantity) {
        return String.valueOf(quantity);

    }

    @Override
    public String seconds(double quantity) {
        return String.valueOf(quantity * 60);
    }
}
