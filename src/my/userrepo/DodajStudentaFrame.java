/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.userrepo;

import javax.swing.JFrame;

public class DodajStudentaFrame extends javax.swing.JFrame {

    MainFrame MainFrame;
    DodajStudentaPanel dodajStudentaPanel;

    /**
     * Creates new form AddUserFrame
     */
    public DodajStudentaFrame(MainFrame mainFrame) {
        this.MainFrame = mainFrame;
        this.setTitle("Dodaj Studenta");
        dodajStudentaPanel = new my.userrepo.DodajStudentaPanel(this);
        init();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void openAddUserFrame() {
        dodajStudentaPanel.cleanUp();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
                MainFrame.setVisible(false);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public void showBackToMein() {
        MainFrame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private void init() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dodajStudentaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dodajStudentaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
        );

        pack();
    }

    void openEditUserFrame(Student studentToEdit, int index) {
        this.setTitle("Edytuj Studenta");
        dodajStudentaPanel.index = -1;
        dodajStudentaPanel.fill(studentToEdit, index);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
                MainFrame.setVisible(false);
            }
        });
    }
}
