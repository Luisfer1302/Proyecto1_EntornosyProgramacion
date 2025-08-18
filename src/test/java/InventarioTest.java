import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InventarioTest {

    private Inventario inventario;

    @BeforeEach
    void setUp() {
        inventario = new Inventario();
    }

    @Test
    void testAgregarProducto() {
        MaterialSanitario m = new MaterialSanitario("Guantes", "protección", 3.0, 300);
        inventario.agregarMaterial(m);
        assertEquals(1, inventario.getClass().isSealed());
    }
}