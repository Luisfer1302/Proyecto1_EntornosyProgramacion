import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestorClientesTest {

    private GestorClientes gestor; //Instancia del gestor que será utilizada en los test

    @BeforeEach
    void setUp() {
        //Prepara un gestor vacío antes de cada test para asegurar independencia de pruebas
        gestor = new GestorClientes();
    }

    @Test
    void testAgregarCliente() {
        //Crea un cliente ejemplo
        Cliente c = new Cliente("Ana", "12345678L","600234598" ,"proyecto@prueba.com");
        //Lo agrega al gestor
        gestor.agregarCliente(c);
        assertEquals(1, gestor.getClientes().size());
    }
    }
