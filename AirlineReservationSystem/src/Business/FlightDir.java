/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Charmy
 */
public class FlightDir {
    private ArrayList<Flight> flightList;

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public FlightDir() {
       flightList = new  ArrayList<Flight>();
    }
    
    public Flight addFlight()
    {
        Flight flight = new Flight();
        flightList.add(flight);
        return flight;
    }
    
    public void removeFlight(Flight flight){
        flightList.remove(flight);
    }
        
    public Flight searchFlight(int id)
    {
       for(Flight f:flightList)
       {
          if( f.getModelNum()==id)
          {
              return f;
          }
       }
       return null;
    }
}
