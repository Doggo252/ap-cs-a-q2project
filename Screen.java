//graphics
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;

//key listening
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Screen extends JPanel implements KeyListener {
    // instance variables
    private PacMan pacMan;

    // initialization constructor
    public Screen() {
        setFocusable(true);
        setLayout(null);

        // sets up keyListening, makes sure the window is focused
        this.requestFocusInWindow();
        this.addKeyListener(this);

        // instantiate/initialize object/variable
        pacMan = new PacMan(this);
    }

    // set the size of the JPanel container
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 800);
    }

    // draw the actual stuff
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        menu.drawMenu(g);

    }

    // do things when keys are pressed
    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    public void animate() {
        
    }

    // required keyListener interface methods
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}