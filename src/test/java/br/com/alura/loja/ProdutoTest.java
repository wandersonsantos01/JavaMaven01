package br.com.alura.loja;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ProdutoTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		Produto produto = new Produto("test", BigDecimal.TEN);
		Assert.assertEquals("test", produto.getNome());
		Assert.assertEquals(BigDecimal.TEN, produto.getPreco());
	}

}
