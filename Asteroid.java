import java.util.Random;

public class Asteroid extends Planet{
    
    private int asteroidCount;
    private double speed;
    
    Random random1 = new Random();
    Random random2 = new Random();
    Random random3 = new Random();
    
    int randomNumber = random1.nextInt(101) + 200;
    double randomSize = random2.nextInt(11) - 5;
    double randomRadian = random3.nextDouble() * 360 - 180;
    
    public Asteroid(double distance, double angle, double diameter, String color, SolarSystem solarSystem, int asteroidCount){
        super(distance, angle, diameter, color, solarSystem);
        this.asteroidCount = asteroidCount;
    }

    public void moveAsteroid(double speed){
        angle = angle + speed;
    }

    public void drawAsteroid(){
        solarSystem.drawSolarObject(distance, angle, diameter, color);
    }
    
    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    
    
   
}

    
    
    
    

