package laboratorio3;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class RegistrarPersona extends javax.swing.JFrame {
    private DefaultListModel<String> modeloPersonas = new DefaultListModel<>();
    private ArrayList<Persona> listaPersonas = new ArrayList<>();
    

    public RegistrarPersona() {
        initComponents();
        List_Personas.setModel(modeloPersonas);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txt_Apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Txt_DNI = new javax.swing.JTextField();
        Btn_Agregar = new javax.swing.JButton();
        Btn_Mostrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        List_Personas = new javax.swing.JList<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRAR PERSONA");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("APELLIDO:");

        jLabel4.setText("DNI:");

        Btn_Agregar.setText("Agregar");
        Btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AgregarActionPerformed(evt);
            }
        });

        Btn_Mostrar.setText("Mostrar");
        Btn_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MostrarActionPerformed(evt);
            }
        });

        List_Personas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        List_Personas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                List_PersonasPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(List_Personas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Btn_Mostrar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Txt_Apellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Btn_Agregar)
                                    .addComponent(Txt_DNI, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Mostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AgregarActionPerformed
        
        String nombre = Txt_Nombre.getText();
        String apellido = Txt_Apellido.getText();
        String dni = Txt_DNI.getText();
        
        Persona per = new Persona(nombre, apellido, dni);
        
        listaPersonas.add(per);
        
        String personaString = per.getNombre() + " " + per.getApellido() + " "
                + per.getDni();
        
        modeloPersonas.addElement(personaString);
        
        Txt_Nombre.setText("");
        Txt_Apellido.setText("");
        Txt_DNI.setText("");
    }//GEN-LAST:event_Btn_AgregarActionPerformed

    private void List_PersonasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_List_PersonasPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_List_PersonasPropertyChange

    private void Btn_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MostrarActionPerformed
        // Obtén el índice de la persona seleccionada en la lista
        int selectedIndex = List_Personas.getSelectedIndex();
        Persona permostrar = listaPersonas.get(selectedIndex);
         
        MostrarPersona mostrarPersonaVentana = 
                new MostrarPersona(permostrar, this);
        mostrarPersonaVentana.setLocationRelativeTo(this);
        mostrarPersonaVentana.setVisible(true);
        this.setVisible(false);
    
    
    }//GEN-LAST:event_Btn_MostrarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Agregar;
    private javax.swing.JButton Btn_Mostrar;
    private javax.swing.JList<String> List_Personas;
    private javax.swing.JTextField Txt_Apellido;
    private javax.swing.JTextField Txt_DNI;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
