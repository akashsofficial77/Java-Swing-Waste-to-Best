/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.DistributorRole;

import business.models.User.User;
import business.models.workRequest.CompostGeneratedWorkRequest;
import business.models.workRequest.FoodProductWorkRequest;
import business.models.workRequest.PurchaseCompostWorkRequest;
import business.models.workRequest.SeedWorkRequest;
import business.models.workRequest.SellCropProduceWorkRequest;
import business.models.workRequest.TumblerWorkRequest;
import business.models.workRequest.WorkRequest;
import enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import organizations.DistributorOrganization;

/**
 *
 * @author Aditya
 */
public class DistributorWorkAreaJPanel extends javax.swing.JPanel {
   private final JPanel userProcessContainer;
    private final DistributorOrganization organization;
    private final Enterprise enterprise;
    private final User userAccount;
    /**
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DistributorWorkAreaJPanel(JPanel userProcessContainer, User account, DistributorOrganization organization, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        populateTable();
    }
    
    
      protected void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        organization.getWorkQueue().getWorkRequestList().stream().map((request) -> {
            Object[] row = new Object[3];
            row[0] = request;
            row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[2] = request.getStatus();
           return row;
       }).forEach((row) -> {
           model.addRow(row);
       });
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
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        assignJButton.setBackground(new java.awt.Color(153, 204, 255));
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setBackground(new java.awt.Color(153, 204, 255));
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setBackground(new java.awt.Color(153, 204, 255));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Distributor Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refreshJButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(assignJButton)
                                .addGap(36, 36, 36)
                                .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(processJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assignJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(246, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        
       if(!request.getStatus().equals("Sent"))
        {JOptionPane.showMessageDialog(null, "Request already assigned or is in Process");
        }else{
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        }
        populateTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        switch (request.getStatus()) {
           case "Sent to Supplier":
               JOptionPane.showMessageDialog(null, "Request  is in Process");
               break;
           case "Sent":
               JOptionPane.showMessageDialog(null, "Assign Request to yourself and then Process");
               break;
           default:
               if (workRequestJTable.getValueAt(selectedRow, 0) instanceof SellCropProduceWorkRequest ){
                   SellCropProduceWorkRequest sellCropProduceWorkRequest = (SellCropProduceWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
                   
                   sellCropProduceWorkRequest.setStatus("Sent to Supplier");
                   
                   ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer,userAccount,enterprise, sellCropProduceWorkRequest);
                   userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
                   CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                   layout.next(userProcessContainer);
                   
               }  if (workRequestJTable.getValueAt(selectedRow, 0) instanceof CompostGeneratedWorkRequest ){
                   CompostGeneratedWorkRequest compostGeneratedWorkRequest = (CompostGeneratedWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
                   
                   compostGeneratedWorkRequest.setStatus("Sent to Supplier");
                   
                   ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer,userAccount,enterprise, compostGeneratedWorkRequest);
                   userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
                   CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                   layout.next(userProcessContainer);
                   
               }  if (workRequestJTable.getValueAt(selectedRow, 0) instanceof FoodProductWorkRequest ){
                   FoodProductWorkRequest foodProductWorkRequest = (FoodProductWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
                   
                   foodProductWorkRequest.setStatus("Sent to Supplier");
                   
                   ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer,userAccount,enterprise, foodProductWorkRequest);
                   userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
                   CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                   layout.next(userProcessContainer);
                   
               }  if (workRequestJTable.getValueAt(selectedRow, 0) instanceof TumblerWorkRequest ){
                   TumblerWorkRequest tumblerWorkRequest = (TumblerWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
                   tumblerWorkRequest.setStatus("Sent to Supplier");
                   
                   ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer,userAccount,enterprise, tumblerWorkRequest);
                   userProcessContainer.add("ProcessWorkRequestJPanel", processWorkRequestJPanel);
                   CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                   layout.next(userProcessContainer);
                   
               }  if (workRequestJTable.getValueAt(selectedRow, 0) instanceof PurchaseCompostWorkRequest ){
                   PurchaseCompostWorkRequest purchaseCompostWorkRequest = (PurchaseCompostWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
                   purchaseCompostWorkRequest.setStatus("Sent to Supplier");

                    ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer,userAccount,enterprise, purchaseCompostWorkRequest);
                    userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }  if (workRequestJTable.getValueAt(selectedRow, 0) instanceof SeedWorkRequest ){
                   SeedWorkRequest seedWorkRequest = (SeedWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
                   seedWorkRequest.setStatus("Sent to Supplier");

                    ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer,userAccount,enterprise, seedWorkRequest);
                    userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                } break;
       }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}