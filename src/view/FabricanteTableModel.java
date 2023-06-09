
package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.FabricanteModel;

public class FabricanteTableModel extends AbstractTableModel {

    private ArrayList<FabricanteModel> linhas;
    String[] colunas;

    public FabricanteTableModel(ArrayList<FabricanteModel> arrayfabricante, String[] colunas) {
        this.colunas = colunas;
        linhas = arrayfabricante;
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
        FabricanteModel fabricante = (FabricanteModel) linhas.get(row);
        switch (col) {
            case 0:
                return fabricante.getFAB_ID();
            case 1:
                return fabricante.getFAB_NOME();
            case 2:
                return fabricante.getFAB_CNPJ();
            case 3:
                return fabricante.getFAB_NATUREZAJURIDICA();
            case 4:
                return fabricante.getFAB_PAISSEDE();
            case 5:
                return fabricante.getFAB_NOMEVACINA();
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de FabricanteModel
    public void addLista(ArrayList<FabricanteModel> fabricante) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os fabricantes
        linhas.addAll(fabricante);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

}
