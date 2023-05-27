package AnaLuisaBC;

public class AnaLuisa extends Pessoa {
    private String identidade;

    public AnaLuisa(String analuisaNome, int ano_nascimento, String email, String identidade) {
        super(analuisaNome, ano_nascimento, email);
        this.setIdentidade(identidade);
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getanaluisaNome() {
        return super.getanaluisaNome();
    }
}