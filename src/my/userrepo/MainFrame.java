/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.userrepo;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserRepoMenage
     */
    public MainFrame() {
       this.setTitle("Baza Studentów");
       initStudentModel();
       initComponents();
       this.addUserFrame = new DodajStudentaFrame(this);
       this.wyswietlFrame = new WyswietlFrame(this);
    }

    private void initStudentModel() {
        studentModel.addElement("Student 1");
        studentModel.addElement("Student 2");
        studentModel.addElement("Student 3");
        studentModel.addElement("Student ...");
    }

    private void initComponents() {

        daodajButton = new javax.swing.JButton();
        usunButton = new javax.swing.JButton();
        wyszukajButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studenciJList = new javax.swing.JList();
        studenciLabel = new javax.swing.JLabel();
        zamknijButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        daodajButton.setText("Dodaj");
        daodajButton.setName("dodaj"); // NOI18N
        daodajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daodajButtonActionPerformed(evt);
            }
        });

        usunButton.setText("Usuń");
        usunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunButtonActionPerformed(evt);
            }
        });

        wyszukajButton.setText("Wyświetl/Wyszukaj");
        wyszukajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyszukajButtonActionPerformed(evt);
            }
        });

        studenciJList.setModel(studentModel);
        studenciJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studenciJListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studenciJList);

        studenciLabel.setText("Studenci:");

        zamknijButton.setText("Zamknij");
        zamknijButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zamknijButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zamknijButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(daodajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wyszukajButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studenciLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(studenciLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(daodajButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usunButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wyszukajButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(zamknijButton))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void usunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunButtonActionPerformed
  
        JOptionPane.showMessageDialog(this, "Najpierw zaznacz studenta");
    }//GEN-LAST:event_usunButtonActionPerformed

    private void daodajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daodajButtonActionPerformed
            this.addUserFrame.openAddUserFrame();        
    }//GEN-LAST:event_daodajButtonActionPerformed

    private void wyszukajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyszukajButtonActionPerformed
        this.wyswietlFrame.openWyswietlFrame();
    }//GEN-LAST:event_wyszukajButtonActionPerformed

    private void zamknijButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zamknijButtonActionPerformed
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_zamknijButtonActionPerformed

    private void studenciJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studenciJListMouseClicked
         if (evt.getClickCount() == 2) {
                 int index = studenciJList.locationToIndex(evt.getPoint());
                 System.out.println("Double clicked on Item " + index);
                 studentModel.setElementAt("edytowany student", index);
              }
    }//GEN-LAST:event_studenciJListMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton daodajButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList studenciJList;
    private javax.swing.JLabel studenciLabel;
    private javax.swing.JButton usunButton;
    private javax.swing.JButton wyszukajButton;
    private javax.swing.JButton zamknijButton;
    // End of variables declaration//GEN-END:variables
    private DodajStudentaFrame addUserFrame;
    private WyswietlFrame wyswietlFrame;
    DefaultListModel studentModel =new DefaultListModel();
}
