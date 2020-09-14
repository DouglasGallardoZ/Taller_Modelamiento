package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		
		int ladoA=0, ladoB=0, ladoC=0;	
		
	    System.out.print("Ingresa lado A: ");
	    ladoA=leer.nextInt();
	    System.out.print("Ingresa lado B: ");
	    ladoB=leer.nextInt();
	    System.out.print("Ingresa lado C: ");
	    ladoC=leer.nextInt();
	    
	    if (ladoA == ladoB)
	    {
	        if (ladoB == ladoC)
	        {
	            System.out.println("**Triangulo equilatero**"); 
	        }else
	        {
	            System.out.println("**Triangulo isosceles**");
	        }
	    }else
	    {
	    	if(ladoA == ladoC) {
	    		System.out.println("**Triangulo isosceles**");
	    	}else {
	    		if(ladoB == ladoC) {
	    			System.out.println("**Triangulo isosceles**");
	    		}else {
	    			System.out.println("**Triangulo escaleno**");
	    		}
	    		
	    	}
	    }
	    	
		
		
		

	}
	

}
