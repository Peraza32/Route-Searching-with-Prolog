package Routes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexToList {

	public List<String> splitSentencesByComma(String text) {
		List<String> sentences = new ArrayList<String>();
		Pattern pattern = Pattern.compile("(\\w+)(, )");
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			sentences.add(matcher.group(1));
		}

		return sentences;
	}

	public List<List<String>> create2DListFromStrings(List<String> stringOfCoordinates) {
		List<List<String>> list = new ArrayList<>();
		Pattern pattern = Pattern.compile("\\[\\[(.*?)\\]\\]");
		for (String string : stringOfCoordinates) {
			Matcher matcher = pattern.matcher(string);
			if (matcher.find()) {
				List<String> subList = new ArrayList<>();
				for (String group : matcher.group(1).split(", ")) {
					subList.add(group);
				}
				list.add(subList);
			}
		}
		return list;
	}

}
