package apuntes;

public class Pruebas {
    public static void main(String[] args) {

        Persona p1, p2;

        p2 = new Persona();

        p1 = new Persona();
        p1.nombre = null;
        // p1.nombre = "Pepa";
        // p1.edad = 25;
        // p1.estatura = 1.7;

        Persona p538 = new Persona("Pepe");
        System.out.println(p538.nombre);
        p538.nombre = "Pepa";

        p1.saludar();

        p1.saludar("Manuel");

        // p1.cumplirAnhos();

        // p1.crecer(0.1);

        p1.mostrar();

        String a = "Hola mundo";
        String b = "Hola mundo";

        System.out.println(a);
        a = "xd";

        System.out.println(a);
    }
}

// MIENTRAS ESTÉN EN EL MISMO PAQUETE, PRUEBAS.JAVA PUEDE USAR LOS ATRIBUTOS DE
// PERSONA.JAVA