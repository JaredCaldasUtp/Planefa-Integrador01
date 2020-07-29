
package pe.gob.oefa.planefa.programacionsupervision.view;


import javax.swing.JOptionPane;
import pe.gob.oefa.planefa.bo.planefa.Planefa;
import pe.gob.oefa.planefa.resources.PlanefaSingleton;

public class FrmResumen extends javax.swing.JFrame {

    private final Planefa planefa;
    public FrmResumen() {
        initComponents();
        this.planefa = PlanefaSingleton.getInstance();                    
        this.lblTitulo.setText("Planefa "+ planefa.getPeriodo().getAnio() + " - "+ this.planefa.getEfa().getNombre());
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
        tblActividades = new javax.swing.JTable();
        lblSubtitulo = new javax.swing.JLabel();
        panelPrincipal2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblActividades2 = new javax.swing.JTable();
        lblSubtitulo2 = new javax.swing.JLabel();
        panelPrincipal1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblActividades1 = new javax.swing.JTable();
        lblSubtitulo1 = new javax.swing.JLabel();
        panelPrincipal3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblActividades3 = new javax.swing.JTable();
        lblSubtitulo3 = new javax.swing.JLabel();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        lblSubtitulo.setText("Programación de supervisiones");

        panelPrincipal2.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblActividades2.setBackground(new java.awt.Color(204, 204, 204));
        tblActividades2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblActividades2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tblActividades2.setModel(new javax.swing.table.DefaultTableModel(
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
        tblActividades2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActividades2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblActividades2);

        lblSubtitulo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSubtitulo2.setText("Programación PAS");

        javax.swing.GroupLayout panelPrincipal2Layout = new javax.swing.GroupLayout(panelPrincipal2);
        panelPrincipal2.setLayout(panelPrincipal2Layout);
        panelPrincipal2Layout.setHorizontalGroup(
            panelPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipal2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                    .addGroup(panelPrincipal2Layout.createSequentialGroup()
                        .addComponent(lblSubtitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPrincipal2Layout.setVerticalGroup(
            panelPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipal2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSubtitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal1.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblActividades1.setBackground(new java.awt.Color(204, 204, 204));
        tblActividades1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblActividades1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tblActividades1.setModel(new javax.swing.table.DefaultTableModel(
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
        tblActividades1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActividades1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblActividades1);

        lblSubtitulo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSubtitulo1.setText("Programación de evaluaciones ambientales");

        javax.swing.GroupLayout panelPrincipal1Layout = new javax.swing.GroupLayout(panelPrincipal1);
        panelPrincipal1.setLayout(panelPrincipal1Layout);
        panelPrincipal1Layout.setHorizontalGroup(
            panelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipal1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
                    .addGroup(panelPrincipal1Layout.createSequentialGroup()
                        .addComponent(lblSubtitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPrincipal1Layout.setVerticalGroup(
            panelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSubtitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal3.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblActividades3.setBackground(new java.awt.Color(204, 204, 204));
        tblActividades3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblActividades3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tblActividades3.setModel(new javax.swing.table.DefaultTableModel(
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
        tblActividades3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActividades3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblActividades3);

        lblSubtitulo3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSubtitulo3.setText("Programación de instrumentos normativos");

        javax.swing.GroupLayout panelPrincipal3Layout = new javax.swing.GroupLayout(panelPrincipal3);
        panelPrincipal3.setLayout(panelPrincipal3Layout);
        panelPrincipal3Layout.setHorizontalGroup(
            panelPrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipal3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
                    .addGroup(panelPrincipal3Layout.createSequentialGroup()
                        .addComponent(lblSubtitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPrincipal3Layout.setVerticalGroup(
            panelPrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipal3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSubtitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
                    .addComponent(panelPrincipal1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPrincipal3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPrincipal3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(panelPrincipal);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        FrmPlanefa abrirProgramacionsupervision = new FrmPlanefa();
        abrirProgramacionsupervision.setVisible(true);
        
        this.setVisible(false);       
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActividadesMouseClicked

    }//GEN-LAST:event_tblActividadesMouseClicked

    private void tblActividades1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActividades1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblActividades1MouseClicked

    private void tblActividades2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActividades2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblActividades2MouseClicked

    private void tblActividades3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActividades3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblActividades3MouseClicked

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Seguro de enviar su Planefa?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
          FrmDatosGenerales frmDatosGenerales = new FrmDatosGenerales();
          frmDatosGenerales.setVisible(true);
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
    private javax.swing.JPanel panelPrincipal1;
    private javax.swing.JPanel panelPrincipal2;
    private javax.swing.JPanel panelPrincipal3;
    private javax.swing.JTable tblActividades;
    private javax.swing.JTable tblActividades1;
    private javax.swing.JTable tblActividades2;
    private javax.swing.JTable tblActividades3;
    // End of variables declaration//GEN-END:variables
}
