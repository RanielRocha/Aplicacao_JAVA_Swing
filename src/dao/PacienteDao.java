
package dao;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.PacienteModel;

public class PacienteDao {

    private Conexao conexao = null;

    public PacienteDao() throws SQLException {
        conexao = new Conexao();
    }

    public void adicionar(PacienteModel paciente) throws SQLException {
        String sql = "INSERT INTO PACIENTE (PAC_NOME, PAC_NOMEMAE, PAC_NOMEPAI, PAC_CPF, "
                + "PAC_DATANASCIMENTO, PAC_IDADE, PAC_ENDERECO, PAC_CARTAOSUS)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
//        stm.setInt(1, paciente.getPAC_ID());
        stm.setString(1, paciente.getPAC_NOME());
        stm.setString(2, paciente.getPAC_NOMEMAE());
        stm.setString(3, paciente.getPAC_NOMEPAI());
        stm.setInt(4, paciente.getPAC_CPF());
        stm.setString(5, paciente.getPAC_DATANASCIMENTO());
        stm.setInt(6, paciente.getPAC_IDADE());
        stm.setString(7, paciente.getPAC_ENDERECO());
        stm.setInt(8, paciente.getPAC_CARTAOSUS());
        stm.execute();
        stm.close();
    }

    public void alterar(PacienteModel paciente) throws SQLException {
        String sql = "UPDATE PACIENTE SET PAC_NOME = ?, PAC_NOMEMAE = ?, PAC_NOMEPAI = ?, PAC_CPF = ?, "
                + "PAC_DATANASCIMENTO = ?, PAC_IDADE = ?, PAC_ENDERECO = ?, PAC_CARTAOSUS = ? WHERE PAC_ID = ?";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
        stm.setString(1, paciente.getPAC_NOME());
        stm.setString(2, paciente.getPAC_NOMEMAE());
        stm.setString(3, paciente.getPAC_NOMEPAI());
        stm.setInt(4, paciente.getPAC_CPF());
        stm.setString(5, paciente.getPAC_DATANASCIMENTO());
        stm.setInt(6, paciente.getPAC_IDADE());
        stm.setString(7, paciente.getPAC_ENDERECO());
        stm.setInt(8, paciente.getPAC_CARTAOSUS());
        stm.setInt(9, paciente.getPAC_ID());
        stm.execute();
        stm.close();
    }

    public void excluir(PacienteModel paciente) throws SQLException {
        String sql = "DELETE FROM PACIENTE WHERE PAC_ID = ?";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
        stm.setInt(1, paciente.getPAC_ID());
        stm.execute();
        stm.close();
    }

    public ArrayList<PacienteModel> consultar(String condicao) throws SQLException {
        ArrayList<PacienteModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM PACIENTE";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.getConexao().prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            PacienteModel objpac = new PacienteModel();
            objpac.setPAC_ID(rs.getInt("PAC_ID"));
            objpac.setPAC_NOME(rs.getString("PAC_NOME"));
            objpac.setPAC_NOMEMAE(rs.getString("PAC_NOMEMAE"));
            objpac.setPAC_NOMEPAI(rs.getString("PAC_NOMEPAI"));
            objpac.setPAC_CPF(rs.getInt("PAC_CPF"));
            objpac.setPAC_DATANASCIMENTO(rs.getString("PAC_DATANASCIMENTO"));
            objpac.setPAC_IDADE(rs.getInt("PAC_IDADE"));
            objpac.setPAC_ENDERECO(rs.getString("PAC_ENDERECO"));
            objpac.setPAC_CARTAOSUS(rs.getInt("PAC_CARTAOSUS"));
            lista.add(objpac);
        }
        rs.close();
        stm.close();
        return lista;
    }

    public List<PacienteModel> listarPacientesDao() {
        ArrayList<PacienteModel> lista;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM PACIENTE ORDER BY PAC_NOME";

        try {
            stm = conexao.getConexao().prepareStatement(sql);
            rs = stm.executeQuery();
            lista = new ArrayList<>();

            while (rs.next()) {
                PacienteModel objpac = new PacienteModel();
                objpac.setPAC_ID(rs.getInt("PAC_ID"));
                objpac.setPAC_NOME(rs.getString("PAC_NOME"));
                objpac.setPAC_NOMEMAE(rs.getString("PAC_NOMEMAE"));
                objpac.setPAC_NOMEPAI(rs.getString("PAC_NOMEPAI"));
                objpac.setPAC_CPF(rs.getInt("PAC_CPF"));
                objpac.setPAC_DATANASCIMENTO(rs.getString("PAC_DATANASCIMENTO"));
                objpac.setPAC_IDADE(rs.getInt("PAC_IDADE"));
                objpac.setPAC_ENDERECO(rs.getString("PAC_ENDERECO"));
                objpac.setPAC_CARTAOSUS(rs.getInt("PAC_CARTAOSUS"));
                lista.add(objpac);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);
            return null;
        }
    }

}
