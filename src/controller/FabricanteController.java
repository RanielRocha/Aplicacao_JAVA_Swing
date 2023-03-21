
package controller;

import dao.FabricanteDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.FabricanteModel;

public class FabricanteController {

    private List<FabricanteModel> listafabricantes;

    public ArrayList<FabricanteModel> consultar(String filtro) throws SQLException {
        listafabricantes = new FabricanteDao().consultar(filtro);
        return (ArrayList<FabricanteModel>) listafabricantes;
    }

    public void excluir(FabricanteModel fabricante) throws SQLException {
        FabricanteDao dao = new FabricanteDao();
        dao.excluir(fabricante);
    }

    public void adicionar(FabricanteModel fabricante) throws SQLException {
        FabricanteDao dao = new FabricanteDao();
        dao.adicionar(fabricante);
    }

    public void alterar(FabricanteModel fabricante) throws SQLException {
        FabricanteDao dao = new FabricanteDao();
        dao.alterar(fabricante);
    }

    public void gravar(String operacao, FabricanteModel fabricante) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(fabricante);
        } else if (operacao.equals("alterar")) {
            alterar(fabricante);
        }
    }

}
