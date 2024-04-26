/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.crm.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    int xMouse, yMouse;

    public MenuPrincipal() {
        initComponents();
    }
    public void cambiarPanel(JPanel m){
        m.setSize(630, 460);
        m.setLocation(0, 0);


        contenido.removeAll();
        contenido.add(m,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        contenido = new javax.swing.JPanel();
        textBienvenida = new javax.swing.JLabel();
        cerrarSesionBtn = new javax.swing.JButton();
        listaEmpleados = new javax.swing.JButton();
        infoEmpleado = new javax.swing.JButton();
        altaEmpleado = new javax.swing.JButton();
        listaClientes = new javax.swing.JButton();
        InfoCliente = new javax.swing.JButton();
        altaCliente = new javax.swing.JButton();
        exitBtn = new javax.swing.JPanel();
        exitText = new javax.swing.JLabel();
        listaEmpleados1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        bg.setBackground(new java.awt.Color(0, 51, 102));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        textBienvenida.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        textBienvenida.setText("Bienvenido a Whats CRM");

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(textBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(textBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 630, 460));

        cerrarSesionBtn.setText("Cerrar Sesión");
        cerrarSesionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionBtnActionPerformed(evt);
            }
        });
        bg.add(cerrarSesionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 400, 147, 36));

        listaEmpleados.setText("Agenda");
        listaEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEmpleadosActionPerformed(evt);
            }
        });
        bg.add(listaEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 147, 32));

        infoEmpleado.setText("Info Empleado");
        infoEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoEmpleadoActionPerformed(evt);
            }
        });
        bg.add(infoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 257, 147, 32));

        altaEmpleado.setText("Alta Empleado");
        altaEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        altaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaEmpleadoActionPerformed(evt);
            }
        });
        bg.add(altaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 207, 147, 32));

        listaClientes.setText("Lista Clientes");
        listaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaClientesActionPerformed(evt);
            }
        });
        bg.add(listaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 155, 147, 34));

        InfoCliente.setText("Info Cliente");
        InfoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InfoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoClienteActionPerformed(evt);
            }
        });
        bg.add(InfoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 103, 147, 34));

        altaCliente.setText("Alta CLiente");
        altaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        altaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaClienteActionPerformed(evt);
            }
        });
        bg.add(altaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 50, 147, 35));

        exitBtn.setBackground(new java.awt.Color(0, 51, 102));

        exitText.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        exitText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitText.setText("X");
        exitText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitText, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        listaEmpleados1.setText("Lista Empleados");
        listaEmpleados1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaEmpleados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEmpleados1ActionPerformed(evt);
            }
        });
        bg.add(listaEmpleados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 307, 147, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 421, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionBtnActionPerformed
        LoginFrame l = new LoginFrame();
        l.setSize(810  , 500);
        l.setLocationRelativeTo(null);
        l.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_cerrarSesionBtnActionPerformed

    private void altaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaEmpleadoActionPerformed
        AltaEmpleado a = new AltaEmpleado();
        cambiarPanel(a);
    }//GEN-LAST:event_altaEmpleadoActionPerformed

    private void InfoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoClienteActionPerformed
        InfoCliente m = new InfoCliente();
        cambiarPanel(m);
    }//GEN-LAST:event_InfoClienteActionPerformed

    private void altaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaClienteActionPerformed
        AltaCliente m = new AltaCliente();
        cambiarPanel(m);

    }//GEN-LAST:event_altaClienteActionPerformed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void exitTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTextMouseClicked

    private void exitTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseEntered
        exitBtn.setBackground(Color.red);
        exitText.setForeground(Color.white);
    }//GEN-LAST:event_exitTextMouseEntered

    private void exitTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseExited
        exitBtn.setBackground(new Color(0,51,102));
        exitText.setForeground(Color.black);
    }//GEN-LAST:event_exitTextMouseExited

    private void listaEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEmpleadosActionPerformed
        Agenda a = new Agenda();
        cambiarPanel(a);
    }//GEN-LAST:event_listaEmpleadosActionPerformed

    private void listaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaClientesActionPerformed
        ListaClientes l = new ListaClientes();
        cambiarPanel(l);
    }//GEN-LAST:event_listaClientesActionPerformed

    private void infoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoEmpleadoActionPerformed
        InfoEmpleado e = new InfoEmpleado();
        cambiarPanel(e);
    }//GEN-LAST:event_infoEmpleadoActionPerformed

    private void listaEmpleados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEmpleados1ActionPerformed
        ListaEmpleados e = new ListaEmpleados();
        cambiarPanel(e);
    }//GEN-LAST:event_listaEmpleados1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InfoCliente;
    private javax.swing.JButton altaCliente;
    private javax.swing.JButton altaEmpleado;
    private javax.swing.JPanel bg;
    private javax.swing.JButton cerrarSesionBtn;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitText;
    private javax.swing.JPanel header;
    private javax.swing.JButton infoEmpleado;
    private javax.swing.JButton listaClientes;
    private javax.swing.JButton listaEmpleados;
    private javax.swing.JButton listaEmpleados1;
    private javax.swing.JLabel textBienvenida;
    // End of variables declaration//GEN-END:variables
}
