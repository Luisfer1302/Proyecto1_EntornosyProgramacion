import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestorVentasTest {

    private GestorVentas gestor;
    private Venta venta;

    @BeforeEach
    void setUp() {
        gestor = new GestorVentas();
        MaterialSanitario m = new MaterialSanitario("Mascarilla", 10);
        Cliente c = new Cliente("Luis", "Calle Falsa 123");
        venta = new Venta(m,
                c,
                2);
    }

    @Test
    void testAgregarVenta() {
        gestor.mostrarVentas();
        assertEquals(1, gestor.getClass().isSealed());
    }
}
