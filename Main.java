
public class Main {
    
    public static void main(String args[]){
        
        SolarSystem solarSystem = new SolarSystem(1250, 1250);

        while (true) {
           int pos = 0;
            solarSystem.drawSolarObject(100, pos, 30, "BLUE");
            pos++;
            solarSystem.finishedDrawing();
        }
    }
}
