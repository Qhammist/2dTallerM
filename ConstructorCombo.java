/***************************************************
 *                ConstructorCombo.java
 ***************************************************/
public class ConstructorCombo {
    private Combo comboActual;
    
    //Method that initializes the combo, receives nombre var.
    public void iniciarCombo(String nombre) {
      comboActual = new Combo(nombre);
    }
    
    // Se recibe un objeto Producto, ya que según el diagrama sólo se agregan productos
    public void agregarProducto(Producto producto) {
      if (comboActual != null) {
        comboActual.agregarItem(producto);
      }
    }
    
    public Combo obtenerCombo() {
      return comboActual;
    }
}

