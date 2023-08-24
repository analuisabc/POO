package AnaLuisaBCGiovanaVBPAbstract;

// Alunas:
// Ana Luísa de Bastos Chagas (202200491)
// Giovana Vilas Boas do Prado (202200514)
public class Prova {
    private String[] questoes;
    private String[] respostas;
    private double nota = 0;

    public Prova(String[] questoes){
        this.questoes = questoes;
    }

    public String[] getQuestoes(){
        return questoes;
    }
    public void setQuestoes(String[] questoes){
        this.questoes = questoes;
    }

    public String[] getRespostas(){
        return respostas;
    }
    public void setRespostas(String[] respostas){
        this.respostas = respostas;
    }

    public double getNota(){
        return nota;
    }
    public void setNota(double nota){
        this.nota = nota;
    }
}