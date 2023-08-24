package iteracao;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class Array<T> implements Iterable<T> {
    T[] values;  // contém os elementos reais do array

 // Construtor que pega um array genérico e o armazena
    public Array(T[] values) {
        this.values = values;
    }

    // Esta é uma classe  que implementa iteração sobre os elementos
    // da lista. Não é acessado diretamente pelo usuário, mas é utilizado em
    // o método iterator() da classe Array. Ele implementa o hasNext ()
    // e métodos next().
    class ArrayIterator implements Iterator<T> {
        int current = 0;  // o elemento atual que estamos atribuíndo

        // retorna se há ou não mais elementos no array que
        // não foram iterados.
        public boolean hasNext() {
            if (current < Array.this.values.length) {
                return true;
            } else {
                return false;
            }
        }

     // retorna o próximo elemento da iteração e move o atual
     // índice para o elemento posterior.
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return values[current++];
        }
    }

    // Retorna o valor em um determinado índice
    public T get(int index) {
        return values[index];
    }

    // Define o valor em um determinado índice
    public void set(int index, T value) {
        values[index] = value;
    }

    // Retorna o comprimento do array
    public int length() {
        return values.length;
    }

     // Retorna um iterador sobre os elementos do array. 
    // Geralmente não é  chamado diretamente, 
    //mas é chamado pelo Java quando usado em um loop for.
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }
  
}
