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
public class AirlinesDir {
    private ArrayList<Airlines> airLineList;

    public ArrayList<Airlines> getAirLineList() {
        return airLineList;
    }

    public AirlinesDir() {
        airLineList = new ArrayList<Airlines>();
    }
    
    public Airlines addAirlines()
    {
        Airlines airline = new Airlines();
       airLineList.add(airline);
       return airline;
    }
    
    public void removeAirlines(Airlines airline)
    {
        airLineList.remove(airline);
    }
    
    public Airlines searchAIrline(String airLineName)
    {
        for (Airlines a:airLineList)
        {
            if(a.getAirLineName().equalsIgnoreCase(airLineName))
            {
                return a;
            }
        }
        return null;
    }
}
