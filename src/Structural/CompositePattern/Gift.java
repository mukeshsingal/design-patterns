package Structural.CompositePattern;

/* Leaf */
public class Gift implements SurpriseBox {
    public String name;

    public Gift(String name) {
        this.name = name;
    }

    @Override
    public void unwrap() {
        System.out.println("unwrapping gift " + this.name);
    }
}
