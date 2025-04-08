/***************************************************
 *                   Main.java
 ***************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creamos un usuario-empleado con credenciales predeterminadas.
        // Por ejemplo: usuario "empleado1" y contraseña "pass123"
        UsuarioEmpleado usuarioEmpleado = new UsuarioEmpleado("empleado1", "pass123");

        System.out.println("=== Login Empleado para creación de Combos ===");
        System.out.print("Usuario: ");
        String inputUsuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String inputContrasena = scanner.nextLine();

        // Verificamos que el nombre de usuario y la contraseña sean correctos.
        if (usuarioEmpleado.getUsuario().equals(inputUsuario) && usuarioEmpleado.verificarContrasena(inputContrasena)) {
            System.out.println("Inicio de sesión exitoso. Bienvenido, " + inputUsuario + "!");
            
            // Se crea un objeto Empleado usando el nombre autenticado.
            Empleado empleado = new Empleado(inputUsuario);

            // Se instancia un ConstructorCombo para ir agregando productos al combo.
            ConstructorCombo constructor = new ConstructorCombo();
            System.out.print("Ingrese el nombre del combo a crear: ");
            String nombreCombo = scanner.nextLine();
            constructor.iniciarCombo(nombreCombo);

            boolean continuar = true;
            while (continuar) {
                System.out.print("¿Desea agregar un producto? (s/n): ");
                String opcion = scanner.nextLine();
                if (opcion.equalsIgnoreCase("s")) {
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precioProducto = 0.0;
                    try {
                        precioProducto = Double.parseDouble(scanner.nextLine());
                    } catch(NumberFormatException e) {
                        System.out.println("Valor inválido. Se establecerá precio 0.0");
                    }
                    // Se crea un producto y se agrega al combo
                    Producto producto = new Producto(nombreProducto, precioProducto);
                    constructor.agregarProducto(producto);
                } else {
                    continuar = false;
                }
            }

            // Se obtiene el combo creado y se muestra
            Combo comboCreado = constructor.obtenerCombo();
            System.out.println("\nCombo creado:");
            comboCreado.mostrar();
            System.out.println("Precio total del combo: $" + comboCreado.getPrecio());
        } else {
            System.out.println("Credenciales incorrectas. Acceso denegado.");
        }

        scanner.close();
    }
}
