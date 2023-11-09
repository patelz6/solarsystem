import java.util.Random;

/**
 * The Asteroid class represents an asteroid in the solar system.
 * It extends the Planet class and adds additional functionality for asteroids.
 */
public class Asteroid extends Planet {
    
    private int asteroidCount;
    private double speed;

    Random random1 = new Random();
    Random random2 = new Random();
    Random random3 = new Random();

    /**
     * Constructs a new Asteroid object.
     *
     * @param distance The distance of the asteroid from the sun.
     * @param angle The angle of the asteroid.
     * @param diameter The diameter of the asteroid.
     * @param color The color of the asteroid.
     * @param solarSystem The solar system the asteroid belongs to.
     * @param asteroidCount The number of asteroids.
     */
    public Asteroid(double distance, double angle, double diameter, String color, SolarSystem solarSystem, int asteroidCount){
        super(distance, angle, diameter, color, solarSystem);
        this.asteroidCount = asteroidCount;
    }

    /**
     * Moves the asteroid by a certain speed.
     *
     * @param speed The speed to move the asteroid by.
     */
    public void moveAsteroid(double speed){
        angle = angle + speed;
    }

    /**
     * Draws the asteroid in the solar system.
     */
    public void drawAsteroid(){
        solarSystem.drawSolarObject(distance, angle, diameter, color);
    }
    
    /**
     * Returns the angle of the asteroid.
     *
     * @return The angle of the asteroid.
     */
    public double getAngle() {
        return angle;
    }

    /**
     * Sets the angle of the asteroid.
     *
     * @param angle The new angle of the asteroid.
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }

    
    
    /**
     * Loops through the specified number of asteroids and draws them in the solar system.
     * Each asteroid is drawn at a random distance and angle, and with a random size.
     *
     * @param asteroidCount The number of asteroids to draw.
     */
    public void asteroidLoop(int asteroidCount){
        for(int i = 0; i < asteroidCount; i++){
            
            int randomNumber = random1.nextInt(101) + 200;
            double randomSize = random2.nextInt(11) - 5;
            double randomRadian = random3.nextDouble() * 360 - 180;
            
            solarSystem.drawSolarObject(randomNumber, randomRadian-angle, randomSize, color);
        }
    }  
}

    }  
}
