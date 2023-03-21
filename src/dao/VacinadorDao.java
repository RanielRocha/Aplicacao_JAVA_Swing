
package dao;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.VacinadorModel;

public class VacinadorDao {

    private Conexao conexao = null;

    public VacinadorDao() throws SQLException {
        conexao = new Conexao();
    }

    public void adicionar(VacinadorModel vacinador) throws SQLException {
        String sql = "INSERT INTO VACINADOR (VAC_NOME, VAC_CPF,"
                + "VAC_REGPROFISSIONAL, VAC_CARGO, VAC_FORMACAO)"
                + " VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
//        stm.setInt(1, vacinador.getVAC_ID());
        stm.setString(1, vacinador.getVAC_NOME());
        stm.setInt(2, vacinador.getVAC_CPF());
        stm.setInt(3, vacinador.getVAC_REGPROFISSIONAL());
        stm.setString(4, vacinador.getVAC_CARGO());
        stm.setString(5, vacinador.getVAC_FORMACAO());
        stm.execute();
        stm.close();
    }

    public void alterar(VacinadorModel vacinador) throws SQLException {
        String sql = "UPDATE VACINADOR SET VAC_NOME = ?, VAC_CPF = ?, "
                + "VAC_REGPROFISSIONAL = ?, VAC_CARGO = ?, VAC_FORMACAO = ? WHERE VAC_ID = ?";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
        stm.setString(1, vacinador.getVAC_NOME());
        stm.setInt(2, vacinador.getVAC_CPF());
        stm.setInt(3, vacinador.getVAC_REGPROFISSIONAL());
        stm.setString(4, vacinador.getVAC_CARGO());
        stm.setString(5, vacinador.getVAC_FORMACAO());
        stm.setInt(6, vacinador.getVAC_ID());
        stm.execute();
        stm.close();
    }

    public void excluir(VacinadorModel vacinador) throws SQLException {
        String sql = "DELETE FROM VACINADOR WHERE VAC_ID = ?";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
        stm.setInt(1, vacinador.getVAC_ID());
        stm.execute();
        stm.close();
    }

    public ArrayList<VacinadorModel> consultar(String condicao) throws SQLException {
        ArrayList<VacinadorModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM VACINADOR";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.getConexao().prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            VacinadorModel objvac = new VacinadorModel();
            objvac.setVAC_ID(rs.getInt("VAC_ID"));
            objvac.setVAC_NOME(rs.getString("VAC_NOME"));
            objvac.setVAC_CPF(rs.getInt("VAC_CPF"));
            objvac.setVAC_REGPROFISSIONAL(rs.getInt("VAC_REGPROFISSIONAL"));
            objvac.setVAC_CARGO(rs.getString("VAC_CARGO"));
            objvac.setVAC_FORMACAO(rs.getString("VAC_FORMACAO"));
            lista.add(objvac);
        }
        rs.close();
        stm.close();
        return lista;
    }

    public List<VacinadorModel> listarVacinadoresDao() {
        ArrayList<VacinadorModel> lista;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM VACINADOR ORDER BY VAC_NOME";

        try {
            stm = conexao.getConexao().prepareStatement(sql);
            rs = stm.executeQuery();
            lista = new ArrayList<>();

            while (rs.next()) {
                VacinadorModel objvac = new VacinadorModel();
                objvac.setVAC_ID(rs.getInt("VAC_ID"));
                objvac.setVAC_NOME(rs.getString("VAC_NOME"));
                objvac.setVAC_CPF(rs.getInt("VAC_CPF"));
                objvac.setVAC_REGPROFISSIONAL(rs.getInt("VAC_REGPROFISSIONAL"));
                objvac.setVAC_CARGO(rs.getString("VAC_CARGO"));
                objvac.setVAC_FORMACAO(rs.getString("VAC_FORMACAO"));
                lista.add(objvac);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);
            return null;
        }
    }
}
