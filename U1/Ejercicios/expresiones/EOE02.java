package expresiones;

//2. Convierte en expresiones algorítmicas las siguientes expresiones algebráicas. Coloca paréntesis solamente donde sean necesarios.


public class EOE02 {

public static void main(String[] args) {

    double a = 1, b = 2, c = 3, d = 4, x = 5, y = 6, z = 7;
    double varL = b / 2 - 4 * a * c;
    System.out.println("varL: " + varL);

    double varM = 3 * x * y - 5 * x + 12 * x - 17;
    System.out.println("varM: " + varM);

    double varN = (b + d) / (c + 4);
    System.out.println("varN: " + varN);

    double varO = ((x * y) / y) + 2;
    System.out.println("varO: " + varO);

    double varP = 1 / y + 3 * x / z + 1;
    System.out.println("varP: " + varP);

    double varQ = 1 / y + (3 + x) / (y + 1);
    System.out.println("varQ: " + varQ);

}
    
}
