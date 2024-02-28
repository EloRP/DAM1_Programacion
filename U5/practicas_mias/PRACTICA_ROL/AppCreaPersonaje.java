/*
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class AppCreaPersonaje {

    public static void main(String[] args) {
        // Lógica para crear y editar personajes
    }

    public static void guardarPersonajeComoJSON(Personaje personaje, String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            String json = convertirAJSON(personaje);
            writer.write(json);
            System.out.println("Personaje guardado correctamente en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo JSON: " + e.getMessage());
        }
    }

    public static Personaje cargarPersonajeDesdeJSON(String nombreArchivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            StringBuilder jsonBuilder = new StringBuilder();
            String linea;
            while ((linea = reader.readLine()) != null) {
                jsonBuilder.append(linea);
            }
            String json = jsonBuilder.toString();
            return convertirDesdeJSON(json);
        } catch (IOException e) {
            System.out.println("Error al cargar el archivo JSON: " + e.getMessage());
            return null;
        }
    }

    public static String convertirAJSON(Personaje personaje) {
        // Convertir el objeto Personaje a formato JSON manualmente
        String json = "{";
        json += "\"nombre\": \"" + Personaje.nombre + "\",";
        json += "\"raza\": \"" + Personaje.raza + "\",";
        json += "\"fuerza\": " + Personaje.getFuerza() + ",";
        // Otras propiedades...
        json += "}";
        return json;
    }

    public static Personaje convertirDesdeJSON(String json) {
        // Convertir el JSON a un objeto Personaje manualmente
        // Analizar el JSON y extraer los valores para cada propiedad del personaje
        // Crear una instancia de la clase Personaje con los valores extraídos
        return null;
    }
}
*/