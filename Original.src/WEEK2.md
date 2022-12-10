# Identificación de clases principales

En base al código de este repositorio, se podría decir que las clases principales son las siguientes:

- **ChessMain**: esta clase contiene el método principal (main) del programa, que es el punto de entrada para iniciar la ejecución del juego.
- **ChessPanel**: esta clase se encarga de mostrar la interfaz gráfica del juego y contiene la mayor parte de los componentes de la GUI, como el menú, el tablero de juego, el registro de eventos, los cementerios de piezas eliminadas y el motor del juego.

- **ChessGameBoard**: esta clase representa el tablero de juego y contiene la lógica para dibujarlo en la pantalla y para gestionar los movimientos de las piezas.

- **ChessGameEngine**: esta clase es el corazón del juego y contiene la lógica para realizar el seguimiento de las piezas en el tablero, verificar si un movimiento es válido o no, y gestionar el estado del juego (como el turno de los jugadores, el jaque, el jaque mate, etc.).

Además de estas clases, hay otras que también son importantes para el funcionamiento del programa, como _ChessMenuBar_, _ChessGameLog_, _ChessGraveyard_ y las clases que representan a cada una de las piezas del ajedrez (como _King_, _Knight_, _Pawn_, _Queen_ y _Rook_). Sin embargo, estas clases dependen de las clases principales para poder realizar su función, y por lo tanto pueden considerarse clases secundarias o complementarias en la estructura del programa.
