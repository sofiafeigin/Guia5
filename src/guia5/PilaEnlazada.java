

package guia5eje1;


public class PilaEnlazada 
{
    private Nodo2 cima;
    
    
    public PilaEnlazada()
    {
       cima=null;
    }
    
    public void push(char dato)
    {
        
        cima=new Nodo2(dato,cima);
        
    }
    
    public char pop() throws Exception
    {
        if(cima==null)
            throw new Exception("pila vacia");
        
        char aux=cima.getDato();
        cima=cima.getNext();
        
        return aux;
        
    }
    
    public boolean esVacia()
    {
        return cima==null;
    }
    
    public void vacear()
    {
        cima=null;
    }
}
