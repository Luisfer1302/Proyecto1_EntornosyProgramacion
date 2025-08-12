import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("Luis", "Luis"); // Solo nombre
    }

    @Test
    void testGetNombre() {
        assertEquals("Luis", cliente.getNombre());
    }
}
