
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // Atributo para guardar una lista de enteros.
    private int arrayEnteros[];

    /**
     * Constructor for objects of class ArrayListInt, inicializamos el array con tamaño minimo.
     */
    public ArrayListInt()
    {
        arrayEnteros = new int[0];
    }
    
    /**
     * Metodo que añade un elemento a la colección al final de la misma.
     * Obtenemos el tamaño del array principal, creamos un array auxiliar de tamaño 1 mas el tamaño del principal.
     * Copiamos todos los elementos del principal al auxiliar.
     * Finalmente le añadimos el ultimo elemento.
     * Asignamos a nuestro array de enteros el auxiliar con el ultimo elemento añadido.
     */
    public void add(int elemento)
    {
        int tamanho = arrayEnteros.length;
        int[] aux = new int[tamanho+1];
        for(int i = 0;i < tamanho;i++)
        {
            aux[i] = arrayEnteros[i];
        }
        aux[tamanho] = elemento;
        arrayEnteros = aux;
    }
    
    /**
     * Metodo que añade un elemento a la colección en la posición especificada por el parámetro index. 
     * Si el valor de index no es válido, entonces no hace nada. Los elementos a continuación del añadido se desplazan una posición.
     */
    public void add(int index, int elemento)
    {
        int tamanho = arrayEnteros.length;
        if(index >= 0 && index <= tamanho)
        {
            int[] aux = new int[tamanho+1];
            int i = 0;
            int indexAux = 0;
            while(i < tamanho+1)
            {
                if(i == index)
                {
                    aux[i] = elemento;
                }
                else
                {
                    aux[i] = arrayEnteros[indexAux];
                    indexAux++;
                }
                i++;
            }
            arrayEnteros = aux;
        }
    }
    
    /**
     * Metodo que vacia nuestro array de enteros.
     */
    public void clear()
    {
        arrayEnteros = new int[0];
    }
}
