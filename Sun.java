/**
 * The Sun class represents the sun in the solar system.
 * It extends the Planet class and adds additional functionality for the sun.
 */
public class Sun extends Planet{
    private boolean isSun;

    /**
     * Constructs a new Sun object.
     *
     * @param distance The distance of the sun from the center of the solar system.
     * @param angle The angle of the sun.
     * @param diameter The diameter of the sun.
     * @param color The color of the sun.
     * @param solarSystem The solar system the sun belongs to.
     * @param isSun A boolean indicating if the object is the sun.
     */
    public Sun(double distance, double angle, double diameter, String color, SolarSystem solarSystem, boolean isSun){
        super(distance, angle, diameter, color, solarSystem);
        this.isSun = isSun;
        if (isSun = true) 
        {
            distance = 0;
            angle = 0;
            color = "YELLOW";
        }
    }

    /**
     * Draws the sun in the solar system.
     */
    public void drawSun()
    {
        solarSystem.drawSolarObject(distance, angle, diameter, color);
    }
}
