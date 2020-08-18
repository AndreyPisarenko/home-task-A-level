package ua.com.solSys;

public class PlanetReporter {

    public void USP(Planet Mercury) {
        System.out.println("USP for" + Mercury.getClass().getSimpleName() + " is " + Mercury.USP());
    }

}

// public void gravitationalAccelerationInfo(Planet planet){
//        System.out.println("Gravitational Acceleration for " + planet.getClass().getSimpleName() + " is " + planet.getGravitationalAcceleration());