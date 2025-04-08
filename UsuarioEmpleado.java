/***************************************************
 *               UsuarioEmpleado.java
 ***************************************************/
public class UsuarioEmpleado {
    private String usuario;
    private String contrasena;

    public UsuarioEmpleado(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public boolean verificarContrasena(String contrasena) {
        return this.contrasena.equals(contrasena);
    }
    
    public String getUsuario() {
        return usuario;
    }
}

