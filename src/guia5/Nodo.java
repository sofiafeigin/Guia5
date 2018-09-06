

package guia5eje1;


public class Nodo 
{
    private int dato;
    private Nodo next;
    
    public Nodo(int d, Nodo n)
    {
        next=n;
        dato=d; 
    }
    
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
}
