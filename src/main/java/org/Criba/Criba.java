package org.Criba;

public class Criba
{
    public static int[] generarPrimos (int max)
    {
        int i, j;
        //Declaraciones
        if (max >= 2)
        {
            int dim = max + 1; //Tamaño del array
            boolean[] esPrimo = new boolean[dim];

            //Inicializar el array
            for (i=0; i<dim; i++)
                esPrimo[i] = true;

            // Eliminar el 0 y 1, que no son primos
            esPrimo[0] = esPrimo[1] = false;

            // Criba
            for (i=2; i<Math.sqrt(dim)+1; i++)
            {
                if (esPrimo[i])
                {
                    for (j=2*i; j<dim; j+=i)
                        esPrimo[j] = false;
                }
            }

            // ¿Cuantos primos hay?
            int cuenta = 0;

            for (i=0; i<dim; i++)
            {
                if (esPrimo[i])
                    cuenta++;
            }

            // Rellenar el vector de números primos
            int[] primos = new int[cuenta];

            for (i=0, j=0; i<dim; i++)
            {
                if (esPrimo[i])
                    primos[j++] = i;
            }

            return primos;
        }

        else //max < 2

        {
            return new int[0]; //Vector vacío
        }
    }
}
