
package guia5eje1;


public class ColaEnlazada 
{
    private Nodo entrada;
    private Nodo salida;
    
    public ColaEnlazada()
    {
        entrada=null;
        salida=null;
    }
    
    public void encolar(int dato)
    {
        Nodo aux=new Nodo(dato,null);
        
        if(entrada!=null)
            entrada.setNext(aux);
        
        entrada=aux;
        
        
        if(salida==null)
            salida=entrada;
         
    }
    
    public int desencolar() throws Exception
    {
        if(salida==null)
            throw new Exception("cola vacia");
        
        int resultado=salida.getDato();
        
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
