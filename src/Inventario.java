package tienda;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<MaterialSanitario> materiales;

    public Inventario() {
        materiales = new ArrayList<>();
    }

    public void agregarMaterial(MaterialSanitario material) {
        materiales.add(material);
    }

    public List<MaterialSanitario> getMateriales() {
        return materiales;
    }

    public void mostrarMateriales() {
        for (MaterialSanitario m : materiales) {
            System.out.println(m);
        }
    }

    public MaterialSanitario buscarMaterial(String nombre) {
        for (MaterialSanitario m : materiales) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                return m;
            }
        }
        return null;
    }

    public void eliminarMaterial(String nombre) {
        materiales.removeIf(m -> m.getNombre().equalsIgnoreCase(nombre));
    }
}