public class Asteroid extends Planet{
    
    private int asteroidCount;
    private double speed;

    

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

    
    
    
    

