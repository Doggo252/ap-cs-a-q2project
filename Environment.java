import javax.swing.*;
import java.awt.*;

public class Environment{
    private int x, y;
    //initialization constructor
    public Environment(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void animate(){
		while(true){
			//wait for .01 second
			try {
			    Thread.sleep(10);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
			// Add move methods here
			
			//repaint the graphics drawn
			//repaint();
		}

	}
    //draw environment tile
    private void drawEnvironment(Graphics g){
        
    }
}