package View;

import Model.DAO.TurmaDAO;
import Model.bean.Turma;
import Model.bean.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PrincipalWindow extends javax.swing.JFrame {

    private Usuario userLogged;
    private List<Turma> listTurma = null;
    
    public PrincipalWindow(Usuario u) {
        initComponents();
        userLogged = u;
        jLoginLabel.setText(userLogged.getNome());
        loadTurmasTable();
    }
    public PrincipalWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLoginLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jCadastrarProfessorBtn = new javax.swing.JButton();
        jCadastrarFuncionarioBtn = new javax.swing.JButton();
        jVisualizarProfessorBtn = new javax.swing.JButton();
        jCadastrarAlunoBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTurmas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));
        setMinimumSize(new java.awt.Dimension(656, 512));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Open Sans Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(81, 94, 102));
        jLabel2.setText("Escola E.E.I.F. Paulo VI");

        jPanel2.setBackground(new java.awt.Color(41, 50, 57));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Professores");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setMaximumSize(new java.awt.Dimension(120, 70));
        jLabel4.setMinimumSize(new java.awt.Dimension(80, 70));
        jLabel4.setPreferredSize(new java.awt.Dimension(80, 20));
        jLabel4.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel4ComponentAdded(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Funcionários");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setMaximumSize(new java.awt.Dimension(120, 70));
        jLabel5.setMinimumSize(new java.awt.Dimension(80, 70));
        jLabel5.setPreferredSize(new java.awt.Dimension(80, 20));
        jLabel5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel5ComponentHidden(evt);
            }
        });
        jPanel2.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Alunos");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setMaximumSize(new java.awt.Dimension(80, 70));
        jLabel6.setMinimumSize(new java.awt.Dimension(80, 70));
        jLabel6.setPreferredSize(new java.awt.Dimension(80, 20));
        jPanel2.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Biblioteca");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setMaximumSize(new java.awt.Dimension(100, 70));
        jLabel7.setMinimumSize(new java.awt.Dimension(120, 70));
        jLabel7.setPreferredSize(new java.awt.Dimension(80, 20));
        jPanel2.add(jLabel7);

        jLabel9.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Turma");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setMaximumSize(new java.awt.Dimension(100, 70));
        jLabel9.setMinimumSize(new java.awt.Dimension(120, 70));
        jLabel9.setPreferredSize(new java.awt.Dimension(80, 20));
        jPanel2.add(jLabel9);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLoginLabel.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLoginLabel.setForeground(new java.awt.Color(81, 94, 102));
        jLoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLoginLabel.setText("Expedito Alves");
        jPanel3.add(jLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 25, 160, -1));

        jLabel3.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(81, 94, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/userImg.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 18, 35, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(400, 32767));

        jCadastrarProfessorBtn.setText("Cadastrar Professores");
        jCadastrarProfessorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarProfessorBtnActionPerformed(evt);
            }
        });

        jCadastrarFuncionarioBtn.setText("Cadastrar Funcionários");
        jCadastrarFuncionarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarFuncionarioBtnActionPerformed(evt);
            }
        });

        jVisualizarProfessorBtn.setText("Visualizar Professores");
        jVisualizarProfessorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVisualizarProfessorBtnActionPerformed(evt);
            }
        });

        jCadastrarAlunoBtn.setText("Cadastrar Alunos");
        jCadastrarAlunoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarAlunoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCadastrarProfessorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jCadastrarFuncionarioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jVisualizarProfessorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCadastrarAlunoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jCadastrarProfessorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jCadastrarFuncionarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCadastrarAlunoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jVisualizarProfessorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel6);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/vLine.png"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(1, 2647));
        jLabel8.setMinimumSize(new java.awt.Dimension(1, 200));
        jLabel8.setOpaque(true);
        jPanel4.add(jLabel8);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        jTableTurmas.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jTableTurmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disciplina", "Turno", "Série", "Sala", "Ano"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTurmas.setGridColor(new java.awt.Color(189, 195, 199));
        jTableTurmas.setRowHeight(20);
        jTableTurmas.setShowVerticalLines(false);
        jTableTurmas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableTurmas);

        jLabel1.setFont(new java.awt.Font("Open Sans Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 50, 57));
        jLabel1.setText("Turmas");
        jLabel1.setMaximumSize(new java.awt.Dimension(65, 26));
        jLabel1.setMinimumSize(new java.awt.Dimension(65, 26));
        jLabel1.setPreferredSize(new java.awt.Dimension(65, 26));

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Visualizar Alunos da turma selecionada");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel4ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4ComponentAdded

    private void jLabel5ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel5ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5ComponentHidden

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jCadastrarProfessorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarProfessorBtnActionPerformed
          FrmCadastroProfessores cp = new FrmCadastroProfessores(userLogged);
          cp.setLocationRelativeTo(null);
          cp.setVisible(true);
    }//GEN-LAST:event_jCadastrarProfessorBtnActionPerformed

    private void jCadastrarFuncionarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarFuncionarioBtnActionPerformed
          CadastroFuncionario cf = new CadastroFuncionario(jLoginLabel.getText());
          cf.setLocationRelativeTo(null);
          cf.setVisible(true);
    }//GEN-LAST:event_jCadastrarFuncionarioBtnActionPerformed

    private void jVisualizarProfessorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVisualizarProfessorBtnActionPerformed
        FrmProfessorInformativo frmprof = new FrmProfessorInformativo(userLogged);
        frmprof.setLocationRelativeTo(null);
        frmprof.setVisible(true);
    }//GEN-LAST:event_jVisualizarProfessorBtnActionPerformed

    private void jCadastrarAlunoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarAlunoBtnActionPerformed
        CadastroAlunos ca = new CadastroAlunos(userLogged);
        ca.setLocationRelativeTo(null);
        ca.setVisible(true);
    }//GEN-LAST:event_jCadastrarAlunoBtnActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        int selIndex = jTableTurmas.getSelectedRow();
                
        VisualizarTurma vt = new VisualizarTurma(listTurma.get(selIndex),userLogged);
        vt.setLocationRelativeTo(null);
        vt.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    
    private void loadTurmasTable(){
        DefaultTableModel model = (DefaultTableModel) jTableTurmas.getModel();
        TurmaDAO turmaDAO = new TurmaDAO();
        
        listTurma = turmaDAO.read(userLogged.getLogin());
        
        for(Turma t: listTurma){
            model.addRow(new Object[]{
                t.getDisc_nome(),
                t.getTurno(),
                t.getSerie(),
                t.getSala(),
                t.getAno()
            });
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrincipalWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCadastrarAlunoBtn;
    private javax.swing.JButton jCadastrarFuncionarioBtn;
    private javax.swing.JButton jCadastrarProfessorBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLoginLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTurmas;
    private javax.swing.JButton jVisualizarProfessorBtn;
    // End of variables declaration//GEN-END:variables
}
