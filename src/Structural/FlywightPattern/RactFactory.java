package Structural.FlywightPattern;

import java.awt.*;
import java.util.HashMap;

class RactFactory {
    private static final HashMap<Color, MyRact> rectangles = new HashMap<>();

    static MyRact getRact(Color color) {
        MyRact ract = rectangles.get(color);

        if (ract == null) {
            ract = new MyRact(color);
            rectangles.put(color, ract);
            return ract;
        }

        return ract;

    }
}
