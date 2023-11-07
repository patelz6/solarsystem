public class Main {
    public static void main(String args[]){
        
        SolarSystem solarSystem = new SolarSystem(1250, 1250);
        Planet earth = new Planet(150, 0, 35, "BLUE", solarSystem);

        while (true) {
            earth.drawPlanet();
            earth.movePlanet(1);
            solarSystem.finishedDrawing();
        }
    }
}
