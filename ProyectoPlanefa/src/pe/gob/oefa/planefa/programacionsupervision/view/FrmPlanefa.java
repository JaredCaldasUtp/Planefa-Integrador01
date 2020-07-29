package pe.gob.oefa.planefa.programacionsupervision.view;


import pe.gob.oefa.planefa.programacionsupervision.model.SeccionPlanefa;
import javax.swing.JFrame;
import javax.swing.table.TableModel;
import pe.gob.oefa.planefa.bo.actividad.Actividad;
import pe.gob.oefa.planefa.bo.actividad.ActividadEvaluacion;
import pe.gob.oefa.planefa.bo.actividad.ActividadInstrumentoNormativo;
import pe.gob.oefa.planefa.bo.actividad.ActividadPas;
import pe.gob.oefa.planefa.bo.actividad.ActividadSupervision;
import pe.gob.oefa.planefa.bo.planefa.Planefa;
import pe.gob.oefa.planefa.programacionsupervision.model.EvaluacionTableModel;
import pe.gob.oefa.planefa.programacionsupervision.model.InstrumentoNormativoTableModel;
import pe.gob.oefa.planefa.programacionsupervision.model.PasTableModel;
import pe.gob.oefa.planefa.programacionsupervision.model.SupervisionTableModel;
import pe.gob.oefa.planefa.resources.PlanefaSingleton;

public class FrmPlanefa extends javax.swing.JFrame {

    private final Planefa planefa;
    private TableModel tableModel; 
    private Actividad actividadSeleccionada;
    private SeccionPlanefa seccion = SeccionPlanefa.SUPERVISIONES;
    
    public FrmPlanefa() {
        initComponents();
        this.planefa = PlanefaSingleton.getInstance();
        this.mostrarTabla();
        this.lblTitulo.setText("Planefa "+ planefa.getPeriodo().getAnio() + " - "+ this.planefa.getEfa().getNombre());
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        rbSupervision = new javax.swing.JRadioButton();
        rbPas = new javax.swing.JRadioButton();
        rbEvaluacion = new javax.swing.JRadioButton();
        rbInstrumento = new javax.swing.JRadioButton();
        panelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblActividades = new javax.swing.JTable();
        lblSubtitulo = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(238, 242, 246));

        jPanel4.setBackground(new java.awt.Color(32, 76, 153));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Título");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        rbSupervision.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbSupervision.setSelected(true);
        rbSupervision.setText("Programación de supervisiones");
        rbSupervision.setEnabled(false);

        rbPas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbPas.setText("Programación del PAS");
        rbPas.setEnabled(false);

        rbEvaluacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbEvaluacion.setText("Programación de evaluaciones ambientales");
        rbEvaluacion.setEnabled(false);

        rbInstrumento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbInstrumento.setText("Programación de instrumentos normativos");
        rbInstrumento.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbSupervision)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbPas)
                .addGap(29, 29, 29)
                .addComponent(rbEvaluacion)
                .addGap(18, 18, 18)
                .addComponent(rbInstrumento)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbInstrumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbSupervision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbPas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbEvaluacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblActividades.setBackground(new java.awt.Color(204, 204, 204));
        tblActividades.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblActividades.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tblActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "SUPERVISIÓN", "NINGUNO", "RUIDO", "INFORME DE SUPERVISIÓN", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "0", "0", "20", "4,000.00"},
                {"2", "SUPERVISIÓN", "NINGUNO", "EMISIONES", "INFORME DE SUPERVISIÓN", "0", "1", "0", "2", "0", "0", "0", "1", "2", "0", "0", "0", "6", "2,000.00"},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "Totales :", "26", "6,000.00"},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Actividad Operativa", "Sector", "Objeto de Supervisión", "Unidad de Medida", "Ene", "Feb", "Mar", "Abril", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic", "Meta Fisica Anual", "Presupuesto Anual (S/.)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActividadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblActividades);

        lblSubtitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSubtitulo.setText("Programación de supervisiones (*) ");

        btnNuevo.setBackground(new java.awt.Color(32, 76, 153));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Agregar actividad");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSiguiente.setBackground(new java.awt.Color(32, 76, 153));
        btnSiguiente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnAnterior.setBackground(new java.awt.Color(32, 76, 153));
        btnAnterior.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAnterior.setText("ANTERIOR");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSiguiente)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
         irPasoAnterior();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        
        JFrame childFrame = null;
        switch (this.seccion) {                
            case SUPERVISIONES:                
                childFrame = new FrmProgramacionActividadesSupervision(null, this); //Creo una instancia de mi otra ventana "childFrame"
                break;
            case PAS:                
                childFrame = new FrmProgramacionActividadesPas(null, this);
                break;
            case EVALUACIONES:                
                childFrame = new FrmProgramacionActividadesSupervision(null, this);
                break;
            case INSTRUMENTOS_NORMATIVOS:                
                childFrame = new FrmProgramacionActividadesSupervision(null, this);
                break;
        }
        
        if(childFrame!=null){
            childFrame.setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
            childFrame.setResizable(false); //Que no se pueda cambiar el tamaño        
            childFrame.setVisible(true); //Que sea visible
        }          
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        irPasoSiguiente();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void tblActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActividadesMouseClicked
        
        //Muestra la fila seleccionada para el evento MouseClicked
        System.out.println("Row selected:"+ this.tblActividades.getSelectedRow());
        //Obtiene el indice de la fila seleccionada
        int selectedRow = this.tblActividades.getSelectedRow(); 
        //Obtiene la Activida desde la  programación sgún el indice de la fila seleccionada
        
        //Abre el formulario de edición según sección seleccionada
        JFrame childFrame = null;
        switch (this.seccion) {                
            case SUPERVISIONES:
                this.actividadSeleccionada = (ActividadSupervision)planefa.getActividadesSupervision().getProgramacion().get(selectedRow);
                childFrame = new FrmProgramacionActividadesSupervision(actividadSeleccionada, this); //Creo una instancia de mi otra ventana "childFrame"
                break;
            case PAS:
                this.actividadSeleccionada = (ActividadPas)planefa.getActividadesPas().getProgramacion().get(selectedRow);
                childFrame = new FrmProgramacionActividadesPas(actividadSeleccionada, this);
                break;
            case EVALUACIONES:
                this.actividadSeleccionada = (ActividadEvaluacion)planefa.getActividadesEvaluacion().getProgramacion().get(selectedRow);
                childFrame = new FrmProgramacionActividadesSupervision(actividadSeleccionada, this);
                break;
            case INSTRUMENTOS_NORMATIVOS:
                this.actividadSeleccionada = (ActividadInstrumentoNormativo)planefa.getActividadesInstrumentoNormativo().getProgramacion().get(selectedRow);
                childFrame = new FrmProgramacionActividadesSupervision(actividadSeleccionada, this);
                break;
        }
        
        if(childFrame!=null){
            childFrame.setLocationRelativeTo(null); //Que cuando aparezca la ventana sea en el centro de la pantalla principal
            childFrame.setResizable(false); //Que no se pueda cambiar el tamaño        
            childFrame.setVisible(true); //Que sea visible
        }
    }//GEN-LAST:event_tblActividadesMouseClicked

    public void mostrarTabla(){
        try {   
            switch (this.seccion) {                
                case SUPERVISIONES:
                    tableModel = new SupervisionTableModel(planefa);
                    break;
                case PAS:
                    tableModel = new PasTableModel(planefa);
                    break;
                case EVALUACIONES:
                    tableModel = new EvaluacionTableModel(planefa);
                    break;
                case INSTRUMENTOS_NORMATIVOS:
                    tableModel = new InstrumentoNormativoTableModel(planefa);
                    break;
            }
            this.tblActividades.setModel(tableModel);
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
      
    public void mostrarSeccionDatosGenerales(){
        FrmDatosGenerales frmDatosGenerales = new FrmDatosGenerales();
        frmDatosGenerales.setVisible(true);        
        this.setVisible(false);
    }
    public void mostrarSeccionSupervisiones(){        
        this.rbSupervision.setSelected(true);        
        mostrarTabla();
    }
    
    public void mostrarSeccionPAS(){        
        this.rbPas.setSelected(true);
        mostrarTabla();
    }
    
    public void mostrarSeccionEvaluaciones(){        
        this.rbEvaluacion.setSelected(true);
        mostrarTabla();
    }
    
    public void mostrarSeccionInstrumentosNormativos(){        
        this.rbInstrumento.setSelected(true);
        mostrarTabla();
    }
    
    public void mostrarSeccionResumen(){        
        FrmResumen frmResumen = new FrmResumen();
        frmResumen.setVisible(true);
        this.setVisible(false);
    }
    
    private void irPasoSiguiente() {
        reiniciarRadioButtons();
        switch (this.seccion) {
            case DATOS_GENERALES:
                this.seccion = SeccionPlanefa.SUPERVISIONES;
                mostrarSeccionSupervisiones();
                break;
            case SUPERVISIONES:
                this.seccion = SeccionPlanefa.PAS;
                mostrarSeccionPAS();
                break;
            case PAS:
                this.seccion = SeccionPlanefa.EVALUACIONES;
                mostrarSeccionEvaluaciones();
                break;
            case EVALUACIONES:
                this.seccion = SeccionPlanefa.INSTRUMENTOS_NORMATIVOS;
                mostrarSeccionInstrumentosNormativos();
                break;
            case INSTRUMENTOS_NORMATIVOS:
                this.seccion = SeccionPlanefa.RESUMEN;
                mostrarSeccionResumen();
                break;
            case RESUMEN:
                //this.seccion = SeccionPlanefa.RESUMEN;
                //mostrarSeccionResumen();
                break;
            default:
                //this.seccion = SeccionPlanefa.DATOS_GENERALES;
                //mostrarSeccionDatosGenerales();
        }
        this.lblSubtitulo.setText(this.seccion.getDescription());
    }
    
    private void irPasoAnterior() {
        reiniciarRadioButtons();
        switch (this.seccion) {
            case DATOS_GENERALES:
                //this.seccion = SeccionPlanefa.DATOS_GENERALES;
                //mostrarSeccionSupervisiones();
                
                break;
            case SUPERVISIONES:
                this.seccion = SeccionPlanefa.DATOS_GENERALES;
                mostrarSeccionDatosGenerales();
                break;
            case PAS:
                this.seccion = SeccionPlanefa.SUPERVISIONES;
                mostrarSeccionSupervisiones();
                break;
            case EVALUACIONES:
                this.seccion = SeccionPlanefa.PAS;
                mostrarSeccionPAS();
                break;
            case INSTRUMENTOS_NORMATIVOS:
                this.seccion = SeccionPlanefa.EVALUACIONES;
                mostrarSeccionEvaluaciones();
                break;
            case RESUMEN:
                this.seccion = SeccionPlanefa.INSTRUMENTOS_NORMATIVOS;
                mostrarSeccionInstrumentosNormativos();
            default:
                //this.seccion = SeccionPlanefa.DATOS_GENERALES;
                //mostrarSeccionDatosGenerales();
        }
        this.lblSubtitulo.setText(this.seccion.getDescription());
    }
    
    private void reiniciarRadioButtons(){
        this.rbSupervision.setSelected(false);
        this.rbPas.setSelected(false);
        this.rbEvaluacion.setSelected(false);
        this.rbInstrumento.setSelected(false);        
    }
    
    
    public static void main(String args[]) {    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPlanefa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JRadioButton rbEvaluacion;
    private javax.swing.JRadioButton rbInstrumento;
    private javax.swing.JRadioButton rbPas;
    private javax.swing.JRadioButton rbSupervision;
    private javax.swing.JTable tblActividades;
    // End of variables declaration//GEN-END:variables
}
