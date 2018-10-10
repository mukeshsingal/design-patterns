package Behavioral.InterpretorPattern;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        String questionAsked = JOptionPane.showInputDialog(frame, "What is your Question");
        ConversionContext question = new ConversionContext(questionAsked);

        String fromConversion = question.getFromConversion();
        String toConversion = question.getToConversion();
        double quantity = question.getQuanity();

        try {
            Class<?> tempClass = Class.forName("Behavioral.InterpretorPattern.Unit." + fromConversion);
            Constructor<?> constructor = tempClass.getConstructor();

            Object convertFrom = constructor.newInstance();

            Class[] methodParams = new Class[]{Double.TYPE};
            Method ConversionMethod = tempClass.getMethod(toConversion, methodParams);

            Object[] params = new Object[]{quantity};
            String toQuantity = (String) ConversionMethod.invoke(convertFrom, params);

            String answer = question.getConversionResponse() + toQuantity + " " + toConversion;
            JOptionPane.showMessageDialog(null, answer);

            frame.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Operation not supported");
        }
    }
}
