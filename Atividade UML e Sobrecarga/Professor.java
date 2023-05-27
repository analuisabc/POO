package AnaLuisaBC;

public class Professor extends Pessoa {
    private String matricula;

    public Professor(String nome, int ano_nascimento, String email, String matricula) {
        super(nome, ano_nascimento, email);
        this.setMatricula(matricula);

    }

    protected String getMatricula() {
        return matricula;
    }

    protected void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAnaLuisaBC() {
        return this.getanaluisaNome();
    }
}