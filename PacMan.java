public class PacMan{
    //instance variables
    private Ghost[] ghosts;
    private Pellet[] pellets;
    private Environment[] environment;
    private PowerUp[] powerUps;
    private Player player1, player2;
    private int round;
    private boolean gameRunning;

    //constructor
    public PacMan(){

    }

    public void animate(){}
    public void drawScore(boolean){}
    public void checkCollisionGhost(Ghost[]){}
    public void checkCollisionPellet(Pellet[]){}
    public void checkCollisionPowerUp(PowerUp[]){}
    public void checkCollisionPlayer(Player[]){}
    public void drawPellets(){}
    public void updateScore(){}
    public void startGame(){}
    public boolean allowMovement(Player player, String direction){}

}