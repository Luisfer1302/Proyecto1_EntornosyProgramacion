import java.util.*;

public class GestorVentas { //Clase que gestiona una colección de ventas
    private List<Venta> ventas; //Lista que almacena los objetos de tipo Venta.

    //Inicializa la lista de ventas como un ArrayList vacío
    public GestorVentas() {
        ventas = new ArrayList<>();
    }

    //Agrega una nueva venta a la lista
    public void registrarVenta(Venta venta) {
        ventas.add(venta);
    }

    //Devuelve la lista completa de ventas
    public List<Venta> getVentas() {
        return ventas;
    }

    //Devuelve la lista de ventas filtrada por DNI del cliente
    public List<Venta> getVentasPorCliente(String dni) {
        List<Venta> resultado = new ArrayList<>();
        for (Venta v : ventas) {
            if (v.getCliente().getDni().equalsIgnoreCase(dni)) {
                resultado.add(v);
            }
        }
        return resultado;
    }

    public void mostrarVentas() {
        if (ventas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            for (Venta v : ventas) {
                System.out.println("---------------");
                System.out.println(v);
            }
        }
    }

    public void mostrarVentasPorCliente(String dni) {
        boolean hayVentas = false;
        for (Venta v : ventas) {
            if (v.getCliente().getDni().equalsIgnoreCase(dni)) {
                System.out.println("---------------");
                System.out.println(v);
                hayVentas = true;
            }
        }
        if (!hayVentas) {
            System.out.println("No se encontraron ventas para ese cliente.");
        }
    }
}
