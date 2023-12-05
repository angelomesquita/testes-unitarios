package net.atos.ecommerce;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaiorMenorTest {

    private CarrinhoDeCompras carrinho;
    private MaiorEMenor algoritmo;

    @Before
    public void setUp() {
        carrinho = new CarrinhoDeCompras();
        algoritmo = new MaiorEMenor();
    }

    @Test
    public void testComCarrinhoVazio() {
        // Act
        algoritmo.encontra(carrinho);

        // Assert
        assertNull(algoritmo.getMenor());
        assertNull(algoritmo.getMaior());
    }

    @Test
    public void testComUnicoProduto() {
        // Arrange
        carrinho.adiciona(new Produto("Jogo de Pratos", 70.0));

        // Act
        algoritmo.encontra(carrinho);

        // Assert
        assertEquals("Jogo de Pratos", algoritmo.getMenor().getNome());
        assertEquals("Jogo de Pratos", algoritmo.getMaior().getNome());
    }

    @Test
    public void testOrdemDecrescente() {
        // Arrange
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Jogo de Pratos", 70.0));

        // Act
        algoritmo.encontra(carrinho);

        // Assert
        assertEquals("Jogo de Pratos", algoritmo.getMenor().getNome());
        assertEquals("Geladeira", algoritmo.getMaior().getNome());
    }

    @Test
    public void testOrdemCrescente() {
        // Arrange
        carrinho.adiciona(new Produto("Jogo de Pratos", 70.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Geladeira", 450.0));

        // Act
        algoritmo.encontra(carrinho);

        // Assert
        assertEquals("Jogo de Pratos", algoritmo.getMenor().getNome());
        assertEquals("Geladeira", algoritmo.getMaior().getNome());
    }

    @Test
    public void testOrdemVariada() {
        // Arrange
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Jogo de Pratos", 70.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));

        // Act
        algoritmo.encontra(carrinho);

        // Assert
        assertEquals("Jogo de Pratos", algoritmo.getMenor().getNome());
        assertEquals("Geladeira", algoritmo.getMaior().getNome());
    }

}
