
package guia5eje1;

import java.util.Scanner;

public class Eje2 {

    public static ListStack ls=new ListStack();
    
    public static void main(String[] args) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        int dato,contador=0;
        String operacion;
        
        
        System.out.println("ingrese el dato");
        dato=sc.nextInt();
        
        while(dato!=0)
        {
            contador=contador +1;
            ls.push(dato);
            
            System.out.println("ingrese el dato");
            dato=sc.nextInt();
            
            
        }
        
        for(int i=0;i<contador-1;i++)
        {
            System.out.println("ingrese la operacion");
            operacion=sc.next();
            
            operacion(operacion);
            
        }
    }
    
    public static void operacion(String operacion) throws Exception
    {
        int j=1,suma,resta,multi,divi;
        
        
        if(operacion.equals("+")==true)
        {
            suma=ls.pop()+ls.pop();
            System.out.println(j+")"+suma);
            ls.push(suma);
            j++;
        }
        
        if(operacion.equals("-")==true)
        {
            resta=ls.pop()-ls.pop();
            System.out.println(j+")"+resta);
            ls.push(resta);
            j++;
        }
        
        if(operacion.equals("*")==true)
        {
            multi=ls.pop()*ls.pop();
            System.out.println(j+")"+multi);
            ls.push(multi);
            j++;
        }
        
        if(operacion.equals("/")==true)
        {
            divi=ls.pop()/ls.pop();
            System.out.println(j+")"+divi);
            ls.push(divi);
            j++;
        }
    }
    
}
