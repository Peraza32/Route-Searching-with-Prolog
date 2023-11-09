package utils;

import java.util.ArrayList;
import java.util.List;

import models.Street;
import models.Segment;
import models.Segment;

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
			"avenida_rio_amazonas" 
	};

	private Streets() {
		fillList();
	}
	
	public Street findStreetByName(String name) {
        for (Street street : content) {
            if (street.getName().equals(name)) {
                return street;
            }
        }
        return null; // Street not found
    }

	public static Streets getInstance() {
		if (instance == null) {
			instance = new Streets();
		}
		return instance;
	}
	
	/**
	 * @return the content
	 */
	public List<Street> getContent() {
		return content;
	}

	public void addStreet(Street street) {
		content.add(street);
	}

	private void fillList() {

		List<List<Segment>> streetCoordinates = new ArrayList<>();
		// Defining the coordinates for each street
		// "calle_cantabrico",  
		streetCoordinates.add(List.of(
			    new Segment(883, 410, 875, 408),
			    new Segment(875, 408, 787, 383),
			    new Segment(787, 383, 776, 386),
			    new Segment(776, 386, 774, 396),
			    new Segment(774, 396, 872, 421),
			    new Segment(875, 408, 872, 426)
			)); 
		
		// "calle_mediterraneo", 
		streetCoordinates.add(List.of(
			    new Segment(925, 437, 925, 437),
			    new Segment(925, 437, 888, 430),
			    new Segment(888, 430, 879, 421),
			    new Segment(879, 421, 871, 424),
			    new Segment(871, 424, 820, 414),
			    new Segment(820, 414, 765, 400),
			    new Segment(765, 400, 748, 393),
			    new Segment(748, 393, 718, 377),
			    new Segment(718, 377, 701, 365),
			    new Segment(701, 365, 688, 358),
			    new Segment(688, 358, 674, 349),
			    new Segment(674, 349, 640, 326),
			    new Segment(640, 326, 584, 282),
			    new Segment(584, 282, 580, 270),
			    new Segment(580, 270, 560, 288),
			    new Segment(580, 270, 560, 288)
			));
		
		// "avenida_albert_einstein",
		streetCoordinates.add(List.of(
			    new Segment(1012, 213, 890, 407),
			    new Segment(890, 407, 884, 426),
			    new Segment(884, 426, 873, 529),
			    new Segment(873, 529, 872, 539),
			    new Segment(872, 539, 752, 631)
		));
		
		// "boulevard_la_sultana",
		streetCoordinates.add(List.of(
			    new Segment(674, 349, 730, 287),
			    new Segment(730, 287, 758, 275),
			    new Segment(758, 275, 804, 249),
			    new Segment(804, 249, 805, 236),
			    new Segment(805, 236, 805, 205)
			));
		
		// "avenida_las_palmeras",
		streetCoordinates.add(List.of(
			    new Segment(670, 355, 606, 451),
			    new Segment(606, 451, 599, 460),
			    new Segment(599, 460, 538, 534)
			));

		// "primera_avenida_norte", 
		streetCoordinates.add(List.of(
			    new Segment(632, 623, 644, 591)
			));

		// "avenida_antiguo_cuscatlan",
		streetCoordinates.add(List.of(
			    new Segment(730, 388, 659, 485),
			    new Segment(659, 485, 652, 492),
			    new Segment(652, 492, 631, 532)
			));

		// "tercera_avenida_norte", 
		streetCoordinates.add(List.of(
			    new Segment(631, 533, 629, 574),
			    new Segment(629, 574, 626, 584),
			    new Segment(626, 584, 614, 611)
			));

		// "primera_calle_oriente", 
		streetCoordinates.add(List.of(
			    new Segment(751, 634, 717, 630),
			    new Segment(717, 630, 708, 627),
			    new Segment(708, 627, 704, 624),
			    new Segment(704, 624, 694, 622),
			    new Segment(694, 622, 678, 615)
			));

		// "primera_calle_poniente",
		streetCoordinates.add(List.of(
			    new Segment(694, 623, 628, 582)
			));

		// "boulevard_walter_thilo_deininger", 
		streetCoordinates.add(List.of(
			    new Segment(628, 626, 609, 607),    // Segment 1
			    new Segment(609, 607, 541, 547),    // Segment 2
			    new Segment(541, 547, 532, 536),    // Segment 3
			    new Segment(532, 536, 398, 473),    // Segment 4
			    new Segment(398, 473, 382, 470),    // Segment 5
			    new Segment(382, 470, 334, 469),    // Segment 6
			    new Segment(382, 470, 380, 443)     // Segment 7
			));

		// "calle_cuscatlan_poniente", 
		streetCoordinates.add(List.of(
				new Segment(630, 626, 759, 685)
		));

		// "carretera_panamericana",
		streetCoordinates.add(List.of(
			    new Segment(714, 204, 619, 226),   // Segment 1
			    new Segment(659, 193, 619, 226),   // Segment 2
			    new Segment(619, 226, 500, 323),   // Segment 3
			    new Segment(380, 443, 504, 327),   // Segment 4
			    new Segment(500, 323, 386, 371),   // Segment 5
			    new Segment(386, 371, 350, 380),   // Segment 6
			    new Segment(307, 434, 361, 454),   // Segment 7
			    new Segment(265, 442, 318, 447),   // Segment 8
			    new Segment(160, 552, 341, 468),   // Segment 9
			    new Segment(291, 423, 163, 487),   // Segment 10
			    new Segment(163, 487, 51,  542),   // Segment 11
			    new Segment(163, 487, 142, 547),   // Segment 12
			    new Segment(128, 548, 154, 549),   // Segment 13
			    new Segment(26,  559, 128, 548)    // Segment 14
			));

		// "boulevard_los_proceres", 
		streetCoordinates.add(List.of(
			    new Segment(1590, 143, 1391, 184),  // Segment 1
			    new Segment(1391, 184, 1040, 208),  // Segment 2
			    new Segment(1040, 208, 904, 203),   // Segment 3
			    new Segment(904, 203, 1040, 208),    // Segment 4
			    new Segment(904, 190, 796, 188)     // Segment 5
			));

		// "boulevard_monsenor_romero", 
		streetCoordinates.add(List.of(
			    new Segment(307, 139, 737, 189),  // Segment 1
			    new Segment(737, 189, 728, 148),  // Segment 2
			    new Segment(737, 189, 673, 216),  // Segment 3
			    new Segment(3, 125, 307, 139)     // Segment 4
			));

		// "boulevard_altamira", 
		streetCoordinates.add(List.of(
			    new Segment(1576, 154, 1585, 222)  // Segment 1
			));

		// "calle_los_viveros",
		streetCoordinates.add(List.of(
			    new Segment(1582, 224, 1476, 232)  // Segment 1
			));

		// "calle_los_estadi", 
		streetCoordinates.add(List.of(
			    new Segment(1475, 234, 1465, 167)  // Segment 1
			));

		// "calle_antigua_ferrocaril", 
		streetCoordinates.add(List.of(
			    new Segment(652, 377, 558, 394),   // Segment 1
			    new Segment(558, 394, 397, 466)   // Segment 2
			));

		// "calle_san_jeronimo_emiliani", 
		streetCoordinates.add(List.of(
			    new Segment(556, 395, 581, 288)   // Segment 1
			));

		// "calle_las_azucenas",
		streetCoordinates.add(List.of(
			    new Segment(588, 389, 630, 412)   // Segment 1
			));

		// "avenida_rio_amazonas
		streetCoordinates.add(List.of(
			    new Segment(768, 401, 700, 623)   // Segment 1
			));

		
		// Create Street objects based on the names and coordinates
		for (int i = 0; i < streetNames.length; i++) {

			String streetName = streetNames[i];
			List<Segment> coordinates = streetCoordinates.get(i);

			Street street = new Street(streetName, coordinates);
			content.add(street);

		}
	}
}
