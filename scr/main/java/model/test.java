package scr.main.java.model;
package test.java.service;


import org.junit.Assert;
import org.junit.Test;

public class PalindromoTest {

    @Test
    public void testRotator() {
        Palindromo verificador = new Palindromo();
        String frase = "Rotator";
        boolean resposta = verificador.ehPalindromo(frase);
        Assert.assertTrue("erro no algoritmo", resposta);
    }

    @Test
    public void testmadam() {
        Palindromo verificador = new Palindromo();
        String frase = "madam";
        boolean resposta = verificador.ehPalindromo(frase);
        Assert.assertTrue("erro no algoritmo", resposta);
    }

    @Test
    public void testelephant() {
        Palindromo verificador = new Palindromo();
        String frase = "elephant";
        boolean resposta = verificador.ehPalindromo(frase);
        Assert.assertFalse("Erro no algoritmo", resposta);
    }
}