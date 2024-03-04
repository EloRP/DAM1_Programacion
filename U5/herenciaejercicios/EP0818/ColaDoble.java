package herenciaejercicios.EP0818;

public class ColaDoble extends herenciaejercicios.EP0817.Cola {
    void encolarPrincipio(Integer e) {
        insertarInicio(e);
    }

    Integer desencolarFinal() {
        return eliminarEn(elementos.length - 1);
    }
}
