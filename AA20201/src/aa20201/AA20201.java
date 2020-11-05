/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import aa20201.data.Grafica;
import busquedas.BusquedaSecuencial;
import busquedas.GeneradorDatos;
import busquedas.Busquedas;
import ordenamiento.Burbuja;
import ordenamiento.InsertionSort;


/**
 *
 * @author Fabián Azrael
 */
public class AA20201 {

    public static void main(String[] args) 
    {
        // TODO code application logic here
        int n = 500;
        int[] aux;
        double[] tiempos = new double[n];
        InsertionSort I = new InsertionSort();

        for (int j = 0; j < n; j++) // 4^n
        {
            //Cambiar el tercer valor en este caso el 4 para el tipo de caso 1 peor, 2 mejor 3 medio 4 aleatorio
            aux = GeneradorDatos.generarArregloIntOrga(j+1,10,2,false); // 1
            //Cambiar el 1 en caso de querer ordenar de Mayor a Menor y 2 de Menor a Mayor
            aux = I.ordenar(aux,2); // 1
            tiempos[j] = (int)I.gettTotal(); // 1
        }  

        Grafica g1 = new Grafica("N","Tiempo","Tiempos");
        g1.agregarSerie("t1",tiempos);
        g1.crearGrafica();
        
        System.out.println();
        g1.muestraGrafica();
    }
}