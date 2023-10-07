import org.jpl7.*;

public class IntegrationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Query q1 = 
			    new Query( 
				"consult", 
				new Term[] {new Atom("")} //Change with your route for the locations.pl file
			    );
	
		System.out.println( "consult " + (q1.hasSolution() ? "succeeded" : "failed"));
	}

}
