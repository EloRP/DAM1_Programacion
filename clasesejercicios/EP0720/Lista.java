package clasesejercicios.EP0720;
import java.util.Arrays;
/* EP0720. Repite la Actividad EP0718, usando una Lista para guardar los elementos encolados. */
public class Lista {
    private Integer[] elementos;
    public Lista() {
        elementos = new Integer[0];
    }
    public int numElementos() {
        return elementos.length;
    }
    public void addFin(Integer num) {
        elementos = Arrays.copyOf(elementos, elementos.length + 1);
        elementos[elementos.length - 1] = num;
    }
    public void addPrincipio(Integer num) {
        Integer[] aux = new Integer[elementos.length + 1];
        System.arraycopy(elementos, 0, aux, 1, elementos.length);
        aux[0] = num;
        elementos = aux;
    }
    public void addNum(Integer num, int posicion) {
        Integer[] aux = Arrays.copyOf(elementos, elementos.length + 1);
        System.arraycopy(elementos, posicion, aux, posicion + 1, elementos.length - posicion);
        aux[posicion] = num;
        elementos = aux;
    }
    public void juntarLista(Lista l){
        Integer[] aux = Arrays.copyOf(this.elementos, this.elementos.length + l.elementos.length);
        System.arraycopy(l.elementos, 0, aux, this.elementos.length, l.elementos.length);
        this.elementos = aux;
    }
    public Integer eliminarEnLista(int pos) {
        Integer e = null;
        if (pos <= elementos.length && pos >= 0) {
            elementos[pos] = elementos[elementos.length - 1];
            e = elementos[pos];
            elementos = Arrays.copyOf(elementos, elementos.length - 1);
        }
        return e;
    }
    public Integer obtenerValor(int pos) {
        return elementos[pos];
    }
    public int buscarValorEnLista(int valor) {
        int pos = -1, i = 0;
        while (i < elementos.length && pos == -1) {
            if (elementos[i] == valor) {
                pos = i;
            }
            i++;
        }
        return pos;
    }
    public void mostrar() {
        System.out.println(Arrays.toString(elementos));
    }
    public static Lista concatena(Lista l1, Lista l2) {
        Integer[] aux = Arrays.copyOf(l1.elementos, l1.elementos.length + l2.elementos.length);
        System.arraycopy(l2.elementos, 0, aux, l1.elementos.length, l2.elementos.length);
        l1.elementos = aux;
        return l1;
    }
    public static void main(String[] args) {
        Lista lista1 = new Lista();

        lista1.addPrincipio(12);
        lista1.mostrar();

        lista1.addPrincipio(11);
        lista1.mostrar();

        lista1.addNum(10, 1);
        lista1.mostrar();

        Lista lista2 = new Lista();
        lista2.addFin(15);
        lista1.juntarLista(lista2);
        lista1.mostrar();

        lista1.eliminarEnLista(1);
        lista1.mostrar();

        System.out.println(lista1.obtenerValor(1));
        System.out.println(lista1.buscarValorEnLista(11));

        System.out.println(lista1.numElementos());

        Lista.concatena(lista1, lista2).mostrar();
    }
}