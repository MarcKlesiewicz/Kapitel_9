package Opgave_8;

public class Fan {

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";


    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int newSpeed){
        if (newSpeed == 1){
            speed = SLOW;
        }else if (newSpeed == 2){
            speed = MEDIUM;
        }else if (newSpeed == 3){
            speed = FAST;
        }
    }

    public boolean getOn(){
        return on;
    }
    public void setOn(boolean newOn){
        if (true){
            on = newOn;
            System.out.println("the fan is on");
        }else if (false){
            on = newOn;
            System.out.println("the fan is off");
        }

    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(int newRadius){
        radius = newRadius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    public Fan (int newSpeed, double newRadius, String newColor, boolean newOn){
        speed = newSpeed;
        radius = newRadius;
        color = newColor;
        on = newOn;
    }


    public String toString(){

        return "Fan speed: " + speed + "\n" + "Color is: " + color + "\n" + "Radius is: " + radius + "\n" + on;
    }
}
