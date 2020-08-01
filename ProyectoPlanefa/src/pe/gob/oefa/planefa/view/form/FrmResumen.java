
package pe.gob.oefa.planefa.view.form;


import com.mongodb.Block;
import com.mongodb.client.MongoCollection;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import org.bson.Document;
import pe.gob.oefa.planefa.bo.planefa.Planefa;
import pe.gob.oefa.planefa.mongodb.MongoDatabaseCliente;
import pe.gob.oefa.planefa.view.model.EvaluacionTableModel;
import pe.gob.oefa.planefa.view.model.InstrumentoNormativoTableModel;
import pe.gob.oefa.planefa.view.model.PasTableModel;
import pe.gob.oefa.planefa.view.model.PlanefaSingleton;
import pe.gob.oefa.planefa.view.model.SupervisionTableModel;

public class FrmResumen extends javax.swing.JFrame {

    private final Planefa planefa;
    private TableModel tableModelSupervision; 
    private TableModel tableModelPas; 
    private TableModel tableModelEvaluacion; 
    private TableModel tableModelInstrumentosNormativos; 
    public FrmResumen() {
        initComponents();
        this.planefa = PlanefaSingleton.getInstance();                    
        this.lblTitulo.setText("Planefa "+ planefa.getPeriodo().getAnio() + " - "+ this.planefa.getEfa().getNombre());
        
        tableModelSupervision = new SupervisionTableModel(planefa);                    
        tableModelPas = new PasTableModel(planefa);
        tableModelEvaluacion = new EvaluacionTableModel(planefa);
        tableModelInstrumentosNormativos = new InstrumentoNormativoTableModel(planefa);
        
        this.tblActividadesSupervision.setModel(tableModelSupervision);
        this.tblActividadesPas.setModel(tableModelPas);
        this.tblActividadesEvaluacion.setModel(tableModelEvaluacion);
        this.tblActividadesInstrumentoNormativo.setModel(tableModelInstrumentosNormativos);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblDatosGenerales = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblActividadesSupervision = new javax.swing.JTable();
        lblSubtitulo = new javax.swing.JLabel();
        lblSubtitulo2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblActividadesPas = new javax.swing.JTable();
        lblSubtitulo1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblActividadesEvaluacion = new javax.swing.JTable();
        lblSubtitulo3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblActividadesInstrumentoNormativo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 242, 246));

        jPanel4.setBackground(new java.awt.Color(238, 242, 246));

        jPanel1.setBackground(new java.awt.Color(32, 76, 153));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Título");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDatosGenerales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDatosGenerales.setText("Resumen");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDatosGenerales)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDatosGenerales)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCancelar.setText("CANCELAR");
        btnCancelar.setActionCommand("ENVIAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEnviar.setBackground(new java.awt.Color(32, 76, 153));
        btnEnviar.setText("ENVIAR");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(807, Short.MAX_VALUE)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblActividadesSupervision.setBackground(new java.awt.Color(204, 204, 204));
        tblActividadesSupervision.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblActividadesSupervision.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tblActividadesSupervision.setModel(new javax.swing.table.DefaultTableModel(
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
        tblActividadesSupervision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActividadesSupervisionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblActividadesSupervision);

        lblSubtitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSubtitulo.setText("Programación de supervisiones");

        lblSubtitulo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSubtitulo2.setText("Programación PAS");

        tblActividadesPas.setBackground(new java.awt.Color(204, 204, 204));
        tblActividadesPas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblActividadesPas.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tblActividadesPas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblActividadesPas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActividadesPasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblActividadesPas);

        lblSubtitulo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSubtitulo1.setText("Programación de evaluaciones ambientales");

        tblActividadesEvaluacion.setBackground(new java.awt.Color(204, 204, 204));
        tblActividadesEvaluacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblActividadesEvaluacion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tblActividadesEvaluacion.setModel(new javax.swing.table.DefaultTableModel(
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
        tblActividadesEvaluacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActividadesEvaluacionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblActividadesEvaluacion);

        lblSubtitulo3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSubtitulo3.setText("Programación de instrumentos normativos");

        tblActividadesInstrumentoNormativo.setBackground(new java.awt.Color(204, 204, 204));
        tblActividadesInstrumentoNormativo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblActividadesInstrumentoNormativo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tblActividadesInstrumentoNormativo.setModel(new javax.swing.table.DefaultTableModel(
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
        tblActividadesInstrumentoNormativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActividadesInstrumentoNormativoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblActividadesInstrumentoNormativo);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
                        .addComponent(lblSubtitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSubtitulo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSubtitulo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(lblSubtitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSubtitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSubtitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSubtitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(panelPrincipal);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        FrmPlanefa abrirProgramacionsupervision = new FrmPlanefa();
        abrirProgramacionsupervision.setVisible(true);
        
        this.setVisible(false);       
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblActividadesSupervisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActividadesSupervisionMouseClicked

    }//GEN-LAST:event_tblActividadesSupervisionMouseClicked

    private void tblActividadesEvaluacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActividadesEvaluacionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblActividadesEvaluacionMouseClicked

    private void tblActividadesPasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActividadesPasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblActividadesPasMouseClicked

    private void tblActividadesInstrumentoNormativoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActividadesInstrumentoNormativoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblActividadesInstrumentoNormativoMouseClicked

    Block<Document> printBlock = new Block<Document>() {
          @Override
          public void apply(final Document document) {
              System.out.println(document.toJson());
          }
      };
    
    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Seguro de enviar su Planefa?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            System.out.println("collectionPlanefas:");
            
            MongoCollection<Document> collectionEfas = MongoDatabaseCliente.getColeccion("efas");
        
            collectionEfas.find().forEach(doc -> printBlock.apply(doc));
        
            
            MongoCollection<Document> collectionPlanefas = MongoDatabaseCliente.getColeccion("planefas");
            System.out.println("collectionPlanefas:"+collectionPlanefas);
            collectionPlanefas.find().forEach(doc -> printBlock.apply(doc));
            
            Document document = new Document("fechaEnvio", new Date().getTime())
                    .append("periodo", new Document("anio", this.planefa.getPeriodo().getAnio())
                            .append("plazoRemisionInicial", new Date().getTime())
                            .append("plazoRemisionFinal", new Date().getTime())
                    )
                    .append("efa", new Document("ruc", this.planefa.getEfa().getRuc())
                            .append("nombre", planefa.getEfa().getNombre())
                            .append("ambito", planefa.getEfa().getAmbito().getNombre())
                            .append("clasificacionMef", planefa.getEfa().getClasificacionMef().getNombre())
                            .append("oficinaDesconcentrada", planefa.getEfa().getOficinaDesconcentrada().getNombre())
                    )
                    .append("programacionSupervision", "")
                    .append("programacionPas", "")
                    .append("programacionEvaluacion", "")
                    .append("programacionInstrumentoNormativo", "")
                    /*
                    .append("programacionSupervision", Arrays.asList(this.planefa.getActividadesSupervision().getProgramacion()))
                    .append("programacionPas", Arrays.asList(this.planefa.getActividadesPas().getProgramacion()))
                    .append("programacionEvaluacion", Arrays.asList(this.planefa.getActividadesEvaluacion().getProgramacion()))
                    .append("programacionInstrumentoNormativo", Arrays.asList(this.planefa.getActividadesInstrumentoNormativo().getProgramacion()))
                    */
                    ;
            System.out.println("document:"+document);
            collectionPlanefas.insertOne(document);
            
            collectionPlanefas = MongoDatabaseCliente.getColeccion("planefas");
            
            collectionPlanefas.find().forEach(doc -> printBlock.apply(doc));
            
            JOptionPane.showMessageDialog(this, "Planefa enviado!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            
            FrmPanelPrincipalEFA frmPanelPrincipalEFA  = new FrmPanelPrincipalEFA(this.planefa.getEfa());
            frmPanelPrincipalEFA.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FrmResumen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblDatosGenerales;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblSubtitulo1;
    private javax.swing.JLabel lblSubtitulo2;
    private javax.swing.JLabel lblSubtitulo3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tblActividadesEvaluacion;
    private javax.swing.JTable tblActividadesInstrumentoNormativo;
    private javax.swing.JTable tblActividadesPas;
    private javax.swing.JTable tblActividadesSupervision;
    // End of variables declaration//GEN-END:variables
}
