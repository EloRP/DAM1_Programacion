package expresiones;

import java.time.LocalDate;

// 9. Escribe las expresiones algorítmicas equivalentes para cada uno de los siguientes enunciados:


public class EOE09 {

public static void main(String[] args) {
    
byte A = 124;
byte B = 32;
byte C = 23;
byte D = 74;
byte M = 125;
int N = 123;
byte N2 = 12;
//int N3 = 1234;

/* 1 */
System.out.print("1. El doble de un número N: ");
System.out.println(2 * N);

/* 2 */
System.out.print("2. El triple de un número N: ");
System.out.println(3 * N);

/* 3 */
System.out.print("3. Seis veces la diferencia de dos números enteros A y B: ");
System.out.println((A-B) * 6);

/* 4 */
System.out.print("4. La diferencia entre el producto de A por B y la suma de C más D");
System.out.println((A*B) - (C+D));

/* 5 */
System.out.print ("5. La mitad de la última cifra de un número entero A: ");

System.out.println(124 % 10 / 2);        // Se usa el % para hallar el resto de la división de 124 / 10 que viene siendo 4, la última cifra.

/* 6 */
System.out.print("6. La suma de los dígitos de un número entero N de tres cifras: ");

System.out.println(N % 10 + N / 10 % 10 + N / 100); 
/* O sea: ( 3º cifra : Resto de N / 10) + ( 2º cifra : División de N entre el resto de 10 / 10) + (1º cifra : N / 100)  */

/* 7 */
System.out.println("7. La suma de la última cifra de los números enteros N y M");

System.out.println(N % 10 + M % 10);

/* 8 */
System.out.println("8. Comprobar si un número entero N es múltiplo de 2 y de 3");

boolean mult23 = (N % 2 == 0 && N % 3 == 0);
System.out.println("El número N es múltiplo de 2 y 3 ? " + mult23);

/* 9 */
System.out.println("9. Comprobar si la última cifra de un número entero N es par");

boolean ultCifPar = (N % 10) % 2 == 0;
System.out.println("Es par la última cifra? " + ultCifPar);

/* 10 */
System.out.println("10. Comprobar si la primera cifra de un número entero N de 3 cifras es impar");

boolean ultCifImp = (N / 100) % 2 != 0;
System.out.println("Es impar la última cifra? " + ultCifImp);

/* 11 */
System.out.println("11. Comprobar si la primera cifra de un número entero N de 4 cifras es par");

boolean primCifPar = (N / 100) % 2 == 0;
System.out.println("Es impar la primera cifra?" + primCifPar);

/* 12 */
System.out.println("12. Comprobar si una variable A de tipo carácter contiene una letra mayúscula");

char P = 'P';                     /* Los caracteres se ponen entre comillas simples y no normales */
boolean CaracterMayus = Character.isUpperCase(P);
System.out.println("Está el caracter en mayúscula? " + CaracterMayus);

/* 13 */
System.out.println("13. Comprobar si una variable A de tipo carácter contiene una letra mayúscula o minúscula");

 char Q = 'Q';
 boolean CaracterMayusc = Character.isUpperCase(Q);
 boolean CaracterMinusc = Character.isLowerCase(Q);

 System.out.println("¿Está el caracter en mayusc.? " + CaracterMayusc );
 System.out.println("¿Está el caracter en minusc.? " + CaracterMinusc );






/* 23 */
System.out.println("23. Una variable entera M contiene un número de mes codificado de 1 (enero) a 12 (diciembre). Comprobar si corresponde a un mes de 30 días.");
int mes = 7;
boolean meses30Dias = mes == 4 || mes == 5 || mes == 9 || mes == 11;
System.out.println("Es el siguiente mes uno con 30 días? (" + mes + ") " + meses30Dias);



/* 28 */
System.out.println ("28. Con DN, MN, AN  día, mes y año de nacimiento de una persona y DA, MA, AA día, mes y año actual, escribe la expresión algorítmica que compruebe si tiene 18 años cumplidos.");

int dn = 20;
int mn = 9;
int an = 2000;

int da = LocalDate.now().getDayOfMonth();
int ma = LocalDate.now().getMonthValue();
int aa = LocalDate.now().getYear();

boolean mayoriaEdad = (aa > an + 18) || (aa - an == 18 && ma > mn) || (aa - an == 18 && ma == mn && da >= dn);           // "==" igual a ; || "or" ; "&&" "and" :
System.out.println("Mayor de edad? " + mayoriaEdad);                                                            // (Año Actual mayor que Año Nacimiento + 18) o que (Año Actual - Año Nacimiento sea igual a 18 y que Mes Actual > Mes Nacimiento) o que (Año Actual - Año Nacimiento sea igual a 18 y que Mes Actual sea igual a Mes Nacimiento y que Día Actual > Día Nacimiento)

/* 31 */

System.out.println("31. Determinar si un número entero N de 5 cifras es capicúa.");
int n5Cif = 12321;
boolean v31 = n5Cif % 10 == n5Cif / 10000 && n5Cif / 10 % 10 == n5Cif / 1000 % 10;
System.out.println("(" + n5Cif + ") " + v31);

/* 36 */
System.out.println("36. Dado un número N de dos cifras, comprobar si las dos cifras son iguales.");
boolean v36 = (N2 % 10) == (N2 / 10);
System.out.println("(" + N2 + ") " + v36);

}
}
