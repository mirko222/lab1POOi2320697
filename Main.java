
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    // 1.A
	    if(6 < 6 * 5)
		System.out.println("Hello");
		System.out.println("there");
		
		// Respuesta: Hello 
		// there
		
		//  1.B
		
		int x=1, y=2, z=3;
		if(x>y)
		if(x>z)
		System.out.println("1111");
		else
		System.out.println("2222");
		
		// Respuesta: no imprime nada
		
		//1.C
		//	int x=1, y=2, z=3;
		
		
		if(x<z)
		System.out.println("*");
		else if(x==2)
		System.out.println("&");
		else
		System.out.println("$");
		
		// Respuesta: *
		
		//1. D
		 
		 if(x<y)
		 System.out.println("####");
		 else 
		 System.out.println("&&&&");
		 System.out.println("!!!!");
		 
		 // Respuesta: ####, !!!!
		 
		 //1.E
		 
		 if(x>y)
		 System.out.println("####");
		 else 
		 System.out.println("&&&&");
		 System.out.println("!!!!");
		 
		 // Respuesta: &&&&, !!!!
		 
		 //1.F
		  int a1=100; int a2=200;
		  
		  if(a1>100 && a2<=200)
		  System.out.println(a1+" "+a2+" "+(a1+a2));
		  else
		  System.out.println(a1+" "+a2+" "+(2*a1-a2));
	
		 // Respuesta: 100 200 0
		 
		 //1.G
		 if(++x > y++ || x-- > 0 )
		 z++;
		 else
		 z--;
		 System.out.println(x+" "+y+" "+z);
		 
		 //respuesta: 1,3,4
		 
		 //1.H
		 
		 if(x<y) {
		     System.out.println("####");
		     System.out.println("!!!!");
		 }   
		  else
	       System.out.println("&&&&");
	       
	    //respuesta: ####, !!!!
	    
	    //1.I
	     if ('x' > 'y' || 66  > (int)('A'))
	     System.out.println("#!#");
	     
	     //respuesta: #!#
	     
	     //1,j
	     if ( x < y )
	     System.out.println("!");
	     else if (x==z)
	     System.out.println("&");
	     else
	     System.out.println("$");
	     
	     //respuesta !
	}
	
		     
}
