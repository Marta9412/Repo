/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.userrepo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserRepoMenage
     */
    public MainFrame() {
        this.setTitle("Baza Studentów");
        initComponents();
        this.addUserFrame = new DodajStudentaFrame(this);
        this.wyswietlFrame = new WyswietlFrame(this);
    }

    private void initComponents() {

        daodajButton = new javax.swing.JButton();
        usunButton = new javax.swing.JButton();
        wyszukajButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studenciJList = new javax.swing.JList();
        studenciLabel = new javax.swing.JLabel();
        zamknijButton = new javax.swing.JButton();
        openButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        openButton.setText("Otwórz plik...");
        openButton.setName("open"); // NOI18N
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    openButtonActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

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
                                                .addComponent(wyszukajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(wyszukajButton)
                                        .addComponent(openButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(zamknijButton))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void usunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunButtonActionPerformed
        int index = studenciJList.getSelectedIndex();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Najpierw zaznacz studenta");
        }
        Student student = (Student) studentModel.getElementAt(index);
        studentModel.removeElementAt(index);
        students.remove(student);
        System.out.print("");
    }//GEN-LAST:event_usunButtonActionPerformed

    private void daodajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daodajButtonActionPerformed
        this.addUserFrame.openAddUserFrame();
    }//GEN-LAST:event_daodajButtonActionPerformed

    private void wyszukajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyszukajButtonActionPerformed
        this.wyswietlFrame.openWyswietlFrame();
    }//GEN-LAST:event_wyszukajButtonActionPerformed

    private void zamknijButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zamknijButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Baza studentów zaostanie zaouisana");
        int returnVal = chooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                menagerPlikow.saveSudents(Arrays.asList((this.studentModel.toArray())), chooser.getSelectedFile());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_zamknijButtonActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        int returnVal = chooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            studentFile = chooser.getSelectedFile();
            //This is where a real application would open the file.
        }
        this.students = menagerPlikow.getStudents(studentFile);
        for (Student student : students) {
            studentModel.addElement(student);
        }
        studenciJList = new JList(studentModel);

        System.out.println(studentFile.getAbsolutePath() + "!!!!");
    }

    private void studenciJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studenciJListMouseClicked
        int index = studenciJList.locationToIndex(evt.getPoint());
        if (evt.getClickCount() == 2) {
            Student studentToEdit = (Student) studentModel.remove(index);
            System.out.println("Double clicked on Item " + index);
            this.addUserFrame.openEditUserFrame(studentToEdit, index);
        }
        studenciJList.setSelectedIndex(index);
    }//GEN-LAST:event_studenciJListMouseClicked

    public void updateStudentList(DefaultListModel defaultListModel) {
        studenciJList = new JList(defaultListModel);
    }

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
    DefaultListModel studentModel = new DefaultListModel();
    private javax.swing.JButton openButton;
    private JFileChooser chooser = new JFileChooser();
    File studentFile;
    MenagerPlikow menagerPlikow = new MenagerPlikow();
    List<Student> students = new ArrayList<>();
}
