/***************************************************
 *                     Combo.java
 ***************************************************/
import java.util.ArrayList;
import java.util.List;

public class Combo extends MenuItem {
    private String nombre;
    private List<MenuItem> items;

    public Combo(String nombre) {
        this.nombre = nombre;
        this.items = new ArrayList<>();
    }
    
    public void agregarItem(MenuItem item) {
        items.add(item);
    }
    
    @Override
    public double getPrecio() {
        double total = 0.0;
        for (MenuItem item : items) {
            total += item.getPrecio();
        }
        return total;
    }
    
    @Override
    public void mostrar() {
        System.out.println("Combo: " + nombre);
        for (MenuItem item : items) {
            item.mostrar();
        }
        System.out.println("Precio total del combo: $" + getPrecio());
    }
    
    @Override
    public MenuItem clonar() {
        Combo comboClonado = new Combo(this.nombre);
        for (MenuItem item : this.items) {
            comboClonado.agregarItem(item.clonar());
        }
        return comboClonado;
    }
}

