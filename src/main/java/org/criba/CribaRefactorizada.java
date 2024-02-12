package org.criba;

import java.util.Arrays;

public class CribaRefactorizada
{
    private CribaRefactorizada()
    {
        throw new IllegalStateException("Utility class");
    }
    public static int[] generarPrimos (int max)
    {
        if (max < 2)
        {
            return new int[0];
        }

        int i; //Declaracion individual de variables
        int j;
        int dim = max + 1;
        boolean[] esPrimo = new boolean[dim];

        Arrays.fill(esPrimo, true);//eliminación del for con el metodo fill()

        esPrimo[0] = esPrimo[1] = false;

        for (i=2; i<=Math.sqrt(dim); i++)
        {
            if (esPrimo[i])
            {
                for (j=2*i; j<dim; j+=i)
                    esPrimo[j] = false;
            }
        }

        int cuenta = 0;

        for (boolean item: esPrimo){ //mejora el for navegando directamente en el for
            if (item)   //a su vez, mejora la validación del if
                cuenta++;
        }

        int[] primos = new int[cuenta];

        for (i=0, j=0; i<dim; i++)
        {
            if (esPrimo[i])
                primos[j++] = i;
        }

        return primos;
    }
}
