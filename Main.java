public class Main {
    public static void main(String args[]){
       
        SolarSystem solarSystem = new SolarSystem(1250, 1250);

        Sun sun = new Sun(0, 0, 75, "YELLOW", solarSystem, true);

        Planet mercury = new Planet(60, 0, 19, "#8B4000", solarSystem);

        Planet venus = new Planet(100, 0, 30, "ORANGE", solarSystem);

        Planet earth = new Planet(150, 0, 35, "BLUE", solarSystem);
            Moon moon = new Moon(30, 0, 15, "WHITE", solarSystem, earth.getDistance(), earth.getAngle(), earth);

        Planet mars = new Planet(225, 0, 32.5, "RED", solarSystem);
            Moon deimos = new Moon(25, 0, 10, "LIGHT_GRAY", solarSystem, mars.getDistance(), mars.getAngle(), mars);
            Moon phobos = new Moon(40, 0, 15, "DRAK_GRAY", solarSystem, mars.getDistance(), mars.getAngle(), mars);
        
        Planet jupiter = new Planet(300, 0, 45, "#F65F3E", solarSystem);
            Moon io = new Moon(35, 0, 10, "DARK_GRAY", solarSystem, jupiter.getDistance(), jupiter.getDistance(), jupiter);
            Moon callisto = new Moon(40, 0, 5, "#A39693", solarSystem, jupiter.getDistance(), jupiter.getAngle(), jupiter);
            Moon europa = new Moon(50, 0, 12.5, "CYAN", solarSystem, jupiter.getDistance(), jupiter.getAngle(), jupiter);
            Moon ganymede = new Moon(60, 0, 10, "ORANGE", solarSystem, jupiter.getDistance(), jupiter.getAngle(), jupiter);

        Planet saturn = new Planet(350, 0, 40, "#AF804F", solarSystem);
            Moon titan = new Moon(35, 90, 17, "#708090", solarSystem, saturn.getDistance(), saturn.getAngle(), saturn);

        Planet uranus = new Planet(400, 0, 40, "#2E5D9D", solarSystem);
            Moon titania = new Moon(25, 0, 5, "GREEN", solarSystem, uranus.getDistance(), uranus.getAngle(), uranus);
            Moon oberon = new Moon(30, 0, 7.5, "DARK_GRAY", solarSystem, uranus.getDistance(), uranus.getAngle(), uranus);

        Planet neptune = new Planet(435, 0, 37.5, "#4870DD", solarSystem);
            Moon triton = new Moon(25, 0, 10, "DARK_GRAY", solarSystem, neptune.getDistance(), neptune.getAngle(), neptune);

        Asteroid asteroidBelt = new Asteroid(200, 0, 10, "GRAY", solarSystem, 100);

        
        
        while (true) {
            sun.drawSun();

            mercury.drawPlanet();
            mercury.movePlanet(1.75);
            
            venus.drawPlanet();
            venus.movePlanet(1.25);

            earth.drawPlanet();
            earth.movePlanet(1);
                moon.drawMoon();
                moon.moveMoon(2);
            
            mars.drawPlanet();
            mars.movePlanet(0.75);
                deimos.drawMoon();
                deimos.moveMoon(3);
                phobos.drawMoon();
                phobos.moveMoon(2.5);

            jupiter.drawPlanet();
            jupiter.movePlanet(0.25);
                io.drawMoon();
                io.moveMoon(3);
                callisto.drawMoon();
                callisto.moveMoon(-2);
                europa.drawMoon();
                europa.moveMoon(1);
                ganymede.drawMoon();
                ganymede.moveMoon(2.5);

            saturn.drawPlanet();
            saturn.movePlanet(0.45);
                titan.drawMoon();
                titan.moveMoon(1.15);

            uranus.drawPlanet();
            uranus.movePlanet(0.2);
                titania.drawMoon();
                titania.moveMoon(1.5);
                oberon.drawMoon();
                oberon.moveMoon(2);

            neptune.drawPlanet();
            neptune.movePlanet(0.5);
                triton.drawMoon();
                triton.moveMoon(2.6);

            asteroidBelt.asteroidLoop(300);
            asteroidBelt.moveAsteroid(10);
                
            solarSystem.finishedDrawing();
        }
        

    }
}
