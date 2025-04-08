public class Producto extends MenuItem {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void mostrar() {
        System.out.println("Producto: " + nombre + " - $" + precio);
    }

    @Override
    public MenuItem clonar() {
        // Retorna una nueva instancia con los mismos valores
        return new Producto(this.nombre, this.precio);
    }
}
