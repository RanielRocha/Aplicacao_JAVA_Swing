
package dao;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.UnidadeSaudeModel;

public class UnidadeSaudeDao {

    private Conexao conexao = null;

    public UnidadeSaudeDao() throws SQLException {
        conexao = new Conexao();
    }

    public void adicionar(UnidadeSaudeModel unidadeSaude) throws SQLException {
        String sql = "INSERT INTO UNIDADESAUDE (UBS_NOME, UBS_CNES, UBS_ATENDESUS, UBS_ESTADO, UBS_MUNICIPIO, "
                + "UBS_GESTAO, UBS_NATUREZA)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
//        stm.setInt(1, unidadeSaude.getUBS_ID());
        stm.setString(1, unidadeSaude.getUBS_NOME());
        stm.setInt(2, unidadeSaude.getUBS_CNES());
        stm.setInt(3, unidadeSaude.getUBS_ATENDESUS());
        stm.setString(4, unidadeSaude.getUBS_ESTADO());
        stm.setString(5, unidadeSaude.getUBS_MUNICIPIO());
        stm.setString(6, unidadeSaude.getUBS_GESTAO());
        stm.setString(7, unidadeSaude.getUBS_NATUREZA());
        stm.execute();
        stm.close();
    }

    public void alterar(UnidadeSaudeModel unidadeSaude) throws SQLException {
        String sql = "UPDATE UNIDADESAUDE SET UBS_NOME = ?, UBS_CNES = ?, UBS_ATENDESUS = ?, UBS_ESTADO = ?, "
                + "UBS_MUNICIPIO = ?, UBS_GESTAO = ?, UBS_NATUREZA = ? WHERE UBS_ID = ?";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
        stm.setString(1, unidadeSaude.getUBS_NOME());
        stm.setInt(2, unidadeSaude.getUBS_CNES());
        stm.setInt(3, unidadeSaude.getUBS_ATENDESUS());
        stm.setString(4, unidadeSaude.getUBS_ESTADO());
        stm.setString(5, unidadeSaude.getUBS_MUNICIPIO());
        stm.setString(6, unidadeSaude.getUBS_GESTAO());
        stm.setString(7, unidadeSaude.getUBS_NATUREZA());
        stm.setInt(8, unidadeSaude.getUBS_ID());
        stm.execute();
        stm.close();
    }

    public void excluir(UnidadeSaudeModel unidadeSaude) throws SQLException {
        String sql = "DELETE FROM UNIDADESAUDE WHERE UBS_ID = ?";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
        stm.setInt(1, unidadeSaude.getUBS_ID());
        stm.execute();
        stm.close();
    }

    public ArrayList<UnidadeSaudeModel> consultar(String condicao) throws SQLException {
        ArrayList<UnidadeSaudeModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM UNIDADESAUDE";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.getConexao().prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            UnidadeSaudeModel objubs = new UnidadeSaudeModel();
            objubs.setUBS_ID(rs.getInt("UBS_ID"));
            objubs.setUBS_NOME(rs.getString("UBS_NOME"));
            objubs.setUBS_CNES(rs.getInt("UBS_CNES"));
            objubs.setUBS_ATENDESUS(rs.getInt("UBS_ATENDESUS"));
            objubs.setUBS_ESTADO(rs.getString("UBS_ESTADO"));
            objubs.setUBS_MUNICIPIO(rs.getString("UBS_MUNICIPIO"));
            objubs.setUBS_GESTAO(rs.getString("UBS_GESTAO"));
            objubs.setUBS_NATUREZA(rs.getString("UBS_NATUREZA"));
            lista.add(objubs);
        }
        rs.close();
        stm.close();
        return lista;
    }

}
