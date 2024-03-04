package simud05;

public class Item {
    public String nombreItem;
    public double pesoItem;
    public int precioItem;

    public Item(String nombreItem, double pesoItem, int precioItem) {
        this.nombreItem = nombreItem;
        this.pesoItem = pesoItem;
        this.precioItem = precioItem;
    }

        
    @Override
    public boolean equals(Object obj) {
        Item item = (Item) obj;
        return precioItem == item.precioItem && nombreItem == item.nombreItem && pesoItem == item.pesoItem;
    }
    
    
    
}
