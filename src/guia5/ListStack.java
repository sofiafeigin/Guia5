

package guia5eje1;


public class ListStack 
{
    private Nodo cima;
    
    
    public ListStack()
    {
       cima=null;
    }
    
    public void push(int dato)
    {
        
        cima=new Nodo(dato,cima);
        
    }
    
    public int pop() throws Exception
    {
        if(cima==null)
            throw new Exception("pila vacia");
        
        int aux=cima.getDato();
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
