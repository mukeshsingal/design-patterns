package Creational.BuilderPattern.Example_2;

public class Pizza {
    private String breadType;
    private String source;
    private String topping;

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getSource() {
        return source;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setSouce(String source) {
        this.source = source;
    }
}
