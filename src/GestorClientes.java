package tienda;

import java.util.ArrayList;
import java.util.List;

public class GestorClientes {
    private List<Cliente> clientes;

    public GestorClientes() {
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void mostrarClientes() {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public Cliente buscarClientePorDNI(String dni) {
        for (Cliente c : clientes) {
            if (c.getDni().equalsIgnoreCase(dni)) {
                return c;
            }
        }
        return null;
    }

    public void eliminarCliente(String dni) {
        clientes.removeIf(c -> c.getDni().equalsIgnoreCase(dni));
    }
}