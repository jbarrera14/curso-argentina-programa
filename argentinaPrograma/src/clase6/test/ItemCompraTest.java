package clase6.test;

import clase6.java.modelos.ItemCompra;
import clase6.java.modelos.Producto;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ItemCompraTest {

    ItemCompra objItemCompraTest;

    @BeforeEach
    public void setUp(){
        objItemCompraTest = new ItemCompra();
    }
    @org.junit.jupiter.api.Test
    void testCalcularSubtotal() {
        objItemCompraTest.setCantidad(2);
        objItemCompraTest.setProducto(new Producto("Arroz", 200));

        double subTotal = objItemCompraTest.calcularSubtotal();
        double subTotalEsperado = 400.0;

        boolean resultado = ( subTotal == subTotalEsperado);
        assertTrue(resultado);
    }

    @org.junit.jupiter.api.Test
    void testFallaCalularSubtotal() {
        objItemCompraTest.setCantidad(2);
        objItemCompraTest.setProducto(new Producto("yerba", 700));
        double subtotal = objItemCompraTest.calcularSubtotal();
        double subtotalEsperado = 700;
        boolean result = ( subtotal == subtotalEsperado );
        assertFalse(result);
    }
}