
public class MaterialSanitario {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
    //Recibe y asigna nombre, categoria, precio y stock
    public MaterialSanitario(String nombre, String categoria,double precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }
    //Getters y setters
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(int stock) { this.stock = stock; }
    // Representación legible al imprimir el material
    @Override
    public String toString() {
        return "Material {Nombre='" + nombre + "', Categoría='" + categoria + "', Precio=" + precio + "€, Stock=" + stock + "}";
    }

}