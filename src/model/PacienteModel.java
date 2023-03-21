
package model;

public class PacienteModel {

    private int PAC_ID;
    private String PAC_NOME;
    private String PAC_NOMEMAE;
    private String PAC_NOMEPAI;
    private int PAC_CPF;
    private String PAC_DATANASCIMENTO;
    private int PAC_IDADE;
    private String PAC_ENDERECO;
    private int PAC_CARTAOSUS;

    public PacienteModel() {

    }

    public PacienteModel(int PAC_ID, String PAC_NOME, String PAC_NOMEMAE, String PAC_NOMEPAI, int PAC_CPF,
            String PAC_DATANASCIMENTO, int PAC_IDADE, String PAC_ENDERECO, int PAC_CARTAOSUS) {
        this.PAC_ID = PAC_ID;
        this.PAC_NOME = PAC_NOME;
        this.PAC_NOMEMAE = PAC_NOMEMAE;
        this.PAC_NOMEPAI = PAC_NOMEPAI;
        this.PAC_CPF = PAC_CPF;
        this.PAC_DATANASCIMENTO = PAC_DATANASCIMENTO;
        this.PAC_IDADE = PAC_IDADE;
        this.PAC_ENDERECO = PAC_ENDERECO;
        this.PAC_CARTAOSUS = PAC_CARTAOSUS;
    }

    public int getPAC_ID() {
        return PAC_ID;
    }

    public void setPAC_ID(int PAC_ID) {
        this.PAC_ID = PAC_ID;
    }

    public String getPAC_NOME() {
        return PAC_NOME;
    }

    public void setPAC_NOME(String PAC_NOME) {
        this.PAC_NOME = PAC_NOME;
    }

    public String getPAC_NOMEMAE() {
        return PAC_NOMEMAE;
    }

    public void setPAC_NOMEMAE(String PAC_NOMEMAE) {
        this.PAC_NOMEMAE = PAC_NOMEMAE;
    }

    public String getPAC_NOMEPAI() {
        return PAC_NOMEPAI;
    }

    public void setPAC_NOMEPAI(String PAC_NOMEPAI) {
        this.PAC_NOMEPAI = PAC_NOMEPAI;
    }

    public int getPAC_CPF() {
        return PAC_CPF;
    }

    public void setPAC_CPF(int PAC_CPF) {
        this.PAC_CPF = PAC_CPF;
    }

    public String getPAC_DATANASCIMENTO() {
        return PAC_DATANASCIMENTO;
    }

    public void setPAC_DATANASCIMENTO(String PAC_DATANASCIMENTO) {
        this.PAC_DATANASCIMENTO = PAC_DATANASCIMENTO;
    }

    public int getPAC_IDADE() {
        return PAC_IDADE;
    }

    public void setPAC_IDADE(int PAC_IDADE) {
        this.PAC_IDADE = PAC_IDADE;
    }

    public String getPAC_ENDERECO() {
        return PAC_ENDERECO;
    }

    public void setPAC_ENDERECO(String PAC_ENDERECO) {
        this.PAC_ENDERECO = PAC_ENDERECO;
    }

    public int getPAC_CARTAOSUS() {
        return PAC_CARTAOSUS;
    }

    public void setPAC_CARTAOSUS(int PAC_CARTAOSUS) {
        this.PAC_CARTAOSUS = PAC_CARTAOSUS;
    }

    @Override
    public String toString() {
        return this.getPAC_NOME();
    }

}
