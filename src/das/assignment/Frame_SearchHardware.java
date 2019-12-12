/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das.assignment;

import static das.assignment.Frame_Search_Lab.isInteger;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Frame_SearchHardware extends javax.swing.JFrame {

    String deviceID;
    String processor;
    String ram;
    String os;
    String version;
    String manufacturer;
    String system;

    public Frame_SearchHardware() {
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
        computertbl = new javax.swing.JTable();
        backbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        showbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        spectxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        computertbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Computer Laboratory", "Computer ID", "Processor", "RAM", "Operating System"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        computertbl.getTableHeader().setReorderingAllowed(false);
        computertbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                computertblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(computertbl);

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel6.setText("Search Specification");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel5.setText("Lab&Computer Searching Engine");

        showbtn.setText("Show");
        showbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Specification");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(spectxt, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(showbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spectxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        Frame_Student fc = new Frame_Student();
        fc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backbtnActionPerformed

    private void showbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbtnActionPerformed
        String spec = spectxt.getText();
        showTable(spec);
    }//GEN-LAST:event_showbtnActionPerformed

    private void computertblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_computertblMouseClicked
//        String line;
//        DefaultTableModel model = (DefaultTableModel) computertbl.getModel();
//        int selectedRowIndex = computertbl.getSelectedRow();
//
//        labbtxt.setText(model.getValueAt(selectedRowIndex, 0).toString());
//        labbtxt.setEnabled(false);
//        deviceIDtxt.setText(model.getValueAt(selectedRowIndex, 1).toString());
//        deviceIDtxt.setEnabled(false);
//        String nameee = labbtxt.getText() + ".txt";
//
//        Computer compp = new Computer();
//        compp.show_comp(nameee, deviceIDtxt.getText());
//        processor = compp.getProcessor();
//        ram = compp.getRam();
//        os = compp.getOS();
//        version = compp.getVersion();
//        manufacturer = compp.getManufacturer();
//        system = compp.getSystem();
//
//        processortxt.setText(this.processor);
//        processortxt.setEnabled(false);
//        ramtxt.setText(this.ram);
//        ramtxt.setEnabled(false);
//        ostxt.setText(this.os);
//        ostxt.setEnabled(false);
//        versiontxt.setText(this.version);
//        versiontxt.setEnabled(false);
//        manufacturertxt.setText(this.manufacturer);
//        manufacturertxt.setEnabled(false);
//        systemtxt.setText(this.system);
//        systemtxt.setEnabled(false);
    }//GEN-LAST:event_computertblMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_SearchHardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_SearchHardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_SearchHardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_SearchHardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_SearchHardware().setVisible(true);
            }
        });
    }

    public void showTable(String spec) {
        String line;
        DefaultTableModel table = new DefaultTableModel(new String[]{"Computer Laboratory", "Computer ID","Processor","RAM","Operating System"}, 0);
        computertbl.setModel(table);
        try {
            BufferedReader lab = new BufferedReader(new FileReader("specification.txt"));
            while ((line = lab.readLine()) != null) {
                String[] labbs = line.split(",");
                String labID = labbs[0];
                deviceID = labbs[1];
                processor = labbs[3];
                ram = labbs[4];
                os = labbs[5];
                version = labbs[6];
                system = labbs[8];
                if (spec.matches(processor) || spec.matches(ram) || spec.matches(ram) || spec.matches(os) || spec.matches(version) || spec.matches(system)) {
                    for (int i = 0; i < line.length(); i++) {
                        Object[] row = new Object[5];
                        row[0] = labID;
                        row[1] = deviceID;
                        row[2] = processor;
                        row[3] = ram;
                        row[4] = os;
                        table.addRow(row);
                        break;
                    }
                    //                   line = lab.readLine();
//                   System.out.println(labID);
//                    System.out.println(deviceID);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

//    public void rst() {
//        DefaultTableModel dm = (DefaultTableModel) computertbl.getModel();
//        while (dm.getRowCount() > 0) {
//            dm.removeRow(0);
//        }
//        deviceIDtxt.setText(null);
//        spectxt.setText(null);
//        labbtxt.setText(null);
//        processortxt.setText(null);
//        ramtxt.setText(null);
//        ostxt.setText(null);
//        versiontxt.setText(null);
//        manufacturertxt.setText(null);
//        systemtxt.setText(null);
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JTable computertbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showbtn;
    private javax.swing.JTextField spectxt;
    // End of variables declaration//GEN-END:variables
}