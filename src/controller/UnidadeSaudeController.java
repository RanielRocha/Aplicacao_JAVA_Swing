
package controller;

import dao.UnidadeSaudeDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.UnidadeSaudeModel;

public class UnidadeSaudeController {

    private List<UnidadeSaudeModel> listaunidadeSaude;

    public ArrayList<UnidadeSaudeModel> consultar(String filtro) throws SQLException {
        listaunidadeSaude = new UnidadeSaudeDao().consultar(filtro);
        return (ArrayList<UnidadeSaudeModel>) listaunidadeSaude;
    }

    public void excluir(UnidadeSaudeModel unidadeSaude) throws SQLException {
        UnidadeSaudeDao dao = new UnidadeSaudeDao();
        dao.excluir(unidadeSaude);
    }

    public void adicionar(UnidadeSaudeModel unidadeSaude) throws SQLException {
        UnidadeSaudeDao dao = new UnidadeSaudeDao();
        dao.adicionar(unidadeSaude);
    }

    public void alterar(UnidadeSaudeModel unidadeSaude) throws SQLException {
        UnidadeSaudeDao dao = new UnidadeSaudeDao();
        dao.alterar(unidadeSaude);
    }

    public void gravar(String operacao, UnidadeSaudeModel unidadeSaude) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(unidadeSaude);
        } else if (operacao.equals("alterar")) {
            alterar(unidadeSaude);
        }
    }

}
