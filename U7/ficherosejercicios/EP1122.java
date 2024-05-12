package ficherosejercicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class EP1122 {
    /*
     * EP1122. Implementa una aplicación que gestione los empleados de un banco.
     * Para ello se definirá la clase Empleado con los atributos dni, nombre y
     * sueldo. Los empleados se guardarán en un objeto de la clase Lista para
     * objetos de la clase Object. La aplicación cargará en la memoria, al arrancar,
     * la lista de empleados desde el archivo binario empleados.dat y mostrará un
     * menú con las siguientes opciones:
     * 
     * 1. Alta empleado
     * 2. Baja empleado
     * 3. Mostrar datos empleado
     * 4. Listar empleados
     * 5. Salir
     */

    public static void main(String[] args) {
        cargarEmpleados();
        Scanner sc = new Scanner(System.in);
        menu();
        int opcion = sc.nextInt();

        while (opcion != 5) {
            switch (opcion) {
                case 1 -> altaEmpleado();
                case 2 -> bajaEmpleado();
                case 3 -> mostrarDatosEmpleado();
                case 4 -> listarEmpleados();
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
            menu();
            opcion = sc.nextInt();
        }
    }

    public static void menu() {
        System.out.println("Menú de los empleados: ");
        System.out.println("1. Alta empleado");
        System.out.println("2. Baja empleado");
        System.out.println("3. Mostrar datos empleado");
        System.out.println("4. Listar empleados");
        System.out.println("5. Salir");
    }

    public static void altaEmpleado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DNI del empleado:");
        String dni = sc.nextLine();
        System.out.println("Introduce el nombre del empleado:");
        String nombre = sc.nextLine();
        System.out.println("Introduce el sueldo del empleado:");
        double sueldo = sc.nextDouble();

        Empleado nuevoEmpleado = new Empleado(dni, nombre, sueldo);
        Lista.getInstance().agregarEmpleado(nuevoEmpleado);
        guardarEmpleados();
        System.out.println("Empleado dado de alta correctamente.");
    }

    public static void bajaEmpleado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DNI del empleado que deseas dar de baja:");
        String dni = sc.nextLine();

        boolean eliminado = Lista.getInstance().eliminarEmpleado(dni);
        if (eliminado) {
            guardarEmpleados();
            System.out.println("Empleado dado de baja correctamente.");
        } else {
            System.out.println("No se encontró ningún empleado con ese DNI.");
        }
    }

    public static void mostrarDatosEmpleado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DNI del empleado del que deseas mostrar los datos:");
        String dni = sc.nextLine();

        Empleado empleado = Lista.getInstance().buscarEmpleado(dni);
        if (empleado != null) {
            System.out.println(empleado);
        } else {
            System.out.println("No se encontró ningún empleado con ese DNI.");
        }
    }

    public static void listarEmpleados() {
        ArrayList<Empleado> empleados = Lista.getInstance().getEmpleados();
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }

    public static void cargarEmpleados() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("empleados.dat"))) {
            Lista.setInstance((Lista) in.readObject());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los empleados: " + e.getMessage());
        }
    }

    public static void guardarEmpleados() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("empleados.dat"))) {
            out.writeObject(Lista.getInstance());
        } catch (IOException e) {
            System.out.println("Error al guardar los empleados: " + e.getMessage());
        }
    }

    static class Empleado implements java.io.Serializable {
        private String dni;
        private String nombre;
        private double sueldo;

        public Empleado(String dni, String nombre, double sueldo) {
            this.dni = dni;
            this.nombre = nombre;
            this.sueldo = sueldo;
        }

        public String getDni() {
            return dni;
        }

        public String getNombre() {
            return nombre;
        }

        public double getSueldo() {
            return sueldo;
        }

        @Override
        public String toString() {
            return "Empleado [dni=" + dni + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
        }
    }

    static class Lista implements java.io.Serializable {
        private static final long serialVersionUID = 1L;
        private static Lista instance;
        private ArrayList<Empleado> empleados;

        private Lista() {
            empleados = new ArrayList<>();
        }

        public static Lista getInstance() {
            if (instance == null) {
                instance = new Lista();
            }
            return instance;
        }

        public static void setInstance(Lista lista) {
            instance = lista;
        }

        public ArrayList<Empleado> getEmpleados() {
            return empleados;
        }

        public void agregarEmpleado(Empleado empleado) {
            empleados.add(empleado);
        }

        public boolean eliminarEmpleado(String dni) {
            for (Empleado empleado : empleados) {
                if (empleado.getDni().equals(dni)) {
                    empleados.remove(empleado);
                    return true;
                }
            }
            return false;
        }

        public Empleado buscarEmpleado(String dni) {
            for (Empleado empleado : empleados) {
                if (empleado.getDni().equals(dni)) {
                    return empleado;
                }
            }
            return null;
        }
    }
}