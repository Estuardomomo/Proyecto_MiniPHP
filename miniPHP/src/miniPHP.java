
import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User_Len
 */
public class miniPHP extends javax.swing.JFrame {

    /**
     * Creates new form miniPHP
     */
    public miniPHP() {
        initComponents();
    }
    //Cargar archivo PHP
    private void cargarPHP(Component a)
    {
     JFileChooser dialog = new JFileChooser();
     FileNameExtensionFilter filter = new FileNameExtensionFilter("archivos php", "php");
     dialog.setFileFilter(filter);
     if(dialog.showOpenDialog(a) == JFileChooser.APPROVE_OPTION)
     {
         File selectedFile = dialog.getSelectedFile();
         //Realizar acción.
     }
    }
    //Cargar un archivo JFlex
    private void cargarJFLEX(Component a)
    {
     JFileChooser dialog = new JFileChooser();
     FileNameExtensionFilter filter = new FileNameExtensionFilter("archivos jflex", "flex");
     dialog.setFileFilter(filter);
     if(dialog.showOpenDialog(a) == JFileChooser.APPROVE_OPTION)
     {
         File selectedFile = dialog.getSelectedFile();
         jflex.Main.main(new String[] {selectedFile.getPath()});
         //Realizar acción.
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

        jbtnFlex = new javax.swing.JButton();
        jbtnPHP = new javax.swing.JButton();
        jbtnGo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnFlex.setText("jFlex");
        jbtnFlex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFlexActionPerformed(evt);
            }
        });

        jbtnPHP.setText("jPHP");
        jbtnPHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPHPActionPerformed(evt);
            }
        });

        jbtnGo.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnGo)
                    .addComponent(jbtnPHP)
                    .addComponent(jbtnFlex))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jbtnFlex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnPHP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnGo)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPHPActionPerformed
        // Cargar el archivo PHP
        cargarPHP(this);
    }//GEN-LAST:event_jbtnPHPActionPerformed

    private void jbtnFlexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFlexActionPerformed
        // TODO add your handling code here:
        cargarJFLEX(this);
    }//GEN-LAST:event_jbtnFlexActionPerformed

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
            java.util.logging.Logger.getLogger(miniPHP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(miniPHP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(miniPHP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(miniPHP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new miniPHP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnFlex;
    private javax.swing.JButton jbtnGo;
    private javax.swing.JButton jbtnPHP;
    // End of variables declaration//GEN-END:variables
}
