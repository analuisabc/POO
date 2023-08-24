package AnaLuisaBCGiovanaVBPAbstract;

// Alunas:
// Ana Luísa de Bastos Chagas (202200491)
// Giovana Vilas Boas do Prado (202200514)
public class Aluno implements Estudante{
    private String nome;
    private int nMatricula;

    public Aluno(String nome, int nMatricula){
        this.nome = nome;
        this.nMatricula = nMatricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return nMatricula;
    }
    public void setMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    public void estudar(){
        System.out.println(nome +" esta estudando");
    }
    
    public void fazerProva(Prova prova){
        int tam = prova.getQuestoes().length; //tamanho do vetor de questoes
        String[] respostas = new String[tam]; //nmero de respostas = numero de questões

        for(int i = 0; i < tam; i++){
            respostas[i] = "R"+(i+1);
        }
        prova.setRespostas(respostas);
    }
}