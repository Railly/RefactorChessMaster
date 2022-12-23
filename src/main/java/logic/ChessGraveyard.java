<<<<<<<< HEAD:Original.src/ChessGraveyard.java
import java.awt.GridLayout;
import javax.swing.*;
========
package logic;

import java.awt.GridLayout;
import javax.swing.*;

import ui.ChessGamePiece;

>>>>>>>> MartinRodriguez:src/main/java/logic/ChessGraveyard.java
// -------------------------------------------------------------------------
/**
 * Represents the graveyard where pieces lie after being captured.
 *
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class ChessGraveyard
<<<<<<<< HEAD:Original.src/ChessGraveyard.java
    extends JPanel{
    private String title;
========
        extends JPanel {
    private String title;

>>>>>>>> MartinRodriguez:src/main/java/logic/ChessGraveyard.java
    // ----------------------------------------------------------
    /**
     * Create a new ChessGraveyard object.
     *
     * @param title
<<<<<<<< HEAD:Original.src/ChessGraveyard.java
     *            the title of the graveyard
     */
    public ChessGraveyard( String title ){
        this.title = title;
        this.add( new JLabel( title ) );
        this.setLayout( new GridLayout( 8, 0 ) );
    }
========
     *              the title of the graveyard
     */
    public ChessGraveyard(String title) {
        this.title = title;
        this.add(new JLabel(title));
        this.setLayout(new GridLayout(8, 0));
    }

>>>>>>>> MartinRodriguez:src/main/java/logic/ChessGraveyard.java
    // ----------------------------------------------------------
    /**
     * Adds a piece to the graveyard.
     *
     * @param piece
<<<<<<<< HEAD:Original.src/ChessGraveyard.java
     *            the GamePiece to add
     */
    public void addPiece( ChessGamePiece piece ){
        piece.setPieceLocation( -1, -1 );
        JLabel pieceLabel = new JLabel();
        pieceLabel.setIcon( piece.getImage() );
        this.add( pieceLabel );
    }
========
     *              the GamePiece to add
     */
    public void addPiece(ChessGamePiece piece) {
        piece.setPieceLocation(-1, -1);
        JLabel pieceLabel = new JLabel();
        pieceLabel.setIcon(piece.getImage());
        this.add(pieceLabel);
    }

>>>>>>>> MartinRodriguez:src/main/java/logic/ChessGraveyard.java
    // ----------------------------------------------------------
    /**
     * Removes all pieces from the graveyard.
     */
<<<<<<<< HEAD:Original.src/ChessGraveyard.java
    public void clearGraveyard(){
        this.removeAll();
        this.add( new JLabel( title ) );
========
    public void clearGraveyard() {
        this.removeAll();
        this.add(new JLabel(title));
>>>>>>>> MartinRodriguez:src/main/java/logic/ChessGraveyard.java
    }
}
