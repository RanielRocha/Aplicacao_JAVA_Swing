
package controller;

import dao.VacinadorDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.VacinadorModel;

public class VacinadorController {

    private List<VacinadorModel> listavacinadores;

    public ArrayList<VacinadorModel> consultar(String filtro) throws SQLException {
        listavacinadores = new VacinadorDao().consultar(filtro);
        return (ArrayList<VacinadorModel>) listavacinadores;
    }

    public void excluir(VacinadorModel vacinador) throws SQLException {
        VacinadorDao dao = new VacinadorDao();
        dao.excluir(vacinador);
    }

    public void adicionar(VacinadorModel vacinador) throws SQLException {
        VacinadorDao dao = new VacinadorDao();
        dao.adicionar(vacinador);
    }

    public void alterar(VacinadorModel vacinador) throws SQLException {
        VacinadorDao dao = new VacinadorDao();
        dao.alterar(vacinador);
    }

    public void gravar(String operacao, VacinadorModel vacinador) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(vacinador);
        } else if (operacao.equals("alterar")) {
            alterar(vacinador);
        }
    }

}
