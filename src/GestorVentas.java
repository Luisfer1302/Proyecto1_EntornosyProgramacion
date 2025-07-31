package tienda;

import java.util.*;

public class GestorVentas {
    private List<Venta> ventas;

    public GestorVentas() {
        ventas = new ArrayList<>();
    }

    public void registrarVenta(Venta venta) {
        ventas.add(venta);
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