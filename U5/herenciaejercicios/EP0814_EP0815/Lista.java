package herenciaejercicios.EP0814_EP0815;
import java.util.Arrays;

public class Lista {
    public Integer[] elementos;

    public Lista() { // Constructor que inicializa la tabla con un tamaño 0
        elementos = new Integer[0];
    }

    public int length() { // Método que devuelve el número de elementos de la lista.
        return elementos.length;
    }

    public void insertarFinal(Integer e) { // Método que introduce un número al final de la lista.
        elementos = Arrays.copyOf(elementos, elementos.length + 1); // ASÍ SE INCREMENTA EL TAMAÑO DE UN ARRAY.
        elementos[elementos.length - 1] = e;
    }

    public void insertarInicio(Integer e) { // Método que introduce un número al inicio de la lista.
        Integer[] aux = new Integer[elementos.length + 1];
        System.arraycopy(elementos, 0, aux, 1, elementos.length);
        aux[0] = e;
        elementos = aux;
    }

    public void insertarEn(Integer e, int i) { // Insertar un número cuyo índice se pasa como parámetro.
        Integer[] aux = Arrays.copyOf(elementos, elementos.length + 1);
        aux[i] = e;
        System.arraycopy(elementos, i, aux, i + 1, elementos.length - i);
        elementos = aux;
    }

    public void insertarFinal(Lista l) {
        elementos = Arrays.copyOf(elementos, elementos.length + l.length());
        // lista de origen //pos. origen //destino //posicion destino //longitud
        System.arraycopy(l.elementos, 0, elementos, elementos.length - l.length(), l.length());

    }

    public Integer eliminarEn(int i) {
        Integer e = null;

        if (i >= 0 && i < elementos.length) {
            e = elementos[i];
            Integer[] aux = Arrays.copyOf(elementos, elementos.length - 1);
            System.arraycopy(elementos, i + 1, aux, i, elementos.length - i - 1);
            elementos = aux;
        }

        return e;
    }

    public Integer valorEn(int i) {
        return (i >= 0 && i < elementos.length) ? elementos[i] : null;
        // si i es mayor o igual que 0 y menor que la longitud de elementos devuelve
        // el núm de la posición i, si no null
    }

    public int buscar(Integer e) {
        int i = 0;
        int pos = -1;
        while (i < elementos.length && pos == -1)
            if (elementos[i] == e) {
                pos = i;
                i++;
            }
        return pos;
    }

    @Override
    public String toString() {
        return "Lista [elementos=" + Arrays.toString(elementos) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Lista otraLista = (Lista) obj;
        if (!Arrays.equals(elementos, otraLista.elementos))
            return false;
        return true;
    }

    public Lista concatena(Lista l1, Lista l2) {
        Lista lR = new Lista();
        Integer[] aux = Arrays.copyOf(l1.elementos, l1.length());
        System.arraycopy(l2.elementos, 0, aux, aux.length - l2.length(), l2.length());
        lR.elementos = aux;
        return lR;

    }
}
