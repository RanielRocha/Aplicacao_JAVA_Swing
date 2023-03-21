
package view;

import controller.VacinacaoController;
import dao.FabricanteDao;
import dao.PacienteDao;
import dao.VacinadorDao;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.FabricanteModel;
import model.PacienteModel;
import model.VacinacaoModel;
import model.VacinadorModel;

public class VacinacaoView extends javax.swing.JFrame {

    private String operacao;
    private String colunas[] = {"ID", "Nome Vacina", "Dose", "Data", "Lote", "Paciente", "Vacinador", "Fabricante"};
    private ArrayList<VacinacaoModel> lista;
    private VacinacaoTableModel tabela;
    PacienteModel pacienteModel;
    VacinadorModel vacinadorModel;
    FabricanteModel fabricanteModel;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
        btnGRAVAR.setEnabled(ativar);
    }

    public VacinacaoView() {
        this.setPreferredSize(new Dimension(750, 650));
        initComponents();
        setOperacao(""); // inicializa o form no modo CONSULTA
        setLocationRelativeTo(null);
        consultar();
        try {
            preencherComboBox();
        } catch (SQLException ex) {
            Logger.getLogger(VacinacaoView.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jTPDadosVacinacao = new javax.swing.JTabbedPane();
        painelDADOS = new javax.swing.JPanel();
        lblVACINACAO_ID = new javax.swing.JLabel();
        lblVACINACAO_NOMEVACINA = new javax.swing.JLabel();
        lblVACINACAO_FABRICANTE = new javax.swing.JLabel();
        txtVACINACAO_ID = new javax.swing.JTextField();
        lblVACINACAO_LOTE = new javax.swing.JLabel();
        lblVACINACAO_DOSE = new javax.swing.JLabel();
        txtVACINACAO_DATA = new javax.swing.JTextField();
        lblVACINACAO_DATA = new javax.swing.JLabel();
        txtVACINACAO_LOTE = new javax.swing.JTextField();
        lblVACINACAO_PACIENTE = new javax.swing.JLabel();
        cbxVACINACAO_PACIENTE = new javax.swing.JComboBox<>();
        cbxVACINACAO_DOSE = new javax.swing.JComboBox<>();
        lblVACINACAO_VACINADOR = new javax.swing.JLabel();
        cbxVACINACAO_NOMEVACINA = new javax.swing.JComboBox<>();
        cbxVACINACAO_FABRICANTE = new javax.swing.JComboBox<>();
        cbxVACINACAO_VACINADOR = new javax.swing.JComboBox<>();
        jTPConsulta = new javax.swing.JTabbedPane();
        painelCONSULTA = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCONS_ID = new javax.swing.JLabel();
        txtCONS_ID1 = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        txtCONS_ID2 = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        btnLimparConsulta = new javax.swing.JButton();
        lblCONS_NOMEVACINA = new javax.swing.JLabel();
        txtCONS_NOMEVACINA = new javax.swing.JTextField();
        lblCONS_DOSE = new javax.swing.JLabel();
        txtCONS_DOSE = new javax.swing.JTextField();
        txtCONS_DATA = new javax.swing.JTextField();
        txtCONS_LOTE = new javax.swing.JTextField();
        lblCONS_DATA = new javax.swing.JLabel();
        lblCONS_LOTE = new javax.swing.JLabel();
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
        lblTitulo.setText("Cadastro de Vacinação");

        lblVACINACAO_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVACINACAO_ID.setText("ID");

        lblVACINACAO_NOMEVACINA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVACINACAO_NOMEVACINA.setText("Nome Vacina");

        lblVACINACAO_FABRICANTE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVACINACAO_FABRICANTE.setText("Fabricante");

        txtVACINACAO_ID.setEditable(false);
        txtVACINACAO_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblVACINACAO_LOTE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVACINACAO_LOTE.setText("Lote");

        lblVACINACAO_DOSE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVACINACAO_DOSE.setText("Dose");

        txtVACINACAO_DATA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVACINACAO_DATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVACINACAO_DATAActionPerformed(evt);
            }
        });

        lblVACINACAO_DATA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVACINACAO_DATA.setText("Data da Aplicação");

        txtVACINACAO_LOTE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVACINACAO_LOTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVACINACAO_LOTEActionPerformed(evt);
            }
        });

        lblVACINACAO_PACIENTE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVACINACAO_PACIENTE.setText("Paciente");

        cbxVACINACAO_PACIENTE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxVACINACAO_PACIENTE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxVACINACAO_PACIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVACINACAO_PACIENTEActionPerformed(evt);
            }
        });

        cbxVACINACAO_DOSE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxVACINACAO_DOSE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1ª Dose", "2ª Dose", "3ª Dose" }));
        cbxVACINACAO_DOSE.setSelectedItem(null);
        cbxVACINACAO_DOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVACINACAO_DOSEActionPerformed(evt);
            }
        });

        lblVACINACAO_VACINADOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVACINACAO_VACINADOR.setText("Vacinador");

        cbxVACINACAO_NOMEVACINA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxVACINACAO_NOMEVACINA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxVACINACAO_NOMEVACINA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVACINACAO_NOMEVACINAActionPerformed(evt);
            }
        });

        cbxVACINACAO_FABRICANTE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxVACINACAO_FABRICANTE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxVACINACAO_FABRICANTE.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbxVACINACAO_FABRICANTEAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbxVACINACAO_FABRICANTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVACINACAO_FABRICANTEActionPerformed(evt);
            }
        });

        cbxVACINACAO_VACINADOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxVACINACAO_VACINADOR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxVACINACAO_VACINADOR.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbxVACINACAO_VACINADORAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbxVACINACAO_VACINADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVACINACAO_VACINADORActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDADOSLayout = new javax.swing.GroupLayout(painelDADOS);
        painelDADOS.setLayout(painelDADOSLayout);
        painelDADOSLayout.setHorizontalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblVACINACAO_NOMEVACINA)
                            .addComponent(lblVACINACAO_ID)
                            .addComponent(lblVACINACAO_DOSE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVACINACAO_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(cbxVACINACAO_DOSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(lblVACINACAO_LOTE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVACINACAO_LOTE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(lblVACINACAO_DATA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVACINACAO_DATA, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(cbxVACINACAO_NOMEVACINA, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblVACINACAO_PACIENTE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxVACINACAO_PACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblVACINACAO_FABRICANTE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxVACINACAO_FABRICANTE, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVACINACAO_VACINADOR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxVACINACAO_VACINADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        painelDADOSLayout.setVerticalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVACINACAO_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVACINACAO_ID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVACINACAO_NOMEVACINA)
                    .addComponent(lblVACINACAO_PACIENTE)
                    .addComponent(cbxVACINACAO_PACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxVACINACAO_NOMEVACINA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVACINACAO_DATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVACINACAO_DATA)
                    .addComponent(lblVACINACAO_DOSE)
                    .addComponent(cbxVACINACAO_DOSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVACINACAO_LOTE)
                    .addComponent(txtVACINACAO_LOTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVACINACAO_FABRICANTE)
                    .addComponent(lblVACINACAO_VACINADOR)
                    .addComponent(cbxVACINACAO_FABRICANTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxVACINACAO_VACINADOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTPDadosVacinacao.addTab("Dados da Vacinação", painelDADOS);

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

        lblCONS_NOMEVACINA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_NOMEVACINA.setText("Nome Vacina");

        txtCONS_NOMEVACINA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCONS_NOMEVACINA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCONS_NOMEVACINAActionPerformed(evt);
            }
        });

        lblCONS_DOSE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_DOSE.setText("Dose");

        txtCONS_DOSE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtCONS_DATA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtCONS_LOTE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCONS_DATA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_DATA.setText("Data da Aplicação");

        lblCONS_LOTE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_LOTE.setText("Lote");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblCONS_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCONS_DOSE)
                        .addGap(4, 4, 4)
                        .addComponent(txtCONS_DOSE, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(lblCONS_DATA)
                        .addGap(12, 12, 12)
                        .addComponent(txtCONS_DATA)
                        .addGap(12, 12, 12)
                        .addComponent(btnConsulta))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCONS_NOMEVACINA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCONS_NOMEVACINA, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblCONS_LOTE)
                        .addGap(4, 4, 4)
                        .addComponent(txtCONS_LOTE)
                        .addGap(8, 8, 8)
                        .addComponent(btnLimparConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
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
                    .addComponent(txtCONS_DOSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_DOSE)
                    .addComponent(txtCONS_DATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_DATA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCONS_NOMEVACINA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_NOMEVACINA)
                    .addComponent(btnLimparConsulta)
                    .addComponent(txtCONS_LOTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_LOTE))
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE))
                .addGap(4, 4, 4))
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
                .addGap(233, 233, 233)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTPDadosVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTBTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTBTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTPDadosVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTPConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparAgenda() {
        txtVACINACAO_ID.setText("0");
        cbxVACINACAO_NOMEVACINA.setSelectedIndex(0);
        cbxVACINACAO_DOSE.setSelectedIndex(-1);
        txtVACINACAO_DATA.setText("");
        cbxVACINACAO_PACIENTE.setSelectedIndex(0);
        cbxVACINACAO_VACINADOR.setSelectedIndex(0);
        cbxVACINACAO_FABRICANTE.setSelectedIndex(0);
        txtVACINACAO_LOTE.setText("");
    }

    private void mostrar(VacinacaoModel vacinacao) {
        txtVACINACAO_ID.setText(String.valueOf(vacinacao.getVACINACAO_ID()));
        cbxVACINACAO_NOMEVACINA.setSelectedItem(vacinacao.getVACINACAO_NOMEVACINA());
        cbxVACINACAO_DOSE.setSelectedItem(vacinacao.getVACINACAO_DOSE());
        txtVACINACAO_DATA.setText(String.valueOf(vacinacao.getVACINACAO_DATA()));
        txtVACINACAO_LOTE.setText(String.valueOf(vacinacao.getVACINACAO_LOTE()));
        cbxVACINACAO_PACIENTE.setSelectedItem(vacinacao.getVACINACAO_PACIENTE());
        cbxVACINACAO_VACINADOR.setSelectedItem(vacinacao.getVACINACAO_VACINADOR());
        cbxVACINACAO_FABRICANTE.setSelectedItem(vacinacao.getVACINACAO_FABRICANTE());
    }

    private String filtroConsulta() {
        String condicao = "";
        if (!txtCONS_ID1.getText().trim().equals("")) {
            condicao += "(VACINACAO_ID >= " + txtCONS_ID1.getText() + ")";
        }
        if (!txtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(VACINACAO_ID <= " + txtCONS_ID2.getText() + ")";
        }
        if (!txtCONS_NOMEVACINA.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(VACINACAO_NOMEVACINA LIKE ('%" + txtCONS_NOMEVACINA.getText() + "%'))";
        }
        if (!txtCONS_LOTE.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(VACINACAO_LOTE LIKE ('%" + txtCONS_LOTE.getText() + "%'))";
        }
        if (!txtCONS_DATA.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(VACINACAO_DATA LIKE ('%" + txtCONS_DATA.getText() + "%'))";
        }
        if (!txtCONS_DOSE.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(VACINACAO_DOSE LIKE ('%" + txtCONS_DOSE.getText() + "%'))";
        }
        return condicao;
    }

    private void consultar() {
        try {
            String condicao = filtroConsulta();
            VacinacaoController vacinacaocontroller = new VacinacaoController();
            lista = null;
            lista = vacinacaocontroller.consultar(condicao);

            tabela = new VacinacaoTableModel(lista, colunas);
            tblConsulta.setModel(tabela);
            tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não Existem Vacinações Cadastradas!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta da Vacinação \n" + ex.getMessage());
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

    private void preencherComboBox() throws SQLException {
        // ComboBox PACIENTES
        PacienteDao vacinacaoPacienteDao = new PacienteDao();
        List<PacienteModel> listaVacinacaoPacientes;

        listaVacinacaoPacientes = vacinacaoPacienteDao.listarPacientesDao();
        cbxVACINACAO_PACIENTE.removeAll();
        for (PacienteModel paciente : listaVacinacaoPacientes) {
            cbxVACINACAO_PACIENTE.addItem(paciente.getPAC_NOME());
        }

        // ComboBox VACINADORES
        VacinadorDao vacinacaoVacinadorDao = new VacinadorDao();
        List<VacinadorModel> listaVacinacaoVacinadores;

        listaVacinacaoVacinadores = vacinacaoVacinadorDao.listarVacinadoresDao();
        cbxVACINACAO_VACINADOR.removeAll();
        for (VacinadorModel vacinador : listaVacinacaoVacinadores) {
            cbxVACINACAO_VACINADOR.addItem(vacinador.getVAC_NOME());
        }

        // ComboBox FABRICANTES
        FabricanteDao vacinacaoFabricanteDao = new FabricanteDao();
        List<FabricanteModel> listaVacinacaoFabricantes;

        listaVacinacaoFabricantes = vacinacaoFabricanteDao.listarFabricantesDao();
        cbxVACINACAO_FABRICANTE.removeAll();
        for (FabricanteModel fabricante : listaVacinacaoFabricantes) {
            cbxVACINACAO_FABRICANTE.addItem(fabricante.getFAB_NOME());
        }

        // ComboBox NOME VACINA
        listaVacinacaoFabricantes = vacinacaoFabricanteDao.listarFabricantesDao();
        cbxVACINACAO_NOMEVACINA.removeAll();
        for (FabricanteModel fabricante : listaVacinacaoFabricantes) {
            cbxVACINACAO_NOMEVACINA.addItem(fabricante.getFAB_NOMEVACINA());
        }
    }

    private void txtVACINACAO_DATAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVACINACAO_DATAActionPerformed

    }//GEN-LAST:event_txtVACINACAO_DATAActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnLimparConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparConsultaActionPerformed
        txtCONS_ID1.setText("");
        txtCONS_ID2.setText("");
        txtCONS_NOMEVACINA.setText("");
        txtCONS_LOTE.setText("");
        txtCONS_DATA.setText("");
        txtCONS_DOSE.setText("");
        consultar();
    }//GEN-LAST:event_btnLimparConsultaActionPerformed

    private void txtCONS_NOMEVACINAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCONS_NOMEVACINAActionPerformed

    }//GEN-LAST:event_txtCONS_NOMEVACINAActionPerformed

    private void txtVACINACAO_LOTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVACINACAO_LOTEActionPerformed

    }//GEN-LAST:event_txtVACINACAO_LOTEActionPerformed

    private void cbxVACINACAO_PACIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVACINACAO_PACIENTEActionPerformed

    }//GEN-LAST:event_cbxVACINACAO_PACIENTEActionPerformed

    private void cbxVACINACAO_DOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVACINACAO_DOSEActionPerformed

    }//GEN-LAST:event_cbxVACINACAO_DOSEActionPerformed

    private void cbxVACINACAO_NOMEVACINAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVACINACAO_NOMEVACINAActionPerformed

    }//GEN-LAST:event_cbxVACINACAO_NOMEVACINAActionPerformed

    private void cbxVACINACAO_FABRICANTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVACINACAO_FABRICANTEActionPerformed

    }//GEN-LAST:event_cbxVACINACAO_FABRICANTEActionPerformed

    private void cbxVACINACAO_VACINADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVACINACAO_VACINADORActionPerformed

    }//GEN-LAST:event_cbxVACINACAO_VACINADORActionPerformed

    private void cbxVACINACAO_VACINADORAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbxVACINACAO_VACINADORAncestorAdded

    }//GEN-LAST:event_cbxVACINACAO_VACINADORAncestorAdded

    private void cbxVACINACAO_FABRICANTEAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbxVACINACAO_FABRICANTEAncestorAdded

    }//GEN-LAST:event_cbxVACINACAO_FABRICANTEAncestorAdded

    private void btnSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSAIRActionPerformed

    private void btnVOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVOLTARActionPerformed
        InicialView inicialView = new InicialView();
        dispose();
    }//GEN-LAST:event_btnVOLTARActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação desta Vacinação ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                VacinacaoModel objvacinacao = new VacinacaoModel();
                objvacinacao.setVACINACAO_ID(Integer.parseInt(txtVACINACAO_ID.getText()));
                objvacinacao.setVACINACAO_NOMEVACINA(cbxVACINACAO_NOMEVACINA.getSelectedItem().toString());
                objvacinacao.setVACINACAO_DOSE(cbxVACINACAO_DOSE.getSelectedItem().toString());
                objvacinacao.setVACINACAO_DATA(txtVACINACAO_DATA.getText());
                objvacinacao.setVACINACAO_LOTE(txtVACINACAO_LOTE.getText());
                objvacinacao.setVACINACAO_PACIENTE((String) cbxVACINACAO_PACIENTE.getSelectedItem());
                objvacinacao.setVACINACAO_VACINADOR((String) cbxVACINACAO_VACINADOR.getSelectedItem());
                objvacinacao.setVACINACAO_FABRICANTE((String) cbxVACINACAO_FABRICANTE.getSelectedItem());
                VacinacaoController vacinacaocontroller = new VacinacaoController();
                vacinacaocontroller.gravar(getOperacao(), objvacinacao);

                JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Gravação \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnGRAVARActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão deste Registro ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                VacinacaoModel objvacinacao = new VacinacaoModel();
                objvacinacao.setVACINACAO_ID(Integer.parseInt(txtVACINACAO_ID.getText()));
                objvacinacao.setVACINACAO_NOMEVACINA(cbxVACINACAO_NOMEVACINA.getSelectedItem().toString());
                objvacinacao.setVACINACAO_DOSE(cbxVACINACAO_DOSE.getSelectedItem().toString());
                objvacinacao.setVACINACAO_DATA(txtVACINACAO_DATA.getText());
                objvacinacao.setVACINACAO_LOTE(txtVACINACAO_LOTE.getText());
//                objvacinacao.setVACINACAO_PACIENTE((PacienteModel) cbxVACINACAO_PACIENTE.getSelectedItem());
//                objvacinacao.setVACINACAO_VACINADOR((VacinadorModel) cbxVACINACAO_VACINADOR.getSelectedItem());
//                objvacinacao.setVACINACAO_FABRICANTE((FabricanteModel) cbxVACINACAO_FABRICANTE.getSelectedItem());

                VacinacaoController vacinacaocontroller = new VacinacaoController();
                vacinacaocontroller.excluir(objvacinacao);

                JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Exclusão de Registro \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void btnALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARActionPerformed
        setOperacao("alterar");
    }//GEN-LAST:event_btnALTERARActionPerformed

    private void btnINCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINCLUIRActionPerformed
        limparAgenda();
        setOperacao("incluir");
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnULTIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnULTIMOActionPerformed
        int ultimo = lista.size() - 1;
        mostrarRegistro(ultimo);
    }//GEN-LAST:event_btnULTIMOActionPerformed

    private void btnPROXIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPROXIMOActionPerformed
        int selecionado = tblConsulta.getSelectedRow() + 1;
        mostrarRegistro(selecionado);
    }//GEN-LAST:event_btnPROXIMOActionPerformed

    private void btnANTERIORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnANTERIORActionPerformed
        int selecionado = tblConsulta.getSelectedRow() - 1;
        mostrarRegistro(selecionado);
    }//GEN-LAST:event_btnANTERIORActionPerformed

    private void btnPRIMEIROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRIMEIROActionPerformed
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Vacinações Cadastradas!");
        }
        int primeiro = 0;
        mostrarRegistro(primeiro);
    }//GEN-LAST:event_btnPRIMEIROActionPerformed

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
    private javax.swing.JComboBox<String> cbxVACINACAO_DOSE;
    private javax.swing.JComboBox<Object> cbxVACINACAO_FABRICANTE;
    private javax.swing.JComboBox<String> cbxVACINACAO_NOMEVACINA;
    private javax.swing.JComboBox<Object> cbxVACINACAO_PACIENTE;
    private javax.swing.JComboBox<Object> cbxVACINACAO_VACINADOR;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jTBTopo;
    private javax.swing.JTabbedPane jTPConsulta;
    private javax.swing.JTabbedPane jTPDadosVacinacao;
    private javax.swing.JLabel lblCONS_DATA;
    private javax.swing.JLabel lblCONS_DOSE;
    private javax.swing.JLabel lblCONS_ID;
    private javax.swing.JLabel lblCONS_LOTE;
    private javax.swing.JLabel lblCONS_NOMEVACINA;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVACINACAO_DATA;
    private javax.swing.JLabel lblVACINACAO_DOSE;
    private javax.swing.JLabel lblVACINACAO_FABRICANTE;
    private javax.swing.JLabel lblVACINACAO_ID;
    private javax.swing.JLabel lblVACINACAO_LOTE;
    private javax.swing.JLabel lblVACINACAO_NOMEVACINA;
    private javax.swing.JLabel lblVACINACAO_PACIENTE;
    private javax.swing.JLabel lblVACINACAO_VACINADOR;
    private javax.swing.JPanel painelCONSULTA;
    private javax.swing.JPanel painelDADOS;
    private javax.swing.JTable tblConsulta;
    private javax.swing.JTextField txtCONS_DATA;
    private javax.swing.JTextField txtCONS_DOSE;
    private javax.swing.JTextField txtCONS_ID1;
    private javax.swing.JTextField txtCONS_ID2;
    private javax.swing.JTextField txtCONS_LOTE;
    private javax.swing.JTextField txtCONS_NOMEVACINA;
    private javax.swing.JTextField txtVACINACAO_DATA;
    private javax.swing.JTextField txtVACINACAO_ID;
    private javax.swing.JTextField txtVACINACAO_LOTE;
    // End of variables declaration//GEN-END:variables

}
