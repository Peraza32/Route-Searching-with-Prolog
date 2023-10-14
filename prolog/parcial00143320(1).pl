% Base de conocimientos
% Victor Daniel Peraza Bolaños 00143320

% lugares
lugar(calle).
lugar(cochera).
lugar(sala).
lugar(cuarto_de_estudio).
lugar(cocina).
lugar(comedor).
lugar(pasillo1).
lugar(bano).
lugar(pasillo2).
lugar(cuarto_papas).
lugar(cuarto_rodri).
lugar(jardin).
lugar(quiosco).
lugar(lavadero).

% objetos

objeto(pantuflas).
objeto(flores).
objeto(pisto).
objeto(agua).
objeto(limones).
objeto(papel_higienico).
objeto(revista_3X).


% conexiones
% casa
% top down
conecta_con(calle,cochera).
conecta_con(cochera,sala).
conecta_con(sala, pasillo1).
conecta_con(pasillo1,cuarto_de_estudio).
conecta_con(pasillo1,cocina).
conecta_con(pasillo1,comedor).
conecta_con(pasillo1, pasillo2).
conecta_con(pasillo2,bano).
conecta_con(pasillo2,cuarto_papas).
conecta_con(pasillo2,cuarto_de_rodri).
conecta_con(pasillo2,jardin).
conecta_con(jardin,quiosco).
conecta_con(jardin,lavadero).

% down up

conecta_con(cochera,calle).
conecta_con(sala,cochera).
conecta_con(pasillo1,sala).
conecta_con(cuarto_de_estudio,pasillo1).
conecta_con(cocina,pasillo1).
conecta_con(comedor,pasillo1).
conecta_con(pasillo2,pasillo1).
conecta_con(bano,pasillo2).
conecta_con(cuarto_papas,pasillo2).
conecta_con(cuarto_de_rodri,pasillo2).
conecta_con(jardin,pasillo2).
conecta_con(quiosco,jardin).
conecta_con(lavadero,jardin).

% objeto, casa
esta_en(pantuflas,cuarto_de_rodri).
esta_en(flores,jardin).
esta_en(pisto,cuarto_papas).
esta_en(papel_higienico,bano).
esta_en(revista_3X,quiosco).
esta_en(limones,jardin).
esta_en(agua,cocina).



% reglas
% manejo en casa
ir_hacia(X,Y):-
    abolish(nodo, 1),
    assert(nodo(X)),
    ir_hacia_2(X, Y),
    writeln(X).

ir_hacia_2(X,Y):-
    conecta_con(X, Y),
    writeln(Y),
    assert(nodo(Y)),
    !.

ir_hacia_2(X,_):-
    conecta_con(X, Z),
    nodo(Z),
    fail.

ir_hacia_2(X, Y):-
    conecta_con(X, Z),
    not(nodo(Z)),
    assert(nodo(Z)),
    ir_hacia_2(Z, Y),
    writeln(Z),
    !.

% ir por objetos

traer(X,Y):-
    not(lugar(X)),
    writeln("Lugar no existe"),
    !, fail;
    not(objeto(Y)),
    writeln("Objeto no existe"),
    !, fail.

traer(X,Y):-
    writeln("-----------------"),
    esta_en(Y,Z),
    ir_hacia(X,Z),
    writeln("-----------------"),
    ir_hacia(Z,X).
