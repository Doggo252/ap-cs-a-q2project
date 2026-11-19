public class PacMan{
    //instance variables
    /*private Ghost[] ghosts;
    private Pellet[] pellets;
    private Environment[] environment;
    private PowerUp[] powerUps;
    */
    private Menu menu;
    private Player player1, player2;
    private int round;
    private boolean gameRunning;

    //constructor
    public PacMan(Screen screen){
        menu = new Menu(screen);
    }

    public void animate(){}
    public void drawScore(boolean gameRunning){}
    /*
    public void checkCollisionGhost(Ghost[] ghosts){}
    public void checkCollisionPellet(Pellet[] pellets){}
    public void checkCollisionPowerUp(PowerUp[] powerUps){}
    public void checkCollisionPlayer(Player player){}
    */
    public void drawPellets(){}
    public void updateScore(){}
    public void startGame(){}
    //public boolean allowMovement(Player player, String direction){}

}