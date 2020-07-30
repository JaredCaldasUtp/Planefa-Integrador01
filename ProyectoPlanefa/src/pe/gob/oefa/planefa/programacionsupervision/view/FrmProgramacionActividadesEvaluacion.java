
package pe.gob.oefa.planefa.programacionsupervision.view;

import javax.swing.JOptionPane;
import pe.gob.oefa.planefa.bo.actividad.ActividadEvaluacion;
import pe.gob.oefa.planefa.bo.catalogo.ActividadOperativa;
import pe.gob.oefa.planefa.bo.catalogo.TipoEvaluacion;
import pe.gob.oefa.planefa.bo.catalogo.UnidadMedida;
import pe.gob.oefa.planefa.bo.planefa.Planefa;
import pe.gob.oefa.planefa.programacionsupervision.model.CatalogoComboBoxModel;
import pe.gob.oefa.planefa.programacionsupervision.model.SeccionPlanefa;
import pe.gob.oefa.planefa.resources.PlanefaSingleton;
import pe.gob.oefa.planefa.resources.PlanefaUtils;

public class FrmProgramacionActividadesEvaluacion extends javax.swing.JFrame {

    private final Planefa planefa;
    private ActividadEvaluacion actividad;
    private boolean editar;
    private final String titulo;
    private String subtitulo;
    private FrmPlanefa formPlanefa;
            
    public FrmProgramacionActividadesEvaluacion(Object arg, javax.swing.JFrame supervision) {
        this.initComponents();
        this.planefa = PlanefaSingleton.getInstance();
        iniciarCatalogos();
                        
        //this.titulo = "Planefa "+ planefa.getPeriodo().getAnio() + " - "+ this.planefa.getEfa().getNombre();
        this.titulo = SeccionPlanefa.EVALUACIONES.getDescription();
                
        this.editar = false;
        this.subtitulo = "Registrar actividad";
        
        if(arg!=null){
            this.editar = true;
            this.subtitulo = "Editar actividad";
            actividad = (ActividadEvaluacion)arg;
            this.txtEnero.setText(actividad.getProgramacionEnero().toString());
            this.txtFebrero.setText(actividad.getProgramacionFebrero().toString());
            this.txtMarzo.setText(actividad.getProgramacionMarzo().toString());
            this.txtAbril.setText(actividad.getProgramacionAbril().toString());
            this.txtMayo.setText(actividad.getProgramacionMayo().toString());
            this.txtJunio.setText(actividad.getProgramacionJunio().toString());
            this.txtJulio.setText(actividad.getProgramacionJulio().toString());
            this.txtAgosto.setText(actividad.getProgramacionAgosto().toString());
            this.txtSeptiembre.setText(actividad.getProgramacionSeptiembre().toString());
            this.txtOctubre.setText(actividad.getProgramacionOctubre().toString());
            this.txtNoviembre.setText(actividad.getProgramacionNoviembre().toString());
            this.txtDiciembre.setText(actividad.getProgramacionDiciembre().toString());
            this.txtPresupuesto.setText(actividad.getPresupuestoAnual().toString());            
            this.cmbActividadOperativa.setSelectedItem(actividad.getActividadOperativa().getNombre());            
            this.cmbTipoEvaluacion.setSelectedItem(actividad.getTipoEvaluacion().getNombre());            
            this.cmbUnidadMedida.setSelectedItem(actividad.getUnidadMedida().getNombre());
        }
        
        if(supervision!=null){
            this.formPlanefa=(FrmPlanefa)supervision;
        }
        
        this.lblSubtitulo.setText(this.subtitulo);
        this.lblTitulo.setText(this.titulo);
    }
        
    private void iniciarCatalogos(){                
        this.cmbActividadOperativa.setModel(new CatalogoComboBoxModel(this.planefa.getActividadesEvaluacion().listarActividadesOperativas()));
        this.cmbActividadOperativa.setSelectedIndex(0);
        this.cmbTipoEvaluacion.setModel(new CatalogoComboBoxModel(this.planefa.getActividadesEvaluacion().listarTiposEvaluacion()));
        this.cmbTipoEvaluacion.setSelectedIndex(0);  
        this.cmbUnidadMedida.setModel(new CatalogoComboBoxModel(this.planefa.getActividadesEvaluacion().listarUnidadesMedida()));
        this.cmbUnidadMedida.setSelectedIndex(0);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblSubtitulo = new javax.swing.JLabel();
        lblSector = new javax.swing.JLabel();
        lblObjetoSupervision = new javax.swing.JLabel();
        cmbActividadOperativa = new javax.swing.JComboBox<>();
        lblUnidadMedida = new javax.swing.JLabel();
        cmbUnidadMedida = new javax.swing.JComboBox<>();
        cmbTipoEvaluacion = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblProgramacion = new javax.swing.JLabel();
        lblDiciembre = new javax.swing.JLabel();
        lblNoviembre = new javax.swing.JLabel();
        lblEnero = new javax.swing.JLabel();
        lblFebrero = new javax.swing.JLabel();
        lblMarzo = new javax.swing.JLabel();
        lblAbril = new javax.swing.JLabel();
        lblMayo = new javax.swing.JLabel();
        lblJunio = new javax.swing.JLabel();
        lblJulio = new javax.swing.JLabel();
        lblAgosto = new javax.swing.JLabel();
        lblSetiembre = new javax.swing.JLabel();
        lblOctubre = new javax.swing.JLabel();
        txtJunio = new javax.swing.JTextField();
        txtMayo = new javax.swing.JTextField();
        txtAbril = new javax.swing.JTextField();
        txtMarzo = new javax.swing.JTextField();
        txtFebrero = new javax.swing.JTextField();
        txtEnero = new javax.swing.JTextField();
        txtDiciembre = new javax.swing.JTextField();
        txtNoviembre = new javax.swing.JTextField();
        txtOctubre = new javax.swing.JTextField();
        txtSeptiembre = new javax.swing.JTextField();
        txtAgosto = new javax.swing.JTextField();
        txtJulio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPresupuesto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(240, 240, 204));
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Título");
        lblTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSubtitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSubtitulo.setText("Subtítulo");

        lblSector.setText("Tipo de evaluación *");

        lblObjetoSupervision.setText("Actividad operativa");

        cmbActividadOperativa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RUIDO" }));

        lblUnidadMedida.setText("Unidad de medida *");

        cmbUnidadMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INFORME DE SUPERVISIÓN" }));

        cmbTipoEvaluacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUPERVISIÓN" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbActividadOperativa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbTipoEvaluacion, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbUnidadMedida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblObjetoSupervision)
                            .addComponent(lblSector)
                            .addComponent(lblUnidadMedida))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSubtitulo)
                .addGap(16, 16, 16)
                .addComponent(lblObjetoSupervision)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbActividadOperativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSector)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTipoEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUnidadMedida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblProgramacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblProgramacion.setText("Programación mensual");

        lblDiciembre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiciembre.setText("Diciembre *");

        lblNoviembre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoviembre.setText("Noviembre *");

        lblEnero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnero.setText("Enero *");

        lblFebrero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFebrero.setText("Febrero *");

        lblMarzo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMarzo.setText("Marzo *");

        lblAbril.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbril.setText("Abril *");

        lblMayo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMayo.setText("Mayo *");

        lblJunio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJunio.setText("Junio *");

        lblJulio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJulio.setText("Julio *");

        lblAgosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgosto.setText("Agosto *");

        lblSetiembre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSetiembre.setText("Setiembre *");

        lblOctubre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOctubre.setText("Octubre *");

        txtJunio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtJunio.setText("2");

        txtMayo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMayo.setText("2");

        txtAbril.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAbril.setText("2");

        txtMarzo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMarzo.setText("2");

        txtFebrero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFebrero.setText("2");

        txtEnero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEnero.setText("2");

        txtDiciembre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDiciembre.setText("0");

        txtNoviembre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNoviembre.setText("0");

        txtOctubre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOctubre.setText("2");

        txtSeptiembre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSeptiembre.setText("2");

        txtAgosto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAgosto.setText("2");

        txtJulio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtJulio.setText("2");

        jLabel1.setText("Presupuesto anual");

        txtPresupuesto.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblProgramacion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblEnero, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtEnero, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFebrero, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(txtFebrero))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMarzo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMarzo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAbril, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAbril, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblJulio, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(txtJulio))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtAgosto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSeptiembre)
                                            .addComponent(lblSetiembre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(lblAgosto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOctubre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblOctubre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblMayo, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(txtMayo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtJunio)
                                    .addComponent(lblJunio, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNoviembre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNoviembre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDiciembre, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(txtDiciembre))))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPresupuesto)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProgramacion)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnero)
                    .addComponent(lblMarzo)
                    .addComponent(lblMayo)
                    .addComponent(lblFebrero)
                    .addComponent(lblAbril)
                    .addComponent(lblJunio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJunio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMayo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAbril, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFebrero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJulio)
                    .addComponent(lblAgosto)
                    .addComponent(lblSetiembre)
                    .addComponent(lblOctubre)
                    .addComponent(lblNoviembre)
                    .addComponent(lblDiciembre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiciembre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoviembre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOctubre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSeptiembre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJulio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            
            if(!this.validarFormulario()) return;
                        
            ActividadOperativa actividadOperativa = (ActividadOperativa)this.planefa.getActividadesEvaluacion().listarActividadesOperativas().get(this.cmbActividadOperativa.getSelectedIndex()-1);            
            TipoEvaluacion tipoEvaluacion = (TipoEvaluacion)this.planefa.getActividadesEvaluacion().listarTiposEvaluacion().get(this.cmbTipoEvaluacion.getSelectedIndex()-1);            
            UnidadMedida unidadMedida = (UnidadMedida)this.planefa.getActividadesEvaluacion().listarUnidadesMedida().get(this.cmbUnidadMedida.getSelectedIndex()-1);
            
            ActividadEvaluacion registro = new ActividadEvaluacion(actividadOperativa, tipoEvaluacion, unidadMedida);
            registro.setProgramacionEnero(PlanefaUtils.convertirAEntero(this.txtEnero));
            registro.setProgramacionFebrero(PlanefaUtils.convertirAEntero(this.txtFebrero));
            registro.setProgramacionMarzo(PlanefaUtils.convertirAEntero(this.txtMarzo));
            registro.setProgramacionAbril(PlanefaUtils.convertirAEntero(this.txtAbril));
            registro.setProgramacionMayo(PlanefaUtils.convertirAEntero(this.txtMayo));
            registro.setProgramacionJunio(PlanefaUtils.convertirAEntero(this.txtJunio));
            registro.setProgramacionJulio(PlanefaUtils.convertirAEntero(this.txtJulio));
            registro.setProgramacionAgosto(PlanefaUtils.convertirAEntero(this.txtAgosto));
            registro.setProgramacionSeptiembre(PlanefaUtils.convertirAEntero(this.txtSeptiembre));
            registro.setProgramacionOctubre(PlanefaUtils.convertirAEntero(this.txtOctubre));
            registro.setProgramacionNoviembre(PlanefaUtils.convertirAEntero(this.txtNoviembre));
            registro.setProgramacionDiciembre(PlanefaUtils.convertirAEntero(this.txtDiciembre));
            registro.setPresupuestoAnual(PlanefaUtils.convertirADouble(this.txtPresupuesto));
            
            if(editar){
                registro.setCorrelativo(this.actividad.getCorrelativo());
                registro.setCodigo(this.actividad.getCodigo());
                this.planefa.getActividadesEvaluacion().actualizar((ActividadEvaluacion)registro.clone());
            }else{
                this.planefa.getActividadesEvaluacion().agregar((ActividadEvaluacion)registro.clone());
            }
            //MongoDatabaseCliente.getColeccion("planefa")
            this.formPlanefa.mostrarTabla();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public boolean validarFormulario(){
        if(this.cmbActividadOperativa.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Seleccione una actividad operativa", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(this.cmbTipoEvaluacion.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Seleccione un tipo de evaluación", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }        
        if(this.cmbUnidadMedida.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Seleccione una unidad de medida", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if (this.txtEnero.getText() == null || this.txtEnero.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese programación para el mes de Enero", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (this.txtFebrero.getText() == null || this.txtFebrero.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese programación para el mes de Febrero", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (this.txtMarzo.getText() == null || this.txtMarzo.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese programación para el mes de Marzo", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (this.txtAbril.getText() == null || this.txtAbril.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese programación para el mes de Abril", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (this.txtMayo.getText() == null || this.txtMayo.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese programación para el mes de Mayo", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (this.txtJunio.getText() == null || this.txtJunio.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese programación para el mes de Junio", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (this.txtJulio.getText() == null || this.txtJulio.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese programación para el mes de Julio", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (this.txtAgosto.getText() == null || this.txtAgosto.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese programación para el mes de Agosto", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (this.txtSeptiembre.getText() == null || this.txtSeptiembre.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese programación para el mes de Septiembre", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (this.txtOctubre.getText() == null || this.txtOctubre.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese programación para el mes de Octubre", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (this.txtNoviembre.getText() == null || this.txtNoviembre.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese programación para el mes de Noviembre", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (this.txtDiciembre.getText() == null || this.txtDiciembre.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese programación para el mes de Diciembre", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if(this.txtPresupuesto.getText()==null || this.txtPresupuesto.getText().trim().length()==0){
            JOptionPane.showMessageDialog(this, "Ingrese presupuesto anual", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        return true;
    }
        
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
            java.util.logging.Logger.getLogger(FrmProgramacionActividadesEvaluacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProgramacionActividadesEvaluacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProgramacionActividadesEvaluacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProgramacionActividadesEvaluacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProgramacionActividadesEvaluacion(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbActividadOperativa;
    private javax.swing.JComboBox<String> cmbTipoEvaluacion;
    private javax.swing.JComboBox<String> cmbUnidadMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblAbril;
    private javax.swing.JLabel lblAgosto;
    private javax.swing.JLabel lblDiciembre;
    private javax.swing.JLabel lblEnero;
    private javax.swing.JLabel lblFebrero;
    private javax.swing.JLabel lblJulio;
    private javax.swing.JLabel lblJunio;
    private javax.swing.JLabel lblMarzo;
    private javax.swing.JLabel lblMayo;
    private javax.swing.JLabel lblNoviembre;
    private javax.swing.JLabel lblObjetoSupervision;
    private javax.swing.JLabel lblOctubre;
    private javax.swing.JLabel lblProgramacion;
    private javax.swing.JLabel lblSector;
    private javax.swing.JLabel lblSetiembre;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUnidadMedida;
    private javax.swing.JTextField txtAbril;
    private javax.swing.JTextField txtAgosto;
    private javax.swing.JTextField txtDiciembre;
    private javax.swing.JTextField txtEnero;
    private javax.swing.JTextField txtFebrero;
    private javax.swing.JTextField txtJulio;
    private javax.swing.JTextField txtJunio;
    private javax.swing.JTextField txtMarzo;
    private javax.swing.JTextField txtMayo;
    private javax.swing.JTextField txtNoviembre;
    private javax.swing.JTextField txtOctubre;
    private javax.swing.JTextField txtPresupuesto;
    private javax.swing.JTextField txtSeptiembre;
    // End of variables declaration//GEN-END:variables
}

