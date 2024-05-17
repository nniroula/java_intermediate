package multipleClasses;

public class MainClass {

    public static void main(String []args){
        // instantiate the MarioGame class and use it as a data type in GameRunner class
        MarioGame marioGameObj = new MarioGame();
        GameRunner gameRunnerObj = new GameRunner(marioGameObj);
        gameRunnerObj.run();
    }
    
}
