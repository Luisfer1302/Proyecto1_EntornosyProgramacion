public class Cliente {
    private String nombre;
    private String dni;
    private String telefono;
    private String email;

    // Constructor con todos los datos
    public Cliente(String nombre, String dni, String telefono, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

    // Métodos para acceder/ modificar los atributos
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }


    // Representación en forma de texto del cliente
    @Override
    public String toString() {
        //Devuelve un String con los datos principales del cliente
        return "Cliente {Nombre='" + nombre + "', DNI='" + dni +
                "', Teléfono='" + telefono + "', Email='" + email + "'}";
    }
}
