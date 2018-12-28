/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Charmy
 */
public class Airlines {
    private String airLineName;
     private FlightDir flightDir;
 public Airlines() {
       flightDir = new FlightDir();
    }
    public String getAirLineName() {
        return airLineName;
    }

    public void setAirLineName(String airLineName) {
        this.airLineName = airLineName;
    }
   

    public FlightDir getFlightDir() {
        return flightDir;
    }
    public String toString()
    {
        return airLineName;
    }
   
    
}
