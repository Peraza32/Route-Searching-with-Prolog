package Routes;

import org.jpl7.*;
import java.util.*;

public class PrologConsult {

	private void checkConnection(String from) {
		List<String> routeList = new ArrayList<String>();

		Query q1 = new Query("consult",
				// Change with your route for the locations.pl file
				new Term[] { new Atom(
						"C:\\Users\\gilbe\\Desktop\\UCA\\ciclo-02-2023\\programacion-declarativa\\primer-proyecto\\Route-Searching-with-Prolog\\prolog\\locations.pl") });

		System.out.println("consult " + from + " " + (q1.hasSolution() ? "succeeded" : "failed"));
		System.out.println("");
	}

	public List<String> getRoute(String from, String where) {

		List<String> routeList = new ArrayList<String>();

		checkConnection("getRoute");

		Variable Route = new Variable("Route");
		Query q2 = new Query("ir_hacia", new Term[] { new Atom(from), new Atom(where), Route });

		Map<String, Term>[] solution;

		if (q2.hasSolution()) {
			solution = q2.allSolutions();

			for (int i = 0; i < solution.length; i++) {
				routeList.add(solution[i].get("Route").toString());
			}

			return routeList;
		} else {
			routeList.add(null);
			return routeList;
		}

	}

	public String getStreetsCoordinates(String street) {
		List<String> routeCoordinates = new ArrayList<String>();

		checkConnection("getCoordinates");

		Variable Coordinates = new Variable("List");
		Query q3 = new Query("calle_coordenadas", new Term[] { new Atom(street), Coordinates });

		Map<String, Term>[] solution;

		solution = q3.allSolutions();

		for (int j = 0; j < solution.length; j++) {
			// System.out.println("Coordinates= " + solution[j].get("List"));
			routeCoordinates.add(solution[j].get("List").toString());
			//System.out.println(routeCoordinates.toString());
		}

		return routeCoordinates.toString();
	}

}
