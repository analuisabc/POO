package AnaLuisaBCGiovanaVBPAbstract;

// Alunas:
// Ana Luísa de Bastos Chagas (202200491)
// Giovana Vilas Boas do Prado (202200514)
public abstract class Professor implements FuncionarioAssalariado, Estudante{
    private String nome;
    private int nTurmas;
    private double salario;

    public Professor(String nome, int nTurmas, double salario){
        this.nome = nome;
        this.nTurmas = nTurmas;
        this.salario = salario;
    }

    public int getNTurmas(){
        return nTurmas;
    }
    public void setNTurmas(int nTurmas){
        this.nTurmas = nTurmas;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void receberSalario(int nTurmas){
        System.out.println("\nNome: "+ nome +"     Salario base: "+ salario +"     Numero de Turmas: "+ nTurmas);
        salario += (nTurmas * salario * 0.05);
        System.out.println("Salario recebido: "+ salario);
        
    }

    public void estudar(){
        System.out.println("O(A) professor(a) "+ nome +" estuda");
    }

    public Prova[] elaborarProvas(){
        Prova[] provas = new Prova[0];
        return provas;
    }

    public double corrigirProva(Prova p){
        int nquestoes;
        double nota = p.getNota();   
        String[] questoes = p.getQuestoes();
        String[] respostas = p.getRespostas();

        nquestoes = questoes.length;

        for(int i = 0; i < nquestoes; i++){
            if(respostas[i].equals("R"+(i+1))){
                nota += 10.0;
            }
        }
        nota /= nquestoes; //media
        p.setNota(nota);
        
        return nota;
    }
}

