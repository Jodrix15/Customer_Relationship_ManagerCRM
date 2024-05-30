/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Dialog.java to edit this template
 */
package com.mycompany.crm.gui;

import com.mycompany.crm.entity.Empresa;
import com.mycompany.crm.entity.acciones.*;
import com.mycompany.crm.exceptions.ComandaException;
import com.mycompany.crm.validator.Validations;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

import com.mycompany.crm.exceptions.ComandaException;
import com.mycompany.crm.validator.Validations;


/**
 *
 * @author admin
 */
public class AgendaAgenda extends java.awt.Dialog {
    
    
    private DefaultTableModel model ;
    private Map<String,Accion> lista;
    
    public AgendaAgenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) tabla.getModel();
        loadData(loadListaEmpresas());
    }
    
    public Map<String,Accion> loadListaEmpresas(){
        Map<String,Accion> listaEmpresas = new LinkedHashMap<>();
        try {
            listaEmpresas = Validations.getInstance().valAccionesList();
           
            
        } catch (ComandaException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex ,"ERROR",javax.swing.JOptionPane.ERROR_MESSAGE);

        }
        lista = listaEmpresas;
        return listaEmpresas;
    }
    
    public void loadData(Map<String,Accion> listas){
        for (Accion e: listas.values()) {
                model.addRow(new Object[]{""+e.getCodigo(),e.getTipo(), e.getFecha(),e.getEmpresa().getNombre(), e.getComercial().getNombre()});
        }
    }
    public void clearText(){
        codigo.setText("");
        telefono.setText("");
        email.setText("");
        acuerdo.setText("");
        direccion.setText("");
        empresa.setText("");
        descripcion.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        empresa = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        acuerdo = new javax.swing.JTextField();

        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(650, 473));
        setModal(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 473));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 473));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setText("Agenda");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo", "Fecha", "Empresa", "Comercial"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 560, 110));

        jLabel2.setText("Codigo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 40, -1));

        jLabel3.setText("Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel5.setText("Acuerdo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        jLabel6.setText("Direccion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel7.setText("Empresa");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        jLabel8.setText("Descripcion");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));
        jPanel1.add(empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 170, -1));
        jPanel1.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 170, -1));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 170, -1));
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 170, -1));
        jPanel1.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 170, -1));
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 170, -1));
        jPanel1.add(acuerdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        clearText();
        int linea = tabla.getSelectedRow();
        if (linea!=-1) {
            String codigo = (String)model.getValueAt(linea, 0);
            Accion e = lista.get(codigo);
            if (e!=null) {
                this.codigo.setText(codigo);
                this.empresa.setText(e.getEmpresa().getNombre());
                this.descripcion.setText(e.getDescripcion());
             
                if (e instanceof Telefono p) {
                    this.telefono.setText(p.getNumTelef());
                    this.acuerdo.setText(p.getAcuerdos());
                }
                if (e instanceof Visita p) {
                    this.telefono.setText(p.getDireccion());
                    this.acuerdo.setText(p.getAcuerdos());
                    this.direccion.setText(p.getDireccion());
                }
                if (e instanceof Email m) {
                    this.email.setText(m.getEmail());
                }
                
                
            }

        }
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {

            Validations.getInstance().valAccionesList();
        } catch (ComandaException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex,"ERROR",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acuerdo;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField email;
    private javax.swing.JTextField empresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
