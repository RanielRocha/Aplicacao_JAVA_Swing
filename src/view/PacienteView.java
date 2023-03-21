
package view;

import controller.PacienteController;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.PacienteModel;

public class PacienteView extends javax.swing.JFrame {

    private String operacao;
    private String colunas[] = {"ID", "Nome", "Nome Mãe", "Nome Pai", "CPF", "Data de Nascimento", "Idade", "Endereço", "Cartão SUS"};
    private ArrayList<PacienteModel> lista;
    private PacienteTableModel tabela;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
        btnGRAVAR.setEnabled(ativar);
    }

    public PacienteView() {
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
        lblTitulo1 = new javax.swing.JLabel();
        jTPDadosPaciente = new javax.swing.JTabbedPane();
        painelDADOS = new javax.swing.JPanel();
        lblUPAC_ID = new javax.swing.JLabel();
        lblPAC_NOME = new javax.swing.JLabel();
        lblPAC_DATANASCIMENTO = new javax.swing.JLabel();
        txtPAC_ID = new javax.swing.JTextField();
        txtPAC_NOME = new javax.swing.JTextField();
        txtPAC_DATANASCIMENTO = new javax.swing.JTextField();
        lblPAC_IDADE = new javax.swing.JLabel();
        lblPAC_NOMEMAE = new javax.swing.JLabel();
        txtPAC_CPF = new javax.swing.JTextField();
        txtPAC_NOMEPAI = new javax.swing.JTextField();
        lblPAC_NOMEPAI = new javax.swing.JLabel();
        lblPAC_CPF = new javax.swing.JLabel();
        txtPAC_NOMEMAE = new javax.swing.JTextField();
        txtPAC_IDADE = new javax.swing.JTextField();
        txtPAC_CARTAOSUS = new javax.swing.JTextField();
        lblPAC_CARTAOSUS = new javax.swing.JLabel();
        txtPAC_ENDERECO = new javax.swing.JTextField();
        lblPAC_ENDERECO = new javax.swing.JLabel();
        jTPConsulta = new javax.swing.JTabbedPane();
        painelCONSULTA = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblCONS_ID = new javax.swing.JLabel();
        txtCONS_ID1 = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCONS_ID2 = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        lblCONS_NOME = new javax.swing.JLabel();
        txtCONS_NOME = new javax.swing.JTextField();
        txtCONS_CARTAOSUS = new javax.swing.JTextField();
        txtCONS_CPF = new javax.swing.JTextField();
        lblCONS_CARTAOSUS = new javax.swing.JLabel();
        lblCONS_CPF = new javax.swing.JLabel();
        btnLimparConsulta = new javax.swing.JButton();
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

        lblTitulo1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo1.setText("Cadastro de Pacientes");

        lblUPAC_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUPAC_ID.setText("ID");

        lblPAC_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPAC_NOME.setText("Nome");

        lblPAC_DATANASCIMENTO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPAC_DATANASCIMENTO.setText("Data Nascimento");

        txtPAC_ID.setEditable(false);
        txtPAC_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPAC_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAC_IDActionPerformed(evt);
            }
        });

        txtPAC_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPAC_NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAC_NOMEActionPerformed(evt);
            }
        });

        txtPAC_DATANASCIMENTO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPAC_IDADE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPAC_IDADE.setText("Idade");

        lblPAC_NOMEMAE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPAC_NOMEMAE.setText("Mãe");

        txtPAC_CPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPAC_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAC_CPFActionPerformed(evt);
            }
        });

        txtPAC_NOMEPAI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPAC_NOMEPAI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAC_NOMEPAIActionPerformed(evt);
            }
        });

        lblPAC_NOMEPAI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPAC_NOMEPAI.setText("Pai");

        lblPAC_CPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPAC_CPF.setText("CPF");

        txtPAC_NOMEMAE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPAC_NOMEMAE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAC_NOMEMAEActionPerformed(evt);
            }
        });

        txtPAC_IDADE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPAC_CARTAOSUS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPAC_CARTAOSUS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPAC_CARTAOSUS.setText("Cartão SUS");

        txtPAC_ENDERECO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAC_ENDERECOActionPerformed(evt);
            }
        });

        lblPAC_ENDERECO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPAC_ENDERECO.setText("Endereço");

        javax.swing.GroupLayout painelDADOSLayout = new javax.swing.GroupLayout(painelDADOS);
        painelDADOS.setLayout(painelDADOSLayout);
        painelDADOSLayout.setHorizontalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDADOSLayout.createSequentialGroup()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPAC_NOME)
                            .addComponent(lblUPAC_ID)
                            .addComponent(lblPAC_NOMEMAE, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPAC_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(txtPAC_NOMEMAE, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPAC_NOMEPAI)
                                .addGap(4, 4, 4)
                                .addComponent(txtPAC_NOMEPAI, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(txtPAC_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPAC_CPF)
                                .addGap(4, 4, 4)
                                .addComponent(txtPAC_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDADOSLayout.createSequentialGroup()
                            .addComponent(lblPAC_ENDERECO)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPAC_ENDERECO))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDADOSLayout.createSequentialGroup()
                            .addComponent(lblPAC_DATANASCIMENTO)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPAC_DATANASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(lblPAC_IDADE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPAC_IDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblPAC_CARTAOSUS)
                            .addGap(4, 4, 4)
                            .addComponent(txtPAC_CARTAOSUS, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        painelDADOSLayout.setVerticalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPAC_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUPAC_ID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPAC_NOME)
                    .addComponent(txtPAC_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPAC_CPF)
                    .addComponent(txtPAC_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPAC_NOMEPAI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPAC_NOMEPAI)
                    .addComponent(lblPAC_NOMEMAE)
                    .addComponent(txtPAC_NOMEMAE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPAC_DATANASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPAC_DATANASCIMENTO)
                    .addComponent(lblPAC_IDADE)
                    .addComponent(txtPAC_IDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPAC_CARTAOSUS)
                    .addComponent(txtPAC_CARTAOSUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPAC_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPAC_ENDERECO))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTPDadosPaciente.addTab("Dados do Paciente", painelDADOS);

        painelCONSULTA.setPreferredSize(new java.awt.Dimension(638, 255));

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCONS_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_ID.setText("ID");

        txtCONS_ID1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo.setText("à");

        txtCONS_ID2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
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

        txtCONS_CARTAOSUS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtCONS_CPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCONS_CARTAOSUS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_CARTAOSUS.setText("Cartão SUS");

        lblCONS_CPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_CPF.setText("CPF");

        btnLimparConsulta.setText("Limpa");
        btnLimparConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCONS_NOME)
                    .addComponent(lblCONS_ID))
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lblCodigo)
                        .addGap(2, 2, 2)
                        .addComponent(txtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(lblCONS_CPF)
                        .addGap(2, 2, 2)
                        .addComponent(txtCONS_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCONS_CARTAOSUS)
                        .addGap(2, 2, 2)
                        .addComponent(txtCONS_CARTAOSUS))
                    .addComponent(txtCONS_NOME))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsulta)
                    .addComponent(btnLimparConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCONS_ID)
                    .addComponent(txtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta)
                    .addComponent(txtCONS_CARTAOSUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_CARTAOSUS)
                    .addComponent(lblCONS_CPF)
                    .addComponent(txtCONS_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCONS_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_NOME)
                    .addComponent(btnLimparConsulta))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(tblConsulta);

        javax.swing.GroupLayout painelCONSULTALayout = new javax.swing.GroupLayout(painelCONSULTA);
        painelCONSULTA.setLayout(painelCONSULTALayout);
        painelCONSULTALayout.setHorizontalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelCONSULTALayout.setVerticalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTPConsulta.addTab("Consulta", painelCONSULTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTBTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(lblTitulo1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTPConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPDadosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTBTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTPDadosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTPConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparAgenda() {
        txtPAC_ID.setText("0");
        txtPAC_NOME.setText("");
        txtPAC_NOMEMAE.setText("");
        txtPAC_NOMEPAI.setText("");
        txtPAC_CPF.setText("");
        txtPAC_DATANASCIMENTO.setText("");
        txtPAC_IDADE.setText("");
        txtPAC_ENDERECO.setText("");
        txtPAC_CARTAOSUS.setText("");
    }

    private void mostrar(PacienteModel paciente) {
        txtPAC_ID.setText(String.valueOf(paciente.getPAC_ID()));
        txtPAC_NOME.setText(paciente.getPAC_NOME());
        txtPAC_NOMEMAE.setText(paciente.getPAC_NOMEMAE());
        txtPAC_NOMEPAI.setText(paciente.getPAC_NOMEPAI());
        txtPAC_CPF.setText(String.valueOf(paciente.getPAC_CPF()));
        txtPAC_DATANASCIMENTO.setText(paciente.getPAC_DATANASCIMENTO());
        txtPAC_IDADE.setText(String.valueOf(paciente.getPAC_IDADE()));
        txtPAC_ENDERECO.setText(paciente.getPAC_ENDERECO());
        txtPAC_CARTAOSUS.setText(String.valueOf(paciente.getPAC_CARTAOSUS()));
    }

    private String filtroConsulta() {
        String condicao = "";
        if (!txtCONS_ID1.getText().trim().equals("")) {
            condicao += "(PAC_ID >= " + txtCONS_ID1.getText() + ")";
        }
        if (!txtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(PAC_ID <= " + txtCONS_ID2.getText() + ")";
        }
        if (!txtCONS_NOME.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(PAC_NOME LIKE ('%" + txtCONS_NOME.getText() + "%'))";
        }
        if (!txtCONS_CPF.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(PAC_CPF LIKE ('%" + txtCONS_CPF.getText() + "%'))";
        }
        if (!txtCONS_CARTAOSUS.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(PAC_CARTAOSUS LIKE ('%" + txtCONS_CARTAOSUS.getText() + "%'))";
        }
        return condicao;
    }

    private void consultar() {
        try {
            String condicao = filtroConsulta();
            PacienteController pacientecontroller = new PacienteController();
            lista = null;
            lista = pacientecontroller.consultar(condicao);

            tabela = new PacienteTableModel(lista, colunas);
            tblConsulta.setModel(tabela);
            tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não Existem Pacientes Cadastrados!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta do Paciente \n" + ex.getMessage());
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
            JOptionPane.showMessageDialog(null, "Não Existem Pacientes Cadastrados!");
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
        txtPAC_NOME.setFocusable(true);
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARActionPerformed
        setOperacao("alterar");
    }//GEN-LAST:event_btnALTERARActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão deste Registro ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                PacienteModel objpaciente = new PacienteModel();
                objpaciente.setPAC_ID(Integer.parseInt(txtPAC_ID.getText()));
                objpaciente.setPAC_NOME(txtPAC_NOME.getText());
                objpaciente.setPAC_NOMEMAE(txtPAC_NOMEMAE.getText());
                objpaciente.setPAC_NOMEPAI(txtPAC_NOMEPAI.getText());
                objpaciente.setPAC_CPF(Integer.parseInt(txtPAC_CPF.getText()));
                objpaciente.setPAC_DATANASCIMENTO(txtPAC_DATANASCIMENTO.getText());
                objpaciente.setPAC_IDADE(Integer.parseInt(txtPAC_IDADE.getText()));
                objpaciente.setPAC_ENDERECO(txtPAC_ENDERECO.getText());
                objpaciente.setPAC_CARTAOSUS(Integer.parseInt(txtPAC_CARTAOSUS.getText()));

                PacienteController pacientecontroller = new PacienteController();
                pacientecontroller.excluir(objpaciente);

                JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Exclusão de Registro \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação deste Paciente ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                PacienteModel objpaciente = new PacienteModel();
                objpaciente.setPAC_ID(Integer.parseInt(txtPAC_ID.getText()));
                objpaciente.setPAC_NOME(txtPAC_NOME.getText());
                objpaciente.setPAC_NOMEMAE(txtPAC_NOMEMAE.getText());
                objpaciente.setPAC_NOMEPAI(txtPAC_NOMEPAI.getText());
                objpaciente.setPAC_CPF(Integer.parseInt(txtPAC_CPF.getText()));
                objpaciente.setPAC_DATANASCIMENTO(txtPAC_DATANASCIMENTO.getText());
                objpaciente.setPAC_IDADE(Integer.parseInt(txtPAC_IDADE.getText()));
                objpaciente.setPAC_ENDERECO(txtPAC_ENDERECO.getText());
                objpaciente.setPAC_CARTAOSUS(Integer.parseInt(txtPAC_CARTAOSUS.getText()));
                PacienteController pacientecontroller = new PacienteController();
                pacientecontroller.gravar(getOperacao(), objpaciente);

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

    private void txtCONS_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCONS_NOMEActionPerformed

    }//GEN-LAST:event_txtCONS_NOMEActionPerformed

    private void btnLimparConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparConsultaActionPerformed
        txtCONS_ID1.setText("");
        txtCONS_ID2.setText("");
        txtCONS_NOME.setText("");
        txtCONS_CPF.setText("");
        txtCONS_CARTAOSUS.setText("");
        consultar();
    }//GEN-LAST:event_btnLimparConsultaActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void txtPAC_NOMEMAEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAC_NOMEMAEActionPerformed

    }//GEN-LAST:event_txtPAC_NOMEMAEActionPerformed

    private void txtPAC_NOMEPAIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAC_NOMEPAIActionPerformed

    }//GEN-LAST:event_txtPAC_NOMEPAIActionPerformed

    private void txtPAC_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAC_CPFActionPerformed

    }//GEN-LAST:event_txtPAC_CPFActionPerformed

    private void txtPAC_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAC_NOMEActionPerformed

    }//GEN-LAST:event_txtPAC_NOMEActionPerformed

    private void txtPAC_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAC_IDActionPerformed

    }//GEN-LAST:event_txtPAC_IDActionPerformed

    private void btnVOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVOLTARActionPerformed
        InicialView inicialView = new InicialView();
        dispose();
    }//GEN-LAST:event_btnVOLTARActionPerformed

    private void txtPAC_ENDERECOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAC_ENDERECOActionPerformed

    }//GEN-LAST:event_txtPAC_ENDERECOActionPerformed

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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jTBTopo;
    private javax.swing.JTabbedPane jTPConsulta;
    private javax.swing.JTabbedPane jTPDadosPaciente;
    private javax.swing.JLabel lblCONS_CARTAOSUS;
    private javax.swing.JLabel lblCONS_CPF;
    private javax.swing.JLabel lblCONS_ID;
    private javax.swing.JLabel lblCONS_NOME;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblPAC_CARTAOSUS;
    private javax.swing.JLabel lblPAC_CPF;
    private javax.swing.JLabel lblPAC_DATANASCIMENTO;
    private javax.swing.JLabel lblPAC_ENDERECO;
    private javax.swing.JLabel lblPAC_IDADE;
    private javax.swing.JLabel lblPAC_NOME;
    private javax.swing.JLabel lblPAC_NOMEMAE;
    private javax.swing.JLabel lblPAC_NOMEPAI;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblUPAC_ID;
    private javax.swing.JPanel painelCONSULTA;
    private javax.swing.JPanel painelDADOS;
    private javax.swing.JTable tblConsulta;
    private javax.swing.JTextField txtCONS_CARTAOSUS;
    private javax.swing.JTextField txtCONS_CPF;
    private javax.swing.JTextField txtCONS_ID1;
    private javax.swing.JTextField txtCONS_ID2;
    private javax.swing.JTextField txtCONS_NOME;
    private javax.swing.JTextField txtPAC_CARTAOSUS;
    private javax.swing.JTextField txtPAC_CPF;
    private javax.swing.JTextField txtPAC_DATANASCIMENTO;
    private javax.swing.JTextField txtPAC_ENDERECO;
    private javax.swing.JTextField txtPAC_ID;
    private javax.swing.JTextField txtPAC_IDADE;
    private javax.swing.JTextField txtPAC_NOME;
    private javax.swing.JTextField txtPAC_NOMEMAE;
    private javax.swing.JTextField txtPAC_NOMEPAI;
    // End of variables declaration//GEN-END:variables
}
