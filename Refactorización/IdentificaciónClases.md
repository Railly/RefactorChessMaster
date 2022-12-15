# Clases principales


### ChessMain,java

Es la clase que instancia un nuevo JFrame(ventana), y en ese frame se agrega el panel principal => ChessPanel(). En la clase ChessMain se define el nombre de la ventana.

### ChessPanel.java

Es el panel principal, se definen las posiciones en la que estarán los elementos como:
- Menu Bar: Al norte
- Game Board: Al centro
- Game Log: Al sur. Muestra los movimientos hechos y los turnos de los jugadores
- LabelPlayerOne: Al este del panel
- LabelPlayerTwo: Al oeste del panel

También se define la dimensión del panel 800x600

# Clases Secundarias

### Representan piezas del tablero

- Rock.java
- Queen.java
- Pawn.java
- Knight.java
- King.java
- Bishop.java

# Cambios en el código

### ChessPanel.java

- El método *getGraveyard* identifica al jugador, en la documentación se lee que *whichPlayer* tiene como valor 1 o 2. Se omite el else if, si witchPlayer no es 1, entonces es 2.

