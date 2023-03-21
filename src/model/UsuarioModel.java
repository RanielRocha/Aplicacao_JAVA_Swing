
package model;

public class UsuarioModel {

    private int USU_ID;
    private String USU_NOME;
    private int USU_CPF;
    private String USU_CARGO;
    private String USU_LOGIN;
    private int USU_ATIVO;
    private String USU_SENHA;

    public UsuarioModel() {

    }

    public UsuarioModel(int USU_ID, String USU_NOME, int USU_CPF, String USU_CARGO,
            String USU_LOGIN, int USU_ATIVO, String USU_SENHA) {
        this.USU_ID = USU_ID;
        this.USU_NOME = USU_NOME;
        this.USU_CPF = USU_CPF;
        this.USU_CARGO = USU_CARGO;
        this.USU_LOGIN = USU_LOGIN;
        this.USU_ATIVO = USU_ATIVO;
        this.USU_SENHA = USU_SENHA;
    }

    public int getUSU_ID() {
        return USU_ID;
    }

    public void setUSU_ID(int USU_ID) {
        this.USU_ID = USU_ID;
    }

    public String getUSU_NOME() {
        return USU_NOME;
    }

    public void setUSU_NOME(String USU_NOME) {
        this.USU_NOME = USU_NOME;
    }

    public int getUSU_CPF() {
        return USU_CPF;
    }

    public void setUSU_CPF(int USU_CPF) {
        this.USU_CPF = USU_CPF;
    }

    public String getUSU_CARGO() {
        return USU_CARGO;
    }

    public void setUSU_CARGO(String USU_CARGO) {
        this.USU_CARGO = USU_CARGO;
    }

    public String getUSU_LOGIN() {
        return USU_LOGIN;
    }

    public void setUSU_LOGIN(String USU_LOGIN) {
        this.USU_LOGIN = USU_LOGIN;
    }

    public int getUSU_ATIVO() {
        return USU_ATIVO;
    }

    public void setUSU_ATIVO(int USU_ATIVO) {
        this.USU_ATIVO = USU_ATIVO;
    }

    public String getUSU_SENHA() {
        return USU_SENHA;
    }

    public void setUSU_SENHA(String USU_SENHA) {
        this.USU_SENHA = USU_SENHA;
    }

}
