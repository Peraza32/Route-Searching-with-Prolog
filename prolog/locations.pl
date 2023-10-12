%Estudiantes: Tito Erick Carpio Guerra - 00226620
%Estuciantes: Gilberto Eduardo Campos Acevedo - 00229220


%lugares de la casas.
lugar(quiosco).
lugar(jardin).
lugar(cuarto_papas).
lugar(pasillo_2).
lugar(cuarto_rodri).
lugar(banio).
lugar(lavadero).
lugar(comedor).
lugar(pasillo_1).
lugar(sala).
lugar(cuarto_estudio).
lugar(cocina).
lugar(cochera).
lugar(calle).


%relaciones
conecta_con(lavadero,jardin).
conecta_con(jardin,lavadero).
conecta_con(jardin,quiosco).
conecta_con(quisco,jardin).
conecta_con(jardin,pasillo_2).
conecta_con(pasillo_2,jardin).
conecta_con(pasillo_2,cuarto_rodri).
conecta_con(cuarto_rodri,pasillo_2).
conecta_con(pasillo_2,cuarto_papas).
conecta_con(cuarto_papas,pasillo_2).
conecta_con(banio,pasillo_2).
conecta_con(pasillo_2,banio).
conecta_con(pasillo_2,pasillo_1).
conecta_con(pasillo_1,pasillo_2).
conecta_con(pasillo_1,comedor).
conecta_con(comedor,pasillo_1).
conecta_con(pasillo_1,cocina).
conecta_con(cocina,pasillo_1).
conecta_con(cocina,lavadero).
conecta_con(lavadero,cocina).
conecta_con(pasillo_1,cuarto_estudio).
conecta_con(cuarto_estudio,pasillo_1).
conecta_con(sala,pasillo_1).
conecta_con(pasillo_1,sala).
conecta_con(sala,cochera).
conecta_con(cochera,sala).
conecta_con(cochera,calle).
conecta_con(calle,cochera).
%_______________________________________________________________
%ir hacia
%caso base

ir_hacia(X, X, [X]):-
    writeln("Ya estás en el lugar").

ir_hacia(X, Y, Route):-
    lugar(X),
    lugar(Y),
    ir_hacia(X, Y, [X], Route).

ir_hacia(X, _, _):-
    \+ lugar(X),
    writeln("Los lugares no existen :("),
    fail.

ir_hacia(_, Y, _):-
    \+ lugar(Y),
    writeln("Los lugares no existen :("),
    fail.

ir_hacia(X, Y, Acc, Route):-
    abolish(eslabon, 1),
    assert(eslabon(X)),
    ir_hacia2(X, Y, Acc, Route).

ir_hacia2(X, Y, Acc, Route):-
    conecta_con(X, Y),
    reverse([Y|Acc], Route),
    assert(eslabon(Y)),
    !.

ir_hacia2(X, _, _, _):-
    conecta_con(X, Z),
    eslabon(Z),
    fail.

ir_hacia2(X, Y, Acc, Route):-
    conecta_con(X, Z),
    not(eslabon(Z)),
    assert(eslabon(Z)),
    ir_hacia2(Z, Y, [Z|Acc], Route),
    !.
