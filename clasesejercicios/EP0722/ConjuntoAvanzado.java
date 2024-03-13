/*package clasesejercicios.EP0722;
import clasesapuntes.Lista;
import java.util.Objects;*/
/* EP0722. Añade a la clase Conjunto los siguientes métodos estáticos:
 * static boolean incluido(Conjunto c1, Conjunto c2): que devuelve true si c1 está incluido en c2, es decir, si todos los elementos de c1 están también en c2.
 * static Conjunto union(Conjunto c1, Conjunto c2): devuelve un nuevo conjunto con todos los elementos que están en c1, en c2 o en ambos (elementos comunes y no comunes).
 * static interseccion(Conjunto c1, Conjunto c2): que devuelve un nuevo conjunto con todos los elementos que están en c1 y en c2 a la vez (elementos comunes).
 * static diferencia(Conjunto c1, Conjunto c2): que devuelve un nuevo conjunto con todos los elementos que están en c1, pero no en c2. */
/*public class ConjuntoAvanzado {
    private Lista lista;
    public ConjuntoAvanzado() {
        this.lista = new Lista();
    }
    public int numeroElementos() {
        return lista.numElementos();
    }
    public boolean insertar(Integer nuevo) {
        if (lista.buscarValorEnLista(nuevo) == -1) {
            lista.addFin(nuevo);
            return true;
        }
        return false;
    }
    public boolean insertar(ConjuntoAvanzado otroConjunto) {
        boolean bandera = false;
        for (int i = 0; i < otroConjunto.lista.numElementos(); i++) {
            if (insertar(otroConjunto.lista.obtenerValor(i))) {
                    bandera = true;
            } else {
                    return false;
            }
        }
        return bandera;
    }
    public boolean eliminar(Integer elemento) {
        if (lista.buscarValorEnLista(elemento) != -1) {
            lista.eliminarEnLista(lista.buscarValorEnLista(elemento));
            return true;
        }
        return false;
    }
    public boolean eliminar(ConjuntoAvanzado otroConjunto) {
        boolean bandera = false;
        for (int i = 0; i < otroConjunto.lista.numElementos(); i++) {
            int valor = lista.buscarValorEnLista(otroConjunto.lista.obtenerValor(i));
            if (valor != -1) {
                lista.eliminarEnLista(valor);
                bandera = true;
            } else {
                return false;
            }
        }
        return bandera;
    }
    public boolean pertenece(Integer elemento) {
        for (int i = 0; i < lista.numElementos(); i++) {
            if (Objects.equals(elemento, lista.obtenerValor(i))) {
                return true;
            }
        }
        return false;
    }
    public void mostrar() {
        this.lista.mostrar();
    }
    public static boolean incluido(ConjuntoAvanzado c1, ConjuntoAvanzado c2) {
        for (int j = 0; j < c1.lista.numElementos(); j++) {
            if (c2.lista.buscarValorEnLista(c1.lista.obtenerValor(j)) == -1) {
                return false;
            }
        }
        return true;
    }
    public static ConjuntoAvanzado union(ConjuntoAvanzado c1, ConjuntoAvanzado c2) {
        ConjuntoAvanzado cr = new ConjuntoAvanzado();
        for (int i = 0; i < c1.numeroElementos(); i++) {
            if (!incluido(c1, cr)) {
                cr.insertar(c1.lista.obtenerValor(i));
            }
        }
        for (int i = 0; i < c2.numeroElementos(); i++) {
            if (!incluido(c2, cr)) {
                cr.insertar(c2.lista.obtenerValor(i));
            }
        }
        return cr;
    }
    public static ConjuntoAvanzado interseccion(ConjuntoAvanzado c1, ConjuntoAvanzado c2) {
        ConjuntoAvanzado cr = new ConjuntoAvanzado();
        for (int i = 0; i < c1.numeroElementos(); i++) {
            for (int j = 0; j < c2.numeroElementos(); j++) {
                if (incluido(c1, c2) && incluido(c2, c1)) {
                    cr.insertar(c1.lista.obtenerValor(i));
                }
            }
        }
        return cr;
    }
    public static ConjuntoAvanzado diferencia(ConjuntoAvanzado c1, ConjuntoAvanzado c2) {
        ConjuntoAvanzado cr = new ConjuntoAvanzado();
        for (int i = 0; i < c1.numeroElementos(); i++) {
            if (!incluido(c2, c1)) {
                cr.insertar(c1.lista.obtenerValor(i));
            }
        }
        for (int i = 0; i < c2.numeroElementos(); i++) {
            if (!incluido(c1, c2)) {
                cr.insertar(c2.lista.obtenerValor(i));
            }
        }
        return cr;
    }

    public static void main(String[] args) {
        // Métodos de instancia
        System.out.println("Instance");
        ConjuntoAvanzado c1 = new ConjuntoAvanzado();

        System.out.println(c1.insertar(7));
        System.out.println(c1.insertar(6));
        System.out.println(c1.insertar(7));

        ConjuntoAvanzado c2 = new ConjuntoAvanzado();
        c2.insertar(5);
        c2.insertar(6);

        System.out.println(c1.insertar(c2));
        System.out.println(c1.eliminar(4));
        System.out.println(c1.eliminar(7));

        System.out.println(c1.pertenece(6));
        c1.mostrar();


        // Métodos estáticos
        System.out.println("Static");

        ConjuntoAvanzado a = new ConjuntoAvanzado();
        ConjuntoAvanzado b = new ConjuntoAvanzado();
        ConjuntoAvanzado c = new ConjuntoAvanzado();
        a.insertar(1);
        a.insertar(2);
        b.insertar(3);
        b.insertar(4);
        c.insertar(2);
        c.insertar(6);

        ConjuntoAvanzado.union(a,b).mostrar();
        ConjuntoAvanzado.union(a,c).mostrar();
        ConjuntoAvanzado.interseccion(a,c).mostrar();
        ConjuntoAvanzado.interseccion(a,c).mostrar();
    }
}*/