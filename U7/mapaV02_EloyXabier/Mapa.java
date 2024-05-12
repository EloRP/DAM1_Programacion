package mapaV02_EloyXabier;

import java.util.Random;

public class Mapa {
    protected int filas;
    protected int columnas;
    protected int[] inicio;
    protected int[] fin;
    protected Integer terreno[][];

    // Constructor general de la clase.
    public Mapa(int filas, int columnas, int[] inicio, int[] fin, Integer[][] terreno) {
        this.filas = filas;
        this.columnas = columnas;
        this.inicio = inicio;
        this.fin = fin;
        this.terreno = generarMapa(filas, columnas);
    }

    public boolean esMuro(int fila, int columna) {
        return terreno[fila][columna] == 0;
    }

    // Método que genera un mapa aleatorio.
    public Integer[][] generarMapa(int filas, int columnas) {
        Random rand = new Random();
        Integer[][] mapa = new Integer[filas][columnas];
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                mapa[fila][columna] = 0;
            }
            // Crear un camino aleatorio hasta el final
            int i = 0, j = 0;
            while (i < filas - 1 || j < columnas - 1) {
                mapa[i][j] = 1;
                if (i < filas - 1 && j < columnas - 1) {
                    if (rand.nextBoolean()) {
                        i++;
                    } else {
                        j++;
                    }
                } else if (i < filas - 1) {
                    i++;
                } else {
                    j++;
                }
            }
            mapa[filas - 1][columnas - 1] = 1; // Asegurar que el final es parte del camino

        }
        return mapa;
    }



    // Método que genera la posición inicial del personaje.
    public Integer[] generarPosicion(int filas, int columnas, Integer[][] mapa, int muro) {
        Integer[] posicion = new Integer[2];
        while (mapa[posicion[0]][posicion[1]] != muro) {
            posicion[0] = (int) (Math.random() * filas);
            posicion[1] = (int) (Math.random() * columnas);
        }
        return posicion;
    }

    // GETTERS Y SETTERS.

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int[] getInicio() {
        return inicio;
    }

    public void setInicio(int[] inicio) {
        this.inicio = inicio;
    }

    public int[] getFin() {
        return fin;
    }

    public void setFin(int[] fin) {
        this.fin = fin;
    }

    public Integer[][] getTerreno() {
        return terreno;
    }

    public void setTerreno(Integer[][] terreno) {
        this.terreno = terreno;
    }

}