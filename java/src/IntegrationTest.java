import org.jpl7.*;

public class IntegrationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Query q1 = 
			    new Query( 
				"consult", 
				new Term[] {new Atom("C:\\Users\\gilbe\\Desktop\\UCA\\ciclo-02-2023\\programacion-declarativa\\primer-proyecto\\Route-Searching-with-Prolog\\prolog\\locations.pl")} 
			    );
	
		System.out.println( "consult " + (q1.hasSolution() ? "succeeded" : "failed"));
	}

}
