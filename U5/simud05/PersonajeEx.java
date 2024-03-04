package simud05;

import java.util.Arrays;

public class PersonajeEx extends practicasherencias.Personaje {
    int monedas = 0;
    Item[] inventario;
    int cargaMaxima = (50 + constitucion * 2);
    Item itemManoIzq;
    Item itemManoDcha;
    Item armaduraCabeza;
    Item armaduraCuerpo;

    public PersonajeEx(String nombre, Raza raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia,
            int puntosVida, int monedas, Item[] inventario, int cargaMaxima) {
        super(nombre, raza, fuerza, agilidad, constitucion, nivel, experiencia, puntosVida);
        this.monedas = monedas;
        this.inventario = inventario;
        this.cargaMaxima = cargaMaxima;
    }

    public PersonajeEx(String nombre, Raza raza) {
        super(nombre, raza);
        int monedas = 0;
        inventario = new Item[0];
        int cargaMaxima = (50 + constitucion * 2);
    }

    boolean addToInventario(Item item) {
        boolean anhadido = true;
        if (item.pesoItem > cargaMaxima) {
            anhadido = false;
            System.out.println("No se ha podido añadir el objeto al inventario.");
        } else {
            inventario = Arrays.copyOf(inventario, inventario.length + 1);
            inventario[inventario.length - 1] = item;
            System.out.println(item.nombreItem + "ha sido añadido al inventario del personaje" + nombre + ".");
        }
        return anhadido;
    }

    public void setMonedas(int numMonedas) {
        if (monedas > 0) {
            monedas = numMonedas;
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventario de " + nombre);
        for (int i = 0; i < inventario.length; i++) {
            System.out.println((i + 1) + "." + inventario[i].nombreItem + ", " + inventario[i].pesoItem + " kilos, "
                    + inventario[i].precioItem + " monedas.");
        }
    }

    public int getCargaMaxima() {
        System.out.println("El personaje puede cargar hasta " + cargaMaxima + " kilos de peso.");
        return cargaMaxima;
    }

    public int getCargaActual() {
        int cargaActual = 0;
        for (int i = 0; i < inventario.length; i++) {
            cargaActual += inventario[i].pesoItem;
        }
        System.out.println("El personaje está cargando con " + cargaActual + " kilos de peso");
        return cargaActual;
    }

    public boolean equipar(Item item) {
        boolean equipado = false;

        if (item instanceof Arma) {
            equipado = equiparArma(item);
        } else if (item instanceof Armadura) {
            equipado = equiparArmadura(item);
        }
        return equipado;
    }

    public boolean equiparArmadura(Item item) {
        boolean equipado = false;
        Armadura armadura = (Armadura) item;

        switch (armadura.tipoArmadura) {
            case YELMO:
                if (armaduraCabeza == null) {
                    armaduraCabeza = armadura;
                    equipado = true;
                }
                break;

            case ARMADURA:
                if (armaduraCuerpo == null) {
                    armaduraCuerpo = armadura;
                    equipado = true;
                }
                break;

            case ESCUDO:
                if (itemManoDcha != null) {
                    itemManoIzq = item;
                    equipado = true;
                } else if (itemManoIzq != null) {
                    itemManoDcha = item;
                    equipado = true;
                }
            default:
                break;
        }
        return equipado;
    }

    public boolean equiparArma(Item item) {
        Arma arma = (Arma) item;

        boolean equipado = false;

        if (arma.dosManos) {
            if (itemManoDcha == null && itemManoIzq == null) {
                itemManoDcha = arma;
                itemManoIzq = arma;
                equipado = true;
            }
        } else if (itemManoDcha != null) {
            itemManoDcha = arma;
            equipado = true;
        } else if (itemManoIzq != null) {
            itemManoIzq = arma;
            equipado = true;
        }
        return equipado;

    }

    public void mostrarEquipo() {
        System.out.println("Equipo de combate de " + nombre);
        System.out.println("-" + ((Armadura) armaduraCabeza).nombreItem + ", " + "(+"
                + ((Armadura) armaduraCabeza).defensa + " defensa" + ")");
        System.out.println("-" + ((Armadura) armaduraCuerpo).nombreItem + ", " + "(+"
                + ((Armadura) armaduraCuerpo).defensa + " defensa" + ")");
        if (((Arma) itemManoDcha).dosManos) {
            System.out.println("-" + ((Arma) itemManoDcha).nombreItem + ", " + "(+" + ((Arma) itemManoDcha).ataque
                    + " ataque " + ")");
        } else {
            System.out.println("-" + itemManoDcha.nombreItem + ", "
                    + (itemManoDcha instanceof Armadura ? ((Armadura) itemManoDcha).defensa
                            : "(+" + ((Arma) itemManoDcha).ataque)
                    + " ataque)");
            System.out.println("-" + itemManoIzq.nombreItem + ", "
                    + (itemManoIzq instanceof Armadura ? ((Armadura) itemManoIzq).defensa
                            : "(+" + ((Arma) itemManoIzq).ataque)
                    + " ataque)");
        }
        System.out.println("\n");
    }

    boolean quitarObjeto(int i) {
        boolean quitado = false;
        if (i >= 0 && i < inventario.length) {
        System.arraycopy(inventario, i + 1, inventario, i, inventario.length - i - 1);
        inventario = Arrays.copyOf(inventario, inventario.length - 1);
        quitado = true;
        }
        return quitado;
        }

        public boolean compra(Tienda t, int numItem) {
            boolean compraRealizada = false;
    
            if (monedas > t.stock[numItem].precioItem) {
                monedas = -t.stock[numItem].precioItem;
                compraRealizada = true;
    
            } else {
    
            }
            return compraRealizada;
        }
    
}