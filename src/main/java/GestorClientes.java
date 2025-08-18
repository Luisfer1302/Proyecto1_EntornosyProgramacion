import java.util.ArrayList;
import java.util.List;

public class GestorClientes {
    //Lista interna donde se almacenan los clientes
    private List<Cliente> clientes;
    //Inicializa la lista vacía
    public GestorClientes() {
        clientes = new ArrayList<>();
    }
    //Agrega un nuevo cliente a la lista
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    //Obtener la lista completa de clientes
    public List<Cliente> getClientes() {
        return clientes;
    }
    //Mostrar por consola todos los clientes registrados
    public void mostrarClientes() {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
    //Buscar un cliente por su DNI
    public Cliente buscarClientePorDNI(String dni) {
        for (Cliente c : clientes) {
            //Se compara el DNI tanto en mayúsculas/minúsculas
            if (c.getDni() != null && c.getDni().equalsIgnoreCase(dni)) {
                return c; //Si encuentra el DNI, lo devuelve
            }
        }
        return null;  //Si no existe, devuelve null
    }
    //Elimina un cliente de la lista mediante el DNI
    public void eliminarCliente(String dni) {
        clientes.removeIf(c -> c.getDni() != null && c.getDni().equalsIgnoreCase(dni));
    }
}
