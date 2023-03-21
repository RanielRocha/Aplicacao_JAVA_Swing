
package dao;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.FabricanteModel;

public class FabricanteDao {

    private Conexao conexao = null;

    public FabricanteDao() throws SQLException {
        conexao = new Conexao();
    }

    public void adicionar(FabricanteModel fabricante) throws SQLException {
        String sql = "INSERT INTO FABRICANTE (FAB_NOME, FAB_CNPJ, FAB_NATUREZAJURIDICA, "
                + "FAB_PAISSEDE, FAB_NOMEVACINA)"
                + " VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
//        stm.setInt(1, fabricante.getFAB_ID());
        stm.setString(1, fabricante.getFAB_NOME());
        stm.setInt(2, fabricante.getFAB_CNPJ());
        stm.setString(3, fabricante.getFAB_NATUREZAJURIDICA());
        stm.setString(4, fabricante.getFAB_PAISSEDE());
        stm.setString(5, fabricante.getFAB_NOMEVACINA());
        stm.execute();
        stm.close();
    }

    public void alterar(FabricanteModel fabricante) throws SQLException {
        String sql = "UPDATE FABRICANTE SET FAB_NOME = ?, FAB_CNPJ = ?, FAB_NATUREZAJURIDICA = ?, "
                + "FAB_PAISSEDE = ?, FAB_NOMEVACINA = ? WHERE FAB_ID = ?";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
        stm.setString(1, fabricante.getFAB_NOME());
        stm.setInt(2, fabricante.getFAB_CNPJ());
        stm.setString(3, fabricante.getFAB_NATUREZAJURIDICA());
        stm.setString(4, fabricante.getFAB_PAISSEDE());
        stm.setString(5, fabricante.getFAB_NOMEVACINA());
        stm.setInt(6, fabricante.getFAB_ID());
        stm.execute();
        stm.close();
    }

    public void excluir(FabricanteModel fabricante) throws SQLException {
        String sql = "DELETE FROM FABRICANTE WHERE FAB_ID = ?";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
        stm.setInt(1, fabricante.getFAB_ID());
        stm.execute();
        stm.close();
    }

    public ArrayList<FabricanteModel> consultar(String condicao) throws SQLException {
        ArrayList<FabricanteModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM FABRICANTE";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.getConexao().prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            FabricanteModel objfab = new FabricanteModel();
            objfab.setFAB_ID(rs.getInt("FAB_ID"));
            objfab.setFAB_NOME(rs.getString("FAB_NOME"));
            objfab.setFAB_CNPJ(rs.getInt("FAB_CNPJ"));
            objfab.setFAB_NATUREZAJURIDICA(rs.getString("FAB_NATUREZAJURIDICA"));
            objfab.setFAB_PAISSEDE(rs.getString("FAB_PAISSEDE"));
            objfab.setFAB_NOMEVACINA(rs.getString("FAB_NOMEVACINA"));
            lista.add(objfab);
        }
        rs.close();
        stm.close();
        return lista;
    }

    public List<FabricanteModel> listarFabricantesDao() {
        ArrayList<FabricanteModel> lista;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM FABRICANTE ORDER BY FAB_NOME";

        try {
            stm = conexao.getConexao().prepareStatement(sql);
            rs = stm.executeQuery();
            lista = new ArrayList<>();

            while (rs.next()) {
                FabricanteModel objfab = new FabricanteModel();
                objfab.setFAB_ID(rs.getInt("FAB_ID"));
                objfab.setFAB_NOME(rs.getString("FAB_NOME"));
                objfab.setFAB_CNPJ(rs.getInt("FAB_CNPJ"));
                objfab.setFAB_NATUREZAJURIDICA(rs.getString("FAB_NATUREZAJURIDICA"));
                objfab.setFAB_PAISSEDE(rs.getString("FAB_PAISSEDE"));
                objfab.setFAB_NOMEVACINA(rs.getString("FAB_NOMEVACINA"));
                lista.add(objfab);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);
            return null;
        }
    }

}
