
package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.UnidadeSaudeModel;

public class UnidadeSaudeTableModel extends AbstractTableModel {

    private ArrayList<UnidadeSaudeModel> linhas;
    String[] colunas;

    public UnidadeSaudeTableModel(ArrayList<UnidadeSaudeModel> arrayunidadeSaude, String[] colunas) {
        this.colunas = colunas;
        linhas = arrayunidadeSaude;
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
        UnidadeSaudeModel unidadeSaude = (UnidadeSaudeModel) linhas.get(row);
        switch (col) {
            case 0:
                return unidadeSaude.getUBS_ID();
            case 1:
                return unidadeSaude.getUBS_NOME();
            case 2:
                return unidadeSaude.getUBS_CNES();
            case 3:
                return unidadeSaude.getUBS_ATENDESUS();
            case 4:
                return unidadeSaude.getUBS_ESTADO();
            case 5:
                return unidadeSaude.getUBS_MUNICIPIO();
            case 6:
                return unidadeSaude.getUBS_GESTAO();
            case 7:
                return unidadeSaude.getUBS_NATUREZA();
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UnidadeSaudeModel
    public void addLista(ArrayList<UnidadeSaudeModel> unidadeSaude) {
        int tamanhoAntigo = getRowCount();

        //Adiciona as unidades de saúde
        linhas.addAll(unidadeSaude);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

}
