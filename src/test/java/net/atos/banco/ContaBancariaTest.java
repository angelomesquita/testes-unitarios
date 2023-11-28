package net.atos.banco;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContaBancariaTest {

    private ContaBancaria conta;

    @Before
    public void setUp() {
        conta = new ContaBancaria(100.0);
    }

    @Test
    public void testSaldoInicial() {
        assertEquals(100.0, conta.getSaldo(), 0.001);
    }

    @Test
    public void testDepositar() {
        conta.depositar(0.01);
        assertEquals(100.01, conta.getSaldo(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositoInvalido() {
        conta.depositar(0.0);
    }

    @Test
    public void testSacar() {
        conta.sacar(0.01);
        assertEquals(99.99 , conta.getSaldo(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaqueInvalidoQuandoValorMenorOuIgualAZero() {
        conta.sacar(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaqueInvalidoQuandoValorMaiorQueSaldo() {
        conta.sacar(100.01);
    }
}
