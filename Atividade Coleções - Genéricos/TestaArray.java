package iteracao;

//PARTICIPANTES
//Ana Luísa de Bastos Chagas
//Pedro Lemes Sixel Lobo
//Guilherme Tavares Monteiro
//Rian Rebouças Brito Pires Santana
//Giordana Farias Franco Bueno Bucci

import java.util.Iterator;

public class TestaArray {
    public static void main(String[] args) {
        // Criando um array de strings
        String[] nomes = {"Estudante1", "Estudante2", "Guilherme Tavares Monteiro", "Rian Rebouças Brito Pires Santana", "Giordana Farias Franco Bueno Bucci"};

        //Criando um novo array para conter novas strings
        Array<String> array = new Array<>(nomes);

        //Definir o segundo valor usando o método set para o nome do estudante
        array.set(1, "Ana Luísa de Bastos Chagas");

        String novonome = "Pedro Lemes Sixel Lobo";
        
        array.set(0, novonome); //uso de metodo set
        novonome = array.get(0); //uso de metodo get

        //Usar iterator sobre array para imprimi-lo
        Iterator<String> iterator = array.iterator();
        while (iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println(nome);
        }

    }
}
