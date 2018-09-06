
package guia5eje1;

import java.util.Scanner;


public class Eje1 {

   
    public static void main(String[] args) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        int dato;
        ListStack ls=new ListStack();
        ColaEnlazada ce=new ColaEnlazada();
        
        System.out.println(ls.esVacia());
        System.out.println(ce.esVacia());
        
        
        System.out.println("ingrese el dato");
        dato=sc.nextInt();
        
        
        
        
        
        while(dato!=0)
        {
            ls.push(dato);
            ce.encolar(dato);
            
            System.out.println("ingrese el dato");
            dato=sc.nextInt();
            
            
        }
        
        System.out.println(ls.esVacia());
        System.out.println(ce.esVacia());
        ls.pop();
        ls.pop();
        ls.pop();
        ls.pop();
        ce.desencolar();
        ce.desencolar();
        ce.desencolar();
        ce.desencolar();
       
    }
    
}
