
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaterialSanitarioTest {

    private MaterialSanitario material;

    @BeforeEach
    void setUp() {
        material = new MaterialSanitario("Mascarilla", "Protección", 0.0, 100);
    }

    @Test
    void testGetNombre() {
        assertEquals("Mascarilla", material.getNombre());
    }

    @Test
    void testGetCantidad() {
        assertEquals(100, material.getStock());
    }
}
