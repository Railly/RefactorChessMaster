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

### Bishop.java

- Se cambió el uso de if, else if, por switch case ya que muestra un poco más de rendimiento, también se eliminó el uso de múltiples return para facilitar el mantenimiento de la función.

# Refactorización final

### Se refactorizó el método createImage

- Rook.java
- Queen.java
- Pawn.java
- Knight.java
- King.java

### Se refactorizó el médoto move de CheesGamePiece

- Se cambiò la sentencia if, else que ejecutadaba la misma funcion solo cambiando el argumento. En su lugar se usò un operador ternario que permitia guardar el valor de ese argumento y enviarlo a la funcion

- En el mètodo isEnemy se aplicò la pràctica del video mostrado en clase en donde se recomienda no tener demasiados condionales if else anidados. En su lugar si la condicion es verdadera retorna true, caso contrario sigue la ejecuciòn y retorna false

- En el mètodo hasLegalMoves se tenian 3 returns, donde 2 de ellos retornaban false. Como norma general se intenta programar funciones con un solo return, o con un solo valor de respuesta. Al entrar en la condicional isPieceOnScreen, independientemente del proceso que se haga dentro de ella, el mètodo devolverìa un return False, el mismo que ya se encontraba al final del mètodo hasLegalMoves

- En el método showLegalMoves se eliminó la misma invocación dos veces de setBackground al Board, para esto antes de la asignacion del color del background se determinó qué color se le asignaría y se le almaceno en una variable mediante un booleano.