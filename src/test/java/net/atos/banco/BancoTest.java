package net.atos.banco;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BancoTest {

    private Banco banco;
    private ContaBancaria c1;
    private ContaBancaria c2;

    @Before
    public void setUp() {
        this.banco = new Banco();
        ContaBancaria c1 = new ContaBancaria(100.0);
        ContaBancaria c2 = new ContaBancaria(200.0);
    }

    @Test
    public void testAdicionarConta() {
        this.banco.adicionarConta(c1);

        assertEquals(1, this.banco.getContas().size());
        assertEquals(c1, this.banco.getContas().get(0));
    }

    @Test
    public void testAdicionarMultiplasContas() {
        banco.adicionarConta(c1);
        banco.adicionarConta(c2);

        assertEquals(2, banco.getContas().size());
        assertEquals(c1, banco.getContas().get(0));
        assertEquals(c2, banco.getContas().get(1));
    }
}
