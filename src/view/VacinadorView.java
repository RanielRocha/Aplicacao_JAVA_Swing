
package view;

import controller.VacinadorController;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.VacinadorModel;

public class VacinadorView extends javax.swing.JFrame {

    private String operacao;
    private String colunas[] = {"ID", "Nome", "CPF", "Registro Profissional", "Cargo", "Formação"};
    private ArrayList<VacinadorModel> lista;
    private VacinadorTableModel tabela;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
        btnGRAVAR.setEnabled(ativar);
    }

    public VacinadorView() {
        this.setPreferredSize(new Dimension(750, 670));
        initComponents();
        setOperacao(""); // inicializa o form no modo CONSULTA
        setLocationRelativeTo(null);
        consultar();
        // adiciona evento para qdo navegar no JTable, atualizar os dados nos JTextField´s
        tblConsulta.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (evt.getValueIsAdjusting()) {
                    return;
                }
                int selecionado = tblConsulta.getSelectedRow();
                if (selecionado >= 0) {
                    mostrar(lista.get(selecionado));
                }
            }
        });
        setVisible(true);
        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTBTopo = new javax.swing.JToolBar();
        btnPRIMEIRO = new javax.swing.JButton();
        btnANTERIOR = new javax.swing.JButton();
        btnPROXIMO = new javax.swing.JButton();
        btnULTIMO = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnINCLUIR = new javax.swing.JButton();
        btnALTERAR = new javax.swing.JButton();
        btnEXCLUIR = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnGRAVAR = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnLIMPAR = new javax.swing.JButton();
        btnVOLTAR = new javax.swing.JButton();
        btnSAIR = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jTPDadosVacinador = new javax.swing.JTabbedPane();
        painelDADOS = new javax.swing.JPanel();
        lblVAC_ID = new javax.swing.JLabel();
        lblVAC_NOME = new javax.swing.JLabel();
        lblVAC_CARGO = new javax.swing.JLabel();
        txtVAC_ID = new javax.swing.JTextField();
        txtUVAC_NOME = new javax.swing.JTextField();
        txtVAC_CARGO = new javax.swing.JTextField();
        lblVAC_FORMACAO = new javax.swing.JLabel();
        lblVAC_CPF = new javax.swing.JLabel();
        txtVAC_CPF = new javax.swing.JTextField();
        txtVAC_REGPROFISSIONAL = new javax.swing.JTextField();
        lblVAC_REGPROFISSIONAL = new javax.swing.JLabel();
        txtVAC_FORMACAO = new javax.swing.JTextField();
        jTPConsulta = new javax.swing.JTabbedPane();
        painelCONSULTA = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCONS_ID = new javax.swing.JLabel();
        txtCONS_ID1 = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        txtCONS_ID2 = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        btnLimparConsulta = new javax.swing.JButton();
        lblCONS_NOME = new javax.swing.JLabel();
        txtCONS_NOME = new javax.swing.JTextField();
        lblCONS_REGPROFISSIONAL = new javax.swing.JLabel();
        txtCONS_REGPROFISSIONAL = new javax.swing.JTextField();
        txtCONS_CARGO = new javax.swing.JTextField();
        txtCONS_CPF = new javax.swing.JTextField();
        lblCONS_CARGO = new javax.swing.JLabel();
        lblCONS_CPF = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTBTopo.setRollover(true);

        btnPRIMEIRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/primeiro.png"))); // NOI18N
        btnPRIMEIRO.setText("Primeiro");
        btnPRIMEIRO.setFocusable(false);
        btnPRIMEIRO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPRIMEIRO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPRIMEIRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPRIMEIROActionPerformed(evt);
            }
        });
        jTBTopo.add(btnPRIMEIRO);

        btnANTERIOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/anterior.png"))); // NOI18N
        btnANTERIOR.setText("Anterior");
        btnANTERIOR.setFocusable(false);
        btnANTERIOR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnANTERIOR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnANTERIOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnANTERIORActionPerformed(evt);
            }
        });
        jTBTopo.add(btnANTERIOR);

        btnPROXIMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/proximo.png"))); // NOI18N
        btnPROXIMO.setText("Próximo");
        btnPROXIMO.setFocusable(false);
        btnPROXIMO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPROXIMO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPROXIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPROXIMOActionPerformed(evt);
            }
        });
        jTBTopo.add(btnPROXIMO);

        btnULTIMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ultimo.png"))); // NOI18N
        btnULTIMO.setText("Último");
        btnULTIMO.setFocusable(false);
        btnULTIMO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnULTIMO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnULTIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnULTIMOActionPerformed(evt);
            }
        });
        jTBTopo.add(btnULTIMO);

        jSeparator1.setSeparatorSize(new java.awt.Dimension(15, 30));
        jTBTopo.add(jSeparator1);

        btnINCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        btnINCLUIR.setText("Novo");
        btnINCLUIR.setFocusable(false);
        btnINCLUIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnINCLUIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnINCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINCLUIRActionPerformed(evt);
            }
        });
        jTBTopo.add(btnINCLUIR);

        btnALTERAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        btnALTERAR.setText("Alterar");
        btnALTERAR.setFocusable(false);
        btnALTERAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnALTERAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERARActionPerformed(evt);
            }
        });
        jTBTopo.add(btnALTERAR);

        btnEXCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        btnEXCLUIR.setText("Excluir");
        btnEXCLUIR.setFocusable(false);
        btnEXCLUIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEXCLUIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXCLUIRActionPerformed(evt);
            }
        });
        jTBTopo.add(btnEXCLUIR);

        jSeparator2.setSeparatorSize(new java.awt.Dimension(15, 30));
        jTBTopo.add(jSeparator2);

        btnGRAVAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        btnGRAVAR.setText("Gravar");
        btnGRAVAR.setFocusable(false);
        btnGRAVAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGRAVAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGRAVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGRAVARActionPerformed(evt);
            }
        });
        jTBTopo.add(btnGRAVAR);

        jSeparator3.setSeparatorSize(new java.awt.Dimension(15, 30));
        jTBTopo.add(jSeparator3);

        btnLIMPAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar.png"))); // NOI18N
        btnLIMPAR.setText("Limpar");
        btnLIMPAR.setFocusable(false);
        btnLIMPAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLIMPAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLIMPAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLIMPARActionPerformed(evt);
            }
        });
        jTBTopo.add(btnLIMPAR);

        btnVOLTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        btnVOLTAR.setText("Voltar");
        btnVOLTAR.setToolTipText("");
        btnVOLTAR.setFocusable(false);
        btnVOLTAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVOLTAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVOLTARActionPerformed(evt);
            }
        });
        jTBTopo.add(btnVOLTAR);

        btnSAIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSAIR.setText("Sair");
        btnSAIR.setFocusable(false);
        btnSAIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSAIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAIRActionPerformed(evt);
            }
        });
        jTBTopo.add(btnSAIR);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Cadastro de Vacinadores");

        lblVAC_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVAC_ID.setText("ID");

        lblVAC_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVAC_NOME.setText("Nome");

        lblVAC_CARGO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVAC_CARGO.setText("Cargo");

        txtVAC_ID.setEditable(false);
        txtVAC_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtUVAC_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUVAC_NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUVAC_NOMEActionPerformed(evt);
            }
        });

        txtVAC_CARGO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblVAC_FORMACAO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVAC_FORMACAO.setText("Formação");

        lblVAC_CPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVAC_CPF.setText("CPF");

        txtVAC_CPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVAC_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVAC_CPFActionPerformed(evt);
            }
        });

        txtVAC_REGPROFISSIONAL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVAC_REGPROFISSIONAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVAC_REGPROFISSIONALActionPerformed(evt);
            }
        });

        lblVAC_REGPROFISSIONAL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVAC_REGPROFISSIONAL.setText("Registro Profissional");

        txtVAC_FORMACAO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVAC_FORMACAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVAC_FORMACAOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDADOSLayout = new javax.swing.GroupLayout(painelDADOS);
        painelDADOS.setLayout(painelDADOSLayout);
        painelDADOSLayout.setHorizontalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVAC_NOME)
                    .addComponent(lblVAC_ID)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDADOSLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblVAC_CPF))
                    .addComponent(lblVAC_CARGO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVAC_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUVAC_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addComponent(txtVAC_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblVAC_REGPROFISSIONAL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVAC_REGPROFISSIONAL, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addComponent(txtVAC_CARGO, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblVAC_FORMACAO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVAC_FORMACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        painelDADOSLayout.setVerticalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVAC_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVAC_ID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVAC_NOME)
                    .addComponent(txtUVAC_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVAC_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVAC_REGPROFISSIONAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVAC_REGPROFISSIONAL)
                    .addComponent(lblVAC_CPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVAC_CARGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVAC_CARGO)
                    .addComponent(lblVAC_FORMACAO)
                    .addComponent(txtVAC_FORMACAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        jTPDadosVacinador.addTab("Dados do Vacinador", painelDADOS);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCONS_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_ID.setText("ID");

        txtCONS_ID1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCodigo2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo2.setText("à");

        txtCONS_ID2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnLimparConsulta.setText("Limpa");
        btnLimparConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparConsultaActionPerformed(evt);
            }
        });

        lblCONS_NOME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_NOME.setText("Nome");

        txtCONS_NOME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCONS_NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCONS_NOMEActionPerformed(evt);
            }
        });

        lblCONS_REGPROFISSIONAL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_REGPROFISSIONAL.setText("Registro Profissional");

        txtCONS_REGPROFISSIONAL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtCONS_CARGO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtCONS_CPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCONS_CARGO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_CARGO.setText("Cargo");

        lblCONS_CPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_CPF.setText("CPF");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCONS_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblCodigo2)
                        .addGap(4, 4, 4)
                        .addComponent(txtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCONS_REGPROFISSIONAL)
                        .addGap(4, 4, 4)
                        .addComponent(txtCONS_REGPROFISSIONAL, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCONS_NOME)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCONS_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCONS_CPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCONS_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(btnLimparConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCONS_CARGO)
                        .addGap(4, 4, 4)
                        .addComponent(txtCONS_CARGO)
                        .addGap(8, 8, 8)
                        .addComponent(btnConsulta)))
                .addGap(11, 11, 11))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCONS_ID)
                    .addComponent(txtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo2)
                    .addComponent(txtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta)
                    .addComponent(txtCONS_REGPROFISSIONAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_REGPROFISSIONAL)
                    .addComponent(txtCONS_CARGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_CARGO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCONS_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_NOME)
                    .addComponent(btnLimparConsulta)
                    .addComponent(txtCONS_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_CPF))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(tblConsulta);

        javax.swing.GroupLayout painelCONSULTALayout = new javax.swing.GroupLayout(painelCONSULTA);
        painelCONSULTA.setLayout(painelCONSULTALayout);
        painelCONSULTALayout.setHorizontalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCONSULTALayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(13, 13, 13))
        );
        painelCONSULTALayout.setVerticalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jTPConsulta.addTab("Consulta", painelCONSULTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTBTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jTPConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jTPDadosVacinador, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTBTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo)
                .addGap(0, 0, 0)
                .addComponent(jTPDadosVacinador, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTPConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparAgenda() {
        txtVAC_ID.setText("0");
        txtUVAC_NOME.setText("");
        txtVAC_CPF.setText("");
        txtVAC_REGPROFISSIONAL.setText("");
        txtVAC_CARGO.setText("");
        txtVAC_FORMACAO.setText("");
    }

    private void mostrar(VacinadorModel vacinador) {
        txtVAC_ID.setText(String.valueOf(vacinador.getVAC_ID()));
        txtUVAC_NOME.setText(vacinador.getVAC_NOME());
        txtVAC_CPF.setText(String.valueOf(vacinador.getVAC_CPF()));
        txtVAC_REGPROFISSIONAL.setText(String.valueOf(vacinador.getVAC_REGPROFISSIONAL()));
        txtVAC_CARGO.setText(vacinador.getVAC_CARGO());
        txtVAC_FORMACAO.setText(vacinador.getVAC_FORMACAO());
    }

    private String filtroConsulta() {
        String condicao = "";
        if (!txtCONS_ID1.getText().trim().equals("")) {
            condicao += "(VAC_ID >= " + txtCONS_ID1.getText() + ")";
        }
        if (!txtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(VAC_ID <= " + txtCONS_ID2.getText() + ")";
        }
        if (!txtCONS_NOME.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(VAC_NOME LIKE ('%" + txtCONS_NOME.getText() + "%'))";
        }
        if (!txtCONS_CPF.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(VAC_CPF LIKE ('%" + txtCONS_CPF.getText() + "%'))";
        }
        if (!txtCONS_CARGO.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(VAC_CARGO LIKE ('%" + txtCONS_CARGO.getText() + "%'))";
        }
        if (!txtCONS_REGPROFISSIONAL.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(VAC_REGPROFISSIONAL LIKE ('%" + txtCONS_REGPROFISSIONAL.getText() + "%'))";
        }
        return condicao;
    }

    private void consultar() {
        try {
            String condicao = filtroConsulta();
            VacinadorController vacinadorcontroller = new VacinadorController();
            lista = null;
            lista = vacinadorcontroller.consultar(condicao);

            tabela = new VacinadorTableModel(lista, colunas);
            tblConsulta.setModel(tabela);
            tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não Existem Vacinadores Cadastrados!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta do Vacinador \n" + ex.getMessage());
        }
    }

    private void mostrarRegistro(int registro) {
        if (registro >= 0 && registro < lista.size()) {
            // exibe os dados do registro na aba Dados
            mostrar(lista.get(registro));

            // posicionar o registro selecionado na tabela (JTable)
            tblConsulta.changeSelection(registro, 0, false, false);
        }
    }

    private void btnPRIMEIROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRIMEIROActionPerformed
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Vacinadores Cadastrados!");
        }
        int primeiro = 0;
        mostrarRegistro(primeiro);
    }//GEN-LAST:event_btnPRIMEIROActionPerformed

    private void btnANTERIORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnANTERIORActionPerformed
        int selecionado = tblConsulta.getSelectedRow() - 1;
        mostrarRegistro(selecionado);
    }//GEN-LAST:event_btnANTERIORActionPerformed

    private void btnPROXIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPROXIMOActionPerformed
        int selecionado = tblConsulta.getSelectedRow() + 1;
        mostrarRegistro(selecionado);
    }//GEN-LAST:event_btnPROXIMOActionPerformed

    private void btnULTIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnULTIMOActionPerformed
        int ultimo = lista.size() - 1;
        mostrarRegistro(ultimo);
    }//GEN-LAST:event_btnULTIMOActionPerformed

    private void btnINCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINCLUIRActionPerformed
        limparAgenda();
        setOperacao("incluir");
        txtUVAC_NOME.setFocusable(true);
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARActionPerformed
        setOperacao("alterar");
    }//GEN-LAST:event_btnALTERARActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão deste Registro ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                VacinadorModel objvacinador = new VacinadorModel();
                objvacinador.setVAC_ID(Integer.parseInt(txtVAC_ID.getText()));
                objvacinador.setVAC_NOME(txtUVAC_NOME.getText());
                objvacinador.setVAC_CPF(Integer.parseInt(txtVAC_CPF.getText()));
                objvacinador.setVAC_REGPROFISSIONAL(Integer.parseInt(txtVAC_REGPROFISSIONAL.getText()));
                objvacinador.setVAC_CARGO(txtVAC_CARGO.getText());
                objvacinador.setVAC_FORMACAO(txtVAC_FORMACAO.getText());

                VacinadorController vacinadorcontroller = new VacinadorController();
                vacinadorcontroller.excluir(objvacinador);

                JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Exclusão de Registro \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação deste Vacinador ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                VacinadorModel objvacinador = new VacinadorModel();
                objvacinador.setVAC_ID(Integer.parseInt(txtVAC_ID.getText()));
                objvacinador.setVAC_NOME(txtUVAC_NOME.getText());
                objvacinador.setVAC_CPF(Integer.parseInt(txtVAC_CPF.getText()));
                objvacinador.setVAC_REGPROFISSIONAL(Integer.parseInt(txtVAC_REGPROFISSIONAL.getText()));
                objvacinador.setVAC_CARGO(txtVAC_CARGO.getText());
                objvacinador.setVAC_FORMACAO(txtVAC_FORMACAO.getText());
                VacinadorController vacinadorcontroller = new VacinadorController();
                vacinadorcontroller.gravar(getOperacao(), objvacinador);

                JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Gravação \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnGRAVARActionPerformed

    private void btnSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSAIRActionPerformed

    private void txtUVAC_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUVAC_NOMEActionPerformed

    }//GEN-LAST:event_txtUVAC_NOMEActionPerformed

    private void txtVAC_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVAC_CPFActionPerformed

    }//GEN-LAST:event_txtVAC_CPFActionPerformed

    private void txtVAC_REGPROFISSIONALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVAC_REGPROFISSIONALActionPerformed

    }//GEN-LAST:event_txtVAC_REGPROFISSIONALActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnLimparConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparConsultaActionPerformed
        txtCONS_ID1.setText("");
        txtCONS_ID2.setText("");
        txtCONS_NOME.setText("");
        txtCONS_CPF.setText("");
        txtCONS_CARGO.setText("");
        txtCONS_REGPROFISSIONAL.setText("");
        consultar();
    }//GEN-LAST:event_btnLimparConsultaActionPerformed

    private void txtCONS_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCONS_NOMEActionPerformed

    }//GEN-LAST:event_txtCONS_NOMEActionPerformed

    private void txtVAC_FORMACAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVAC_FORMACAOActionPerformed

    }//GEN-LAST:event_txtVAC_FORMACAOActionPerformed

    private void btnVOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVOLTARActionPerformed
        InicialView inicialView = new InicialView();
        dispose();
    }//GEN-LAST:event_btnVOLTARActionPerformed

    private void btnLIMPARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLIMPARActionPerformed
        limparAgenda();
    }//GEN-LAST:event_btnLIMPARActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTERAR;
    private javax.swing.JButton btnANTERIOR;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnGRAVAR;
    private javax.swing.JButton btnINCLUIR;
    private javax.swing.JButton btnLIMPAR;
    private javax.swing.JButton btnLimparConsulta;
    private javax.swing.JButton btnPRIMEIRO;
    private javax.swing.JButton btnPROXIMO;
    private javax.swing.JButton btnSAIR;
    private javax.swing.JButton btnULTIMO;
    private javax.swing.JButton btnVOLTAR;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jTBTopo;
    private javax.swing.JTabbedPane jTPConsulta;
    private javax.swing.JTabbedPane jTPDadosVacinador;
    private javax.swing.JLabel lblCONS_CARGO;
    private javax.swing.JLabel lblCONS_CPF;
    private javax.swing.JLabel lblCONS_ID;
    private javax.swing.JLabel lblCONS_NOME;
    private javax.swing.JLabel lblCONS_REGPROFISSIONAL;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVAC_CARGO;
    private javax.swing.JLabel lblVAC_CPF;
    private javax.swing.JLabel lblVAC_FORMACAO;
    private javax.swing.JLabel lblVAC_ID;
    private javax.swing.JLabel lblVAC_NOME;
    private javax.swing.JLabel lblVAC_REGPROFISSIONAL;
    private javax.swing.JPanel painelCONSULTA;
    private javax.swing.JPanel painelDADOS;
    private javax.swing.JTable tblConsulta;
    private javax.swing.JTextField txtCONS_CARGO;
    private javax.swing.JTextField txtCONS_CPF;
    private javax.swing.JTextField txtCONS_ID1;
    private javax.swing.JTextField txtCONS_ID2;
    private javax.swing.JTextField txtCONS_NOME;
    private javax.swing.JTextField txtCONS_REGPROFISSIONAL;
    private javax.swing.JTextField txtUVAC_NOME;
    private javax.swing.JTextField txtVAC_CARGO;
    private javax.swing.JTextField txtVAC_CPF;
    private javax.swing.JTextField txtVAC_FORMACAO;
    private javax.swing.JTextField txtVAC_ID;
    private javax.swing.JTextField txtVAC_REGPROFISSIONAL;
    // End of variables declaration//GEN-END:variables

}
