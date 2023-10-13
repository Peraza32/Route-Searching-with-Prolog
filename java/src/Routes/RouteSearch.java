package Routes;

import java.util.*;

public class RouteSearch {

	private static List<String> route = new ArrayList<String>();
	private static PrologConsult searchRoute = new PrologConsult();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		route = searchRoute.getRoute("uca", "multiplaza");

		for (int i = 0; i < route.size(); i++) {
			System.out.println(route.get(i));
		}
	}

}
