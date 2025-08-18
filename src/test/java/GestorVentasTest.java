import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GestorVentasTest {

    private GestorVentas gestor;
    private Cliente cliente;
    private MaterialSanitario material;

    @BeforeEach
    void setUp() {
        gestor = new GestorVentas();
        cliente = new Cliente("Luis", "012345678L", "Calle Falsa 123", "luis@email.com");
        material = new MaterialSanitario("Mascarilla", "Protección", 2.5, 100);
    }

    @Test
    void testAgregarVenta() {
        Map<MaterialSanitario, Integer> items = new HashMap<>();
        items.put(material, 10);

        Venta venta = new Venta(cliente, items);
        gestor.registrarVenta(venta);

        // Verifica que ahora hay una venta registrada
        assertEquals(1, gestor.getVentas().size());
        assertTrue(gestor.getVentas().contains(venta));
    }

    @Test
    void testListaVentasInicialVacia() {
        // Verifica que inicialmente no hay ventas
        assertTrue(gestor.getVentas().isEmpty());
    }
}

