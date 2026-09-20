package e3.chapter1;

import java.util.ResourceBundle;

public class TwelveDays {

    static ResourceBundle bundle =
            ResourceBundle.getBundle("e3.chapter1.TwelveDays");

    static String firstLine(int day) {
        return String.format(
                bundle.getString("firstLine"),
                bundle.getString("day" + (day + 1))
        ) + bundle.getString("newline");
    }

    static String allGifts(int day) {
        if (day == 0) {
            return bundle.getString("and")
                    + bundle.getString("space")
                    + bundle.getString("gift1");
        } else {
            return bundle.getString("gift" + (day + 1))
                    + bundle.getString("newline")
                    + allGifts(day - 1);
        }
    }

    static String poem() {
        String poem =
                firstLine(0)
                + bundle.getString("gift1")
                + bundle.getString("doubleNewline");

        for (int day = 1; day < 12; day++) {
            poem += firstLine(day)
                    + allGifts(day)
                    + bundle.getString("doubleNewline");
        }

        return poem;
    }

    public static void main(String[] args) {
        System.out.println(poem());
    }
}