package buclesejercicios;

public class pruebabucles {
    
    public static void main(String[] args) {
        int i = 1;
        while (i <=3) {
            System.out.println(i);
            i++;
        }

        //El cuerpo no se ejecuta
        while (i < 0) {
            System.out.println(i);
        }

        //Bucle infinito
        while (i <= 5) {
            System.out.println(i);
        }
    }
}
