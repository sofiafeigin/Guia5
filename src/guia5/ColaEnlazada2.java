
package guia5eje1;


public class ColaEnlazada2
{
    private Nodo2 entrada;
    private Nodo2 salida;
    
    public ColaEnlazada2()
    {
        entrada=null;
        salida=null;
    }
    
    public void encolar(char dato)
    {
        Nodo2 aux=new Nodo2(dato,null);
        
        if(entrada!=null)
            entrada.setNext(aux);
        
        entrada=aux;
        
        
        if(salida==null)
            salida=entrada;
         
    }
    
    public char desencolar() throws Exception
    {
        if(salida==null)
            throw new Exception("cola vacia");
        
        char resultado=salida.getDato();
        
        salida=salida.getNext();
        
        if(salida==null)
            entrada=null;
        
        return resultado;
        
        
    }
    
    public boolean esVacia()
    {
        return salida==null;
    }
    
    public void vaciar()
    {
        salida=null;
        entrada=null;
    }
}
