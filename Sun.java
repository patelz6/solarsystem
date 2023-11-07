public class Sun extends Planet{
    private boolean isSun;

    public Sun(double distance, double angle, double diameter, String color, SolarSystem solarSystem, boolean isSun){
        super(distance, angle, diameter, color, solarSystem);
        this.isSun = isSun;
        if (isSun = true) 
        {
            distance = 0;
            angle = 0;
            color = "YELLOW";
        }
        public void drawSun()
    {
        solarSystem.drawSolarObject(distance, angle, diameter, color);
        
    }
    }
}
