
package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.VacinacaoModel;

public class VacinacaoTableModel extends AbstractTableModel {

    private ArrayList<VacinacaoModel> linhas;
    String[] colunas;

    public VacinacaoTableModel(ArrayList<VacinacaoModel> arrayvacinacao, String[] colunas) {
        this.colunas = colunas;
        linhas = arrayvacinacao;
    }

    //Retorna a quantidade de colunas do modelo, que no caso será fixa
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    //Retorna a quantidade de linhas atual do objeto, que no caso é o tamanho da lista
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    //Retorna o nome da coluna, recebendo seu índice
    @Override
    public String getColumnName(int indiceColuna) {
        return colunas[indiceColuna];
    }

    @Override
    public Object getValueAt(int row, int col) {
        VacinacaoModel vacinacao = (VacinacaoModel) linhas.get(row);
        switch (col) {
            case 0:
                return vacinacao.getVACINACAO_ID();
            case 1:
                return vacinacao.getVACINACAO_NOMEVACINA();
            case 2:
                return vacinacao.getVACINACAO_DOSE();
            case 3:
                return vacinacao.getVACINACAO_DATA();
            case 4:
                return vacinacao.getVACINACAO_LOTE();
            case 5:
                return vacinacao.getVACINACAO_PACIENTE();
            case 6:
                return vacinacao.getVACINACAO_VACINADOR();
            case 7:
                return vacinacao.getVACINACAO_FABRICANTE();
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de VacinacaoModel
    public void addLista(ArrayList<VacinacaoModel> vacinacao) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os vacinação
        linhas.addAll(vacinacao);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

}
