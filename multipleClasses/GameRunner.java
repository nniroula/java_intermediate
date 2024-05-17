package multipleClasses;

public class GameRunner {
    // instantiate MarioGame class and use its methods
   // private MarioGame marioGame;

    // when you call the game runner constructor, it should create mario game
    // public GameRunner(MarioGame mGame){
    //     this.marioGame = mGame;
    // }

    // instead use Interface type to achieve loose coupling -> using interface allows you to 
    // have multiple game classes instantiated and used with same GameRunner class
    InterfaceConsole gameI;
    public GameRunner(InterfaceConsole iGame){
        this.gameI = iGame;
    }

    // in Main class, you can call run method instead of calling all MarioGame class methods

    // public void run(){
    //     // call all the methods from MarioGame class
    //     marioGame.left();
    //     marioGame.right();
    //     marioGame.up();
    //     marioGame.down();
    // }


    // use interface type instead
    public void run(){
        // call all the methods from MarioGame class
        gameI.getGameType();
        gameI.left();
        gameI.right();
        gameI.up();
        gameI.down();
    }
}
