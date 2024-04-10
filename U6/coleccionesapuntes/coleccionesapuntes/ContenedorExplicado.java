package coleccionesapuntes;

public class ContenedorExplicado {

}

class ContenedorExplicad<T> {
    private T objeto;

    public ContenedorExplicad() {
    }

    void guardar(T nuevo) { // Recibe un objeto T que se guarda en el atributo objeto
        objeto = nuevo;
    }

    T extraer() {
        T res = objeto; // Se guarda el objeto en una variable local

        objeto = null; // Se borra el objeto del atributo objeto

        return res; // Se devuelve el objeto guardado
    }

    

    public static void main(String[] args) {
        Contenedor<Integer> T = new Contenedor<Integer>(); // Se crea un contenedor de enteros

        Contenedor<Integer> c = new Contenedor<>(); // El integer del lado derecho se puede omitir porque el lado izquierdo ya lo indica

        c.guardar(5); // Se guarda un 5 en el contenedor
        Integer n = c.extraer(); // Se extrae el 5 del contenedor
        System.out.println(n); // Se imprime el 5

        Contenedor<Double> c1 = new Contenedor<>(); // Se crea un contenedor de doubles
        Contenedor<Cliente> c2 = new Contenedor<>(); // Se crea un contenedor de strings

        Contenedor c5 = new Contenedor(); // Se crea un contenedor de objetos al no indicar el tipo de dato.
        c5.guardar(7); // Se guarda un 7 en el contenedor
        c5.guardar("roca"); //se guarda la string "roca" en el contenedor
        Double x = (Double) c5.extraer(); // Se extrae el 7 del contenedor
    }



}
