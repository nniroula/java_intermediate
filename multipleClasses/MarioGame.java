package multipleClasses;

// public class MarioGame{

public class MarioGame implements InterfaceConsole{

    // left button 
    public void left(){
        System.out.println("LEFT");
    }

    // right button
    public void right(){
        System.out.println("RIGHT");
    }

    // up button
    public void up(){
        System.out.println("UP");
    }

    // down button
    public void down(){
        System.out.println("DOWN");
    }

    public void getGameType() {
        System.out.println("Mario Game class...");
    }
    
}
