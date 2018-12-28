/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Charmy
 */
public class Flight {
    private static int count = 0;
    int [][]seatCapacity= new int[50][3];
   //value 1 in the array implies seat is unbooked, value 0 in the array implies seat is booked.
   /*public void manageSeatCapacity()
   {
       for(int i=0;i<25;i++)
       {
           for(int j=0;j<3;j++)
           {
                seatCapacity[i][j]=1;
           }
       }
   }*/
   /* private int capacity = 2;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }*/

    public int[][] getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int[][] seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

   
    public Flight()
    {
        count ++;
        modelNum=count;
        
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    private String time;
    private String source;
    private String destination;
    private int cost;
    private int modelNum;

    public int getModelNum() {
        return modelNum;
    }

    public void setModelNum(int modelNum) {
        this.modelNum = modelNum;
    }
    public String toString()
    {
        return time;
    }
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
