public class Moon extends Planet{
    private double distanceR;
    private double angleR;
    private double velocity;
    private Planet planet;

    public Moon(double distance, double angle, double diameter, String color, SolarSystem solarSystem, double distanceR, double angleR, Planet planet){
        super(distance, angle, diameter, color, solarSystem);
        this.distanceR = distanceR;
        this.angleR = angleR;
        this.planet = planet;    
    }
    
    public void drawMoon()
    {   
        solarSystem.drawSolarObjectAbout(distance, angle, diameter, color, distanceR, angleR);
    }

    public void moveMoon(double velocity){
        angle = angle + velocity;
        angleR = planet.getAngle();
        distanceR = planet.getDistance();
        
    }
}
