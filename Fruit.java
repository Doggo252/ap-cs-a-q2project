public class Fruit{
    //instance variables
    private int x, y, width, height;
    private String type;
    //initialization constructor
    public Fruit(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        int fruitNum = (int) (Math.random() * 5 + 1);
        if (fruitNum == 1){
            type = "Cherry";
        }
        else if (fruitNum == 2){
            type = "Strawberry";
        }
        else if (fruitNum == 3){
            type = "Orange";
        }
        else if (fruitNum == 4){
            type = "Apple";
        }
        else{
            type = "Melon";
        }
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