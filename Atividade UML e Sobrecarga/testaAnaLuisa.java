package AnaLuisaBC;

public class testaAnaLuisa {
	 public static void main(String[] args) {
	        Pessoa a = new Pessoa("Lucas Nascimento", 2002, "lucas@outlook.com");
	        AnaLuisa g = new AnaLuisa("Ana Luisa", 2004, "analuisa@gmail.com", "404040");
	        Professor f = new Professor("Pedro Silva", 1971, "pedro@uni.com", "19964477");

	        a.mensagem();
	        g.mensagem();
	        g.mensagem(g.getIdentidade());
	        f.mensagem();
	        f.mensagem(f.getMatricula());
	 }
}
