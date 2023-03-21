
package model;

public class VacinadorModel {

    private int VAC_ID;
    private String VAC_NOME;
    private int VAC_CPF;
    private int VAC_REGPROFISSIONAL;
    private String VAC_CARGO;
    private String VAC_FORMACAO;

    public VacinadorModel() {

    }

    public VacinadorModel(int VAC_ID, String VAC_NOME, int VAC_CPF, int VAC_REGPROFISSIONAL,
            String VAC_CARGO, String VAC_FORMACAO) {
        this.VAC_ID = VAC_ID;
        this.VAC_NOME = VAC_NOME;
        this.VAC_CPF = VAC_CPF;
        this.VAC_REGPROFISSIONAL = VAC_REGPROFISSIONAL;
        this.VAC_CARGO = VAC_CARGO;
        this.VAC_FORMACAO = VAC_FORMACAO;
    }

    public int getVAC_ID() {
        return VAC_ID;
    }

    public void setVAC_ID(int VAC_ID) {
        this.VAC_ID = VAC_ID;
    }

    public String getVAC_NOME() {
        return VAC_NOME;
    }

    public void setVAC_NOME(String VAC_NOME) {
        this.VAC_NOME = VAC_NOME;
    }

    public int getVAC_CPF() {
        return VAC_CPF;
    }

    public void setVAC_CPF(int VAC_CPF) {
        this.VAC_CPF = VAC_CPF;
    }

    public int getVAC_REGPROFISSIONAL() {
        return VAC_REGPROFISSIONAL;
    }

    public void setVAC_REGPROFISSIONAL(int VAC_REGPROFISSIONAL) {
        this.VAC_REGPROFISSIONAL = VAC_REGPROFISSIONAL;
    }

    public String getVAC_CARGO() {
        return VAC_CARGO;
    }

    public void setVAC_CARGO(String VAC_CARGO) {
        this.VAC_CARGO = VAC_CARGO;
    }

    public String getVAC_FORMACAO() {
        return VAC_FORMACAO;
    }

    public void setVAC_FORMACAO(String VAC_FORMACAO) {
        this.VAC_FORMACAO = VAC_FORMACAO;
    }

    @Override
    public String toString() {
        return this.getVAC_NOME();
    }

}
