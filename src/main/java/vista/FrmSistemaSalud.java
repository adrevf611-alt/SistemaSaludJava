package vista;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Paciente;
import modelo.Medico;
import modelo.Medicamento;
import patron.FactoryMedicamento;
import modelo.Cita;
import java.util.List;
import patron.SistemaSalud;

public class FrmSistemaSalud extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
        java.util.logging.Logger.getLogger(
            FrmSistemaSalud.class.getName()
        );

    ArrayList<Paciente> pacientes =
            new ArrayList<>();
    
    ArrayList<Medico> medicos =
            new ArrayList<>();
    
    ArrayList<Medicamento> medicamentos =
            new ArrayList<>();
    
    ArrayList<Cita> citas =
            new ArrayList<>();
    /**
     * Creates new form FrmSistemaSalud
     */
    public FrmSistemaSalud() {

        initComponents();

    }
    
    private void actualizarCombos() {

    cmbPaciente.removeAllItems();

    for(Paciente p : pacientes){

        cmbPaciente.addItem(
                p.getNombre()
        );

    }

    cmbMedico.removeAllItems();

    for(Medico m : medicos){

        cmbMedico.addItem(
                m.getNombre()
        );

    }

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnRegistrarPaciente = new javax.swing.JButton();
        btnMostrarPacientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtListadoPacientes = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDniMedico = new javax.swing.JTextField();
        txtNombreMedico = new javax.swing.JTextField();
        txtEspecialidad = new javax.swing.JTextField();
        btnRegistrarMedico = new javax.swing.JButton();
        btnMostrarMedicos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtListadoMedicos = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoMedicamento = new javax.swing.JTextField();
        txtNombreMedicamento = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnRegistrarMedicamento = new javax.swing.JButton();
        btnMostrarMedicamentos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtListadoMedicamentos = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        cmbPaciente = new javax.swing.JComboBox<>();
        cmbMedico = new javax.swing.JComboBox<>();
        btnRegistrarCita = new javax.swing.JButton();
        btnMostrarCitas = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtListadoCitas = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btnProcesarReportes = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtReporte = new javax.swing.JTextArea();
        btnProbarSingleton = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DNI :");

        jLabel2.setText("Nombre :");

        btnRegistrarPaciente.setText("Registrar Paciente");
        btnRegistrarPaciente.addActionListener(this::btnRegistrarPacienteActionPerformed);

        btnMostrarPacientes.setText("Mostrar Pacientes");
        btnMostrarPacientes.addActionListener(this::btnMostrarPacientesActionPerformed);

        txtListadoPacientes.setColumns(20);
        txtListadoPacientes.setRows(5);
        jScrollPane1.setViewportView(txtListadoPacientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrarPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(btnRegistrarPaciente)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarPacientes))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tabPrincipal.addTab("Pacientes", jPanel1);

        jLabel3.setText("DNI :");

        jLabel4.setText("Nombre :");

        jLabel5.setText("Especialidad :");

        btnRegistrarMedico.setText("Registrar Médico");
        btnRegistrarMedico.addActionListener(this::btnRegistrarMedicoActionPerformed);

        btnMostrarMedicos.setText("Mostrar Médicos");
        btnMostrarMedicos.addActionListener(this::btnMostrarMedicosActionPerformed);

        txtListadoMedicos.setColumns(20);
        txtListadoMedicos.setRows(5);
        jScrollPane2.setViewportView(txtListadoMedicos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDniMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnMostrarMedicos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarMedico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDniMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btnRegistrarMedico)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarMedicos))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tabPrincipal.addTab("Medicos", jPanel2);

        jLabel6.setText("Código :");

        jLabel7.setText("Nombre :");

        jLabel8.setText("Stock :");

        btnRegistrarMedicamento.setText("Registrar Medicamento");
        btnRegistrarMedicamento.addActionListener(this::btnRegistrarMedicamentoActionPerformed);

        btnMostrarMedicamentos.setText("Mostrar Medicamentos");
        btnMostrarMedicamentos.addActionListener(this::btnMostrarMedicamentosActionPerformed);

        txtListadoMedicamentos.setColumns(20);
        txtListadoMedicamentos.setRows(5);
        jScrollPane3.setViewportView(txtListadoMedicamentos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnMostrarMedicamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCodigoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNombreMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(btnRegistrarMedicamento)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarMedicamentos))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tabPrincipal.addTab("Medicamentos", jPanel3);

        jLabel9.setText("Fecha :");

        jLabel10.setText("Paciente :");

        jLabel11.setText("Médico :");

        cmbPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnRegistrarCita.setText("Registrar Cita");
        btnRegistrarCita.addActionListener(this::btnRegistrarCitaActionPerformed);

        btnMostrarCitas.setText("Mostrar Citas");
        btnMostrarCitas.addActionListener(this::btnMostrarCitasActionPerformed);

        txtListadoCitas.setColumns(20);
        txtListadoCitas.setRows(5);
        jScrollPane4.setViewportView(txtListadoCitas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnMostrarCitas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarCita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cmbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarCita)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarCitas))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tabPrincipal.addTab("Citas", jPanel4);

        btnProcesarReportes.setText("Generar Reporte General");
        btnProcesarReportes.addActionListener(this::btnProcesarReportesActionPerformed);

        txtReporte.setColumns(20);
        txtReporte.setRows(5);
        jScrollPane5.setViewportView(txtReporte);

        btnProbarSingleton.setText("Validar Sistema");
        btnProbarSingleton.addActionListener(this::btnProbarSingletonActionPerformed);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnProcesarReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProbarSingleton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnProcesarReportes)
                        .addGap(18, 18, 18)
                        .addComponent(btnProbarSingleton)
                        .addGap(153, 153, 153)
                        .addComponent(btnSalir))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tabPrincipal.addTab("Reportes", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProbarSingletonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProbarSingletonActionPerformed
        SistemaSalud s1 =
        SistemaSalud.getInstancia();

        SistemaSalud s2 =
        SistemaSalud.getInstancia();

        if(s1 == s2){

            JOptionPane.showMessageDialog(
                this,
                "Singleton funcionando correctamente"
            );

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnProbarSingletonActionPerformed

    private void btnProcesarReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarReportesActionPerformed
        txtReporte.setText("");

        txtReporte.append(
            "======================================\n"
        );

        txtReporte.append(
            "REPORTE GENERAL DEL SISTEMA\n"
        );

        txtReporte.append(
            "======================================\n\n"
        );

        //MAP
        txtReporte.append(
            "PACIENTES REGISTRADOS\n"
        );

        txtReporte.append(
            "---------------------\n"
        );

        List<String> nombresPacientes =
        pacientes.stream()
        .map(Paciente::getNombre)
        .toList();

        for(String nombre : nombresPacientes){

            txtReporte.append(
                "• " + nombre + "\n"
            );
        }

        //FILTER
        txtReporte.append(
            "\nMEDICAMENTOS DISPONIBLES\n"
        );

        txtReporte.append(
            "------------------------\n"
        );

        List<Medicamento> disponibles =
        medicamentos.stream()
        .filter(
            m -> m.getStock() > 0
        )
        .toList();

        for(Medicamento m : disponibles){

            txtReporte.append(
                "• "
                + m.getNombre()
                + " (Stock: "
                + m.getStock()
                + ")\n"
            );
        }

        //REDUCE
        int totalStock =
        medicamentos.stream()
        .map(
            Medicamento::getStock
        )
        .reduce(
            0,
            Integer::sum
        );

        txtReporte.append(
            "\nRESUMEN DE INVENTARIO\n"
        );

        txtReporte.append(
            "---------------------\n"
        );

        txtReporte.append(
            "Stock total disponible: "
            + totalStock
            + " unidades\n"
        );
    }//GEN-LAST:event_btnProcesarReportesActionPerformed

    private void btnMostrarCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCitasActionPerformed
        txtListadoCitas.setText("");

        for(Cita c : citas){

            txtListadoCitas.append(
                c.mostrar()
                + "\n"
            );

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarCitasActionPerformed

    private void btnRegistrarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCitaActionPerformed
        try {

            String fecha =
            txtFecha.getText().trim();

            if(fecha.isEmpty()){

                throw new Exception(
                    "Ingrese una fecha"
                );

            }

            int posPaciente =
            cmbPaciente.getSelectedIndex();

            int posMedico =
            cmbMedico.getSelectedIndex();

            if(posPaciente == -1 ||
                posMedico == -1){

                throw new Exception(
                    "Debe registrar pacientes y médicos"
                );

            }

            Paciente paciente =
            pacientes.get(posPaciente);

            Medico medico =
            medicos.get(posMedico);

            Cita cita =
            new Cita(
                fecha,
                paciente,
                medico
            );

            citas.add(cita);

            JOptionPane.showMessageDialog(
                this,
                "Cita registrada"
            );

            txtFecha.setText("");

        }
        catch(Exception e){

            JOptionPane.showMessageDialog(
                this,
                e.getMessage()
            );

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarCitaActionPerformed

    private void btnMostrarMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMedicamentosActionPerformed
        txtListadoMedicamentos.setText("");

        for(Medicamento m :
            medicamentos){

            txtListadoMedicamentos.append(
                m.mostrar()
                + "\n"
            );

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarMedicamentosActionPerformed

    private void btnRegistrarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMedicamentoActionPerformed
        try {

            String codigo =
            txtCodigoMedicamento
            .getText()
            .trim();

            String nombre =
            txtNombreMedicamento
            .getText()
            .trim();

            int stock =
            Integer.parseInt(
                txtStock.getText()
            );

            if(codigo.isEmpty()){

                throw new Exception(
                    "Ingrese un código"
                );

            }

            if(nombre.isEmpty()){

                throw new Exception(
                    "Ingrese un nombre"
                );

            }

            if(stock < 0){

                throw new Exception(
                    "Stock inválido"
                );

            }

            for(Medicamento m :
                medicamentos){

                if(m.getCodigo()
                    .equals(codigo)){

                    throw new Exception(
                        "Código repetido"
                    );

                }

            }

            Medicamento medicamento =
            FactoryMedicamento
            .crearMedicamento(
                codigo,
                nombre,
                stock
            );

            medicamentos.add(
                medicamento
            );

            JOptionPane.showMessageDialog(
                this,
                "Medicamento registrado"
            );

            txtCodigoMedicamento.setText("");
            txtNombreMedicamento.setText("");
            txtStock.setText("");

            txtCodigoMedicamento.requestFocus();

        }
        catch(Exception e){

            JOptionPane.showMessageDialog(
                this,
                e.getMessage()
            );

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarMedicamentoActionPerformed

    private void btnMostrarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMedicosActionPerformed
        txtListadoMedicos.setText("");

        for(Medico m : medicos){

            txtListadoMedicos.append(
                m.mostrarInformacion()
                + "\n"
            );

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarMedicosActionPerformed

    private void btnRegistrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMedicoActionPerformed
        try {

            String dni =
            txtDniMedico.getText().trim();

            String nombre =
            txtNombreMedico.getText().trim();

            String especialidad =
            txtEspecialidad.getText().trim();

            if(dni.length() != 8){

                throw new Exception(
                    "El DNI debe tener 8 dígitos"
                );

            }

            if(nombre.isEmpty()){

                throw new Exception(
                    "Debe ingresar un nombre"
                );

            }

            if(especialidad.isEmpty()){

                throw new Exception(
                    "Debe ingresar una especialidad"
                );

            }

            for(Medico m : medicos){

                if(m.getDni().equals(dni)){

                    throw new Exception(
                        "Ya existe un médico con ese DNI"
                    );

                }

            }

            Medico medico =
            new Medico(
                dni,
                nombre,
                especialidad
            );

            medicos.add(medico);

            actualizarCombos();

            JOptionPane.showMessageDialog(
                this,
                "Médico registrado correctamente"
            );

            txtDniMedico.setText("");
            txtNombreMedico.setText("");
            txtEspecialidad.setText("");

            txtDniMedico.requestFocus();

        }
        catch(Exception e){

            JOptionPane.showMessageDialog(
                this,
                e.getMessage()
            );

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarMedicoActionPerformed

    private void btnMostrarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPacientesActionPerformed
        txtListadoPacientes.setText("");

        for(Paciente p : pacientes){

            txtListadoPacientes.append(
                p.mostrarInformacion()
                + "\n"
            );

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarPacientesActionPerformed

    private void btnRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPacienteActionPerformed
        try {

            String dni = txtDni.getText().trim();
            String nombre = txtNombre.getText().trim();

            for(Paciente p : pacientes){

                if(p.getDni().equals(dni)){

                    throw new Exception(
                        "Ya existe un paciente con ese DNI"
                    );

                }

            }

            if(dni.length() != 8){
                throw new Exception(
                    "El DNI debe tener 8 dígitos"
                );
            }

            if(nombre.isEmpty()){
                throw new Exception(
                    "Debe ingresar un nombre"
                );
            }

            // Verificar si el DNI ya existe
            for(Paciente p : pacientes){

                if(p.getDni().equals(dni)){

                    throw new Exception(
                        "Ya existe un paciente con ese DNI"
                    );

                }

            }

            Paciente paciente =
            new Paciente(
                dni,
                nombre
            );

            pacientes.add(paciente);

            actualizarCombos();

            JOptionPane.showMessageDialog(
                this,
                "Paciente registrado correctamente"
            );

            txtDni.setText("");
            txtNombre.setText("");

            txtDni.requestFocus();

        }
        catch(Exception e){

            JOptionPane.showMessageDialog(
                this,
                e.getMessage()
            );

        }
    }//GEN-LAST:event_btnRegistrarPacienteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
  System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrmSistemaSalud().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarCitas;
    private javax.swing.JButton btnMostrarMedicamentos;
    private javax.swing.JButton btnMostrarMedicos;
    private javax.swing.JButton btnMostrarPacientes;
    private javax.swing.JButton btnProbarSingleton;
    private javax.swing.JButton btnProcesarReportes;
    private javax.swing.JButton btnRegistrarCita;
    private javax.swing.JButton btnRegistrarMedicamento;
    private javax.swing.JButton btnRegistrarMedico;
    private javax.swing.JButton btnRegistrarPaciente;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbMedico;
    private javax.swing.JComboBox<String> cmbPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane tabPrincipal;
    private javax.swing.JTextField txtCodigoMedicamento;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDniMedico;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextArea txtListadoCitas;
    private javax.swing.JTextArea txtListadoMedicamentos;
    private javax.swing.JTextArea txtListadoMedicos;
    private javax.swing.JTextArea txtListadoPacientes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreMedicamento;
    private javax.swing.JTextField txtNombreMedico;
    private javax.swing.JTextArea txtReporte;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
