/**
 * The Planet class represents a planet in the solar system.
 */
public class Planet{
    protected double distance;
    protected double diameter;
    protected double angle;
    protected String color;
    protected SolarSystem solarSystem;
    protected double speed;

    /**
     * Constructs a new Planet object.
     *
     * @param distance The distance of the planet from the sun.
     * @param angle The angle of the planet.
     * @param diameter The diameter of the planet.
     * @param color The color of the planet.
     * @param solarSystem The solar system the planet belongs to.
     */
    public Planet(double distance, double angle, double diameter, String color, SolarSystem solarSystem){
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.color = color;
        this.solarSystem = solarSystem;
    }

    /**
     * Returns the angle of the planet.
     *
     * @return The angle of the planet.
     */
    public double getAngle() {
        return angle;
    }

    /**
     * Sets the angle of the planet.
     *
     * @param angle The new angle of the planet.
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }

    /**
     * Returns the distance of the planet from the sun.
     *
     * @return The distance of the planet from the sun.
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Returns the color of the planet.
     *
     * @return The color of the planet.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the planet.
     *
     * @param color The new color of the planet.
     */
    public void setColor(String color) {
        this.color = color;
    }

   /**
     * Returns the diameter of the planet.
     *
     * @return The diameter of the planet.
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * Sets the diameter of the planet.
     *
     * @param diameter The new diameter of the planet.
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /**
     * Returns the solar system the planet belongs to.
     *
     * @return The solar system the planet belongs to.
     */
    public SolarSystem getSolarSystem() {
        return solarSystem;
    }

    /**
     * Sets the solar system the planet belongs to.
     *
     * @param solarSystem The new solar system the planet belongs to.
     */
    public void setSolarSystem(SolarSystem solarSystem) {
        this.solarSystem = solarSystem;
    }

    /**
     * Sets the distance of the planet from the sun.
     *
     * @param distance The new distance of the planet from the sun.
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * Moves the planet by a certain speed.
     *
     * @param speed The speed to move the planet by.
     */
    public void movePlanet(double speed){
        angle = angle + speed;
    }
    /**
     * Draws the planet in the solar system.
     */
    public void drawPlanet()
    {
        solarSystem.drawSolarObject(distance, angle, diameter, color);
    }

    
}
