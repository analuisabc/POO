package AnaLuisaBC;

public class Pessoa {
    private String analuisaNome;
    private int ano_nascimento;
    private String email;

    public Pessoa() {
        this.analuisaNome = "Nome Padrão";
        this.ano_nascimento = 2000;
        this.email = "email@dominio.com";
    }

    public Pessoa(String analuisaNome, int ano_nascimento, String email) {
        this.analuisaNome = analuisaNome;
        this.ano_nascimento = ano_nascimento;
        this.email = email;
    }

    public String getanaluisaNome() {
        return analuisaNome;
    }

    public void setanaluisaNome(String analuisaNome) {
        this.analuisaNome = analuisaNome;
    }

    public int getAnoNascimento() {
        return ano_nascimento;
    }

    public void setAnoNascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void mensagem() {
        System.out.println("\n");
        System.out.println(this.getClass());
        System.out.println("Nome: " + this.getanaluisaNome());
        System.out.println("Ano de Nascimento: " + this.getAnoNascimento());
        System.out.println("Email: " + this.getEmail());
    }

    public void mensagem(String msg) {
        System.out.println(msg);
    }
}