
import org.junit.Assert;
import org.junit.Test;

public class PalindromoTest {

    @Test
    public void testRotator() {
        Palindromo verificador = new Palindromo();
        String frase = "Rotator";
        boolean resposta = verificador.ePalindromo(frase);
        Assert.assertTrue(resposta);
    }

    @Test
    public void testmadam() {
        Palindromo verificador = new Palindromo();
        String frase = "madam";
        boolean resposta = verificador.ePalindromo(frase);
        Assert.assertTrue(resposta);
    }

    @Test
    public void testelephant() {
        Palindromo verificador = new Palindromo();
        String frase = "elephant";
        boolean resposta = verificador.ePalindromo(frase);
        Assert.assertFalse(resposta);
    }
}