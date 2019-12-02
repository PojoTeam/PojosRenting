/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;
import hibernate.NewHibernateUtil;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import metodos.Altas;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import pojos.Cliente;
import pojos.Empresa;
import pojos.Particular;

/**
 *
 * @author a18carlosva
 */
public class Clientes extends javax.swing.JPanel {
    
    private Cliente clienteEnSeleccion = null;
    private JPanel panelMain;
    
    public Clientes() {
        
        initComponents();
        listarClientes();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelDatosClientes = new javax.swing.JPanel();
        rbParticular = new javax.swing.JRadioButton();
        rbEmpresa = new javax.swing.JRadioButton();
        lblNombre = new javax.swing.JLabel();
        entNombre = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblFechaNac = new javax.swing.JLabel();
        lblPuntos = new javax.swing.JLabel();
        btnAlta = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        entDni = new javax.swing.JTextField();
        entTelf = new javax.swing.JTextField();
        entMail = new javax.swing.JTextField();
        entFecha = new javax.swing.JTextField();
        entPuntos = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        window = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1061, 606));
        setMinimumSize(new java.awt.Dimension(1061, 606));
        setPreferredSize(new java.awt.Dimension(1061, 606));

        panelDatosClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(rbParticular);
        rbParticular.setSelected(true);
        rbParticular.setText("Particular");
        rbParticular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbParticularActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbEmpresa);
        rbEmpresa.setText("Empresa");
        rbEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEmpresaActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        lblDni.setText("Dni/Cif");

        lblTelefono.setText("Telefono");

        lblEmail.setText("Email");

        lblFechaNac.setText("Fecha nac.");
        lblFechaNac.setToolTipText("(dd-MM-yyyy)");

        lblPuntos.setText("Puntos");

        btnAlta.setText("ALTA");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        jButton2.setText("BAJA");

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jButton4.setText("BUSCAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

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
                            .addComponent(lblEmail)
                            .addComponent(lblFechaNac)
                            .addComponent(lblPuntos))
                        .addGap(14, 14, 14)
                        .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entNombre)
                            .addComponent(entDni)
                            .addComponent(entTelf)
                            .addComponent(entMail)
                            .addComponent(entFecha)
                            .addComponent(entPuntos)))
                    .addGroup(panelDatosClientesLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelDatosClientesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rbParticular)
                .addGap(18, 18, 18)
                .addComponent(rbEmpresa)
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
        );
        panelDatosClientesLayout.setVerticalGroup(
            panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEmpresa)
                    .addComponent(rbParticular))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(entNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDni))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaNac))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuntos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(38, 38, 38))
        );

        window.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelDatosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(window, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(window, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void rbEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEmpresaActionPerformed

        lblPuntos.setVisible(false);
        entPuntos.setVisible(false);
        lblFechaNac.setVisible(false);
        entFecha.setVisible(false);

    }//GEN-LAST:event_rbEmpresaActionPerformed

    private void rbParticularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbParticularActionPerformed

        lblPuntos.setVisible(true);
        entPuntos.setVisible(true);
        lblFechaNac.setVisible(true);
        entFecha.setVisible(true);

    }//GEN-LAST:event_rbParticularActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        try{
            if(rbParticular.isSelected()){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                Date fechaNac = sdf.parse(entFecha.getText());
                DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
                int puntos = Integer.parseInt(entPuntos.getText());
                Date fechaHoy = new Date();
                int d1 = Integer.parseInt(formatter.format(fechaNac));
                int d2 = Integer.parseInt(formatter.format(fechaHoy));
                int edad = (d2-d1)/10000;
                Particular particular = new Particular(entDni.getText(), fechaNac, puntos, edad, entNombre.getText(), entMail.getText(), entTelf.getText());
                Altas.particulares(particular);
                vaciarCampos();
                
            }else {
                Empresa empresa = new Empresa(entDni.getText(), entNombre.getText(), entMail.getText(), entTelf.getText());
                Altas.empresas(empresa);
                vaciarCampos();
                
            }
        }catch(ParseException e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        try{
            if(clienteEnSeleccion != null){
                if(clienteEnSeleccion instanceof Particular){
                    
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                    Date fechaNac = sdf.parse(entFecha.getText());
                    DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
                    int puntos = Integer.parseInt(entPuntos.getText());
                    Date fechaHoy = new Date();
                    int d1 = Integer.parseInt(formatter.format(fechaNac));
                    int d2 = Integer.parseInt(formatter.format(fechaHoy));
                    int edad = (d2-d1)/10000;
                    Particular particular = (Particular)clienteEnSeleccion;
                    particular.setDni(entDni.getText());
                    particular.setFechaNacimiento(fechaNac);
                    particular.setEdad(edad);
                    particular.setNombre(entNombre.getText());
                    particular.setEmail(entMail.getText());
                    particular.setTelefono(entTelf.getText());
                    Altas.particulares(particular);
                    vaciarCampos();
                }else {
                    Empresa empresa = (Empresa)clienteEnSeleccion;
                    empresa.setCif(entDni.getText());
                    empresa.setNombre(entNombre.getText());
                    empresa.setEmail(entMail.getText());
                    empresa.setTelefono(entTelf.getText());
                    Altas.empresas(empresa);
                    vaciarCampos();
                
                }
            }
        }catch(ParseException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    public void mostrarDatosClienteSeleccionado(){
        
        this.entNombre.setText(clienteEnSeleccion.getNombre());
        this.entMail.setText(clienteEnSeleccion.getEmail());
        this.entTelf.setText(clienteEnSeleccion.getTelefono());
        if(clienteEnSeleccion instanceof Particular){
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            rbParticular.setSelected(true);
            this.entDni.setText(((Particular)clienteEnSeleccion).getDni());
            this.entTelf.setText(String.valueOf(((Particular)clienteEnSeleccion).getTelefono()));
            this.entFecha.setText(sdf.format(((Particular)clienteEnSeleccion).getFechaNacimiento()));
            
        }else{
            
            rbEmpresa.setSelected(true);
            this.entDni.setText(((Empresa)clienteEnSeleccion).getCif());
            
        }
        
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
    
    public void vaciarCampos() {
        entDni.setText("");
        entNombre.setText("");
        entPuntos.setText("");
        entMail.setText("");
        entTelf.setText("");
        entFecha.setText("");
    }
    
    
    /**
     * GridBagConstraints c = new GridBagConstraints();
     *  //c.fill = GridBagConstraints.HORIZONTAL;
     *  c.weighty = 0.5;
     *  c.weightx = 0.5;
     *  
     *  for(int i = 0; i < 10; i++){    
     *      for(int j = 0; j < 3; j++){
     *          button = new JButton("Button" + i + j);
               c.gridx = j;
                c.gridy = i;
                window.add(button, c);
            }
        }
     */

    public Cliente getClienteEnSeleccion() {
        return clienteEnSeleccion;
    }

    public void setClienteEnSeleccion(Cliente clienteEnSeleccion) {
        this.clienteEnSeleccion = clienteEnSeleccion;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnModificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField entDni;
    private javax.swing.JTextField entFecha;
    private javax.swing.JTextField entMail;
    private javax.swing.JTextField entNombre;
    private javax.swing.JTextField entPuntos;
    private javax.swing.JTextField entTelf;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel panelDatosClientes;
    private javax.swing.JRadioButton rbEmpresa;
    private javax.swing.JRadioButton rbParticular;
    private javax.swing.JPanel window;
    // End of variables declaration//GEN-END:variables
}
