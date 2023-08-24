package AnaLuisaBCGiovanaVBPAbstract;

// Alunas:
// Ana Luísa de Bastos Chagas (202200491)
// Giovana Vilas Boas do Prado (202200514)
public class ProfessorDaEducacaoBasica extends Professor{
    public ProfessorDaEducacaoBasica(String nome, int nTurmas, double salario) {
        super(nome, nTurmas, salario);
    }

    public Prova[] elaborarProvas(){
        Prova[] provas = new Prova[4]; //criar 4 provas

        for(int i = 0; i < 4; i++){
            String questoes[] = new String[5]; //5 questoes por prova
            
            for(int j = 0; j < 5; j++){ //5 questoes
                questoes[j] = "P"+(i+1)+"Q"+(j+1); // P1Q1, P1Q2, P1Q3, P1Q4...
            }
            Prova prova = new Prova(questoes);
            provas[i] = prova;
        }
        return provas;
    }
}