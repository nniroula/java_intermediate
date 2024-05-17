package multipleClasses;

public class GameRunner {
    // instantiate MarioGame class and use its methods
    private MarioGame marioGame;

    // when you call the game runner constructor, it should create mario game
    public GameRunner(MarioGame mGame){
        this.marioGame = mGame;
    }

    // in Main class, you can call run method instead of calling all MarioGame class methods

    public void run(){
        // call all the methods from MarioGame class
        marioGame.left();
        marioGame.right();
        marioGame.up();
        marioGame.down();
    }
}
