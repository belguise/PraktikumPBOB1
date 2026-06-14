/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import javax.swing.DefaultListModel;
public class Gui extends javax.swing.JFrame {
    DefaultListModel<String> model = new DefaultListModel<>();
    ArrayList<String> data = new ArrayList<>();

    public Gui() {
    
        initComponents();
        listItem.setModel(model);
   
        jLabel2.setText("Item Name");

        txtItem.setText("");

        btnAdd.setText("Add");
        btnUpdate.setText("Update");
        btnDelete.setText("Delete");
        btnClearall.setText("Clear All");
        btnsavelist.setText("Save Data");
        btninsertlist.setText("Insert Data");
}
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listItem = new javax.swing.JList<>();
        txtItem = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClearall = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnsavelist = new javax.swing.JButton();
        btninsertlist = new javax.swing.JButton();
        btnsaveset = new javax.swing.JButton();
        btninsertset = new javax.swing.JButton();
        btnsavemap = new javax.swing.JButton();
        btninsertmap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listItem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listItem);

        btnAdd.setText("Add");
        btnAdd.addActionListener(this::btnAddActionPerformed);

        jLabel2.setText("Item Name");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(this::btnUpdateActionPerformed);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(this::btnDeleteActionPerformed);

        btnClearall.setText("Clear all");
        btnClearall.addActionListener(this::btnClearallActionPerformed);

        btnsavelist.setText("save to List->");
        btnsavelist.addActionListener(this::btnsavelistActionPerformed);

        btninsertlist.setText("<-insert data List");
        btninsertlist.addActionListener(this::btninsertlistActionPerformed);

        btnsaveset.setText("save to Set->");
        btnsaveset.addActionListener(this::btnsavesetActionPerformed);

        btninsertset.setText("<-insert data Set");
        btninsertset.addActionListener(this::btninsertsetActionPerformed);

        btnsavemap.setText("save to Map->");
        btnsavemap.setToolTipText("");
        btnsavemap.addActionListener(this::btnsavemapActionPerformed);

        btninsertmap.setText("<-insert data Map");
        btninsertmap.addActionListener(this::btninsertmapActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClearall, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsavelist, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btninsertlist, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsaveset, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btninsertset, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsavemap, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btninsertmap, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnsavelist)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btninsertlist)
                        .addGap(20, 20, 20)
                        .addComponent(btnsaveset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btninsertset)
                        .addGap(18, 18, 18)
                        .addComponent(btnsavemap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btninsertmap)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearall)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                   

                                    

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here
        String item = txtItem.getText();
        
        if (!item.isEmpty()){
            model.addElement (item);
            txtItem.setText("");
       
    }//GEN-LAST:event_btnAddActionPerformed
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    int index = listItem.getSelectedIndex();
    String itemBaru = txtItem.getText();
    if (index != -1 && !itemBaru.isEmpty()) {
        model.set(index, itemBaru);
        txtItem.setText("");
    }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
                                                               
        int index = listItem.getSelectedIndex();

        if (index != -1) {
            model.remove(index);
    }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearallActionPerformed
        // TODO add your handling code here:
        
   
    model.clear();
    }//GEN-LAST:event_btnClearallActionPerformed

    private void btnsavelistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavelistActionPerformed
        // TODO add your handling code here:
        

    data.clear();

    for (int i = 0; i < model.size(); i++) {
        data.add(model.getElementAt(i));
    }

    
    }//GEN-LAST:event_btnsavelistActionPerformed

    private void btninsertlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertlistActionPerformed
       

    model.clear();

    for (String item : data) {
        model.addElement(item);
    }

    }//GEN-LAST:event_btninsertlistActionPerformed

    private void btnsavesetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavesetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsavesetActionPerformed

    private void btninsertsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertsetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btninsertsetActionPerformed

    private void btnsavemapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavemapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsavemapActionPerformed

    private void btninsertmapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertmapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btninsertmapActionPerformed
/**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(() -> {

            new Gui().setVisible(true);
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClearall;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btninsertlist;
    private javax.swing.JButton btninsertmap;
    private javax.swing.JButton btninsertset;
    private javax.swing.JButton btnsavelist;
    private javax.swing.JButton btnsavemap;
    private javax.swing.JButton btnsaveset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listItem;
    private javax.swing.JTextField txtItem;
    // End of variables declaration//GEN-END:variables
}
