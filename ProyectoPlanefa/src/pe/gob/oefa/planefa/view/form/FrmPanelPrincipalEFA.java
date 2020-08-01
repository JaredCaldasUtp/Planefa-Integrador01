
package pe.gob.oefa.planefa.view.form;


import com.mongodb.Block;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.and;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Date;
import javax.swing.table.TableModel;
import org.bson.Document;
import pe.gob.oefa.planefa.bo.catalogo.Efa;
import pe.gob.oefa.planefa.bo.planefa.EstadoPlanefa;
import pe.gob.oefa.planefa.bo.planefa.Periodo;
import pe.gob.oefa.planefa.bo.planefa.Planefa;
import pe.gob.oefa.planefa.mongodb.MongoDatabaseCliente;
import pe.gob.oefa.planefa.view.model.PlanefaTableModel;

public class FrmPanelPrincipalEFA extends javax.swing.JFrame {

    private Efa efa;
    private String perfil;
    
    private TableModel tableModel;
    private Planefa planefaSeleccionada;
    public FrmPanelPrincipalEFA(Efa arg0) {
        initComponents();
        if(arg0 != null){
            perfil="EFA";
            this.efa=arg0;
        }
        
        this.lblNombreEfa.setText(this.efa.getNombre() +" ("+this.efa.getRuc()+")");
        this.cargarDataInicial();        
        this.mostrarTabla();
        this.btnRemitirPlanefa.setEnabled(false);
        this.btnVerDetalle.setEnabled(false);
    }
    
    public void mostrarTabla(){
        try {   
            tableModel = new PlanefaTableModel(this.planefas);           
            this.tblPlanefas.setModel(tableModel);
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
    Block<Document> printBlock = new Block<Document>() {
        @Override
        public void apply(final Document document) {
            System.out.println(document.toJson());
        }
    };
     
    private List<Planefa> planefas;
    private List<Document> documents;
    public void cargarDataInicial(){
        documents = new ArrayList<>();         
        MongoCollection<Document> collectionEfas = MongoDatabaseCliente.getColeccion("planefas");
        collectionEfas.find().forEach((Document doc) -> {
             this.documents.add(doc);
        });
       
        List<String> aniosPlanefa = Arrays.asList("2019","2020") ;
        planefas = new ArrayList<>();
                        
        for (String anio : aniosPlanefa) {
//            Document document =  collectionEfas.find(
//            and(eq("periodo.anio", anio), eq("efa.ruc", this.efa.getRuc())))
//            .first();
            Document document=null;
            for (Document rowDocument : this.documents) {
                String docRuc = ((Document)rowDocument.get("efa")).get("ruc", String.class);            
                System.out.println("docRuc:"+docRuc);
                String docAnio = String.valueOf(((Document)rowDocument.get("periodo")).get("anio", Integer.class));            
                System.out.println("docAnio:"+docAnio);
                System.out.println("this.efa:"+this.efa);
                
                System.out.println("docRuc:"+docRuc + "docAnio:"+docAnio +":"+this.efa.getRuc()+":"+anio);
                if(docRuc.equalsIgnoreCase(this.efa.getRuc()) 
                        && docAnio.equalsIgnoreCase(anio)){
                    document = rowDocument;
                    System.out.println("Ubicado:"+rowDocument);
                    break;
                }
            }

             
            System.out.println("document ubicado:"+document);
            if(document!=null){
                Periodo periodo = new Periodo(new Integer(anio));
                Planefa planefa = new Planefa(periodo,this.efa);   
                planefa.setEstadoPlanefa(new EstadoPlanefa("00","Enviado"));
                String fechaEnvio = document.get("fechaEnvio").toString();
                System.out.println("fechaEnvio1:"+fechaEnvio);
                Date envio = new Date(new Long(fechaEnvio));
                System.out.println("fechaEnvio2:"+envio);
                planefa.setFechaEnvio(envio);
                planefas.add(planefa);                
            }else{
                Periodo periodo = new Periodo(new Integer(anio));
                Planefa planefa = new Planefa(periodo,this.efa);                                                
                planefa.setEstadoPlanefa(new EstadoPlanefa("01","Pendiente"));
                planefas.add(planefa);  
            }
        }
        
        
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblDatosGenerales = new javax.swing.JLabel();
        lblNombreEfa = new javax.swing.JLabel();
        lblTipoEfa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPlanefas = new javax.swing.JTable();
        btnRemitirPlanefa = new javax.swing.JButton();
        btnVerDetalle = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 242, 246));

        jPanel4.setBackground(new java.awt.Color(238, 242, 246));

        jPanel1.setBackground(new java.awt.Color(32, 76, 153));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Plan Anual de Evaluación y Fiscalización Ambienta - Planefa");
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
        lblDatosGenerales.setText("Bienvenido");

        lblNombreEfa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreEfa.setText("Nombre de la EFA *");

        lblTipoEfa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipoEfa.setText("Responsabilidades");

        tblPlanefas.setBackground(new java.awt.Color(204, 204, 204));
        tblPlanefas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblPlanefas.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tblPlanefas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPlanefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlanefasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPlanefas);

        btnRemitirPlanefa.setText("Remitir Planefa");
        btnRemitirPlanefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemitirPlanefaActionPerformed(evt);
            }
        });

        btnVerDetalle.setText("Ver detalle");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreEfa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDatosGenerales)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblTipoEfa)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemitirPlanefa)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerDetalle)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDatosGenerales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreEfa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoEfa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemitirPlanefa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSalir.setBackground(new java.awt.Color(32, 76, 153));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmLogin frmLogin = new FrmLogin();
        frmLogin.setVisible(true);        
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tblPlanefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlanefasMouseClicked

        //Muestra la fila seleccionada para el evento MouseClicked
        System.out.println("Row selected:"+ this.tblPlanefas.getSelectedRow());
        //Obtiene el indice de la fila seleccionada
        int selectedRow = this.tblPlanefas.getSelectedRow();
        //Obtiene la Activida desde la  programación sgún el indice de la fila seleccionada
        this.planefaSeleccionada = this.planefas.get(selectedRow);
        System.out.println("planefaSeleccionada:"+planefaSeleccionada);
        System.out.println("Estado:"+planefaSeleccionada.getEstadoPlanefa().getNombre());
        if(planefaSeleccionada.getEstadoPlanefa().getNombre().equalsIgnoreCase("Pendiente")){
            this.btnRemitirPlanefa.setEnabled(true);
            this.btnVerDetalle.setEnabled(false);
        }else{
            this.btnRemitirPlanefa.setEnabled(false);
            this.btnVerDetalle.setEnabled(true);
        }
    }//GEN-LAST:event_tblPlanefasMouseClicked

    private void btnRemitirPlanefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemitirPlanefaActionPerformed
        
        FrmDatosGenerales frmDatosGenerales = new FrmDatosGenerales(this.planefaSeleccionada.getPeriodo(),this.planefaSeleccionada.getEfa());
        frmDatosGenerales.setVisible(true);
        
        this.setVisible(false);
        
    }//GEN-LAST:event_btnRemitirPlanefaActionPerformed

    public static void main(String args[]) {        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPanelPrincipalEFA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPanelPrincipalEFA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPanelPrincipalEFA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPanelPrincipalEFA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPanelPrincipalEFA(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemitirPlanefa;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerDetalle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDatosGenerales;
    private javax.swing.JLabel lblNombreEfa;
    private javax.swing.JLabel lblTipoEfa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblPlanefas;
    // End of variables declaration//GEN-END:variables
}
