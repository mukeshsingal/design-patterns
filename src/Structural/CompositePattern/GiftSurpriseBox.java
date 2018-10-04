package Structural.CompositePattern;


import java.util.ArrayList;
import java.util.List;

/* Composite of leaf and SurpriseBox Interface Implementation */
public class GiftSurpriseBox implements SurpriseBox {
    List<SurpriseBox> surpriseBoxes;

    public GiftSurpriseBox() {
        this.surpriseBoxes = new ArrayList<>();
    }

    public void add(SurpriseBox surpriseBox) {
        this.surpriseBoxes.add(surpriseBox);
    }

    public void remove(SurpriseBox surpriseBox) {
        this.surpriseBoxes.remove(surpriseBox);
    }

    @Override
    public void unwrap() {
        surpriseBoxes.forEach(SurpriseBox::unwrap);
    }
}
