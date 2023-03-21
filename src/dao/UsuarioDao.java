
package dao;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.UsuarioModel;

public class UsuarioDao {

    private Conexao conexao = null;

    public UsuarioDao() throws SQLException {
        conexao = new Conexao();
    }

    public void adicionar(UsuarioModel usuario) throws SQLException {
        String sql = "INSERT INTO USUARIO (USU_NOME, USU_CPF, USU_CARGO, USU_LOGIN, "
                + " USU_ATIVO, USU_SENHA)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
//        stm.setInt(1, usuario.getUSU_ID());
        stm.setString(1, usuario.getUSU_NOME());
        stm.setInt(2, usuario.getUSU_CPF());
        stm.setString(3, usuario.getUSU_CARGO());
        stm.setString(4, usuario.getUSU_LOGIN());
        stm.setInt(5, usuario.getUSU_ATIVO());
        stm.setString(6, usuario.getUSU_SENHA());
        stm.execute();
        stm.close();
    }

    public void alterar(UsuarioModel usuario) throws SQLException {
        String sql = "UPDATE USUARIO SET USU_NOME = ?, USU_CPF = ?, USU_CARGO = ?, USU_LOGIN = ?, "
                + "USU_ATIVO = ?, USU_SENHA = ? WHERE USU_ID = ?";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
        stm.setString(1, usuario.getUSU_NOME());
        stm.setInt(2, usuario.getUSU_CPF());
        stm.setString(3, usuario.getUSU_CARGO());
        stm.setString(4, usuario.getUSU_LOGIN());
        stm.setInt(5, usuario.getUSU_ATIVO());
        stm.setString(6, usuario.getUSU_SENHA());
        stm.setInt(7, usuario.getUSU_ID());
        stm.execute();
        stm.close();
    }

    public void excluir(UsuarioModel usuario) throws SQLException {
        String sql = "DELETE FROM USUARIO WHERE USU_ID = ?";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
        stm.setInt(1, usuario.getUSU_ID());
        stm.execute();
        stm.close();
    }

    public ArrayList<UsuarioModel> consultar(String condicao) throws SQLException {
        ArrayList<UsuarioModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM USUARIO";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.getConexao().prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            UsuarioModel objusu = new UsuarioModel();
            objusu.setUSU_ID(rs.getInt("USU_ID"));
            objusu.setUSU_NOME(rs.getString("USU_NOME"));
            objusu.setUSU_CPF(rs.getInt("USU_CPF"));
            objusu.setUSU_CARGO(rs.getString("USU_CARGO"));
            objusu.setUSU_LOGIN(rs.getString("USU_LOGIN"));
            objusu.setUSU_ATIVO(rs.getInt("USU_ATIVO"));
            objusu.setUSU_SENHA(rs.getString("USU_SENHA"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }

    public ResultSet autenticacaoUsuarioLogin(UsuarioModel usuario) throws SQLException {
        PreparedStatement stm;
        ResultSet rs;
        String sqlAutenticacao = "SELECT * FROM USUARIO WHERE (USU_LOGIN = ?) AND (USU_SENHA = ?) ";

        try {
            stm = conexao.getConexao().prepareStatement(sqlAutenticacao);
            stm.setString(1, usuario.getUSU_LOGIN());
            stm.setString(2, usuario.getUSU_SENHA());

            rs = stm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LOGIN: " + erro);
            return null;
        }
    }

}
