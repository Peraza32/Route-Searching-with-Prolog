import org.jpl7.*;
import java.io.*;
import java.util.*;

public class RouteSearch {

	public static void main(String[] args) throws IOException {

		Query q1 = new Query("consult",
				// Change with your route for the locations.pl file
				new Term[] { new Atom(
						"C:\\Users\\gilbe\\Desktop\\UCA\\ciclo-02-2023\\programacion-declarativa\\primer-proyecto\\Route-Searching-with-Prolog\\prolog\\locations.pl") });

		System.out.println("consult " + (q1.hasSolution() ? "succeeded" : "failed"));
		System.out.println("");

		Query q2 = new Query("ir_hacia", new Term[] { new Atom("calle"), new Atom("jardin") });
		q2.hasSolution();
		//System.out.println("ir_hacia(calle,jardin) is " + (q2.hasSolution() ? "provable" : "not provable"));

	}
}
