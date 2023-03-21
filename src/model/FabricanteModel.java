
package model;

public class FabricanteModel {

    private int FAB_ID;
    private String FAB_NOME;
    private int FAB_CNPJ;
    private String FAB_NATUREZAJURIDICA;
    private String FAB_PAISSEDE;
    private String FAB_NOMEVACINA;

    public FabricanteModel() {

    }

    public FabricanteModel(int FAB_ID, String FAB_NOME, int FAB_CNPJ, String FAB_NATUREZAJURIDICA,
            String FAB_PAISSEDE, String FAB_NOMEVACINA) {
        this.FAB_ID = FAB_ID;
        this.FAB_NOME = FAB_NOME;
        this.FAB_CNPJ = FAB_CNPJ;
        this.FAB_NATUREZAJURIDICA = FAB_NATUREZAJURIDICA;
        this.FAB_PAISSEDE = FAB_PAISSEDE;
        this.FAB_NOMEVACINA = FAB_NOMEVACINA;
    }

    public int getFAB_ID() {
        return FAB_ID;
    }

    public void setFAB_ID(int FAB_ID) {
        this.FAB_ID = FAB_ID;
    }

    public String getFAB_NOME() {
        return FAB_NOME;
    }

    public void setFAB_NOME(String FAB_NOME) {
        this.FAB_NOME = FAB_NOME;
    }

    public int getFAB_CNPJ() {
        return FAB_CNPJ;
    }

    public void setFAB_CNPJ(int FAB_CNPJ) {
        this.FAB_CNPJ = FAB_CNPJ;
    }

    public String getFAB_NATUREZAJURIDICA() {
        return FAB_NATUREZAJURIDICA;
    }

    public void setFAB_NATUREZAJURIDICA(String FAB_NATUREZAJURIDICA) {
        this.FAB_NATUREZAJURIDICA = FAB_NATUREZAJURIDICA;
    }

    public String getFAB_PAISSEDE() {
        return FAB_PAISSEDE;
    }

    public void setFAB_PAISSEDE(String FAB_PAISSEDE) {
        this.FAB_PAISSEDE = FAB_PAISSEDE;
    }

    public String getFAB_NOMEVACINA() {
        return FAB_NOMEVACINA;
    }

    public void setFAB_NOMEVACINA(String FAB_NOMEVACINA) {
        this.FAB_NOMEVACINA = FAB_NOMEVACINA;
    }

    @Override
    public String toString() {
        return this.getFAB_NOME();
    }

}
