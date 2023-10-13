package Routes;

import org.jpl7.*;
import java.util.*;

public class PrologConsult {

	private List<String> routeList = new ArrayList<String>();

	public List<String> getRoute(String from, String where) {

		Query q1 = new Query("consult",
				// Change with your route for the locations.pl file
				new Term[] { new Atom(
						"C:\\Users\\gilbe\\Desktop\\UCA\\ciclo-02-2023\\programacion-declarativa\\primer-proyecto\\Route-Searching-with-Prolog\\prolog\\locations.pl") });

		System.out.println("consult " + (q1.hasSolution() ? "succeeded" : "failed"));
		System.out.println("");

		Variable Route = new Variable("Route");
		Query q2 = new Query("ir_hacia", new Term[] { new Atom(from), new Atom(where), Route });

		Map<String, Term>[] solution;

		if (q1.hasSolution() && q2.hasSolution()) {
			solution = q2.allSolutions();

			for (int i = 0; i < solution.length; i++) {
				// System.out.println("Route = " + solution[i].get("Route"));
				routeList.add(solution[i].get("Route").toString());
			}

			return routeList;
		} else {
			// System.out.println("consult q1 or q2 has an issue, please check");
			// System.out.println("");
			routeList.add(null);
			return routeList;
		}

	}

}
