/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchengineBen;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Frame_EditLab extends javax.swing.JFrame {

    /**
     * Creates new form Frame_AddLab
     */
    private List<Lab> labList = new ArrayList<>();

    public Frame_EditLab() {
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

        jLabel1 = new javax.swing.JLabel();
        labID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        block = new javax.swing.JTextField();
        levelllllllllllll = new javax.swing.JLabel();
        level = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        spec = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        noofco = new javax.swing.JTextField();
        showbtn = new javax.swing.JButton();
        Edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Lab ID");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Block");

        levelllllllllllll.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        levelllllllllllll.setText("Level");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Specification");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Number of Computer");

        showbtn.setText("Show");
        showbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbtnActionPerformed(evt);
            }
        });

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(noofco, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(block)
                            .addComponent(labID)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(levelllllllllllll)
                            .addComponent(jLabel4))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spec, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(level)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(showbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(block, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelllllllllllll)
                    .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(noofco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void showbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbtnActionPerformed
        // TODO add your handling code here:
        
        String line;
        String search_name = labID.getText();
        int flagg = 0;
        try {
            BufferedReader lab = new BufferedReader(new FileReader("Labs.txt"));
            while ((line = lab.readLine()) != null) {
                String[] labbs = line.split(",");
                String labid = labbs[0];
                String Block = labbs[1];
                String floor = labbs[2];
                String purpose = labbs[3];
                String no_of_pc = labbs[4];

                if (labid.equals(search_name)) {
                    flagg = 1;
                    labID.setText(labid);
                    block.setText(Block);
                    level.setText(floor);
                    spec.setText(purpose);
                    noofco.setText(no_of_pc);
                    break;
                } else {
                    flagg = 2;
                }

            }
            if (flagg == 2) {
                JOptionPane.showMessageDialog(null, "Invalid input", "Please try again", JOptionPane.ERROR_MESSAGE);

            }
            lab.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        
    }//GEN-LAST:event_showbtnActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        String labid = labID.getText();
        String Block = block.getText();
        String floor = level.getText();
        String purpose = spec.getText();
        String no_of_pc = noofco.getText();
        ArrayList<String> buduu = new ArrayList<>();
        try {
            BufferedReader labbb = new BufferedReader(new FileReader("Labs.txt"));
            String line;
            while ((line = labbb.readLine()) != null) {

                String[] filll = line.split(",");
                String ID = filll[0];
                if (filll[0].equals(labid)) {
                    buduu.add(filll[0] + "," + Block + "," + floor + "," + purpose + "," + no_of_pc + "\r\n");
                } else {
                    buduu.add(line);
                }
            }
            labbb.close();
        } catch (Exception e) {
             e.printStackTrace();
        }
        try {
            try (PrintWriter pp = new PrintWriter("Labs.txt")) {
                for (String tt : buduu) {
                    pp.println(tt);
                }
                pp.close();
            } catch (Exception e) {
                 e.printStackTrace();
            }
        } catch (Exception e) {
             e.printStackTrace();
        } finally {
            JOptionPane.showMessageDialog(null, "Details of " + labID.getText() + " has been modified", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    
    }//GEN-LAST:event_EditActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame_EditLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_EditLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_EditLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_EditLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_EditLab().setVisible(true);
            }
        });
    }

    private void rst() {
        labID.setText("");
        block.setText("");
        level.setText("");
        spec.setText("");
        noofco.setText("");
    }

    public String formatList() {
        String outputStr = "";
        for (int i = 0; i < labList.size(); ++i) {
            outputStr += (i + 1) + ". " + labList.get(i);
        }
        return outputStr;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    private javax.swing.JTextField block;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField labID;
    private javax.swing.JTextField level;
    private javax.swing.JLabel levelllllllllllll;
    private javax.swing.JTextField noofco;
    private javax.swing.JButton showbtn;
    private javax.swing.JTextField spec;
    // End of variables declaration//GEN-END:variables
}
