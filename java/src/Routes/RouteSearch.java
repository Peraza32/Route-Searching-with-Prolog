package Routes;

import java.util.*;

public class RouteSearch {

	private static List<String> route = new ArrayList<String>();
	private static List<String> formattedStreets = new ArrayList<String>();
	private static List<String> stringOfCoordinates = new ArrayList<String>();
	private static List<List<String>> formattedCoordinates = new ArrayList<List<String>>();

	private static PrologConsult searchRoute = new PrologConsult();
	private static RegexToList regex = new RegexToList();

	public static void main(String[] args) {
		System.out.println(getStreets("uca", "escuela_alemana"));
		
		System.out.println(getStreetsCoordinates(getStreets("uca", "multiplaza")));
	}

	// This method returns the streets that are gonna be used to ge to the
	// destination
	private static List<String> getStreets(String from, String where) {
		route = searchRoute.getRoute(from, where);
		formattedStreets = regex.splitSentencesByComma(route.get(0));
		return formattedStreets;
	}

	// This methos takes a list of formatted streets
	private static List<List<String>> getStreetsCoordinates(List<String> streets) {
		for (int i = 0; i < formattedStreets.size(); i++) {
			String pivot = searchRoute.getStreetsCoordinates(formattedStreets.get(i));
			stringOfCoordinates.add(pivot);
		}

		formattedCoordinates = regex.create2DListFromStrings(stringOfCoordinates);
		return formattedCoordinates;
	}

}
