/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;

import java.util.Random;

/**
 *
 * @author Fabián Azrael
 */
public class GeneradorDatos {
    
    
    public static int[] generarArregloInt(int x, int dim, int bound,int clase, boolean mostrarArray)
    {
        int[] arreglo = new int[dim];
        
        Random ran = new Random();
       
        for(int y=0; y < dim; y++)
        {
            arreglo[y] = ran.nextInt(bound);
            while(arreglo[y] == x)
            {
                arreglo[y] = ran.nextInt(bound);
            }
        }
        
        int pos = 0;
        switch (clase)
        {
            //Peor Caso
            case 1:
            {
                pos = arreglo.length - 1;
                break;
            }
            //Mejor Caso
            case 2:
            {
                pos = 0;
                break;
            }
            //Caso Medio
            case 3:
            {
                pos = arreglo.length / 2;
                break;
            }
            //Caso aleatorio
            default:
            {
                pos = ran.nextInt(dim);
                break;
            }
        }
        
        arreglo[pos] = x;
        
        mostrarArray(arreglo,mostrarArray);
        return arreglo;
    }
    
    public static int[] generarArregloIntOrga(int dim, int bound,int clase, boolean mostrarArray)
    {
        int[] arreglo = new int[dim];
        
        Random ran = new Random();
        
        switch (clase)
        {
            //Menor a Mayor
            case 1:
            {
                for(int y=0; y < dim; y++)
                {
                    arreglo[y] = y;
                }
                break;
            }
            
            //De mayor a menor
            case 2:
            {
                int cont = dim;
                for(int y=0; y < dim; y++)
                {
                    arreglo[y] = cont;
                    cont--;
                }
                break;
            }
            
            //Mitad de Mayor a Menor y otra mitad de Menor a Mayor
            case 3:
            {
                int cont = dim;
                for(int y=0; y < dim/2; y++)
                {
                    arreglo[y] = cont;
                    cont--;
                }
                for(int y=(int)dim/2; y < dim; y++)
                {
                    arreglo[y] = y;
                }
                break;
            }
            
            //Caso aleatorio
            default:
            {
                for(int y=0; y < dim; y++)
                {
                    arreglo[y] = ran.nextInt(bound);
                }
                break;
            }
        }
        
        mostrarArray(arreglo,mostrarArray);
        return arreglo;
    }
    
    public static int[] generarArregloInt(int dim, int bound, boolean mostrarArray)
    {
        int[] arreglo = new int[dim];
        
        Random ran = new Random();
       
        for(int y=0; y < dim; y++)
        {
            arreglo[y] = ran.nextInt(bound);
        }
        
        mostrarArray(arreglo,mostrarArray);
        return arreglo;
    }
    
    
    public static void mostrarArray(int[] aux,boolean mostrarArray)
    {
        if(mostrarArray == true)
        {
            for(int l =0; l<aux.length; l++)
            {
                System.out.print("["+l+"]");
            }
            System.out.println();
            for(int l =0; l<aux.length; l++)
            {
                System.out.print("-"+aux[l]+"-");
            }
            System.out.println();
        }
        
    }
}
