package multipleClasses;

public class MainClass {

    public static void main(String []args){
        // instantiate the MarioGame class and use it as a data type in GameRunner class
        MarioGame marioGameObj = new MarioGame();
        GameRunner gameRunnerObj = new GameRunner(marioGameObj);
        gameRunnerObj.run();


        // call call the interface type with SuperContra class data type
        SuperContra superContraObj = new SuperContra();
        GameRunner gameRunnerObj2 = new GameRunner(superContraObj);
        gameRunnerObj2.run();
    }
    
}
