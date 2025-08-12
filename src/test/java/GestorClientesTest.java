import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestorClientesTest {

    private GestorClientes gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorClientes();
    }

    @Test
    void testAgregarCliente() {
        Cliente c = new Cliente("Ana", "Calle Real 5");
        gestor.agregarCliente(c);
        assertEquals(1, gestor.getClientes().size());
    }
}
