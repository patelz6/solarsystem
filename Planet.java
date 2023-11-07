public class Planet{
    protected double distance;
    protected double diameter;
    protected double angle;
    protected String color;
    protected SolarSystem solarSystem;
    protected double speed;

    public Planet(double distance, double angle, double diameter, String color, SolarSystem solarSystem){
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.color = color;
        this.solarSystem = solarSystem;
    }
     public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getDistance() {
        return distance;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public SolarSystem getSolarSystem() {
        return solarSystem;
    }

    public void setSolarSystem(SolarSystem solarSystem) {
        this.solarSystem = solarSystem;
    }


    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void movePlanet(double speed){
        angle = angle + speed;
        
    }

  

    

    
}
