
package guia5eje1;

import java.util.Scanner;


public class Eje3 {

    public static PilaEnlazada pe=new PilaEnlazada();
    public static void main(String[] args) throws Exception 
    {
       Scanner sc=new Scanner(System.in);
       
       
       String funcion;
       
        System.out.println("escriba la funcion");
        funcion=sc.next();
        
        for(int j=0;j<funcion.length();j++)
        pe.push(funcion.charAt(j));
        
        contar(funcion);
        
    }
    
    public static void contar(String funcion) throws Exception
    {
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int cont5=0;
        int cont6=0;
        char valor;
        
        for(int i=0;i<funcion.length();i++)
        {
            valor=pe.pop();
            if(valor=='(')
                cont1++;
            if(valor=='[')
                cont2++;
            if(valor=='{')
                cont3++;
            if(valor==')')
                cont4++;
            if(valor==']')
                cont5++;
            if(valor=='}')
                cont6++;
        }
        
        if(cont1==cont4&&cont2==cont5&&cont3==cont6)
            System.out.println("la funcion esta escrita correctamente");
        else
        {
            System.out.println("la funcion no esta correctamente escrita");
            System.out.println("cantidad de (: "+cont1);
            System.out.println("cantidad de ): "+cont4);
            System.out.println("cantidad de [: "+cont2);
            System.out.println("cantidad de ]: "+cont5);
            System.out.println("cantidad de {: "+cont3);
            System.out.println("cantidad de }: "+cont6);
             
        }
    }
    
}
