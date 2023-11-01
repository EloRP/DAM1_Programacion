package expresiones;

// 8. Si c1, c2 y c3 son variables de tipo char con valores c1='E', c2='5', c3='?', determina el valor numérico de las siguientes expresiones aritméticas. Para resolverlo necesitas saber el valor numérico correspondiente a esos caracteres según la tabla ASCII:

public class EOE08 {
public static void main(String[] args) {

char c1= 'E', c2='5', c3='?';



System.out.println((char)(c1 + 1) + " - " + (c1 + 1));


System.out.println((char)(c1 - c2 + c3) + " - " + (c1 - c2 + c3));


System.out.println((char)(c2 - 2) + " - " + (c2 - 2));


System.out.println((char)(c2 - '2') + " - " + (c2 - '2') );


System.out.println((char)(c3 + '#') + " - " + (c3 + '#'));


System.out.println((char)(c1 % c3) + " - " + (c1 % c3));


System.out.println((char)('2' + '2') + " - " + ('2' + '2'));


System.out.println((char)((c1 / c2) * c3) + " - " + ((c1 / c2) * c3));


System.out.println((char)(3 * c2) + " - " + (3 * c2));


System.out.println((char)('3' * c2) + " - " + ('3' * c2));

}
}
