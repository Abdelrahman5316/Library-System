/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static gui.ViewLibrarian.librarianTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mosta
 */
public class StudentSection extends javax.swing.JFrame {

    /**
     * Creates new form StudentSection
     */
    public StudentSection() {
        initComponents();
        int i,j ,flag=0;
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
         DefaultTableModel mode2=(DefaultTableModel)jTable2.getModel();
       model.getDataVector().removeAllElements();
       mode2.getDataVector().removeAllElements();
       String[] X=new String[8];
       String[] tokin=new String[3];
       X[0]=Reader.students.get(Student.selectedStudent).getStudentName();
       X[1]=Reader.students.get(Student.selectedStudent).getStudentPassword();
       X[2]=Reader.students.get(Student.selectedStudent).getStudentEmail();
       X[3]=Reader.students.get(Student.selectedStudent).getAddress();
       X[4]=Reader.students.get(Student.selectedStudent).getCity();
       X[5]=Reader.students.get(Student.selectedStudent).getStudentcontact();
       X[6]=Integer.toString(Reader.students.get(Student.selectedStudent).getNumberOfBooks());
       X[7]=Integer.toString(Reader.students.get(Student.selectedStudent).getId());

        model.addRow(X);
        for(i=0;i<Reader.issued.size();i++){
        if(Reader.issued.get(i).getStudentName().equals(Reader.students.get(Student.selectedStudent).getStudentName()))
            for(j=0;j<Reader.books.size();j++){
                if(Reader.books.get(j).getCallNo().equals(Reader.issued.get(i).getBookCallno())){
                    tokin[0]=Reader.books.get(j).getName();
                    tokin[1]=Reader.books.get(j).getAuthor();
                    tokin[2]=Reader.books.get(j).getPublisher();
                    mode2.addRow(tokin);
                }
            }
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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Student Password", "Student email", "Student Addess", "City", "Student Contact", "Student no. of Books", "Student id"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book name", "Book author", "Book publisher"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
       new HomeFrame().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
