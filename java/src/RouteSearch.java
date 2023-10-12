import org.jpl7.*;
import java.io.*;
import java.util.*;

public class RouteSearch {

	public static void main(String[] args) throws IOException {

		Query q1 = new Query("consult",
				// Change with your route for the locations.pl file
				new Term[] { new Atom(
						"C:\\Users\\gilbe\\Desktop\\UCA\\ciclo-02-2023\\programacion-declarativa\\primer-proyecto\\Route-Searching-with-Prolog\\prolog\\locations.pl") });

		Variable Route = new Variable("Route");
		Query q2 = new Query("ir_hacia", new Term[] { new Atom("cocina"), new Atom("qwqw"), Route });

		Map<String, Term>[] solution;

		if (q1.hasSolution() && q2.hasSolution()) {
			solution = q2.allSolutions();

			for (int i = 0; i < solution.length; i++) {
				System.out.println("Route = " + solution[i].get("Route"));
			}
		} else {
			System.out.println("consult q1 or q2 has an issue, please checl");
			System.out.println("");
		}

	}
}
