/**
 * The Moon class represents a moon in the solar system.
 * It extends the Planet class and adds additional functionality for moons.
 */
public class Moon extends Planet{
    private double distanceR;
    private double angleR;
    private Planet planet;

    /**
     * Constructs a new Moon object.
     *
     * @param distance The distance of the moon from the sun.
     * @param angle The angle of the moon.
     * @param diameter The diameter of the moon.
     * @param color The color of the moon.
     * @param solarSystem The solar system the moon belongs to.
     * @param distanceR The distance of the moon from its planet.
     * @param angleR The angle of the moon relative to its planet.
     * @param planet The planet the moon orbits.
     */
    public Moon(double distance, double angle, double diameter, String color, SolarSystem solarSystem, double distanceR, double angleR, Planet planet){
        super(distance, angle, diameter, color, solarSystem);
        this.distanceR = distanceR;
        this.angleR = angleR;
        this.planet = planet;    
    }

    /**
     * Draws the moon in the solar system.
     */
    public void drawMoon()
    {   
        solarSystem.drawSolarObjectAbout(distance, angle, diameter, color, distanceR, angleR);
    }

    /**
     * Moves the moon by a certain velocity.
     *
     * @param velocity The velocity to move the moon by.
     */
    public void moveMoon(double velocity){
        angle = angle + velocity;
        angleR = planet.getAngle();
        distanceR = planet.getDistance();
    }
}
