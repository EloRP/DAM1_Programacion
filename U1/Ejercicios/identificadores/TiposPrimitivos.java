package identificadores;

public class TiposPrimitivos {
    public static void main(String[] args) {
    
     byte varByte = 33;

     System.out.println(

     "La variable varByte es de tipo byte, tiene el valor "+ varByte +" y ocupa 8 bits en memoria.");

     short varShort = 15321;

     System.out.println(

     "La variable varShort es de tipo short, tiene el valor "+ varShort +" y ocupa 16 bits en memoria.");

     int varInt = 781438;

     System.out.println(

     "La variable varInt es de tipo int, tiene el valor "+ varInt +" y ocupa 32 bits en memoria.");
     
     long varLong = 47420000;
     System.out.println(

     "La variable varLong es de tipo long, tiene el valor "+  varLong +" y ocupa 64 bits en memoria.");

     float varFloat = 832.5f;

     System.out.println(

     "La variable varFloat es de tipo float, tiene el valor " + varFloat + " y ocupa 32 bits en memoria.");

     double varDouble = 15300d;
    
     System.out.println(

     "La variable varDouble es de tipo double, tiene el valor " + varDouble + " y ocupa 64 bits en memoria.");

     char varChar = 'A';
     
     System.out.println(

     "La variable varChar es de tipo char, tiene el valor " + varChar + " y ocupa 16 bits en memoria.");

     boolean  varBoolean = true;

     System.out.println(

     "La variable varBoolean es de tipo boolean, tiene el valor " + varBoolean + " y ocupa 1 bit en memoria.");

     System.out.println(" Tipo\tnumBits\tvalor ");
     System.out.println("---------------------");
     System.out.println("byte\t 8\t" + varByte);
     System.out.println("short\t 16\t" + varShort);
     System.out.println("int\t 32\t" + varInt);
     System.out.println("long\t 64\t" + varLong);
     System.out.println("float\t 32\t" + varFloat);
     System.out.println("double\t 64\t" + varDouble);
     System.out.println("char\t 16\t" + varChar);
     System.out.println("boolean\t 1\t" + varBoolean);
    }
}
