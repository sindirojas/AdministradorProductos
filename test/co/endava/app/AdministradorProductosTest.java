package co.endava.app;

import co.endava.datos.Comida;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {

    @Test
    void main() {
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now());
        int descuento= (int) (p3.getPrecio()*0.1);
        assertEquals(descuento, p3.getDescuento());
    }
}