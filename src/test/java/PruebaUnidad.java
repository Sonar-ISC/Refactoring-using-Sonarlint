import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.criba.CribaRefactorizada;
import org.criba.Criba;


public class PruebaUnidad
{

    int[] arreglo1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59};
    int[] arreglo2 = CribaRefactorizada.generarPrimos(60);
    int[] arreglo3 = Criba.generarPrimos(60);

    @Test
    public void PruebaDatosEnBruto()
    {
        Assertions.assertArrayEquals(arreglo1, arreglo2);

    }

    @Test
    public void PruebaComparacionVersionAntigua()
    {
        Assertions.assertArrayEquals(arreglo3, arreglo2);
    }
}
