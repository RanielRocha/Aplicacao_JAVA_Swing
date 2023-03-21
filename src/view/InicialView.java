
package view;

import java.awt.Dimension;

public class InicialView extends javax.swing.JFrame {

    public InicialView() {
        this.setPreferredSize(new Dimension(750, 650));
        setVisible(true);
        initComponents();
        setLocationRelativeTo(null);
        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnPacientes = new javax.swing.JButton();
        btnUnidadeSaude = new javax.swing.JButton();
        btnVacinadores = new javax.swing.JButton();
        btnFabricantes = new javax.swing.JButton();
        btnVacinacao = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setFocusable(false);
        setFocusableWindowState(false);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 102, 0));
        lblTitulo.setText("CAMPANHA DE VACINAÇÃO CONTRA COVID-19");

        lblTitulo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(0, 102, 0));
        lblTitulo2.setText("Governo do Estado de São Paulo");

        btnUsuarios.setBackground(new java.awt.Color(0, 102, 0));
        btnUsuarios.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("Usuários");
        btnUsuarios.setFocusPainted(false);
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnPacientes.setBackground(new java.awt.Color(0, 102, 0));
        btnPacientes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPacientes.setForeground(new java.awt.Color(255, 255, 255));
        btnPacientes.setText("Pacientes");
        btnPacientes.setFocusPainted(false);
        btnPacientes.setFocusable(false);
        btnPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesActionPerformed(evt);
            }
        });

        btnUnidadeSaude.setBackground(new java.awt.Color(0, 102, 0));
        btnUnidadeSaude.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUnidadeSaude.setForeground(new java.awt.Color(255, 255, 255));
        btnUnidadeSaude.setText("Unidades de \nSaúde");
        btnUnidadeSaude.setFocusPainted(false);
        btnUnidadeSaude.setFocusable(false);
        btnUnidadeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidadeSaudeActionPerformed(evt);
            }
        });

        btnVacinadores.setBackground(new java.awt.Color(0, 102, 0));
        btnVacinadores.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnVacinadores.setForeground(new java.awt.Color(255, 255, 255));
        btnVacinadores.setText("Vacinadores");
        btnVacinadores.setFocusPainted(false);
        btnVacinadores.setFocusable(false);
        btnVacinadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacinadoresActionPerformed(evt);
            }
        });

        btnFabricantes.setBackground(new java.awt.Color(0, 102, 0));
        btnFabricantes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnFabricantes.setForeground(new java.awt.Color(255, 255, 255));
        btnFabricantes.setText("Fabricantes");
        btnFabricantes.setFocusPainted(false);
        btnFabricantes.setFocusable(false);
        btnFabricantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFabricantesActionPerformed(evt);
            }
        });

        btnVacinacao.setBackground(new java.awt.Color(0, 102, 0));
        btnVacinacao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnVacinacao.setForeground(new java.awt.Color(255, 255, 255));
        btnVacinacao.setText("Vacinação");
        btnVacinacao.setFocusPainted(false);
        btnVacinacao.setFocusable(false);
        btnVacinacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacinacaoActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(0, 102, 0));
        btnSair.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setFocusPainted(false);
        btnSair.setFocusable(false);
        btnSair.setPreferredSize(new java.awt.Dimension(201, 28));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUnidadeSaude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVacinadores, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFabricantes, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo2)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitulo2)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFabricantes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVacinadores, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnidadeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        UsuarioView usuario = new UsuarioView();
        dispose();
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesActionPerformed
        PacienteView paciente = new PacienteView();
        dispose();
    }//GEN-LAST:event_btnPacientesActionPerformed

    private void btnUnidadeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidadeSaudeActionPerformed
        UnidadeSaudeView unidadeSaude = new UnidadeSaudeView();
        dispose();
    }//GEN-LAST:event_btnUnidadeSaudeActionPerformed

    private void btnVacinadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacinadoresActionPerformed
        VacinadorView vacinador = new VacinadorView();
        dispose();
    }//GEN-LAST:event_btnVacinadoresActionPerformed

    private void btnFabricantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFabricantesActionPerformed
        FabricanteView fabricante = new FabricanteView();
        dispose();
    }//GEN-LAST:event_btnFabricantesActionPerformed

    private void btnVacinacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacinacaoActionPerformed
        VacinacaoView vacinacao = new VacinacaoView();
        dispose();
    }//GEN-LAST:event_btnVacinacaoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFabricantes;
    private javax.swing.JButton btnPacientes;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnUnidadeSaude;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVacinacao;
    private javax.swing.JButton btnVacinadores;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    // End of variables declaration//GEN-END:variables
}
