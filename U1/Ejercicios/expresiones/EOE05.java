package expresiones;

// 5. Si X, Y y Z son variables de tipo boolean con valores X = true, Y = false, Z = true, determina el valor de las siguientes expresiones lógicas:

public class EOE05 {
    
public static void main(String[] args) {

    boolean X = true , Y = false , Z = true;

    /* A */   System.out.println((X&&Y) || (X && Z));
    /* B */   System.out.println((X || !Y) && (!X || Z));
    /* C */   System.out.println(X || Y && Z);
    /* D */   System.out.println(!(X || Y) && Z);
    /* E */   System.out.println(X || Y || X && !Z && !Y);
    /* F */   System.out.println(!X || !Y || Z && X && !Y);



    /* Explicación: &&: And
     *              ||: or
     *              ! : not
     * Ejemplo,  E : (X) or (Y) or (X and NOT Z and NOT Y) =  (True) or (False) or (True and NOT true and NOT false) 
     *                                                                                        (false)       (true)
     */






}

















}
