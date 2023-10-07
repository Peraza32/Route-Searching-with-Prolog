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

ir_hacia(X,X):-
    writeln("Ya estas en el lugar").

ir_hacia(X,Y):-
    lugar(X),
    lugar(Y),
    conecta_con(X,Y).

ir_hacia(X,_):-
    \+ lugar(X),
    writeln("Los lugares no existen :("),
    fail.

ir_hacia(_,X):-
    \+ lugar(X),
    writeln("Los lugares no existen :("),
    fail.


ir_hacia(X, Y):-
    abolish(eslabon, 1),
    assert(eslabon(X)),
    ir_hacia2(X, Y),
    writeln(X).

ir_hacia2(X, Y):-
    conecta_con(X, Y),
    writeln(Y),
    assert(eslabon(Y)),
    !.

ir_hacia2(X, _):-
    conecta_con(X, Z),
    eslabon(Z),
    fail.

ir_hacia2(X, Y):-
    conecta_con(X, Z),
    not(eslabon(Z)), %verifica si no es un esalabon
    assert(eslabon(Z)), %si no es eslabon lo ingresa a la memoria
    ir_hacia2(Z, Y),
    writeln(Z),
    !.


% ______________________________________________________________
% objetos RODRI
objeto(pantunflas).
objeto(flores).
objeto(pisto).
objeto(agua).
objeto(limones).
objeto(papel_higienico).
objeto(triple_X).

%____________________________________________________________-_
%Relacion esta_en/2
%
esta_en(pantunflas,cuarto_rodri).
esta_en(flores,jardin).
esta_en(pisto,cuarto_papas).
esta_en(agua,cocina).
esta_en(limones,jardin).
esta_en(papel_higienico,banio).
esta_en(triple_X,quiosco).

%Relacion traer/2
traer(X,_):-
    \+ lugar(X),
    writeln("El lugar no existe"),
    !,fail.

traer(_,X):-
    \+ objeto(X),
    writeln("El objeto no existe"),
    !,fail.


traer(X,Y):-
    lugar(X),
    objeto(Y),
    esta_en(Y,Z),
    ir_hacia(X,Z),
    writeln("________________"),
    ir_hacia(Z,X).


