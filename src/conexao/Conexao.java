
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {
    private final static String BANCO = "jdbc:sqlite:bancoCartVacinacao.db";
    private Connection conexao;             //cria conexão 

    public Conexao() {
        try {
            conexao = DriverManager.getConnection(BANCO); //cria conexão 
            criarBancoDeDados();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta SQL \n" + ex.getMessage());
        }
    }
    
    public Connection getConexao() {
        return conexao;
    }
    
    public void criarTabelaUsuarios() {
        Statement stat = null;                             
        try {
            stat = conexao.createStatement();
            String tabela = "CREATE TABLE IF NOT EXISTS USUARIO "
                    + " ( USU_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
                    + "     USU_NOME VARCHAR(80),"
                    + "     USU_CPF INTEGER,"
                    + "     USU_CARGO VARCHAR(20),"
                    + "     USU_LOGIN VARCHAR(20),"
                    + "     USU_ATIVO INTEGER,"
                    + "     USU_SENHA VARCHAR(20)"
                    + "   )";
            stat.executeUpdate(tabela);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados \n" + ex.getMessage());
        }
    }
    
    public void criarTabelaPacientes() {
        Statement stat = null;
        try {
            stat = conexao.createStatement();
            String tabela = "CREATE TABLE IF NOT EXISTS PACIENTE "
                    + " ( PAC_ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "     PAC_NOME VARCHAR(80),"
                    + "     PAC_NOMEMAE VARCHAR(80),"
                    + "     PAC_NOMEPAI VARCHAR(80),"
                    + "     PAC_CPF INTEGER,"
                    + "     PAC_DATANASCIMENTO VARCHAR(10),"
                    + "     PAC_IDADE INTEGER,"
                    + "     PAC_ENDERECO VARCHAR(150),"
                    + "     PAC_CARTAOSUS INTEGER"
                    + " )";
            stat.executeUpdate(tabela);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados \n" + ex.getMessage());
        }
    }
    
    public void criarTabelaUnidadeDeSaude() {
        Statement stat = null;
        try {
            stat = conexao.createStatement();
            String tabela = "CREATE TABLE IF NOT EXISTS UNIDADESAUDE "
                    + " ( UBS_ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "     UBS_NOME VARCHAR(50),"
                    + "     UBS_CNES INTEGER,"
                    + "     UBS_ATENDESUS INTEGER,"
                    + "     UBS_ESTADO VARCHAR(3),"
                    + "     UBS_MUNICIPIO VARCHAR(50),"
                    + "     UBS_GESTAO VARCHAR(10),"
                    + "     UBS_NATUREZA VARCHAR(30)"
                    + " )";
            stat.executeUpdate(tabela);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados \n" + ex.getMessage());
        }
    }
    
    public void criarTabelaFabricantes() {
        Statement stat = null;
        try {
            stat = conexao.createStatement();
            String tabela = "CREATE TABLE IF NOT EXISTS FABRICANTE"
                    + " ( FAB_ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "     FAB_NOME VARCHAR(50),"
                    + "     FAB_CNPJ INTEGER,"
                    + "     FAB_NATUREZAJURIDICA VARCHAR(30),"
                    + "     FAB_PAISSEDE VARCHAR(50),"
                    + "     FAB_NOMEVACINA VARCHAR(10)"
                    + " )";
            stat.executeUpdate(tabela);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados \n" + ex.getMessage());
        }
    }
    
    public void criarTabelaVacinadores() {
        Statement stat = null;
        try {
            stat = conexao.createStatement();
            String tabela = "CREATE TABLE IF NOT EXISTS VACINADOR"
                    + " ( VAC_ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "     VAC_NOME VARCHAR(50),"
                    + "     VAC_CPF INTEGER,"
                    + "     VAC_REGPROFISSIONAL INTEGER,"
                    + "     VAC_CARGO VARCHAR(20),"
                    + "     VAC_FORMACAO VARCHAR(25)"
                    + " )";
            stat.executeUpdate(tabela);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados \n" + ex.getMessage());
        }
    }
    
    public void criarTabelaVacinacao() {
        Statement stat = null;
        try {
            stat = conexao.createStatement();
            String tabela = "CREATE TABLE IF NOT EXISTS VACINACAO"
                    + " ( VACINACAO_ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "     VACINACAO_NOMEVACINA VARCHAR(10),"
                    + "     VACINACAO_DOSE VARCHAR(10),"
                    + "     VACINACAO_DATA VARCHAR(10),"
                    + "     VACINACAO_LOTE VARCHAR(10),"
                    + "     VACINACAO_PACIENTE VARCHAR(50),"
                    + "     VACINACAO_VACINADOR VARCHAR(50),"
                    + "     VACINACAO_FABRICANTE VARCHAR(50)"
                    + " )";
            stat.executeUpdate(tabela);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados \n" + ex.getMessage());
        }
                    
    }
    
    public void criarBancoDeDados() {
        criarTabelaUsuarios();
        criarTabelaPacientes();
        criarTabelaUnidadeDeSaude();
        criarTabelaFabricantes();
        criarTabelaVacinadores();
        criarTabelaVacinacao();
    }
    
}
