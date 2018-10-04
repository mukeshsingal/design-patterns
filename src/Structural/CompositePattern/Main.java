package Structural.CompositePattern;

/**
 * It is structural design Pattern that let you compose objects in
 * Tree structure and allow client to work with these object as if
 * these were individual objects
 */
public class Main {
    public static void main(String[] args) {
        GiftSurpriseBox giftSurpriseBox = new GiftSurpriseBox();
        GiftSurpriseBox innerSurpriseBox = new GiftSurpriseBox();

        Gift toy1 = new Gift("Toy 1");
        Gift toy2 = new Gift("Toy 2");

        giftSurpriseBox.add(toy1);
        innerSurpriseBox.add(toy2);
        giftSurpriseBox.add(innerSurpriseBox);

        giftSurpriseBox.unwrap();
    }
}
