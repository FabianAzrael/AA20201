/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author Fabián Azrael
 */
public class InsertionSort 
{
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public InsertionSort() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }
    
    public int[] ordenar (int[] datos,int tipo)
    {
        this.tInicio = System.currentTimeMillis();
        if(tipo == 1)
        {
            datos = ordenarDatosMayor(datos);
        }
        else
        {
            datos = ordenarDatosMenor(datos);
        }
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
        return datos;
    }

    public long gettFinal() {
        return tFinal;
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettTotal() {
        return tTotal;
    }
    
    public int[] ordenarDatosMenor(int arr[])  
    {  
        int i, key, j;  
        for (i = 1; i < arr.length; i++) 
        {  
            key = arr[i];  
            j = i - 1;  

            while (j >= 0 && arr[j] > key) 
            {  
                arr[j + 1] = arr[j];  
                j = j - 1;  
            }  
            arr[j + 1] = key;  
        } 
        return arr;
    }  

    
    public int[] ordenarDatosMayor(int arr[])  
    {  
        int i, key, j;  
        for (i = 1; i < arr.length; i++) 
        {  
            key = arr[i];  
            j = i - 1;  

            while (j <= 0 && arr[j] < key) 
            {  
                arr[j + 1] = arr[j];  
                j = j - 1;  
            }  
            arr[j + 1] = key;  
        } 
        return arr;
    }  
}
