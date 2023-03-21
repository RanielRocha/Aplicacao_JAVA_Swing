
package view;

import controller.UnidadeSaudeController;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.UnidadeSaudeModel;

public class UnidadeSaudeView extends javax.swing.JFrame {

    private String operacao;
    private String colunas[] = {"ID", "Nome", "CNES", "Atende SUS", "Estado", "Município", "Gestão", "Natureza Jurídica"};
    private ArrayList<UnidadeSaudeModel> lista;
    private UnidadeSaudeTableModel tabela;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
        btnGRAVAR.setEnabled(ativar);
    }

    public UnidadeSaudeView() {
        this.setPreferredSize(new Dimension(750, 650));
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
        jTPDadosUnidadeSaude = new javax.swing.JTabbedPane();
        painelDADOS = new javax.swing.JPanel();
        lblUBS_ID = new javax.swing.JLabel();
        lblUBS_NOME = new javax.swing.JLabel();
        lblUBS_ESTADO = new javax.swing.JLabel();
        txtUBS_ID = new javax.swing.JTextField();
        txtUBS_NOME = new javax.swing.JTextField();
        txtUBS_ESTADO = new javax.swing.JTextField();
        lblUBS_MUNICIPIO = new javax.swing.JLabel();
        chkUBS_ATENDESUS = new javax.swing.JCheckBox();
        lblUBS_CNES = new javax.swing.JLabel();
        txtUBS_CNES = new javax.swing.JTextField();
        lblUBS_GESTAO = new javax.swing.JLabel();
        txtUBS_MUNICIPIO = new javax.swing.JTextField();
        lblUBS_NATUREZA = new javax.swing.JLabel();
        cbxUBS_NATUREZA = new javax.swing.JComboBox<>();
        cbxUBS_GESTAO = new javax.swing.JComboBox<>();
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
        lblCONS_ESTADO = new javax.swing.JLabel();
        txtCONS_ESTADO = new javax.swing.JTextField();
        txtCONS_MUNICIPIO = new javax.swing.JTextField();
        txtCONS_CNES = new javax.swing.JTextField();
        lblCONS_CARGO = new javax.swing.JLabel();
        lblCONS_CNES = new javax.swing.JLabel();
        txtCONS_GESTAO = new javax.swing.JTextField();
        lblCONS_GESTAO = new javax.swing.JLabel();
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
        lblTitulo.setText("Cadastro de Unidades de Saúde");

        lblUBS_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUBS_ID.setText("ID");

        lblUBS_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUBS_NOME.setText("Nome");

        lblUBS_ESTADO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUBS_ESTADO.setText("Estado");

        txtUBS_ID.setEditable(false);
        txtUBS_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtUBS_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUBS_NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUBS_NOMEActionPerformed(evt);
            }
        });

        txtUBS_ESTADO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUBS_MUNICIPIO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUBS_MUNICIPIO.setText("Município");

        chkUBS_ATENDESUS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkUBS_ATENDESUS.setText("Atende SUS?");

        lblUBS_CNES.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUBS_CNES.setText("CNES");

        txtUBS_CNES.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUBS_CNES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUBS_CNESActionPerformed(evt);
            }
        });

        lblUBS_GESTAO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUBS_GESTAO.setText("Gestão");

        txtUBS_MUNICIPIO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUBS_NATUREZA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUBS_NATUREZA.setText("Natureza");

        cbxUBS_NATUREZA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxUBS_NATUREZA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrção Pública", "Entidades Empresarias", "Entidades sem Fins Lucrativos", "Organizações Internacionais", "Outras" }));
        cbxUBS_NATUREZA.setSelectedItem(null);
        cbxUBS_NATUREZA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUBS_NATUREZAActionPerformed(evt);
            }
        });

        cbxUBS_GESTAO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxUBS_GESTAO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estadual", "Municipal", "Dupla" }));
        cbxUBS_GESTAO.setSelectedItem(null);

        javax.swing.GroupLayout painelDADOSLayout = new javax.swing.GroupLayout(painelDADOS);
        painelDADOS.setLayout(painelDADOSLayout);
        painelDADOSLayout.setHorizontalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUBS_NOME)
                            .addComponent(lblUBS_ID)
                            .addComponent(lblUBS_CNES, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(txtUBS_CNES, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblUBS_GESTAO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxUBS_GESTAO, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(lblUBS_NATUREZA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxUBS_NATUREZA, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUBS_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUBS_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblUBS_ESTADO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUBS_ESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUBS_MUNICIPIO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUBS_MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkUBS_ATENDESUS)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        painelDADOSLayout.setVerticalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUBS_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUBS_ID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUBS_NOME)
                    .addComponent(txtUBS_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUBS_CNES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUBS_GESTAO)
                    .addComponent(lblUBS_CNES)
                    .addComponent(lblUBS_NATUREZA)
                    .addComponent(cbxUBS_NATUREZA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUBS_GESTAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUBS_ESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUBS_ESTADO)
                    .addComponent(lblUBS_MUNICIPIO)
                    .addComponent(chkUBS_ATENDESUS)
                    .addComponent(txtUBS_MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTPDadosUnidadeSaude.addTab("Dados da Unidade de Saúde", painelDADOS);

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

        lblCONS_ESTADO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_ESTADO.setText("Estado");

        txtCONS_ESTADO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCONS_ESTADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCONS_ESTADOActionPerformed(evt);
            }
        });

        txtCONS_MUNICIPIO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtCONS_CNES.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCONS_CARGO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_CARGO.setText("Município");

        lblCONS_CNES.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_CNES.setText("CNES");

        txtCONS_GESTAO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCONS_GESTAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCONS_GESTAOActionPerformed(evt);
            }
        });

        lblCONS_GESTAO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_GESTAO.setText("Gestão");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCONS_NOME)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCONS_ID)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCONS_ESTADO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCONS_ESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblCONS_CARGO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCONS_MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCONS_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCONS_CNES)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCONS_CNES, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCONS_GESTAO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCONS_GESTAO, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
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
                    .addComponent(txtCONS_ESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_ESTADO)
                    .addComponent(txtCONS_MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_CARGO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCONS_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_NOME)
                    .addComponent(btnLimparConsulta)
                    .addComponent(txtCONS_CNES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_CNES)
                    .addComponent(txtCONS_GESTAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_GESTAO))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(tblConsulta);

        javax.swing.GroupLayout painelCONSULTALayout = new javax.swing.GroupLayout(painelCONSULTA);
        painelCONSULTA.setLayout(painelCONSULTALayout);
        painelCONSULTALayout.setHorizontalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        painelCONSULTALayout.setVerticalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPConsulta.addTab("Consulta", painelCONSULTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblTitulo))
                    .addComponent(jTBTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTPDadosUnidadeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTPConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTBTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTPDadosUnidadeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTPConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparAgenda() {
        txtUBS_ID.setText("0");
        txtUBS_NOME.setText("");
        txtUBS_CNES.setText("");
        cbxUBS_GESTAO.setSelectedIndex(-1);
        txtUBS_ESTADO.setText("");
        txtUBS_MUNICIPIO.setText("");
        cbxUBS_NATUREZA.setSelectedIndex(-1);
        chkUBS_ATENDESUS.setSelected(false);
    }

    private void mostrar(UnidadeSaudeModel unidadeSaude) {
        txtUBS_ID.setText(String.valueOf(unidadeSaude.getUBS_ID()));
        txtUBS_NOME.setText(unidadeSaude.getUBS_NOME());
        txtUBS_CNES.setText(String.valueOf(unidadeSaude.getUBS_CNES()));
        chkUBS_ATENDESUS.setSelected((unidadeSaude.getUBS_ATENDESUS() == 1));
        txtUBS_ESTADO.setText(unidadeSaude.getUBS_ESTADO());
        txtUBS_MUNICIPIO.setText(unidadeSaude.getUBS_MUNICIPIO());
        cbxUBS_GESTAO.setSelectedItem(unidadeSaude.getUBS_GESTAO());
        cbxUBS_NATUREZA.setSelectedItem(unidadeSaude.getUBS_NATUREZA());
    }

    private String filtroConsulta() {
        String condicao = "";
        if (!txtCONS_ID1.getText().trim().equals("")) {
            condicao += "(UBS_ID >= " + txtCONS_ID1.getText() + ")";
        }
        if (!txtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(UBS_ID <= " + txtCONS_ID2.getText() + ")";
        }
        if (!txtCONS_NOME.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(UBS_NOME LIKE ('%" + txtCONS_NOME.getText() + "%'))";
        }
        if (!txtCONS_CNES.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(UBS_CNES LIKE ('%" + txtCONS_CNES.getText() + "%'))";
        }
        if (!txtCONS_ESTADO.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(UBS_ESTADO LIKE ('%" + txtCONS_ESTADO.getText() + "%'))";
        }
        if (!txtCONS_MUNICIPIO.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(UBS_MUNICIPIO LIKE ('%" + txtCONS_MUNICIPIO.getText() + "%'))";
        }
        if (!txtCONS_GESTAO.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(UBS_GESTAO LIKE ('%" + txtCONS_GESTAO.getText() + "%'))";
        }
        return condicao;
    }

    private void consultar() {
        try {
            String condicao = filtroConsulta();
            UnidadeSaudeController unidadeSaudecontroller = new UnidadeSaudeController();
            lista = null;
            lista = unidadeSaudecontroller.consultar(condicao);

            tabela = new UnidadeSaudeTableModel(lista, colunas);
            tblConsulta.setModel(tabela);
            tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não Existem Unidades de Saúde Cadastradas!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta da Unidades de Saúde \n" + ex.getMessage());
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
            JOptionPane.showMessageDialog(null, "Não Existem Unidades de Saúde Cadastradas!");
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
        txtUBS_NOME.setFocusable(true);
        chkUBS_ATENDESUS.setSelected(true);
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARActionPerformed
        setOperacao("alterar");
    }//GEN-LAST:event_btnALTERARActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão deste Registro ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                UnidadeSaudeModel objunidadeSaude = new UnidadeSaudeModel();
                objunidadeSaude.setUBS_ID(Integer.parseInt(txtUBS_ID.getText()));
                objunidadeSaude.setUBS_NOME(txtUBS_NOME.getText());
                objunidadeSaude.setUBS_CNES(Integer.parseInt(txtUBS_CNES.getText()));
                objunidadeSaude.setUBS_GESTAO(cbxUBS_GESTAO.getSelectedItem().toString());
                objunidadeSaude.setUBS_ESTADO(txtUBS_ESTADO.getText());
                objunidadeSaude.setUBS_MUNICIPIO(txtUBS_MUNICIPIO.getText());
                objunidadeSaude.setUBS_NATUREZA(cbxUBS_NATUREZA.getSelectedItem().toString());
                objunidadeSaude.setUBS_ATENDESUS((chkUBS_ATENDESUS.isSelected() ? 1 : 0));

                UnidadeSaudeController unidadeSaudecontroller = new UnidadeSaudeController();
                unidadeSaudecontroller.excluir(objunidadeSaude);

                JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Exclusão de Registro \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação desta Unidades de Saúde ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                UnidadeSaudeModel objunidadeSaude = new UnidadeSaudeModel();
                objunidadeSaude.setUBS_ID(Integer.parseInt(txtUBS_ID.getText()));
                objunidadeSaude.setUBS_NOME(txtUBS_NOME.getText());
                objunidadeSaude.setUBS_CNES(Integer.parseInt(txtUBS_CNES.getText()));
                objunidadeSaude.setUBS_GESTAO(cbxUBS_GESTAO.getSelectedItem().toString());
                objunidadeSaude.setUBS_ESTADO(txtUBS_ESTADO.getText());
                objunidadeSaude.setUBS_MUNICIPIO(txtUBS_MUNICIPIO.getText());
                objunidadeSaude.setUBS_NATUREZA(cbxUBS_NATUREZA.getSelectedItem().toString());
                objunidadeSaude.setUBS_ATENDESUS((chkUBS_ATENDESUS.isSelected() ? 1 : 0));
                UnidadeSaudeController unidadeSaudecontroller = new UnidadeSaudeController();
                unidadeSaudecontroller.gravar(getOperacao(), objunidadeSaude);

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

    private void txtUBS_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUBS_NOMEActionPerformed

    }//GEN-LAST:event_txtUBS_NOMEActionPerformed

    private void txtUBS_CNESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUBS_CNESActionPerformed

    }//GEN-LAST:event_txtUBS_CNESActionPerformed

    private void txtCONS_ESTADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCONS_ESTADOActionPerformed

    }//GEN-LAST:event_txtCONS_ESTADOActionPerformed

    private void txtCONS_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCONS_NOMEActionPerformed

    }//GEN-LAST:event_txtCONS_NOMEActionPerformed

    private void btnLimparConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparConsultaActionPerformed
        txtCONS_ID1.setText("");
        txtCONS_ID2.setText("");
        txtCONS_NOME.setText("");
        txtCONS_CNES.setText("");
        txtCONS_ESTADO.setText("");
        txtCONS_MUNICIPIO.setText("");
        txtCONS_GESTAO.setText("");
        consultar();
    }//GEN-LAST:event_btnLimparConsultaActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void txtCONS_GESTAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCONS_GESTAOActionPerformed

    }//GEN-LAST:event_txtCONS_GESTAOActionPerformed

    private void btnVOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVOLTARActionPerformed
        InicialView inicialView = new InicialView();
        dispose();
    }//GEN-LAST:event_btnVOLTARActionPerformed

    private void btnLIMPARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLIMPARActionPerformed
        limparAgenda();
    }//GEN-LAST:event_btnLIMPARActionPerformed

    private void cbxUBS_NATUREZAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUBS_NATUREZAActionPerformed

    }//GEN-LAST:event_cbxUBS_NATUREZAActionPerformed

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
    private javax.swing.JComboBox<String> cbxUBS_GESTAO;
    private javax.swing.JComboBox<String> cbxUBS_NATUREZA;
    private javax.swing.JCheckBox chkUBS_ATENDESUS;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jTBTopo;
    private javax.swing.JTabbedPane jTPConsulta;
    private javax.swing.JTabbedPane jTPDadosUnidadeSaude;
    private javax.swing.JLabel lblCONS_CARGO;
    private javax.swing.JLabel lblCONS_CNES;
    private javax.swing.JLabel lblCONS_ESTADO;
    private javax.swing.JLabel lblCONS_GESTAO;
    private javax.swing.JLabel lblCONS_ID;
    private javax.swing.JLabel lblCONS_NOME;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUBS_CNES;
    private javax.swing.JLabel lblUBS_ESTADO;
    private javax.swing.JLabel lblUBS_GESTAO;
    private javax.swing.JLabel lblUBS_ID;
    private javax.swing.JLabel lblUBS_MUNICIPIO;
    private javax.swing.JLabel lblUBS_NATUREZA;
    private javax.swing.JLabel lblUBS_NOME;
    private javax.swing.JPanel painelCONSULTA;
    private javax.swing.JPanel painelDADOS;
    private javax.swing.JTable tblConsulta;
    private javax.swing.JTextField txtCONS_CNES;
    private javax.swing.JTextField txtCONS_ESTADO;
    private javax.swing.JTextField txtCONS_GESTAO;
    private javax.swing.JTextField txtCONS_ID1;
    private javax.swing.JTextField txtCONS_ID2;
    private javax.swing.JTextField txtCONS_MUNICIPIO;
    private javax.swing.JTextField txtCONS_NOME;
    private javax.swing.JTextField txtUBS_CNES;
    private javax.swing.JTextField txtUBS_ESTADO;
    private javax.swing.JTextField txtUBS_ID;
    private javax.swing.JTextField txtUBS_MUNICIPIO;
    private javax.swing.JTextField txtUBS_NOME;
    // End of variables declaration//GEN-END:variables
}
