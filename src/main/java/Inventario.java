
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    //Lista que almacena todos los materiales sanitarios
    private List<MaterialSanitario> materiales;
    //Inicializa la lista de materiales
    public Inventario() {
        materiales = new ArrayList<>();
    }
    //Agrega un material al inventario
    public void agregarMaterial(MaterialSanitario material) {
        materiales.add(material);
    }
    //Devuelve la lista completa de materiales
    public List<MaterialSanitario> getMateriales() {
        return materiales;
    }
    //Muestra por consola todos los materiales del inventario
    public void mostrarMateriales() {
        for (MaterialSanitario m : materiales) {
            System.out.println(m);
        }
    }
    //Busca un material por su nombre ignorando mayúsculas/minúsculas
    public MaterialSanitario buscarMaterial(String nombre) {
        for (MaterialSanitario m : materiales) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                return m; //Retorna el material encontrado
            }
        }
        return null; // Devuelve null si no ha encontrado el material
    }
    //Elimina un material del inventario por su nombre
    public void eliminarMaterial(String nombre) {
        materiales.removeIf(m -> m.getNombre().equalsIgnoreCase(nombre));
    }
}