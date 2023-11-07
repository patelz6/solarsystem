public class Main {
    public static void main(String args[]){
        
        SolarSystem solarSystem = new SolarSystem(1250, 1250);
        Planet earth = new Planet(150, 0, 35, "BLUE", solarSystem);
            Moon moon = new Moon(30, 0, 15, "WHITE", solarSystem, earth.getDistance(), earth.getAngle(), earth);

        while (true) {
            earth.drawPlanet();
            earth.movePlanet(1);
                moon.drawMoon();
                moon.moveMoon(2);
            
            solarSystem.finishedDrawing();
        }
    }
}
