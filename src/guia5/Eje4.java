package guia5eje1;

import java.util.Scanner;


public class Eje4 {

    public static PilaEnlazada pe=new PilaEnlazada();
    public static ColaEnlazada2 ce2=new ColaEnlazada2();
    
    public static void main(String[] args) throws Exception 
    {
       Scanner sc=new Scanner(System.in);
       String frase;
       
        System.out.println("ingrese la frase");
        frase=sc.next();
        
        for(int i=0;i<frase.length();i++)
        {
             if(frase.charAt(i)!=' ')
             {
                 pe.push(frase.charAt(i));
                 ce2.encolar(frase.charAt(i));
             }
             
        }
        
        if(palidromo(frase)==true)
            System.out.println("la frase es un palidromo");
        else
            System.out.println("la frase no es palidromo");
            
    }
    
    public static boolean palidromo(String frase) throws Exception
    {
       
        while(pe.esVacia()!=true)
        {
            if(pe.pop()!=ce2.desencolar())
                return false;
                        
           
        }
        
        return true;
    }
}
