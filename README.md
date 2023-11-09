# Solar System Java task 1 / SCC212

# Main.java
The Main class is the entry point of the application. It initializes the solar system and its celestial bodies, including the sun, planets, and their moons. It creates an instance of the SolarSystem class, an instance of the Sun class, and instances of the Planet class for each planet.

# Sun.java
The Sun class represents the Sun in the solar system. It is a subclass of the Planet class and includes additional properties and methods specific to the Sun. It takes parameters for distance, angle, diameter, color, the solar system it belongs to, and a boolean indicating if the object is the Sun.

# Planet.java
The Planet class represents a planet in the solar system. It takes parameters for distance, angle, diameter, color, and the solar system it belongs to. Instances of this class are created for each planet in the solar system.

# Moon.java
The Moon class represents a moon in the solar system. It is a subclass of the Planet class and includes properties and methods specific to a moon. It takes parameters similar to the Planet class, such as distance, angle, diameter, color, and the planet it orbits.

# Asteroid.java
The Asteroid class represents an asteroid in the solar system. It is a subclass of the Planet class and includes properties and methods specific to an asteroid. It takes parameters similar to the Planet class, such as distance, angle, diameter, color, and the asteroid belt it belongs to.
