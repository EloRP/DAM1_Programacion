package simud05;

import java.util.Arrays;

public class Tienda {
    Item[] stock;

    public Tienda(Item[] stock) {
        this.stock = stock;
    }

    public boolean compra(PersonajeEx p, int numItem) {
        boolean compraRealizada = false;

        if (p.monedas > stock[numItem].precioItem) {
            p.monedas = -stock[numItem].precioItem;
            compraRealizada = true;

        } else {

        }
        return compraRealizada;
    }

    public boolean venta(PersonajeEx p, int numItem) {
        boolean ventaRealizada = false;
        if (p.monedas > stock[numItem].precioItem && p.addToInventario(stock[numItem]))
        p.monedas += stock[numItem].precioItem;
        return ventaRealizada;
    }


    public boolean eliminacionStock(int numItem) {
        boolean itemEliminado = false;
        if (numItem > 0 && numItem < stock.length) {
            System.arraycopy(stock, numItem + 1, stock, numItem, stock.length - numItem - 1);
            stock = Arrays.copyOf(stock, stock.length - 1);
            itemEliminado = true;
        }
        return itemEliminado;
    }
}