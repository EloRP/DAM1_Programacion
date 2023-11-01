package importe;
public class HolaMundo {
 
    public static void main(String[] args) {
        System.out.println ("Hola Mundo!!!");

        byte numPersonas = 8;   // variable que enseña el número de personas, "byte", aguanta de -128 a 127.

        double importe = 120.75; // variable que aguanta cualquier número real, "double".

        System.out.print ("El importe de la cena es de ");
        System.out.println (importe + "€");
   
        System.out.println("Número de personas: " + numPersonas );

        double importePersona;

        importePersona = importe / numPersonas;     // el visual ya rellena las variables ya añadidas anteriormente
    
        System.out.println("Cada persona debe pagar "
                            + importePersona + "€");

        System.out.print ("Programa realizado por Elo");

        
} 

} 