import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VentaTest {

    private Venta venta;

    @BeforeEach
    void setUp() {
        MaterialSanitario m = new MaterialSanitario("Gel", 20);
        Cliente c = new Cliente("Luis", "Calle Falsa 123");
        venta = new Venta(c, m, 5);
    }

    @Test
    void testGetCantidad() {
        assertEquals(5, venta.getItems());
    }

    @Test
    void testGetCliente() {
        assertEquals("Luis", venta.getCliente().getNombre());
    }
}
