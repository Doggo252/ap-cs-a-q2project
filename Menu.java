//imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu implements ActionListener{
    //instance variables
    private boolean state;
    private JButton playButton;
    private JButton settingsButton;
    private JButton helpButton;
    private Color black;

    public Menu(Screen screen){
        black = new Color(0,0,0);
        // Set up the button
        playButton = new JButton("Play");
        playButton.setBounds(400, 300, 100, 30);
        screen.add(playButton);
        playButton.addActionListener(this);
    }

    public void animate(){}
    public void updateMenu(){}
    public void drawMenu(Graphics g){
        g.setColor(black);
        
    }

    public void actionPerformed(ActionEvent e){
        // Check to see if the button was pushed
		if (e.getSource() == playButton) {
            System.out.println("BUTTON!!!");
		}
    }
}