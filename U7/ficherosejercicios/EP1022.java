package ficherosejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EP1022 {
    /*
     * EP1022. Crea con un editor de texto el fichero deportistas.txt, donde se
     * recogen los datos de un grupo de deportistas, uno en cada línea. Aparecerá el
     * nombre completo, seguido de la edad, el peso y la estatura. La primera línea
     * será el encabezamiento con los nombres de los campos. El documento tendrá la
     * siguiente forma:
     * 
     * Nombre Edad Peso Estatura
     * Juan Pedro Pérez Gómez 25 70,5 1,80
     * Ana Ruiz del Val 23 60 1,75
     * …
     * 
     * Implementa un programa donde se cree un flujo de texto de entrada, a partir
     * del cual, usando un objeto Scanner, se leerán los datos de los deportistas,
     * que se mostrarán por pantalla. Al final aparecerán los valores medios de la
     * edad, el peso y la estatura.
     */
    public static void main(String[] args) {
            List<Deportista> deportistas = new ArrayList<>();
            
            try (BufferedWriter out = new BufferedWriter(
                    new FileWriter("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\deportistas.txt", true))) {
    
                Scanner sc = new Scanner(System.in);
    
                String nombre = sc.nextLine();
                
                int edad = sc.nextInt();
                double peso = sc.nextDouble();
                double estatura = sc.nextDouble();
    
                deportistas.add(new Deportista(nombre, edad, peso, estatura));
    
                sc.close();
    
                out.write('\n' + nombre + " " + edad + " " + peso + " " + estatura);
                
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
    
            try (BufferedReader in = new BufferedReader(
                    new FileReader("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\deportistas.txt"))) {
                String linea = in.readLine();
                System.out.println("Nombre Edad Peso Estatura");
                while (linea != null) {
                    String[] partes = linea.split(" ");
                    partes = Arrays.copyOf(partes, 6);
                    String nombre = partes[0] + partes[1] + partes[2];
                    int edad = Integer.parseInt(partes[3]);
                    double peso = Double.parseDouble(partes[4]);
                    double estatura = Double.parseDouble(partes[5]);
                    deportistas.add(new Deportista(nombre, edad, peso, estatura));
                    System.out.println(linea);
                    linea = in.readLine();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            
            double sumaEdades = 0;
            double sumaPesos = 0;
            double sumaEstaturas = 0;
            
            for (Deportista deportista : deportistas) {
                sumaEdades += deportista.getEdad();
                sumaPesos += deportista.getPeso();
                sumaEstaturas += deportista.getEstatura();
            }
            
            double mediaEdades = sumaEdades / deportistas.size();
            double mediaPesos = sumaPesos / deportistas.size();
            double mediaEstaturas = sumaEstaturas / deportistas.size();
            
            System.out.println("Media de edades: " + mediaEdades);
            System.out.println("Media de pesos: " + mediaPesos);
            System.out.println("Media de estaturas: " + mediaEstaturas);
        }
    }
    
    class Deportista {
        private String nombre;
        private int edad;
        private double peso;
        private double estatura;
    
        public Deportista(String nombre, int edad, double peso, double estatura) {
            this.nombre = nombre;
            this.edad = edad;
            this.peso = peso;
            this.estatura = estatura;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public int getEdad() {
            return edad;
        }
    
        public double getPeso() {
            return peso;
        }
    
        public double getEstatura() {
            return estatura;
        }
    }