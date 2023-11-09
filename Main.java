/**
 * Main class that represents the solar system.
 */
public class Main {
    /**
     * Main method that initializes the solar system and its celestial bodies.
     * @param args Command line arguments
     */
    public static void main(String args[]){
       
        // Create a new solar system
        /**
         * Represents the solar system.
         */
        SolarSystem solarSystem = new SolarSystem(1250, 1250);

        // Create the sun
        /**
         * Represents the sun.
         */
        Sun sun = new Sun(0, 0, 75, "YELLOW", solarSystem, true); 

        // Create the planets and their moons
        /**
         * Represents the planet Mercury.
         */
        Planet mercury = new Planet(60, 0, 19, "#8B4000", solarSystem);

        /**
         * Represents the planet Venus.
         */
        Planet venus = new Planet(100, 0, 30, "ORANGE", solarSystem);

        /**
         * Represents the planet Earth.
         */
        Planet earth = new Planet(150, 0, 35, "BLUE", solarSystem);
            /**
             * Represents the moon of Earth.
             */
            Moon moon = new Moon(30, 0, 15, "WHITE", solarSystem, earth.getDistance(), earth.getAngle(), earth);

        // ... rest of the planets and moons
            /**
         * Represents the planet Mars.
         */
        Planet mars = new Planet(225, 0, 32.5, "RED", solarSystem);
            /**
             * Represents the moon Deimos of Mars.
             */
            Moon deimos = new Moon(25, 0, 10, "LIGHT_GRAY", solarSystem, mars.getDistance(), mars.getAngle(), mars);
            /**
             * Represents the moon Phobos of Mars.
             */
            Moon phobos = new Moon(40, 0, 15, "DRAK_GRAY", solarSystem, mars.getDistance(), mars.getAngle(), mars);
        
        /**
         * Represents the planet Jupiter.
         */
        Planet jupiter = new Planet(300, 0, 45, "#F65F3E", solarSystem);
            /**
             * Represents the moon Io of Jupiter.
             */
            Moon io = new Moon(35, 0, 10, "DARK_GRAY", solarSystem, jupiter.getDistance(), jupiter.getDistance(), jupiter);
            /**
             * Represents the moon Callisto of Jupiter.
             */
            Moon callisto = new Moon(40, 0, 5, "#A39693", solarSystem, jupiter.getDistance(), jupiter.getAngle(), jupiter);
            /**
             * Represents the moon Europa of Jupiter.
             */
            Moon europa = new Moon(50, 0, 12.5, "CYAN", solarSystem, jupiter.getDistance(), jupiter.getAngle(), jupiter);
            /**
             * Represents the moon Ganymede of Jupiter.
             */
            Moon ganymede = new Moon(60, 0, 10, "ORANGE", solarSystem, jupiter.getDistance(), jupiter.getAngle(), jupiter);

        /**
         * Represents the planet Saturn.
         */
        Planet saturn = new Planet(350, 0, 40, "#AF804F", solarSystem);
            /**
             * Represents the moon Titan of Saturn.
             */
            Moon titan = new Moon(35, 90, 17, "#708090", solarSystem, saturn.getDistance(), saturn.getAngle(), saturn);

                /**
         * Represents the planet Uranus.
         */
        Planet uranus = new Planet(400, 0, 40, "#2E5D9D", solarSystem);
            /**
             * Represents the moon Titania of Uranus.
             */
            Moon titania = new Moon(25, 0, 5, "GREEN", solarSystem, uranus.getDistance(), uranus.getAngle(), uranus);
            /**
             * Represents the moon Oberon of Uranus.
             */
            Moon oberon = new Moon(30, 0, 7.5, "DARK_GRAY", solarSystem, uranus.getDistance(), uranus.getAngle(), uranus);

        /**
         * Represents the planet Neptune.
         */
        Planet neptune = new Planet(435, 0, 37.5, "#4870DD", solarSystem);
            /**
             * Represents the moon Triton of Neptune.
             */
            Moon triton = new Moon(25, 0, 10, "DARK_GRAY", solarSystem, neptune.getDistance(), neptune.getAngle(), neptune);

        /**
         * Represents an asteroid belt in the solar system.
         */
        Asteroid asteroidBelt = new Asteroid(200, 0, 10, "GRAY", solarSystem, 100);

        
        /**
         * Infinite loop to animate the solar system.
         * Draws and moves the celestial bodies in the solar system.
         */
        while (true) {
            /**
             * Draws the sun.
             */
            sun.drawSun();

            /**
             * Draws and moves the planet Mercury.
             */
            mercury.drawPlanet();
            mercury.movePlanet(1.75);

            /**
             * Draws and moves the planet Venus.
             */
            venus.drawPlanet();
            venus.movePlanet(1.25);
                        /**
             * Draws and moves the planet Earth and its moon.
             */
            earth.drawPlanet();
            earth.movePlanet(1);
                moon.drawMoon();
                moon.moveMoon(2);
            
            /**
             * Draws and moves the planet Mars and its moons.
             */
            mars.drawPlanet();
            mars.movePlanet(0.75);
                deimos.drawMoon();
                deimos.moveMoon(3);
                phobos.drawMoon();
                phobos.moveMoon(2.5);

            /**
             * Draws and moves the planet Jupiter and its moons.
             */
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

            /**
             * Draws and moves the planet Saturn and its moon.
             */
            saturn.drawPlanet();
            saturn.movePlanet(0.45);
                titan.drawMoon();
                titan.moveMoon(1.15);

            /**
             * Draws and moves the planet Uranus and its moons.
             */
            uranus.drawPlanet();
            uranus.movePlanet(0.2);
                titania.drawMoon();
                titania.moveMoon(1.5);
                oberon.drawMoon();

                        /**
             * Draws and moves the planet Neptune and its moon.
             */
            neptune.drawPlanet();
            neptune.movePlanet(0.5);
                triton.drawMoon();
                triton.moveMoon(2.6);

            /**
             * Draws and moves the asteroid belt.
             */
            asteroidBelt.asteroidLoop(300);
            asteroidBelt.moveAsteroid(10);
                
            /**
             * Signals that all drawing for this frame is complete (/tick)
             */
            solarSystem.finishedDrawing();
        }
        

    }
}
