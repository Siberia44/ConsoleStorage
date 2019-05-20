package task4.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputUtil {
    public final static String DATE_RGEX = "(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d";

    public static boolean isDateCorrect(String date) {
        Pattern patternForDate = Pattern.compile(DATE_RGEX);
        Matcher matcher = patternForDate.matcher(date);
        return matcher.find() ? true : false;
    }
}
