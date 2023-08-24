package provaQ3;

public class Saude {
	int idade; double altura; double peso;

	//construtor
	public Saude(int idade, double altura,double peso) {
			this.idade = idade;
			this.altura = altura;
			this.peso = peso;
	}

	//calculo do imc
	public double calculaIMC() {
		return peso / (altura * altura);
	}
	
	//checagem do imc
	public String condiçãoFísica() {
		if ( calculaIMC() < 18.5 )
			return "Abaixo do peso adequado";
		else if ( calculaIMC() <= 24.9 )
			return "Peso adequado";
		
		return "Acima do peso adequado";
	}
}
