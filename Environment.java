import javax.swing.*;
import java.awt.*;

public class Environment{
    private int x, y, width, height;
    //initialization constructor
    public Environment(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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