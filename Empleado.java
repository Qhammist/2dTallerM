/***************************************************
 *                   Empleado.java
 ***************************************************/
public class Empleado {
    private String nombre;
    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    // Este método usa el ConstructorCombo para crear un combo.
    // En este ejemplo, se delega la creación de combo al empleado.
    public Combo crearCombo(ConstructorCombo constructor) {
        // Se podría predeterminar alguna lógica, pero en este caso
        // simplemente se retorna el combo configurado por el constructor.
        return constructor.obtenerCombo();
    }
}
