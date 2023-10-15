package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SegmentExtractor {
    public String extractName(String street) {
        Pattern pattern = Pattern.compile("(.+)_s(\\d+)?");
        Matcher matcher = pattern.matcher(street);

        if (matcher.find()) {
            return matcher.group(1);
        }

        return null;
    }

    public String extractNumber(String street) {
        Pattern pattern = Pattern.compile("(.+)_s(\\d+)?");
        Matcher matcher = pattern.matcher(street);

        if (matcher.find() && matcher.group(2) != null) {
            return matcher.group(2);
        }

        return null;
    }
}
