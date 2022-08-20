/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package todolist;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author LENOVO
 */
public class FormViewTask extends javax.swing.JFrame {

    /**
     * Creates new form FormViewTask
     */
    public FormViewTask(String nama) {
        initComponents();
        String n = nama;
        labelNama.setText(n);
        koneksi();
        display();
    }
    
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement stat;
    Boolean ada = false;

    private FormViewTask() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void koneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/database_pengguna";
            String user = "root";
            String pass ="";
            con = DriverManager.getConnection(url, user, pass);
            stat = con.createStatement(rs.TYPE_SCROLL_SENSITIVE, rs.CONCUR_UPDATABLE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.exit(0);
        }
    }
    
    private void display()
    {
        try {
            String sql = "select * from tasklist where assign_to='"+labelNama.getText()+"'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tableViewList.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void reset()
    {
            inputAssignTo.setText("");
            inputDescription.setText("");
            inputDueDate.setText("");
            inputPriority.setText("");
            inputTitleTask.setText("");
            inputToken.setText("");    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableViewList = new javax.swing.JTable();
        inputToken = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        inputPriority = new javax.swing.JTextField();
        inputAssignTo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescription = new javax.swing.JTextArea();
        inputStatusProgress = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputTitleTask = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputDueDate = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Your Task List");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 30));

        jLabel2.setText("Due Date");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, 20));

        jLabel3.setText("Ttile Task List");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel5.setText("Priority Status");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        jLabel6.setText("Description");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Copy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 70, 40));

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Go to Repository");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 320, 30));

        tableViewList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableViewList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableViewListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableViewList);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 660, 140));
        jPanel2.add(inputToken, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 240, 40));

        jLabel4.setText("Token Task List");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, 20));

        jButton5.setBackground(new java.awt.Color(0, 102, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Save Changes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 620, 130, 40));
        jPanel2.add(inputPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 320, 40));
        jPanel2.add(inputAssignTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 320, 40));

        inputDescription.setColumns(20);
        inputDescription.setRows(5);
        jScrollPane1.setViewportView(inputDescription);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 320, -1));

        inputStatusProgress.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Action", "In Progress", "Completed" }));
        jPanel2.add(inputStatusProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 320, 40));

        jLabel10.setText("Status Progress");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, -1, 20));

        labelNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setText("Rima Regiani");
        jPanel2.add(labelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Welcome,");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));
        jPanel2.add(inputTitleTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 660, 40));

        jLabel7.setText("Assign To");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));
        jPanel2.add(inputDueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 320, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\home (1).png")); // NOI18N
        jLabel19.setText("MENU");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            koneksi();
            stat = con.createStatement();
            String SQL = "update tasklist SET status_progress = '"+inputStatusProgress.getSelectedItem()+"' WHERE token = '"+inputToken.getText()+"'";
            stat.executeUpdate(SQL);
            display();
            stat.close();
            con.close();
            reset();
            JOptionPane.showMessageDialog(null, "Data has been edited successfully");

        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tableViewListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableViewListMouseClicked
        // TODO add your handling code here:
        try {
            inputAssignTo.setEnabled(false);
            inputDescription.setEnabled(false);
            inputDueDate.setEnabled(false);
            inputPriority.setEnabled(false);
            inputTitleTask.setEnabled(false);
            inputToken.setEnabled(false);            
            
            koneksi();
            int row =tableViewList.getSelectedRow();
            String tabel_klik=(tableViewList.getModel().getValueAt(row, 0).toString());
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from tasklist where id='"+tabel_klik+"'");
            if(sql.next()){
                String title = sql.getString("title");
                inputTitleTask.setText(title);
                
                String assign = sql.getString("assign_to");
                inputAssignTo.setText(assign);
                
                String priority = sql.getString("priority");
                inputPriority.setText(priority);
                
                String desc = sql.getString("description");
                inputDescription.setText(desc);
                
                String token = sql.getString("token");
                inputToken.setText(token);
                
                String dateValue = sql.getString("due_date"); 
                inputDueDate.setText(dateValue);
                
                String statusProgress = sql.getString("status_progress"); 
                inputStatusProgress.setSelectedItem(statusProgress);
                
            }
        } catch (Exception e) {}
    }//GEN-LAST:event_tableViewListMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        StringSelection stringSelection = new StringSelection (inputToken.getText());
        Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
        clpbrd.setContents (stringSelection, null);
        JOptionPane.showMessageDialog(null, "Copied!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        String nama = "User Testing";
        String jabatan = "Staff";
        String role = "ADM";
        FormMenu fb = new FormMenu(nama, jabatan, role);
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String url="http://localhost/upload/?menu=token";

        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(FormViewTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(FormViewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormViewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormViewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormViewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormViewTask().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputAssignTo;
    private javax.swing.JTextArea inputDescription;
    private javax.swing.JTextField inputDueDate;
    private javax.swing.JTextField inputPriority;
    private javax.swing.JComboBox<String> inputStatusProgress;
    private javax.swing.JTextField inputTitleTask;
    private javax.swing.JTextField inputToken;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelNama;
    private javax.swing.JTable tableViewList;
    // End of variables declaration//GEN-END:variables
}
