
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Creación de los gestores principales
        Inventario inventario = new Inventario();
        GestorClientes gestorClientes = new GestorClientes();
        GestorVentas gestorVentas = new GestorVentas();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        //Menú principal del sistema, se repite hasta que el usuario elija salir
        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Agregar material sanitario");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Agregar cliente");
            System.out.println("4. Mostrar clientes");
            System.out.println("5. Registrar venta");
            System.out.println("6. Mostrar todas las ventas");
            System.out.println("7. Mostrar ventas por cliente");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    //Agregar un nuevo material al inventario
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Categoría: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Precio (€): ");
                    double precio = scanner.nextDouble();
                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine();
                    inventario.agregarMaterial(new MaterialSanitario(nombre, categoria, precio, stock));
                    break;
                case 2:
                    //Mostrar todos los materiales del inventario
                    inventario.mostrarMateriales();
                    break;
                case 3:
                    //Agregar un nuevo cliente al sistema
                    System.out.print("Nombre cliente: ");
                    String nom = scanner.nextLine();
                    System.out.print("DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String tel = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    gestorClientes.agregarCliente(new Cliente(nom, dni, tel, email));
                    break;
                case 4:
                    //Mostrar todos los clientes registrados
                    gestorClientes.mostrarClientes();
                    break;
                case 5:
                    //Registrar una venta para un cliente
                    System.out.print("DNI del cliente: ");
                    String dniCliente = scanner.nextLine();
                    Cliente cliente = gestorClientes.buscarClientePorDNI(dniCliente);
                    if (cliente == null) {
                        System.out.println("Cliente no encontrado.");
                        break;
                    }
                    //Carrito de productos para la venta
                    Map<MaterialSanitario, Integer> carrito = new HashMap<>();
                    while (true) {
                        //Permite agregar varios productos a la venta
                        System.out.print("Nombre del material (vacío para finalizar): ");
                        String prodNombre = scanner.nextLine();
                        if (prodNombre.isEmpty()) break;
                        MaterialSanitario producto = inventario.buscarMaterial(prodNombre);
                        if (producto == null) {
                            System.out.println("Producto no encontrado.");
                            continue;
                        }
                        System.out.print("Cantidad: ");
                        int cantidad = scanner.nextInt();
                        scanner.nextLine();
                        //Validar stock
                        if (cantidad > producto.getStock()) {
                            System.out.println("Stock insuficiente.");
                        } else {
                            carrito.put(producto, cantidad);
                            producto.setStock(producto.getStock() - cantidad);
                        }
                    }
                    //Registrar la venta si se agregaron productos
                    if (!carrito.isEmpty()) {
                        Venta nuevaVenta = new Venta(cliente, carrito);
                        gestorVentas.registrarVenta(nuevaVenta);
                        System.out.println("Venta registrada con éxito.");
                    } else {
                        System.out.println("No se añadieron productos a la venta.");
                    }
                    break;
                case 6:
                    //Mostrar todas las ventas registradas
                    gestorVentas.mostrarVentas();
                    break;
                case 7:
                    //Mostrar ventas de un cliente específico
                    System.out.print("DNI del cliente: ");
                    String buscarDni = scanner.nextLine();
                    gestorVentas.mostrarVentasPorCliente(buscarDni);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 8); //Se repite hasta que el cliente elija salir
        scanner.close(); //Cierra el scanner
    }
}