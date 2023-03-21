
package model;

public class VacinacaoModel {

    private int VACINACAO_ID;
    private String VACINACAO_NOMEVACINA;
    private String VACINACAO_DOSE;
    private String VACINACAO_DATA;
    private String VACINACAO_LOTE;
    private String VACINACAO_PACIENTE;
    private String VACINACAO_VACINADOR;
    private String VACINACAO_FABRICANTE;

    public VacinacaoModel() {

    }

    public VacinacaoModel(int VACINACAO_ID, String VACINACAO_NOMEVACINA, String VACINACAO_DOSE,
            String VACINACAO_DATA, String VACINACAO_LOTE, String VACINACAO_PACIENTE,
            String VACINACAO_VACINADOR, String VACINACAO_FABRICANTE) {
        this.VACINACAO_ID = VACINACAO_ID;
        this.VACINACAO_NOMEVACINA = VACINACAO_NOMEVACINA;
        this.VACINACAO_DOSE = VACINACAO_DOSE;
        this.VACINACAO_DATA = VACINACAO_DATA;
        this.VACINACAO_LOTE = VACINACAO_LOTE;
        this.VACINACAO_PACIENTE = VACINACAO_PACIENTE;
        this.VACINACAO_VACINADOR = VACINACAO_VACINADOR;
        this.VACINACAO_FABRICANTE = VACINACAO_FABRICANTE;
        
//                    PacienteModel pac = new PacienteModel();
//            VacinadorModel vac = new VacinadorModel();
//            FabricanteModel fab = new FabricanteModel();
    }

    public int getVACINACAO_ID() {
        return VACINACAO_ID;
    }

    public void setVACINACAO_ID(int VACINACAO_ID) {
        this.VACINACAO_ID = VACINACAO_ID;
    }

    public String getVACINACAO_NOMEVACINA() {
        return VACINACAO_NOMEVACINA;
    }

    public void setVACINACAO_NOMEVACINA(String VACINACAO_NOMEVACINA) {
        this.VACINACAO_NOMEVACINA = VACINACAO_NOMEVACINA;
    }

    public String getVACINACAO_DOSE() {
        return VACINACAO_DOSE;
    }

    public void setVACINACAO_DOSE(String VACINACAO_DOSE) {
        this.VACINACAO_DOSE = VACINACAO_DOSE;
    }

    public String getVACINACAO_DATA() {
        return VACINACAO_DATA;
    }

    public void setVACINACAO_DATA(String VACINACAO_DATA) {
        this.VACINACAO_DATA = VACINACAO_DATA;
    }

    public String getVACINACAO_LOTE() {
        return VACINACAO_LOTE;
    }

    public void setVACINACAO_LOTE(String VACINACAO_LOTE) {
        this.VACINACAO_LOTE = VACINACAO_LOTE;
    }

    public String getVACINACAO_PACIENTE() {
        return VACINACAO_PACIENTE;
    }

    public void setVACINACAO_PACIENTE(String VACINACAO_PACIENTE) {
        this.VACINACAO_PACIENTE = VACINACAO_PACIENTE;
    }

    public String getVACINACAO_VACINADOR() {
        return VACINACAO_VACINADOR;
    }

    public void setVACINACAO_VACINADOR(String VACINACAO_VACINADOR) {
        this.VACINACAO_VACINADOR = VACINACAO_VACINADOR;
    }

    public String getVACINACAO_FABRICANTE() {
        return VACINACAO_FABRICANTE;
    }

    public void setVACINACAO_FABRICANTE(String VACINACAO_FABRICANTE) {
        this.VACINACAO_FABRICANTE = VACINACAO_FABRICANTE;
    }

}
