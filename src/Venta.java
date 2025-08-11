
import java.time.LocalDateTime;
import java.util.Map;

public class Venta {
    private Cliente cliente;
    private Map<MaterialSanitario, Integer> items;
    private LocalDateTime fecha;

    public Venta(Cliente cliente, Map<MaterialSanitario, Integer> items) {
        this.cliente = cliente;
        this.items = items;
        this.fecha = LocalDateTime.now();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Map<MaterialSanitario, Integer> getItems() {
        return items;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Map.Entry<MaterialSanitario, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrecio() * entry.getValue();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder detalle = new StringBuilder();
        detalle.append("Venta a cliente ").append(cliente.getNombre()).append(" (").append(cliente.getDni()).append(")\n");
        detalle.append("Fecha: ").append(fecha).append("\n");
        detalle.append("Productos:\n");
        for (Map.Entry<MaterialSanitario, Integer> entry : items.entrySet()) {
            detalle.append(" - ").append(entry.getKey().getNombre()).append(" x").append(entry.getValue())
                   .append(" = ").append(entry.getKey().getPrecio() * entry.getValue()).append("€\n");
        }
        detalle.append("Total: ").append(calcularTotal()).append("€");
        return detalle.toString();
    }
}