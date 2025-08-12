import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test de la clase Producto.
 */
public class ProductoTest {

    private Producto producto;

    @BeforeEach
    void setUp() {
        // Crear un producto antes de cada test
        producto = new Producto("Pan", 1.0, 10); // nombre, precio, IVA
    }

    @Test
    void testCalcularPrecioFinal() {
        // Precio final = precio + IVA
        assertEquals(1.1, producto.calcularPrecioFinal(), 0.01);
    }

    @Test
    void testCalcularPrecioNegativo() {
        Producto p = new Producto("Pan", -1.0, 10);
        assertThrows(IllegalArgumentException.class, p::calcularPrecioFinal);
    }

    private class Producto {
        public Producto(String pan, double v, int i) {
        }

        public double calcularPrecioFinal() {
            return 0;
        }
    }

}
