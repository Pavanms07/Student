/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_v1;
import java.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
//import net.proteanit.sql.DbUtils;

/**
 *
 * @author Krishno Dey
 */
public class Course_Registration extends javax.swing.JFrame {

    /**
     * Creates new form Course_Registration
     */
    
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    public Course_Registration() {
        initComponents();
        con=Javav1.getConnection();
        CourseDB();
    }

    private void CourseDB(){
        String sql = "select * from CourseList";
        
        try {
            pst=con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTableCourse.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCourse = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jID = new javax.swing.JTextField();
        jCourseName = new javax.swing.JComboBox<>();
        jRegister = new javax.swing.JButton();
        jCourseID = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jSemester = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCredit = new javax.swing.JTextField();
        jSection = new javax.swing.JTextField();
        jTeacher = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Information System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Course Registration");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/diu_64px.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons8-registration-40.png"))); // NOI18N
        jLabel7.setText("\n\n");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1)))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ass_ID", "ID", "CourseID", "Couse_Name", "Credit", "Section", "Teacher"
            }
        ));
        jTableCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCourseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCourse);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Course ID:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Course Name:");

        jID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jCourseName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCourseName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Algorithms", "Algorithoms Lab", "Electrical Device & Circuit", "Electrical Device & Circuit Lab", "Statistics", "Microprocessor & Assembly Language", "Microprocessor & Assembly Language Lab", "Data Communication", "Numerical Methods", "Introduction to Bio-Informatics", "DBMS", "DBMS Sessional", "Networking", "Networking Sessional", "Art of Living" }));

        jRegister.setBackground(new java.awt.Color(204, 204, 204));
        jRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons8-registration-24.png"))); // NOI18N
        jRegister.setText("Register");
        jRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterActionPerformed(evt);
            }
        });

        jCourseID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCourseID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE 221", "CSE 222", "CSE 224", "CSE 225", "STA 113", "CSE 231", "CSE 232", "CSE 233", "CSE 234", "CSE 235", "CSE 311", "CSE 312", "CSE 313", "CSE 314", "GED 321" }));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons8-back-arrow-24.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSemester.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Summer 18", "Fall 18", "Spring 19" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Section:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Credit:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Teacher:");

        jCredit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jSection.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTeacher.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Select Semester");

        Update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons8-update-24(1).png"))); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(204, 204, 204));
        Delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons8-delete-bin-24.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRegister)
                        .addGap(125, 125, 125))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(109, 109, 109)
                                            .addComponent(jID))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(48, 48, 48)
                                            .addComponent(jCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(217, 217, 217)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSection)
                                            .addComponent(jCredit)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Update))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Delete)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRegister)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Update)
                                .addComponent(Delete)))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCourseID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Admin_DashBoard lfg = new Admin_DashBoard();
        lfg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterActionPerformed
       con=Javav1.getConnection();
        if(con !=null){
            String semester = (String) jSemester.getSelectedItem();
            String id=jID.getText();
            String courseid = (String) jCourseID.getSelectedItem();
            String coursename = (String) jCourseName.getSelectedItem();
            String credit=jCredit.getText();
            String section=jSection.getText();
            String teacher=jTeacher.getText();
            
            
            String sql= "INSERT INTO CourseList VALUES (?,?,?,?,?,?,?)";
            
            try {
                pst=con.prepareStatement(sql);
                
              
                pst.setInt(1, Integer.parseInt(id));
                pst.setString(2, courseid);
                pst.setString(3, coursename);
                pst.setInt(4, Integer.parseInt(credit));
                pst.setString(5, section);
                pst.setString(6, teacher);
                pst.setString(7, semester);
              
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "You have added courses successfully!");
                
            } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex);
            }
            finally{
            try{
             rs.close();
             pst.close();
                    
            }catch(Exception ex){}
            }
        }
        CourseDB();
    }//GEN-LAST:event_jRegisterActionPerformed

    private void jTableCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCourseMouseClicked
         int row=jTableCourse.getSelectedRow();
        String sjb=jTableCourse.getModel().getValueAt(row, 0).toString();
        
        try{
        String sql="select * from CourseList where Ass_ID="+sjb+"";
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        
        if(rs.next()){
          //get data from data
           int id=rs.getInt("ID");
           String courseid=rs.getString("CourseID");
           String coursename=rs.getString("CourseName");
           int credit=rs.getInt("Credit");
           String section=rs.getString("Section");
           String teacher=rs.getString("Teacher");
           String semester=rs.getString("S_Name");
         
           
          //putting data in the fields
           
          
           jSemester.setSelectedItem(semester);
           jID.setText(""+id);
           jCourseID.setSelectedItem(courseid);
           jCourseName.setSelectedItem(coursename);
           jCredit.setText(""+credit);
           jSection.setText(section);
           jTeacher.setText(teacher);
           
           
           
           
        }
        
        }
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jTableCourseMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
       con=Javav1.getConnection();
       
       if(con !=null){
            String semester = (String) jSemester.getSelectedItem();
            String id=jID.getText();
            String courseid = (String) jCourseID.getSelectedItem();
            String coursename = (String) jCourseName.getSelectedItem();
            String credit=jCredit.getText();
            String section=jSection.getText();
            String teacher=jTeacher.getText();
            
            int row=jTableCourse.getSelectedRow();
            String sjb=jTableCourse.getModel().getValueAt(row, 0).toString();
            
            String sql= "update CourseList set ID=?,CourseID=?,CourseName=?,Credit=?,Section=?,Teacher=?,S_Name=? where Ass_ID="+sjb+"";
            
            try {
                pst=con.prepareStatement(sql);
                
              
                pst.setInt(1, Integer.parseInt(id));
                pst.setString(2, courseid);
                pst.setString(3, coursename);
                pst.setInt(4, Integer.parseInt(credit));
                pst.setString(5, section);
                pst.setString(6, teacher);
                pst.setString(7, semester);
              
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "You have Updated course successfully!");
                
            } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex);
            }
            finally{
            try{
             rs.close();
             pst.close();
                    
            }catch(Exception ex){}
            }
        }
        CourseDB();
       
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        con=Javav1.getConnection();
        int row=jTableCourse.getSelectedRow();
        String sjti=jTableCourse.getModel().getValueAt(row, 0).toString();
        
        String sql="delete from CourseList where Ass_ID="+sjti+"";
        
        try {
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Susscessfully Deleted");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Course_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Course_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Course_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Course_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Course_Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCourseID;
    private javax.swing.JComboBox<String> jCourseName;
    private javax.swing.JTextField jCredit;
    private javax.swing.JTextField jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jRegister;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSection;
    private javax.swing.JComboBox<String> jSemester;
    private javax.swing.JTable jTableCourse;
    private javax.swing.JTextField jTeacher;
    // End of variables declaration//GEN-END:variables
}