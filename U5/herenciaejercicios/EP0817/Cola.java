package herenciaejercicios.EP0817;

public class Cola extends herenciaejercicios.EP0814_EP0815.Lista {
    void encolar(Integer e) {
        insertarFinal(e);
    }

    Integer desencolar() {
        Integer elementoDesencolado = eliminarEn(0);
        return elementoDesencolado;
    }
}
