
public class MaterialSanitario {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    public MaterialSanitario(String nombre, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "Material {Nombre='" + nombre + "', Categoría='" + categoria + "', Precio=" + precio + "€, Stock=" + stock + "}";
    }

}