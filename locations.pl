% Lugares
% Instituciones educativas
lugar(uca).
lugar(escuela_alemana).
lugar(instituto_hermanas_somascas).
lugar(instituto_tecnico_emiliani).
lugar(colegio_augusto_walte).

% Centros de Salud
lugar(instituto_salvadoreno_del_seguro_social). 
lugar(farmacia_economica_la_sultana).
lugar(analiza_laboratio_clinico).
lugar(bioinnova).
lugar(cruz_verde_antiguo_cuscatlan).

% Gasolineras
lugar(uno_la_sultana).
lugar(uno_las_lomas).
lugar(uno_los_proceres).
lugar(uno_monumental).
lugar(puma_los_proceres).

%% Parques, eco centros o centros deportivos 
lugar(cancha_emiliani).
lugar(parque_lomas_de_san_francisco).
lugar(parque_bicentenario).
lugar(parque_central_antiguo_cuscatlan).
lugar(estadio_cuscatlan).

% Centros comerciales
lugar(multiplaza).
lugar(centro_comercial_las_cascadas).
lugar(la_gran_via).
lugar(plaza_tunal).
lugar(centro_comercial_jardines).


%% Calles y segmentos de calle 

%% Calle cantabrico, 6 partes
calles(calle_cantabrico_s1).
calles(calle_cantabrico_s2).
calles(calle_cantabrico_s3).
calles(calle_cantabrico_s4).
calles(calle_cantabrico_s5).
calles(calle_cantabrico_s6).

%% Calle Mediterraneo, 16 secciones
calles(calle_mediterraneo_s1).
calles(calle_mediterraneo_s2).
calles(calle_mediterraneo_s3).
calles(calle_mediterraneo_s4).
calles(calle_mediterraneo_s5).
calles(calle_mediterraneo_s6).
calles(calle_mediterraneo_s7).
calles(calle_mediterraneo_s8).
calles(calle_mediterraneo_s9).
calles(calle_mediterraneo_s10).
calles(calle_mediterraneo_s11).
calles(calle_mediterraneo_s12).
calles(calle_mediterraneo_s13).
calles(calle_mediterraneo_s14).
calles(calle_mediterraneo_s15).
calles(calle_mediterraneo_s16).

%% Avenida Albert Einstein, 4 seccion
calles(avenida_albert_einstein_s1).
calles(avenida_albert_einstein_s2).
calles(avenida_albert_einstein_s3).
calles(avenida_albert_einstein_s4).

%% Boulevard La Sultana, 5 secciones
calles(boulevard_la_sultana_s1).
calles(boulevard_la_sultana_s2).
calles(boulevard_la_sultana_s3).
calles(boulevard_la_sultana_s4).
calles(boulevard_la_sultana_s5).

%% Avenida Las Palmeras, 3 secciones
calles(avenida_las_palmeras_s1).
calles(avenida_las_palmeras_s2).
calles(avenida_las_palmeras_s3).

%% 1ra Avenida Norte, 1 seccion
calles(primera_avenida_norte_s1).

%% 3 Avenida Norte, 5 secciones
calles(tercera_avenida_norte_s1).
calles(tercera_avenida_norte_s2).
calles(tercera_avenida_norte_s3).
calles(tercera_avenida_norte_s4).
calles(tercera_avenida_norte_s5).

%% 1 Calle Oriente, 5 secciones
calles(primera_calle_oriente_s1).
calles(primera_calle_oriente_s2).
calles(primera_calle_oriente_s3).
calles(primera_calle_oriente_s4).
calles(primera_calle_oriente_s5).

%% 1 Calle Poniente, 1 seccion
calles(primera_calle_poniente_s1).

%% Boulevard Walter Thilo Deininger, 6 secciones
calles(boulevard_walter_thilo_deininger_s1).
calles(boulevard_walter_thilo_deininger_s2).
calles(boulevard_walter_thilo_deininger_s3).
calles(boulevard_walter_thilo_deininger_s4).
calles(boulevard_walter_thilo_deininger_s5).
calles(boulevard_walter_thilo_deininger_s6).

%% Calle Cuscatlan Poniente, 1 seccion
calles(calle_cuscatlan_poniente_s1).

%% Carretera Panamericana, 12 secciones
calles(carretera_panamericana_s1).
calles(carretera_panamericana_s2).
calles(carretera_panamericana_s3).
calles(carretera_panamericana_s4).
calles(carretera_panamericana_s5).
calles(carretera_panamericana_s6).
calles(carretera_panamericana_s7).
calles(carretera_panamericana_s8).
calles(carretera_panamericana_s9).
calles(carretera_panamericana_s10).
calles(carretera_panamericana_s11).
calles(carretera_panamericana_s12).

%% Boulevard los Proceres, 4 secciones
calles(boulevard_los_proceres_s1).
calles(boulevard_los_proceres_s2).
calles(boulevard_los_proceres_s3).
calles(boulevard_los_proceres_s4).

%% Boulevard Monsenor Romero, 4 secciones
calles(boulevard_monsenor_romero_s1).
calles(boulevard_monsenor_romero_s2).
calles(boulevard_monsenor_romero_s3).
calles(boulevard_monsenor_romero_s4).


%% Boulevard Altamira, 1 seccion
calles(boulevard_altamira_s1).

%% Calle Los Viveros, 1 seccion
calles(calle_los_viveros_s1).

%% Calle Los Estadi, 1 seccion
calles(calle_los_estadi_s1).

%% Calle Antigua Ferrocaril, 2 secciones
calles(calle_antigua_ferrocaril_s1).
calles(calle_antigua_ferrocaril_s2).

%% Calle San Jeronimo Emiliani, 1 seccion
calles(calle_san_jeronimo_emiliani_s1).

%% TODO: asigar las coordenadas
%% Coordenadas de los lugares, x, y
%% Instituciones educativas
%% centros de salud
%% gasolineras
%% parques, eco centros o centros deportivos
%% centros comerciales
%% calles y segmentos de calle


%% Conexiones entre los lugares y calles
%% Instituciones educativas
%% UCA 
conecta(uca, calle_cantabrico_s4).
conecta(uca, boulevard_la_sultana_s3).
conecta(uca, boulevard_los_proceres_s4).
conecta(calle_cantabrico_s4, uca).
conecta(boulevard_la_sultana_s3, uca).
conecta(boulevard_los_proceres_s4, uca).

%% Escuela Alemana
conecta(escuela_alemana,calle_mediterraneo_s9).
conecta(calle_mediterraneo_s9, escuela_alemana).

%% Instituto Hermanas Somascas
conecta(instituto_hermanas_somascas, calle_mediterraneo_s13).
conecta(calle_mediterraneo_s13, instituto_hermanas_somascas).

%% Instituto Tecnico Emiliani
conecta(instituto_tecnico_emiliani, carretera_panamericana_s3).
conecta(carretera_panamericana_s3, instituto_tecnico_emiliani).

%% Colegio Augusto Walte
conecta(colegio_augusto_walte, calle_san_jeronimo_emiliani_s1).
conecta(calle_san_jeronimo_emiliani_s1, colegio_augusto_walte).

%% Centros de Salud
%% Instituto Salvadoreno del Seguro Social
conecta(instituto_salvadoreno_del_seguro_social, boulevard_monsenor_romero_s3).
conecta(boulevard_monsenor_romero_s3, instituto_salvadoreno_del_seguro_social).