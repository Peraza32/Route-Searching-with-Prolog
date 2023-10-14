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
		// TODO Auto-generated method stub

		route = searchRoute.getRoute("uca", "multiplaza");
		formattedStreets = regex.splitSentencesByComma(route.get(0));
		
		// Iterar sobre el arreglo y asignar valores a cada elemento
	    for (int i = 0; i < formattedStreets.size(); i++) {
	    	String pivot = searchRoute.getStreetsCoordinates(formattedStreets.get(i));
	    	stringOfCoordinates.add(pivot);
	    }
	    
	    formattedCoordinates = regex.create2DListFromStrings(stringOfCoordinates);
	    
	    System.out.println(formattedCoordinates.toString());
	}

}
