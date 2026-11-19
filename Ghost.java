public class Ghost{
    //instance variables
    private int x, y, width, height;
    private Color color;
    //initialization constructor
    public Ghost(int x, int y, int width, int height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    //pathfind
    public String pathfind(int[] playerPosition, String direction){

    }
    //move according to pathfinding
    public void move(String direction){

    }
    //animate
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
			repaint();
		}
        
	}
}