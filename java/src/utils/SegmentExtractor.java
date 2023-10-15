package utils;

import java.util.ArrayList;
import java.util.List;
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
    
    public List<String> splitSentencesByComma(String text) {
		List<String> sentences = new ArrayList<String>();
		Pattern pattern = Pattern.compile("(\\w+)(, )");
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			sentences.add(matcher.group(1));
		}

		return sentences;
	}

}
