/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.planefa.programacionsancionadora2.view;

/**
 *
 * @author Daniel
 */
public class frmProgramacionSancionadora2Editar extends javax.swing.JFrame {

    /**
     * Creates new form JFDatosGenerales
     */
    public frmProgramacionSancionadora2Editar() {
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

        lblTitulo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblEditarSancionadora2 = new javax.swing.JLabel();
        cbActividadOperativa = new javax.swing.JComboBox<>();
        lblSector = new javax.swing.JLabel();
        txtSector = new javax.swing.JTextField();
        lblUnidadMedida = new javax.swing.JLabel();
        cbUnidadMedida = new javax.swing.JComboBox<>();
        lblActividadOperativa = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbmCancelar = new javax.swing.JButton();
        cbmAceptar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblProgramacionMensual = new javax.swing.JLabel();
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
        txtSetiembre = new javax.swing.JTextField();
        txtAgosto = new javax.swing.JTextField();
        txtJulio = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblPresupuestoAnual = new javax.swing.JLabel();
        txtPresupuestoAnual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(240, 240, 204));
        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Plan anual de actividades 2020 (MUNICIPALIDAD PROVINCIAL 1 - 22012)");
        lblTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblEditarSancionadora2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEditarSancionadora2.setText("Programación del ejercicio de la potestad sancionadora >> Editar");

        cbActividadOperativa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emisión de resoluciones finales de primera instancia de procedimientos iniciados el año" }));
        cbActividadOperativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActividadOperativaActionPerformed(evt);
            }
        });

        lblSector.setText("Sector *");

        txtSector.setText("Dato no requerido para su caso");
        txtSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSectorActionPerformed(evt);
            }
        });

        lblUnidadMedida.setText("Unidad de medida *");

        cbUnidadMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Expediente concluido" }));
        cbUnidadMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUnidadMedidaActionPerformed(evt);
            }
        });

        lblActividadOperativa.setText("Actividad Operativa *");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEditarSancionadora2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSector)
                    .addComponent(cbActividadOperativa, 0, 437, Short.MAX_VALUE)
                    .addComponent(cbUnidadMedida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSector)
                            .addComponent(lblUnidadMedida)
                            .addComponent(lblActividadOperativa, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblEditarSancionadora2)
                .addGap(4, 4, 4)
                .addComponent(lblActividadOperativa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbActividadOperativa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSector)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUnidadMedida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbmCancelar.setText("CANCELAR");
        cbmCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmCancelarActionPerformed(evt);
            }
        });

        cbmAceptar.setText("ACEPTAR");
        cbmAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addComponent(cbmAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbmCancelar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbmCancelar)
                    .addComponent(cbmAceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblProgramacionMensual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblProgramacionMensual.setText("Programación mensual");

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
        txtJunio.setText("0");
        txtJunio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJunioActionPerformed(evt);
            }
        });

        txtMayo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMayo.setText("0");

        txtAbril.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAbril.setText("0");
        txtAbril.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAbrilActionPerformed(evt);
            }
        });

        txtMarzo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMarzo.setText("1");

        txtFebrero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFebrero.setText("1");

        txtEnero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEnero.setText("1");
        txtEnero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEneroActionPerformed(evt);
            }
        });

        txtDiciembre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDiciembre.setText("0");

        txtNoviembre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNoviembre.setText("0");

        txtOctubre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOctubre.setText("0");

        txtSetiembre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSetiembre.setText("0");

        txtAgosto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAgosto.setText("0");

        txtJulio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtJulio.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblProgramacionMensual)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEnero, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(txtEnero))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFebrero, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(txtFebrero))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblMarzo, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(txtMarzo))
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
                                            .addComponent(txtSetiembre)
                                            .addComponent(lblSetiembre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(lblAgosto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOctubre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblOctubre, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))))
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
                                    .addComponent(txtDiciembre)
                                    .addComponent(lblDiciembre, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))))
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProgramacionMensual)
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
                    .addComponent(txtSetiembre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJulio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPresupuestoAnual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPresupuestoAnual.setText("Presupuesto anual (S/.)");

        txtPresupuestoAnual.setText("3,000.00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblPresupuestoAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtPresupuestoAnual))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPresupuestoAnual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPresupuestoAnual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJunioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJunioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJunioActionPerformed

    private void txtAbrilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAbrilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAbrilActionPerformed

    private void cbActividadOperativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActividadOperativaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActividadOperativaActionPerformed

    private void cbUnidadMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUnidadMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUnidadMedidaActionPerformed

    private void txtEneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEneroActionPerformed

    private void cbmAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmAceptarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cbmAceptarActionPerformed

    private void cbmCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cbmCancelarActionPerformed

    private void txtSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSectorActionPerformed

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
            java.util.logging.Logger.getLogger(frmProgramacionSancionadora2Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProgramacionSancionadora2Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProgramacionSancionadora2Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProgramacionSancionadora2Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProgramacionSancionadora2Editar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbActividadOperativa;
    private javax.swing.JComboBox<String> cbUnidadMedida;
    private javax.swing.JButton cbmAceptar;
    private javax.swing.JButton cbmCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblAbril;
    private javax.swing.JLabel lblActividadOperativa;
    private javax.swing.JLabel lblAgosto;
    private javax.swing.JLabel lblDiciembre;
    private javax.swing.JLabel lblEditarSancionadora2;
    private javax.swing.JLabel lblEnero;
    private javax.swing.JLabel lblFebrero;
    private javax.swing.JLabel lblJulio;
    private javax.swing.JLabel lblJunio;
    private javax.swing.JLabel lblMarzo;
    private javax.swing.JLabel lblMayo;
    private javax.swing.JLabel lblNoviembre;
    private javax.swing.JLabel lblOctubre;
    private javax.swing.JLabel lblPresupuestoAnual;
    private javax.swing.JLabel lblProgramacionMensual;
    private javax.swing.JLabel lblSector;
    private javax.swing.JLabel lblSetiembre;
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
    private javax.swing.JTextField txtPresupuestoAnual;
    private javax.swing.JTextField txtSector;
    private javax.swing.JTextField txtSetiembre;
    // End of variables declaration//GEN-END:variables
}

