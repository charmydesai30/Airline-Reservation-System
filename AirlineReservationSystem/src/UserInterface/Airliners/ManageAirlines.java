/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Airliners;

import Business.Airlines;
import Business.AirlinesDir;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Charmy
 */
public class ManageAirlines extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlines
     */
    JPanel userProcessContainer;
     AirlinesDir airLineDir;
    public ManageAirlines(JPanel userProcessContainer,AirlinesDir airLineDir) {
        
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.airLineDir=airLineDir;
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backjButton = new javax.swing.JButton();
        removeAirlineButton = new javax.swing.JButton();
        viewAirlineButton = new javax.swing.JButton();
        addArlineButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        airLineTable = new javax.swing.JTable();
        masterScheduleButton = new javax.swing.JButton();

        jLabel1.setText("List Of Airlines");

        backjButton.setText("<<Go Back");
        backjButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        removeAirlineButton.setText("Remove Airline");
        removeAirlineButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeAirlineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAirlineButtonActionPerformed(evt);
            }
        });

        viewAirlineButton.setText("View Airline");
        viewAirlineButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewAirlineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirlineButtonActionPerformed(evt);
            }
        });

        addArlineButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addArlineButton.setText("Add Airline");
        addArlineButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addArlineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArlineButtonActionPerformed(evt);
            }
        });

        airLineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Airline Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(airLineTable);

        masterScheduleButton.setText("Master Schedule");
        masterScheduleButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        masterScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterScheduleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addArlineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(viewAirlineButton)
                                .addGap(63, 63, 63)
                                .addComponent(removeAirlineButton)
                                .addGap(73, 73, 73)
                                .addComponent(masterScheduleButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(backjButton)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeAirlineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewAirlineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addArlineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(masterScheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(backjButton)
                .addGap(151, 151, 151))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void removeAirlineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAirlineButtonActionPerformed
        // TODO add your handling code here:
        int row = airLineTable.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Airlines airlines = (Airlines)airLineTable.getValueAt(row, 0);
        airLineDir.removeAirlines(airlines);
        refreshTable();
        
    }//GEN-LAST:event_removeAirlineButtonActionPerformed

     public void refreshTable() {
        int rowCount = airLineTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)airLineTable.getModel();
        for(int i = rowCount - 1; i >=0; i--) {
            model.removeRow(i);
        }
        
        for(Airlines s : airLineDir.getAirLineList()) {
            Object row[] = new Object[1];
            row[0] = s;
            model.addRow(row);
        }
    }
  
    private void viewAirlineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirlineButtonActionPerformed
        // TODO add your handling code here:
        int row = airLineTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Airlines airlines = (Airlines)airLineTable.getValueAt(row, 0);
        ViewAirlinesFlight viewAirLines = new ViewAirlinesFlight(userProcessContainer, airlines);
        userProcessContainer.add("ViewSupplier", viewAirLines);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAirlineButtonActionPerformed

    private void addArlineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArlineButtonActionPerformed
        // TODO add your handling code here:

        //int i=1;
        AddNewAirlines addAirlines = new AddNewAirlines(userProcessContainer, airLineDir);
        userProcessContainer.add("AddAirlines", addAirlines);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addArlineButtonActionPerformed

    private void masterScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterScheduleButtonActionPerformed
            MasterSchedule masterSchedule = new MasterSchedule(userProcessContainer,airLineDir);
            userProcessContainer.add("MasterSchedule",masterSchedule);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_masterScheduleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addArlineButton;
    private javax.swing.JTable airLineTable;
    private javax.swing.JButton backjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton masterScheduleButton;
    private javax.swing.JButton removeAirlineButton;
    private javax.swing.JButton viewAirlineButton;
    // End of variables declaration//GEN-END:variables
}