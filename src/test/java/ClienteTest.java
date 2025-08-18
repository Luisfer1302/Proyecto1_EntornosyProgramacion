import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    void setUp() {
        // Usamos el constructor con dos parámetros
        cliente = new Cliente("Luis", "012345678L", "603216546", "proyecto@prueba.com");
    }

    @Test
    void testGetNombre() {
        assertEquals("Luis", cliente.getNombre());
    }

    @Test
    void testGetDni() {
        assertEquals("012345678L", cliente.getDni());
    }

    @Test
    void testTelefonoPorDefecto() {
        assertEquals("Sin teléfono", cliente.getTelefono());
    }

    @Test
    void testEmailPorDefecto() {
        assertEquals("Sin email", cliente.getEmail());
    }
}
