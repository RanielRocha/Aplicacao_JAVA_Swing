
package controller;

import dao.VacinacaoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.VacinacaoModel;

public class VacinacaoController {

    private List<VacinacaoModel> listavacinacao;

    public ArrayList<VacinacaoModel> consultar(String filtro) throws SQLException {
        listavacinacao = new VacinacaoDao().consultar(filtro);
        return (ArrayList<VacinacaoModel>) listavacinacao;
    }

    public void excluir(VacinacaoModel vacinacao) throws SQLException {
        VacinacaoDao dao = new VacinacaoDao();
        dao.excluir(vacinacao);
    }

    public void adicionar(VacinacaoModel vacinacao) throws SQLException {
        VacinacaoDao dao = new VacinacaoDao();
        dao.adicionar(vacinacao);
    }

    public void alterar(VacinacaoModel vacinacao) throws SQLException {
        VacinacaoDao dao = new VacinacaoDao();
        dao.alterar(vacinacao);
    }

    public void gravar(String operacao, VacinacaoModel vacinacao) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(vacinacao);
        } else if (operacao.equals("alterar")) {
            alterar(vacinacao);
        }
    }

}
