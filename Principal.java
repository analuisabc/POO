package AnaLuisaBCGiovanaVBPAbstract;

// Alunas:
// Ana Luísa de Bastos Chagas (202200491)
// Giovana Vilas Boas do Prado (202200514)

public class Principal {
    public static void main(String[] args) {
        Professor maria = new ProfessorUniversitario("Maria", 2, 3000);
        Professor jose = new ProfessorDaEducacaoBasica("Jose", 3, 2000);
        Aluno ana = new Aluno("Ana Luisa de Bastos Chagas", 202200491); //meu nome (Ana Luísa)
        Aluno giovana = new Aluno("Giovana Vilas Boas do Prado", 202200514); //nome Giovana (dupla)

        Estudante[] pessoasQueEstudam = new Estudante[4];
        pessoasQueEstudam[0] = maria;
        pessoasQueEstudam[1] = jose;
        pessoasQueEstudam[2] = ana; //nome do estudante
        pessoasQueEstudam[3] = giovana; //nome dupla

        System.out.println();
        for(Estudante estudante : pessoasQueEstudam){
            estudante.estudar();
        }

        Prova[] provasDaFaculdade = maria.elaborarProvas();
        Prova[] provasDaEducacaoBasica = jose.elaborarProvas();

        ana.fazerProva(provasDaFaculdade[0]);
        giovana.fazerProva(provasDaEducacaoBasica[0]);
        maria.corrigirProva(provasDaFaculdade[0]);
        jose.corrigirProva(provasDaEducacaoBasica[0]);

        System.out.println("\nAna tirou "+ provasDaFaculdade[0].getNota() + " na prova da Faculdade");
        System.out.println("Giovana tirou "+ provasDaEducacaoBasica[0].getNota() + " na prova da Educacao Basica");

        maria.receberSalario(maria.getNTurmas());
        jose.receberSalario(jose.getNTurmas());
    }
}