

package guia5eje1;


public class Nodo2 
{
    private char dato;
    private Nodo2 next;
    
    public Nodo2(char d, Nodo2 n)
    {
        next=n;
        dato=d; 
    }
    
    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public Nodo2 getNext() {
        return next;
    }

    public void setNext(Nodo2 next) {
        this.next = next;
    }
    
    
}
