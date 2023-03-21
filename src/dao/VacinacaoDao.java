
package dao;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.FabricanteModel;
import model.PacienteModel;
import model.VacinacaoModel;
import model.VacinadorModel;

public class VacinacaoDao {

    private Conexao conexao = null;

    public VacinacaoDao() throws SQLException {
        conexao = new Conexao();

    }

    public void adicionar(VacinacaoModel vacinacao) throws SQLException {
        String sql = "INSERT INTO VACINACAO (VACINACAO_NOMEVACINA, VACINACAO_DOSE, VACINACAO_DATA, "
                + "VACINACAO_LOTE, VACINACAO_PACIENTE, VACINACAO_VACINADOR, VACINACAO_FABRICANTE)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
//        stm.setInt(1, vacinacao.getVACINACAO_ID());
        stm.setString(1, vacinacao.getVACINACAO_NOMEVACINA());
        stm.setString(2, vacinacao.getVACINACAO_DOSE());
        stm.setString(3, vacinacao.getVACINACAO_DATA());
        stm.setString(4, vacinacao.getVACINACAO_LOTE());
        stm.setString(5, vacinacao.getVACINACAO_PACIENTE());
        stm.setString(6, vacinacao.getVACINACAO_VACINADOR());
        stm.setString(7, vacinacao.getVACINACAO_FABRICANTE());
        stm.execute();
        stm.close();
    }

    public void alterar(VacinacaoModel vacinacao) throws SQLException {
        String sql = "UPDATE VACINACAO SET VACINACAO_NOMEVACINA = ?, VACINACAO_DOSE = ?, "
                + "VACINACAO_DATA = ?, VACINACAO_LOTE = ?, VACINACAO_PACIENTE = ?, "
                + "VACINACAO_VACINADOR = ?, VACINACAO_FABRICANTE = ? WHERE VACINACAO_ID = ?";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
        stm.setString(1, vacinacao.getVACINACAO_NOMEVACINA());
        stm.setString(2, vacinacao.getVACINACAO_DOSE());
        stm.setString(3, vacinacao.getVACINACAO_DATA());
        stm.setString(4, vacinacao.getVACINACAO_LOTE());
        stm.setString(5, vacinacao.getVACINACAO_PACIENTE());
        stm.setString(6, vacinacao.getVACINACAO_VACINADOR());
        stm.setString(7, vacinacao.getVACINACAO_FABRICANTE());
        stm.setInt(8, vacinacao.getVACINACAO_ID());
        stm.execute();
        stm.close();
    }

    public void excluir(VacinacaoModel vacinacao) throws SQLException {
        String sql = "DELETE FROM VACINACAO WHERE VACINACAO_ID = ?";
        PreparedStatement stm = conexao.getConexao().prepareStatement(sql);
        stm.setInt(1, vacinacao.getVACINACAO_ID());
        stm.execute();
        stm.close();
    }

    public ArrayList<VacinacaoModel> consultar(String condicao) throws SQLException {
        ArrayList<VacinacaoModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM VACINACAO";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.getConexao().prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            VacinacaoModel objvacinacao = new VacinacaoModel();
            objvacinacao.setVACINACAO_ID(rs.getInt("VACINACAO_ID"));
            objvacinacao.setVACINACAO_NOMEVACINA(rs.getString("VACINACAO_NOMEVACINA"));
            objvacinacao.setVACINACAO_DOSE(rs.getString("VACINACAO_DOSE"));
            objvacinacao.setVACINACAO_DATA(rs.getString("VACINACAO_DATA"));
            objvacinacao.setVACINACAO_LOTE(rs.getString("VACINACAO_LOTE"));
            objvacinacao.setVACINACAO_PACIENTE(rs.getString("VACINACAO_PACIENTE"));
            
//            PacienteModel pac = new PacienteModel();
//            pac.getPAC_NOME(objvacinacao.setVACINACAO_PACIENTE(rs.getString("VACINACAO_PACIENTE")));
//            VacinadorModel vac = new VacinadorModel();
//            FabricanteModel fab = new FabricanteModel();
            objvacinacao.setVACINACAO_VACINADOR(rs.getString("VACINACAO_VACINADOR"));
            objvacinacao.setVACINACAO_FABRICANTE(rs.getString("VACINACAO_FABRICANTE"));
            lista.add(objvacinacao);
        }
        rs.close();
        stm.close();
        return lista;
    }

}
