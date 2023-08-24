package AnaLuisaBCGiovanaVBPAbstract;

// Alunas:
// Ana Luísa de Bastos Chagas (202200491)
// Giovana Vilas Boas do Prado (202200514)
public class ProfessorUniversitario extends Professor{
    public ProfessorUniversitario(String nome, int nTurmas, double salario) {
        super(nome, nTurmas, salario);
    }

    public Prova[] elaborarProvas(){
        Prova[] provas = new Prova[3]; //3 provas a serem elaboradas

        for(int i = 0; i < 3; i++){
            String questoes[] = new String[2]; //criar as questoes
            
            for(int j = 0; j < 2; j++){ //2 questoes
                questoes[j] = "P"+(i+1)+"Q"+(j+1); // P1Q1, P1Q2, P2Q1, P2Q2...
            }
            Prova prova = new Prova(questoes);
            provas[i] = prova;
        }

        return provas;
    }
}