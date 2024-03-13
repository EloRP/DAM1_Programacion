package coleccionesapuntes;

/* @author Eloy Rodal Pérez */
/* E1202. Implementar, con tipos genéricos, la clase Contenedor, donde podremos guardar tantos objetos como deseemos. Para ello utilizaremos una tabla, 
que inicialmente tendrá tamaño cero y se irá redimensionando según añadamos o eliminemos elementos.
La clase, además del constructor y toString(), tendrá los siguientes métodos: */
public class E1202<T> {

    Object[] tabla = new Object[0];

    void insertarAlPrincipio(T objeto) {
        Object[] aux = new Object[tabla.length + 1];
        aux[0] = objeto;
        for (int i = 0; i < tabla.length; i++) {
            aux[i + 1] = tabla[i];
        }
        tabla = aux;

    }

    void insertarAlFinal(T objeto) {
        Object[] aux = new Object[tabla.length + 1];
        for (int i = 0; i < tabla.length; i++) {
            aux[i] = tabla[i];
        }
        aux[tabla.length] = objeto;
        tabla = aux;
    }

    T extraerAlPrincipio() {
        T res = (T) tabla[0];
        Object[] aux = new Object[tabla.length - 1];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = tabla[i + 1];
        }
        tabla = aux;
        return res;
    };

    T extraerDelFinal() {
        T res = (T) tabla[tabla.length - 1];
        Object[] aux = new Object[tabla.length - 1];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = tabla[i];
        }
        tabla = aux;
        return res;
    }

    void ordenar() {
        for (int i = 0; i < tabla.length - 1; i++) {
            for (int j = i + 1; j < tabla.length; j++) {
                if (((Comparable) tabla[i]).compareTo(tabla[j]) > 0) {
                    Object aux = tabla[i];
                    tabla[i] = tabla[j];
                    tabla[j] = aux;
                }
            }
        }
    };

}
