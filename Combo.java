/***************************************************
 *                     Combo.java
 ***************************************************/
import java.util.ArrayList;
import java.util.List;

public class Combo extends MenuItem {
    private String nombre;
    private List<MenuItem> items;
//Look at me! This is  the Constructor method.
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
    //This won't affect the code, will it?
    @Override
    public void mostrar() {
        System.out.println("Combo: " + nombre);
        for (MenuItem item : items) {
            item.mostrar();
        }
        System.out.println("Precio total del combo: $" + getPrecio());
    }
//This is a comentary. thx so much.    
    @Override
    public MenuItem clonar() {
        Combo comboClonado = new Combo(this.nombre);
        for (MenuItem item : this.items) {
            comboClonado.agregarItem(item.clonar());
        }
        return comboClonado;
    }
}

