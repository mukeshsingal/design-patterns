package Structural.FlywightPattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

/**
 * Used when we need to create a large number of similar objects
 * To reduce memory usage you share object that are similar in some way rather
 * than creating new ones
 * <p>
 * Intrinsic State : Color
 * Extrinsic State : Size
 */

public class Main extends JFrame {
    private JButton startDrawing = new JButton("Draw Stuff");

    private int windowWidth = 1024;
    private int windowHeight = 760;

    private Color[] shapeColor = {Color.orange, Color.red, Color.yellow,
            Color.blue, Color.pink, Color.cyan,
            Color.magenta, Color.black, Color.gray};


    public Main() {
        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Test");

        /*Main window*/
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        /*Drawing Window*/
        final JPanel drawingPanel = new JPanel();
        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = drawingPanel.getGraphics();

                long startTime = System.currentTimeMillis();

                for (int i = 0; i < 100000; i++) {
                    MyRact ract = RactFactory.getRact(getRandColor());
                    ract.draw(g, getRandX(), getRandY(), getRandX(), getRandY());

                    /*g.setColor(getRandColor());
                    g.fillRect(getRandX(), getRandY(), getRandX(), getRandY());*/

                    /*MyRact ract = new MyRact(getRandColor(), getRandX(), getRandY(), getRandX(), getRandY());
                    ract.draw(g);*/


                }

                long endTime = System.currentTimeMillis();

                System.out.println("That took : " + (endTime - startTime));
            }
        });

        this.add(contentPane);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }

    private Color getRandColor() {
        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(9);
        return shapeColor[randInt];
    }

    private int getRandX() {
        return (int) (Math.random() * windowWidth);
    }

    private int getRandY() {
        return (int) (Math.random() * windowHeight);
    }
}
