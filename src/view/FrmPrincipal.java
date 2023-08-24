/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import clases.Alquileres;
import clases.Inquilino;
import clases.Mensualidades;
import clases.Persona;
import clases.Propietario;
import clases.Vivienda;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian Daniel Martinez
 * @author Jose Andres Cortes
 * @author Criztofer Angulo Lopez
 *
 */

/*
*  Se crea un FrmPrincipa_GuanaRenta
* 
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private ArrayList<Persona> people = new ArrayList<>();
    private static ArrayList<Inquilino> tenant =  new ArrayList<>();
    private ArrayList<Propietario> owner = new ArrayList<>();
    private ArrayList<Alquileres> rentals = new ArrayList<>();
    private ArrayList<Mensualidades> mensualidades = new ArrayList<>();
     private ArrayList<Vivienda> home = new ArrayList<>();
    

    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null); //Se utiliza para centrar la ventana
    }

   
    /**
     *
     * @Metodo para colocar el icono de la aplicacion
     * @return icono para la aplicación
     *
     */
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("img/Principal.png"));

        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImagen = new javax.swing.JLabel();
        btnPropietarios = new javax.swing.JButton();
        btnViviendas = new javax.swing.JButton();
        btnInquilinos = new javax.swing.JButton();
        btnAlquileres = new javax.swing.JButton();
        btnMensualidades = new javax.swing.JButton();
        btnGanancias = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Alquileres GuanaRenta");
        setIconImage(getIconImage());

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio1.png"))); // NOI18N
        lblImagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPropietarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Propietario.png"))); // NOI18N
        btnPropietarios.setText("Propietarios");
        btnPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPropietariosActionPerformed(evt);
            }
        });

        btnViviendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Viviendas.png"))); // NOI18N
        btnViviendas.setText("Viviendas");
        btnViviendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViviendasActionPerformed(evt);
            }
        });

        btnInquilinos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inquilinos.png"))); // NOI18N
        btnInquilinos.setText("Inquilinos");
        btnInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInquilinosActionPerformed(evt);
            }
        });

        btnAlquileres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Alquileres.png"))); // NOI18N
        btnAlquileres.setText("Alquileres");
        btnAlquileres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlquileresActionPerformed(evt);
            }
        });

        btnMensualidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Mensualidades.png"))); // NOI18N
        btnMensualidades.setText("Mensualidades");
        btnMensualidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensualidadesActionPerformed(evt);
            }
        });

        btnGanancias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ganancias.png"))); // NOI18N
        btnGanancias.setText("Ganancias");
        btnGanancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGananciasActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGanancias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlquileres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViviendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPropietarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInquilinos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMensualidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(lblImagen))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnPropietarios)
                .addGap(20, 20, 20)
                .addComponent(btnViviendas)
                .addGap(28, 28, 28)
                .addComponent(btnInquilinos)
                .addGap(25, 25, 25)
                .addComponent(btnAlquileres)
                .addGap(22, 22, 22)
                .addComponent(btnMensualidades)
                .addGap(20, 20, 20)
                .addComponent(btnGanancias)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInquilinosActionPerformed
        FrmInquilino inquilino = new FrmInquilino(this, rootPaneCheckingEnabled,tenant);
        inquilino.setVisible(true);

    }//GEN-LAST:event_btnInquilinosActionPerformed

    private void btnPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPropietariosActionPerformed
        FrmPropietarios propietario = new FrmPropietarios(this, true , owner);
        propietario.setVisible(true );
    }//GEN-LAST:event_btnPropietariosActionPerformed

    private void btnViviendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViviendasActionPerformed
        FrmVivienda vivienda = new FrmVivienda(this, true, owner, home);
        vivienda.setVisible(true);

    }//GEN-LAST:event_btnViviendasActionPerformed

    private void btnMensualidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensualidadesActionPerformed
        FrmMensualidades mensualidades = new FrmMensualidades(this, true, this.mensualidades, rentals, tenant);
        mensualidades.setVisible(true);
    }//GEN-LAST:event_btnMensualidadesActionPerformed

    
    
    private void btnGananciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGananciasActionPerformed
        FrmGanancias ganancias = new FrmGanancias(this,true , rentals,mensualidades );
        ganancias.setVisible(true);
    }//GEN-LAST:event_btnGananciasActionPerformed

    private void btnAlquileresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquileresActionPerformed
       FrmAlquiler windowsAlquiler = new FrmAlquiler(this, true, tenant, home, rentals,owner);
       windowsAlquiler.setVisible(true);
    }//GEN-LAST:event_btnAlquileresActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlquileres;
    private javax.swing.JButton btnGanancias;
    private javax.swing.JButton btnInquilinos;
    private javax.swing.JButton btnMensualidades;
    private javax.swing.JButton btnPropietarios;
    private javax.swing.JButton btnViviendas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables
}
