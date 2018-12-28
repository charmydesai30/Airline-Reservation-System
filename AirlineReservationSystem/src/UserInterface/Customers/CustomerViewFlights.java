/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customers;

import Business.AirlinesDir;
import Business.Customer;
import Business.Flight;
import Business.FlightDir;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Charmy
 */
public class CustomerViewFlights extends javax.swing.JPanel {

    /**
     * Creates new form CustomerViewAllFlights
     */
    JPanel userProcessContainer;
    ArrayList<Flight> availbleFlights;
    AirlinesDir airLineDir;
    FlightDir flightDir;
    
    
    public CustomerViewFlights(JPanel userProcessContainer,ArrayList<Flight> availbleFlights,AirlinesDir airLineDir, FlightDir flightDir) {
        initComponents();
        this.availbleFlights=availbleFlights;
         int rowCount = flightDetailsTable.getRowCount();
        this.airLineDir=airLineDir;
        this.flightDir=flightDir;
        
        this.userProcessContainer=userProcessContainer;
        
        
        
        DefaultTableModel model = (DefaultTableModel)flightDetailsTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
             SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        for(Flight flight:availbleFlights)
        {
            
            Object row[] = new Object[6];
            row[0] = flight;
            row[1] = flight.getSource();
            row[2] = flight.getDestination();
            row[3]= flight.getCost();
            row[4]= flight.getModelNum();
            String date =dateFormat.format(flight.getDate());
            row[5] = date;
            model.addRow(row);
        }
       
        
          
            
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        flightDetailsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bookFlight = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bookingId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fnameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lnameTxt = new javax.swing.JTextField();
        windowButton = new javax.swing.JRadioButton();
        middleButton = new javax.swing.JRadioButton();
        aisleButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        flightDetailsTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        flightDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Source", "Destination", "cost", "Flight ID", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(flightDetailsTable);

        jLabel1.setText("Flights that matched your Search");

        bookFlight.setText("Book Flight");
        bookFlight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bookFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookFlightActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Flight ID to book:");

        jLabel3.setText("First Name:");

        fnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameTxtActionPerformed(evt);
            }
        });

        jLabel4.setText("Last Name:");

        windowButton.setText("window ");
        windowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                windowButtonActionPerformed(evt);
            }
        });

        middleButton.setText("Middle");
        middleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleButtonActionPerformed(evt);
            }
        });

        aisleButton.setText("Aisle");
        aisleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aisleButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Please do the seat selection");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 76, 76))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(bookFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(middleButton)
                                .addGap(124, 124, 124)
                                .addComponent(aisleButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(windowButton)
                            .addComponent(jLabel2))
                        .addGap(77, 77, 77)
                        .addComponent(bookingId)))
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aisleButton)
                            .addComponent(middleButton)
                            .addComponent(windowButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(fnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(62, 62, 62)
                .addComponent(bookFlight)
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookFlightActionPerformed
       boolean modelFlag=false;
       boolean flag = false;
        for(Flight flight:availbleFlights)
        {
            try{
            if (Integer.parseInt(bookingId.getText())==flight.getModelNum())
            {
                modelFlag=true;
              if(!(windowButton.isSelected()||middleButton.isSelected()||aisleButton.isSelected()))
              {
                 JOptionPane.showMessageDialog(null, "Please select a seat in the flight to proceed with booking");
                 break;
              }
                if(windowButton.isSelected())
                {
                    int remainingWindowSeats=0;
                    flag =false;
                   flight.getSeatCapacity();
                   
                   for(int i=0;i<flight.getSeatCapacity().length;i++)
                   {
                      if( flight.getSeatCapacity()[i][0]==0)
                      {
                          JOptionPane.showMessageDialog(null, fnameTxt.getText()+lnameTxt.getText()+"  your Booking is Successfull");
                          flight.getSeatCapacity()[i][0]=1;
                          flight.setSeatCapacity(flight.getSeatCapacity());
                          flag = true;
                          break;
                      }
                      
                      
                   }
                     for(int i=0;i<flight.getSeatCapacity().length;i++)
                    {
                      if( flight.getSeatCapacity()[i][0]==0)
                        {
                            remainingWindowSeats=remainingWindowSeats+1;
                        }
                    
                    }
                   JOptionPane.showMessageDialog(null,remainingWindowSeats+" window seats remaining" );
                   if(!flag)
                   {
                       JOptionPane.showMessageDialog(null, "No more window seats available");
                   }
                    
                }
                
                
                
                //code for checking availability of middle seat.
                        if(middleButton.isSelected())
                {
                    int remainingMiddleSeats=0;
                    flag =false;
                   flight.getSeatCapacity();
                   
                   for(int i=0;i<flight.getSeatCapacity().length;i++)
                   {
                      if( flight.getSeatCapacity()[i][1]==0)
                      {
                          JOptionPane.showMessageDialog(null, fnameTxt.getText()+lnameTxt.getText()+"  your Booking is Successfull");
                          flight.getSeatCapacity()[i][1]=1;
                          flight.setSeatCapacity(flight.getSeatCapacity());
                          flag = true;
                          break;
                      }
                      
                      
                   }
                     for(int i=0;i<flight.getSeatCapacity().length;i++)
                    {
                      if( flight.getSeatCapacity()[i][1]==0)
                        {
                            remainingMiddleSeats=remainingMiddleSeats+1;
                        }
                    
                    }
                   JOptionPane.showMessageDialog(null,remainingMiddleSeats+" middle seats remaining" );
                   if(!flag)
                   {
                       JOptionPane.showMessageDialog(null, "No more middle seats available");
                   }
                    
                }
                        
                     //code for checking availability of aisle seats
                   if(aisleButton.isSelected())
                {
                    int remainingAisleSeats=0;
                    flag =false;
                   flight.getSeatCapacity();
                   
                   for(int i=0;i<flight.getSeatCapacity().length;i++)
                   {
                      if( flight.getSeatCapacity()[i][2]==0)
                      {
                          JOptionPane.showMessageDialog(null, fnameTxt.getText()+lnameTxt.getText()+"  your Booking is Successfull");
                          flight.getSeatCapacity()[i][2]=1;
                          flight.setSeatCapacity(flight.getSeatCapacity());
                          flag = true;
                          break;
                      }
                      
                      
                   }
                     for(int i=0;i<flight.getSeatCapacity().length;i++)
                    {
                      if( flight.getSeatCapacity()[i][2]==0)
                        {
                            remainingAisleSeats=remainingAisleSeats+1;
                        }
                    
                    }
                   JOptionPane.showMessageDialog(null,remainingAisleSeats+" aisle seats remaining" );
                   if(!flag)
                   {
                       JOptionPane.showMessageDialog(null, "No more aisle seats available");
                   }
                    
                }//end of aisle seat's if
                   
                   if(!flag)
                   {
                       JOptionPane.showMessageDialog(null, "No more  seats available in this flight");
                   }
            } //end of model number check's if
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Booking id has to be a valid integer");
            }
            
        }//end of for loop of available flights
        
        if(modelFlag==false)
        {
             JOptionPane.showMessageDialog(null,"Enter a valid flight ID to book the flight");
        }
    }//GEN-LAST:event_bookFlightActionPerformed

    private void fnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameTxtActionPerformed

    private void windowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_windowButtonActionPerformed
        if (windowButton.isSelected())
        {
            middleButton.setSelected(false);
            aisleButton.setSelected(false);
        }
    }//GEN-LAST:event_windowButtonActionPerformed

    private void middleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleButtonActionPerformed
      if(middleButton.isSelected())
      {
          aisleButton.setSelected(false);
          windowButton.setSelected(false);
      }    
    }//GEN-LAST:event_middleButtonActionPerformed

    private void aisleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aisleButtonActionPerformed
      if(aisleButton.isSelected())
      {
          middleButton.setSelected(false);
          windowButton.setSelected(false);
      }    
    }//GEN-LAST:event_aisleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton aisleButton;
    private javax.swing.JButton bookFlight;
    private javax.swing.JTextField bookingId;
    private javax.swing.JTable flightDetailsTable;
    private javax.swing.JTextField fnameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnameTxt;
    private javax.swing.JRadioButton middleButton;
    private javax.swing.JRadioButton windowButton;
    // End of variables declaration//GEN-END:variables
}
