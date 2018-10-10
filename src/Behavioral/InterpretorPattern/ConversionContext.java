package Behavioral.InterpretorPattern;

public class ConversionContext {
    private String[] partsOfQuestions;
    private String conversionQuestion;
    private String conversionResponse;
    private String fromConversion;
    private String toConversion;
    private double quanity;

    ConversionContext(String input) {
        conversionQuestion = input;
        partsOfQuestions = conversionQuestion.split(" ");

        fromConversion = getCapitalize(partsOfQuestions[1]);
        toConversion = partsOfQuestions[3].toLowerCase();
        toConversion += toConversion.charAt(toConversion.length() - 1) == 's' ? "" : "s";


        quanity = Double.valueOf(partsOfQuestions[0]);
        conversionResponse = partsOfQuestions[0] + " " + partsOfQuestions[1] + " equals  ";
    }

    public String getConversionQuestion() {
        return conversionQuestion;
    }

    String getConversionResponse() {
        return conversionResponse;
    }

    String getFromConversion() {
        return fromConversion;
    }

    String getToConversion() {
        return toConversion;
    }

    double getQuanity() {
        return quanity;
    }

    private String getCapitalize(String string) {
        string = string.toLowerCase();
        string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
        if (string.charAt(string.length() - 1) != 's') {
            string = new StringBuffer(string).insert(string.length(), "s").toString();
        }
        System.out.println(string);
        return string;
    }
}
