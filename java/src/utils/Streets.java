package utils;

import java.util.ArrayList;
import java.util.List;

import models.Street;
import models.Coordinates;

public class Streets {
	private static Streets instance;
	private List<Street> content = new ArrayList<>();
	public String[] streetNames = { 
			"calle_cantabrico", 
			"calle_mediterraneo", 
			"avenida_albert_einstein",
			"boulevard_la_sultana", 
			"avenida_las_palmeras", 
			"primera_avenida_norte", 
			"avenida_antiguo_cuscatlan",
			"tercera_avenida_norte", 
			"primera_calle_oriente", 
			"primera_calle_poniente",
			"boulevard_walter_thilo_deininger", 
			"calle_cuscatlan_poniente", 
			"carretera_panamericana",
			"boulevard_los_proceres", 
			"boulevard_monsenor_romero", 
			"boulevard_altamira", 
			"calle_los_viveros",
			"calle_los_estadi", 
			"calle_antigua_ferrocaril", 
			"calle_san_jeronimo_emiliani", 
			"calle_las_azucenas",
			"avenida_rio_amazonas" };

	private Streets() {
		fillList();
	}

	public static Streets getInstance() {
		if (instance == null) {
			instance = new Streets();
		}
		return instance;
	}

	public List<Street> getBurnedStreets() {
		return content;
	}

	public void addBurnedStreet(Street street) {
		content.add(street);
	}

	private void fillList() {

		List<List<Coordinates>> streetCoordinates = new ArrayList<>();
		// Define the coordinates for each street
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));
		streetCoordinates.add(List.of(new Coordinates(0, 0)));

		// Create Street objects based on the names and coordinates
		for (int i = 0; i < streetNames.length; i++) {

			String streetName = streetNames[i];
			List<Coordinates> coordinates = streetCoordinates.get(i);

			Street street = new Street(streetName, coordinates);
			content.add(street);

		}
	}
}
