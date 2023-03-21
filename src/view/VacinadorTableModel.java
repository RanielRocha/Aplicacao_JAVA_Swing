
package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.VacinadorModel;

public class VacinadorTableModel extends AbstractTableModel {

    private ArrayList<VacinadorModel> linhas;
    String[] colunas;

    public VacinadorTableModel(ArrayList<VacinadorModel> arrayvacinador, String[] colunas) {
        this.colunas = colunas;
        linhas = arrayvacinador;
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
        VacinadorModel vacinador = (VacinadorModel) linhas.get(row);
        switch (col) {
            case 0:
                return vacinador.getVAC_ID();
            case 1:
                return vacinador.getVAC_NOME();
            case 2:
                return vacinador.getVAC_CPF();
            case 3:
                return vacinador.getVAC_REGPROFISSIONAL();
            case 4:
                return vacinador.getVAC_CARGO();
            case 5:
                return vacinador.getVAC_FORMACAO();
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de VacinadorModel
    public void addLista(ArrayList<VacinadorModel> vacinador) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os vacinadores
        linhas.addAll(vacinador);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

}
