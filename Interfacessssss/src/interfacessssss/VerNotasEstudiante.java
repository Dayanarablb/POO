/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacessssss;
import java.awt.Color;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
/**
 *
 * @author EFRAIN
 */
public class VerNotasEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form VerNotasEstudiante
     */
    public VerNotasEstudiante() {
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

        jPanel1 = new javax.swing.JPanel();
        panelRound1 = new ComponentRoundJilmar.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        ComboParciales = new javax.swing.JComboBox<>();
        panelRound2 = new ComponentRoundJilmar.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCalificaciones = new javax.swing.JTable();
        PanelAlumnoCal = new ComponentRoundJilmar.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 630));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 630));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new Color(255, 255, 255, 123));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        jLabel3.setBackground(new Color(144,17,17));
        jLabel3.setForeground(new Color(144,17,17));
        jLabel3.setText("Seleccione el parcial para observar sus calificaciones");

        ComboParciales.setBackground(new Color(255, 255, 255, 123));
        ComboParciales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PARCIAL 1", "PARCIAL 2", "PARCIAL 3" }));
        ComboParciales.setBorder(null);
        ComboParciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboParcialesActionPerformed(evt);
            }
        });

        panelRound2.setBackground(new Color(144,17,17));
        panelRound2.setRoundBottomLeft(33);
        panelRound2.setRoundBottomRight(33);
        panelRound2.setRoundTopLeft(33);
        panelRound2.setRoundTopRight(33);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Curriculum Principal");

        jLabel5.setBackground(new java.awt.Color(255, 255, 204));
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Nivel");

        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Carrera");

        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Grado");

        lblNivel.setForeground(new java.awt.Color(255, 255, 204));
        lblNivel.setText("PREGRADO NIVEL 1");

        lblCarrera.setForeground(new java.awt.Color(255, 255, 204));
        lblCarrera.setText("TECNOLOGÍAS DE LA INFORMACIÓN");

        jLabel10.setForeground(new java.awt.Color(255, 255, 204));
        jLabel10.setText("INGENIERO");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(23, 23, 23)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(lblCarrera)
                            .addComponent(lblNivel))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblNivel))
                .addGap(18, 18, 18)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblCarrera))
                .addGap(18, 18, 18)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addGap(15, 15, 15))
        );

        TablaCalificaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(147,17,17)));
        TablaCalificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MATERIA", "NRC", "TAREAS", "LABORATORIOS", "TALLERES", "PRUEBAS", "EXAMEN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaCalificaciones);
        if (TablaCalificaciones.getColumnModel().getColumnCount() > 0) {
            TablaCalificaciones.getColumnModel().getColumn(0).setMinWidth(60);
            TablaCalificaciones.getColumnModel().getColumn(0).setPreferredWidth(60);
            TablaCalificaciones.getColumnModel().getColumn(0).setMaxWidth(10);
            TablaCalificaciones.getColumnModel().getColumn(1).setPreferredWidth(60);
            TablaCalificaciones.getColumnModel().getColumn(2).setPreferredWidth(60);
            TablaCalificaciones.getColumnModel().getColumn(3).setPreferredWidth(60);
            TablaCalificaciones.getColumnModel().getColumn(4).setPreferredWidth(60);
            TablaCalificaciones.getColumnModel().getColumn(5).setPreferredWidth(60);
            TablaCalificaciones.getColumnModel().getColumn(6).setPreferredWidth(60);
        }

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(ComboParciales, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(154, 154, 154)
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboParciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 1160, 370));

        PanelAlumnoCal.setBackground(new java.awt.Color(255, 255, 255));
        PanelAlumnoCal.setRoundBottomLeft(50);
        PanelAlumnoCal.setRoundBottomRight(50);
        PanelAlumnoCal.setRoundTopLeft(50);
        PanelAlumnoCal.setRoundTopRight(50);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Calificaciones de Alumno - DAYANARA LISSETH BAUTISTA BRAVO");

        javax.swing.GroupLayout PanelAlumnoCalLayout = new javax.swing.GroupLayout(PanelAlumnoCal);
        PanelAlumnoCal.setLayout(PanelAlumnoCalLayout);
        PanelAlumnoCalLayout.setHorizontalGroup(
            PanelAlumnoCalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlumnoCalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(729, Short.MAX_VALUE))
        );
        PanelAlumnoCalLayout.setVerticalGroup(
            PanelAlumnoCalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlumnoCalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(PanelAlumnoCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1160, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LogoEspe4.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1.png"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboParcialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboParcialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboParcialesActionPerformed

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
            java.util.logging.Logger.getLogger(VerNotasEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerNotasEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerNotasEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerNotasEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerNotasEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboParciales;
    private ComponentRoundJilmar.PanelRound PanelAlumnoCal;
    private javax.swing.JTable TablaCalificaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNivel;
    private ComponentRoundJilmar.PanelRound panelRound1;
    private ComponentRoundJilmar.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
