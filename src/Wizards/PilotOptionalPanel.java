/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Wizards;

/**
 *
 * @author Matt
 */
public class PilotOptionalPanel extends javax.swing.JPanel {

    /**
     * Creates new form PilotOptionalPanel
     */
    public PilotOptionalPanel() {
        initComponents();
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
        additionalInfoArea = new javax.swing.JTextArea();
        ppPhoneField = new javax.swing.JTextField();
        ppNameField = new javax.swing.JTextField();
        ppNameLabel = new javax.swing.JLabel();
        ppPhoneLabel = new javax.swing.JLabel();
        primaryPhysicianLabel = new javax.swing.JLabel();
        ecNameField = new javax.swing.JTextField();
        ecPhoneLabel = new javax.swing.JLabel();
        ecPhoneField = new javax.swing.JTextField();
        additionalInfoLabel = new javax.swing.JLabel();
        emergContactLabel = new javax.swing.JLabel();
        ecNameLabel = new javax.swing.JLabel();

        additionalInfoArea.setColumns(20);
        additionalInfoArea.setRows(5);
        jScrollPane1.setViewportView(additionalInfoArea);

        ppNameLabel.setText("Name:");

        ppPhoneLabel.setText("Phone:");

        primaryPhysicianLabel.setText("Primary Physician:");

        ecNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecNameFieldActionPerformed(evt);
            }
        });

        ecPhoneLabel.setText("Phone:");

        ecPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecPhoneFieldActionPerformed(evt);
            }
        });

        additionalInfoLabel.setText("Additional Info:");

        emergContactLabel.setText("Emergency Contact:");

        ecNameLabel.setText("Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ecPhoneLabel)
                            .addComponent(ecNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ecNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(ecPhoneField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ppNameLabel)
                            .addComponent(ppPhoneLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ppNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(ppPhoneField)))
                    .addComponent(primaryPhysicianLabel)
                    .addComponent(emergContactLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(additionalInfoLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emergContactLabel)
                    .addComponent(additionalInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ecNameLabel)
                            .addComponent(ecNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ecPhoneLabel)
                            .addComponent(ecPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(primaryPhysicianLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ppNameLabel)
                            .addComponent(ppNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ppPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ppPhoneLabel)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ecNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ecNameFieldActionPerformed

    private void ecPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ecPhoneFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea additionalInfoArea;
    private javax.swing.JLabel additionalInfoLabel;
    private javax.swing.JTextField ecNameField;
    private javax.swing.JLabel ecNameLabel;
    private javax.swing.JTextField ecPhoneField;
    private javax.swing.JLabel ecPhoneLabel;
    private javax.swing.JLabel emergContactLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ppNameField;
    private javax.swing.JLabel ppNameLabel;
    private javax.swing.JTextField ppPhoneField;
    private javax.swing.JLabel ppPhoneLabel;
    private javax.swing.JLabel primaryPhysicianLabel;
    // End of variables declaration//GEN-END:variables
}
