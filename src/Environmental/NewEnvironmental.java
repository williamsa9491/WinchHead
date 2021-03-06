/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ParameterSelection;
import DataObjects.Environmental;
import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @author garreola-gutierrez
 */
public class NewEnvironmental extends javax.swing.JPanel {

    /**
     * Creates new form NewEnvironmental
     */
    public NewEnvironmental() {
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

        windSpeedTextField = new javax.swing.JTextField();
        windDirectionField = new javax.swing.JTextField();
        densityAltitudeTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        button1 = new java.awt.Button();

        windSpeedTextField.setBackground(new java.awt.Color(255, 0, 0));
        windSpeedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                windSpeedTextFieldKeyReleased(evt);
            }
        });

        windDirectionField.setBackground(new java.awt.Color(255, 0, 0));
        windDirectionField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                windDirectionFieldKeyReleased(evt);
            }
        });

        densityAltitudeTextField.setBackground(new java.awt.Color(255, 0, 0));
        densityAltitudeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                densityAltitudeTextFieldKeyReleased(evt);
            }
        });

        jLabel1.setText("Wind Speed");

        jLabel2.setText("<html>Wind Direction <br/> (relative to winch) </html>");

        jLabel3.setText("Density Altitude");

        jLabel4.setText("Enter weather conditions");

        button1.setLabel("Submit");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(densityAltitudeTextField)
                            .addComponent(windDirectionField)
                            .addComponent(windSpeedTextField))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(windSpeedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(windDirectionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(densityAltitudeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void windSpeedTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_windSpeedTextFieldKeyReleased
        if(windSpeedTextField.getText().isEmpty()){
            windSpeedTextField.setBackground(Color.RED);
        }
        else
            try {
                int  windSpeed = Integer.parseInt(windSpeedTextField.getText());
                windSpeedTextField.setBackground(Color.GREEN);
            }catch(NumberFormatException e) {
                windSpeedTextField.setBackground(Color.RED);
            }      
    }//GEN-LAST:event_windSpeedTextFieldKeyReleased

    private void windDirectionFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_windDirectionFieldKeyReleased
        // TODO add your handling code here:
        if(windDirectionField.getText().isEmpty()){
            windDirectionField.setBackground(Color.RED);
        }
        else
            windDirectionField.setBackground(Color.GREEN);   
    }//GEN-LAST:event_windDirectionFieldKeyReleased

    private void densityAltitudeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_densityAltitudeTextFieldKeyReleased
        // TODO add your handling code here:
                if(densityAltitudeTextField.getText().isEmpty()){
            densityAltitudeTextField.setBackground(Color.RED);
        }
        else
            try {
                int densityAltitude = Integer.parseInt(densityAltitudeTextField.getText());
                densityAltitudeTextField.setBackground(Color.GREEN);
            }catch(NumberFormatException e) {
                densityAltitudeTextField.setBackground(Color.RED);
            } 
    }//GEN-LAST:event_densityAltitudeTextFieldKeyReleased
public Environmental getSelectedEnviromental() {
 
        int wind = 0;
        if(windSpeedTextField.getText().isEmpty())
            JOptionPane.showMessageDialog(windSpeedTextField, "Please provide a wind speed");
        try{
            wind= Integer.parseInt(windSpeedTextField.getText());
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(windSpeedTextField, "Please provide a VALID wind speed");
        }
        if(windDirectionField.getText().isEmpty())
            JOptionPane.showMessageDialog(windDirectionField, "Please provide a last name");
        String direction = windDirectionField.getText();
           int density = 0;
        if(densityAltitudeTextField.getText().isEmpty())
            JOptionPane.showMessageDialog(densityAltitudeTextField, "Please provide a wind speed");
        try{
            density = Integer.parseInt(densityAltitudeTextField.getText());
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(densityAltitudeTextField, "Please provide a VALID wind speed");
        }
       
        return (new Environmental(wind, direction, density));
        
    }
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
            Environmental name = getSelectedEnviromental();
            if(name == null)
                JOptionPane.showMessageDialog(null,"You have enterder weather conditions");
            else
                JOptionPane.showMessageDialog(null, "Weather Conditions:" + '\n' + name.getWindSpeed() + '\n' + name.getDirection() + '\n' + 
                        name.getAltitudeDensity());
       
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JTextField densityAltitudeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField windDirectionField;
    private javax.swing.JTextField windSpeedTextField;
    // End of variables declaration//GEN-END:variables
}
