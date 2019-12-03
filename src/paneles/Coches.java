/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import hibernate.NewHibernateUtil;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.hibernate.Session;
import pojos.Cliente;
import pojos.Coche;
import pojos.Empresa;
import pojos.Particular;
/**
 *
 * @author a18carlosva
 */
public class Coches extends javax.swing.JPanel {
    
    private Coche cocheEnSeleccion = null;
    
    /**
     * Creates new form Clientes
     */
    public Coches() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatosClientes = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        entMatricula = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnAlta = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        entEstado = new javax.swing.JTextField();
        entTelf = new javax.swing.JTextField();
        entMail = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblNombre1 = new javax.swing.JLabel();
        entModelo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1061, 606));
        setMinimumSize(new java.awt.Dimension(1061, 606));

        panelDatosClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));

        lblNombre.setText("Matricula");

        lblDni.setText("Estado");

        lblTelefono.setText("Marca");

        lblEmail.setText("Fecha PM");

        btnAlta.setText("ALTA");

        jButton2.setText("BAJA");

        btnModificar.setText("MODIFICAR");

        jButton4.setText("BUSCAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lblNombre1.setText("Modelo");

        javax.swing.GroupLayout panelDatosClientesLayout = new javax.swing.GroupLayout(panelDatosClientes);
        panelDatosClientes.setLayout(panelDatosClientesLayout);
        panelDatosClientesLayout.setHorizontalGroup(
            panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDatosClientesLayout.createSequentialGroup()
                        .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefono)
                            .addComponent(lblDni)
                            .addComponent(lblEmail))
                        .addGap(19, 19, 19)
                        .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(entEstado)
                            .addComponent(entTelf)
                            .addComponent(entMail)
                            .addComponent(entModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                    .addGroup(panelDatosClientesLayout.createSequentialGroup()
                        .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblNombre1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator2)
        );
        panelDatosClientesLayout.setVerticalGroup(
            panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClientesLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(entMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre1)
                    .addComponent(entModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDni))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(38, 38, 38)
                .addComponent(btnAlta)
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addGap(26, 26, 26)
                .addComponent(btnModificar)
                .addGap(33, 33, 33)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton4)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDatosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    public void mostrarDatosCocheSeleccionado(){
        
        this.entMatricula.setText(cocheEnSeleccion.getNombre());
        this.entMail.setText(cocheEnSeleccion.getEmail());
        this.entTelf.setText(cocheEnSeleccion.getTelefono());
        
        
    }
    
    public void listarClientes(){
        if(panelMain != null){
            panelMain.removeAll();
            panelMain.revalidate();
            panelMain.repaint();
            window.remove(panelMain);
            window.revalidate();
            window.repaint();
        }
        
        panelMain = new JPanel(new BorderLayout());
        window.add(panelMain);
        GridBagLayout innerLayout = new GridBagLayout();
        GridBagConstraints innerConstraints = new GridBagConstraints();
        JPanel innerPanel = new JPanel(innerLayout);
        
        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        List<Cliente> clientes = sesion.createCriteria(Cliente.class).list();
        int numeroClientes = clientes.size();
        int numeroIteracionesX = (numeroClientes/3)+1;
        int numeroIteracionesTotales = 0;
        
        innerConstraints.weightx = 0.5;
        innerConstraints.weighty = 0.5;
        innerConstraints.gridy = 0;
        
        for(int i = 0; i < numeroIteracionesX; i++){    
            for(int j = 0; j < 3; j++){
                if(numeroIteracionesTotales != numeroClientes){
                    Cliente cliente = clientes.get(numeroIteracionesTotales);
                    boxClientes boxCliente;
                    if(cliente instanceof Particular){
                        boxCliente = new boxClientes(cliente.getNombre(), ((Particular)cliente).getDni());
                    }else{
                        boxCliente = new boxClientes(cliente.getNombre(), ((Empresa)cliente).getCif());
                    }
                    boxCliente.setPanelPadre(this);
                    innerConstraints.gridx = j;
                    innerConstraints.gridy = i;
                    innerPanel.add(boxCliente, innerConstraints);
                    numeroIteracionesTotales++;
                }else{
                    break;
                }
            }
        }

        JPanel innerVoidPanel = new JPanel();
        innerConstraints.weighty = 1.0;
        innerConstraints.fill = GridBagConstraints.VERTICAL;
        innerLayout.setConstraints(innerVoidPanel, innerConstraints);
        innerPanel.add(innerVoidPanel);

        //...

        JScrollPane scrollPanel = new JScrollPane(innerPanel);
        scrollPanel.getVerticalScrollBar().setUnitIncrement(16);
        panelMain.add(scrollPanel, BorderLayout.CENTER);
    
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField entEstado;
    private javax.swing.JTextField entMail;
    private javax.swing.JTextField entMatricula;
    private javax.swing.JTextField entModelo;
    private javax.swing.JTextField entTelf;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel panelDatosClientes;
    // End of variables declaration//GEN-END:variables
}
