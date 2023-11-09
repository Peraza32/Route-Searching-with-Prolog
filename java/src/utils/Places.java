package utils;

public class Places {
    private static Places instance;
    private String[] placeNames = {
        "Seleccione un lugar...",
        "---- Instituciones educativas ----",
        "uca",
        "escuela_alemana",
        "instituto_hermanas_somascas",
        "instituto_tecnico_emiliani",
        "colegio_augusto_walte",
        "---- Centros de Salud -----",
        "instituto_salvadoreno_del_seguro_social",
        "centro_dental_la_sultana",
        "analiza_laboratorio_clinico",
        "bioinnova",
        "cruz_verde_antiguo_cuscatlan",
        "---- Gasolineras ----",
        "uno_la_sultana",
        "uno_las_lomas",
        "uno_los_proceres",
        "uno_autopista_sur",
        "puma_los_proceres",
        "---- Parques, eco centros o centros deportivos ----",
        "cancha_emiliani",
        "parque_lomas_de_san_francisco",
        "parque_bicentenario",
        "parque_central_antiguo_cuscatlan",
        "estadio_cuscatlan",
        "---- Centros comerciales ----",
        "multiplaza",
        "centro_comercial_las_cascadas",
        "la_gran_via",
        "plaza_tunal",
        "centro_comercial_jardines"
    };

    private String[] invalidPlaces = {
        "Seleccione un lugar...",
        "---- Instituciones educativas ----",
        "---- Centros de Salud -----",
        "---- Gasolineras ----",
        "---- Parques, eco centros o centros deportivos ----",
        "---- Centros comerciales ----"
    };

    private Places() {
    }

    public boolean isValidPlace(String place) {
        for (String invalidPlace : invalidPlaces)
            if (invalidPlace.equals(place)) return false;
           
        return true;
    }

    public static Places getInstance() {
        if (instance == null) {
            instance = new Places();
        }
        return instance;
    }

    public String[] getPlaceNames() {
        return placeNames;
    }

    public String[] getInvalidPlaces() {
        return invalidPlaces;
    }
}
