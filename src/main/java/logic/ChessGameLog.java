<<<<<<<< HEAD:Original.src/ChessGameLog.java
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.util.Date;
========
package logic;

import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollPane;
import java.util.Date;

>>>>>>>> MartinRodriguez:src/main/java/logic/ChessGameLog.java
// -------------------------------------------------------------------------
/**
 * A scrollable textArea representing the game log. (i.e. moves made by each
 * player)
 * 
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class ChessGameLog
<<<<<<<< HEAD:Original.src/ChessGameLog.java
    extends JScrollPane{
    private JTextArea textArea;
========
        extends JScrollPane {
    private JTextArea textArea;

>>>>>>>> MartinRodriguez:src/main/java/logic/ChessGameLog.java
    // ----------------------------------------------------------
    /**
     * Create a new ChessGameLog object.
     */
<<<<<<<< HEAD:Original.src/ChessGameLog.java
    public ChessGameLog(){
        super(
            new JTextArea( "", 5, 30 ),
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS );
        textArea = ( (JTextArea)this.getViewport().getView() );
    }
========
    public ChessGameLog() {
        super(
                new JTextArea("", 5, 30),
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        textArea = ((JTextArea) this.getViewport().getView());
    }

>>>>>>>> MartinRodriguez:src/main/java/logic/ChessGameLog.java
    // ----------------------------------------------------------
    /**
     * Adds a new line of text to the log.
     * 
     * @param s
<<<<<<<< HEAD:Original.src/ChessGameLog.java
     *            the line of text to add
     */
    public void addToLog( String s ){
        if ( textArea.getText().length() > 0 ){
            textArea.setText( textArea.getText() + "\n" + new Date() + " - "
                + s );
        }
        else
        {
            textArea.setText( new Date() + " - " + s );
        }
    }
    /**
     * Clears the log.
     */
    public void clearLog(){
        textArea.setText( "" );
    }
========
     *          the line of text to add
     */
    public void addToLog(String s) {
        if (textArea.getText().length() > 0) {
            textArea.setText(textArea.getText() + "\n" + new Date() + " - "
                    + s);
        } else {
            textArea.setText(new Date() + " - " + s);
        }
    }

    /**
     * Clears the log.
     */
    public void clearLog() {
        textArea.setText("");
    }

>>>>>>>> MartinRodriguez:src/main/java/logic/ChessGameLog.java
    // ----------------------------------------------------------
    /**
     * Gets the most recent statement added to the log.
     * 
     * @return String the most recent log statement
     */
<<<<<<<< HEAD:Original.src/ChessGameLog.java
    public String getLastLog(){
        int indexOfLastNewLine = textArea.getText().lastIndexOf( "\n" );
        if ( indexOfLastNewLine < 0 ){
            return textArea.getText();
        }
        return textArea.getText().substring( indexOfLastNewLine + 1 );
========
    public String getLastLog() {
        int indexOfLastNewLine = textArea.getText().lastIndexOf("\n");
        if (indexOfLastNewLine < 0) {
            return textArea.getText();
        }
        return textArea.getText().substring(indexOfLastNewLine + 1);
>>>>>>>> MartinRodriguez:src/main/java/logic/ChessGameLog.java
    }
}
