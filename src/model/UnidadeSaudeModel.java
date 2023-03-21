
package model;

public class UnidadeSaudeModel {

    private int UBS_ID;
    private String UBS_NOME;
    private int UBS_CNES;
    private int UBS_ATENDESUS;
    private String UBS_ESTADO;
    private String UBS_MUNICIPIO;
    private String UBS_GESTAO;
    private String UBS_NATUREZA;

    public UnidadeSaudeModel() {

    }

    public UnidadeSaudeModel(int UBS_ID, String UBS_NOME, int UBS_CNES, int UBS_ATENDESUS, String UBS_ESTADO,
            String UBS_MUNICIPIO, String UBS_GESTAO, String UBS_NATUREZA) {
        this.UBS_ID = UBS_ID;
        this.UBS_NOME = UBS_NOME;
        this.UBS_CNES = UBS_CNES;
        this.UBS_ATENDESUS = UBS_ATENDESUS;
        this.UBS_ESTADO = UBS_ESTADO;
        this.UBS_MUNICIPIO = UBS_MUNICIPIO;
        this.UBS_GESTAO = UBS_GESTAO;
        this.UBS_NATUREZA = UBS_NATUREZA;
    }

    public int getUBS_ID() {
        return UBS_ID;
    }

    public void setUBS_ID(int UBS_ID) {
        this.UBS_ID = UBS_ID;
    }

    public String getUBS_NOME() {
        return UBS_NOME;
    }

    public void setUBS_NOME(String UBS_NOME) {
        this.UBS_NOME = UBS_NOME;
    }

    public int getUBS_CNES() {
        return UBS_CNES;
    }

    public void setUBS_CNES(int UBS_CNES) {
        this.UBS_CNES = UBS_CNES;
    }

    public int getUBS_ATENDESUS() {
        return UBS_ATENDESUS;
    }

    public void setUBS_ATENDESUS(int UBS_ATENDESUS) {
        this.UBS_ATENDESUS = UBS_ATENDESUS;
    }

    public String getUBS_ESTADO() {
        return UBS_ESTADO;
    }

    public void setUBS_ESTADO(String UBS_ESTADO) {
        this.UBS_ESTADO = UBS_ESTADO;
    }

    public String getUBS_MUNICIPIO() {
        return UBS_MUNICIPIO;
    }

    public void setUBS_MUNICIPIO(String UBS_MUNICIPIO) {
        this.UBS_MUNICIPIO = UBS_MUNICIPIO;
    }

    public String getUBS_GESTAO() {
        return UBS_GESTAO;
    }

    public void setUBS_GESTAO(String UBS_GESTAO) {
        this.UBS_GESTAO = UBS_GESTAO;
    }

    public String getUBS_NATUREZA() {
        return UBS_NATUREZA;
    }

    public void setUBS_NATUREZA(String UBS_NATUREZA) {
        this.UBS_NATUREZA = UBS_NATUREZA;
    }

}
