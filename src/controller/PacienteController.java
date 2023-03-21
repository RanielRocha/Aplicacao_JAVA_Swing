
package controller;

import dao.PacienteDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.PacienteModel;

public class PacienteController {

    private List<PacienteModel> listapacientes;

    public ArrayList<PacienteModel> consultar(String filtro) throws SQLException {
        listapacientes = new PacienteDao().consultar(filtro);
        return (ArrayList<PacienteModel>) listapacientes;
    }

    public void excluir(PacienteModel paciente) throws SQLException {
        PacienteDao dao = new PacienteDao();
        dao.excluir(paciente);
    }

    public void adicionar(PacienteModel paciente) throws SQLException {
        PacienteDao dao = new PacienteDao();
        dao.adicionar(paciente);
    }

    public void alterar(PacienteModel paciente) throws SQLException {
        PacienteDao dao = new PacienteDao();
        dao.alterar(paciente);
    }

    public void gravar(String operacao, PacienteModel paciente) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(paciente);
        } else if (operacao.equals("alterar")) {
            alterar(paciente);
        }
    }

}
