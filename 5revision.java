package com.rcdo5;
//importa el java util scanner 
import java.util.Scanner;
public class Codigo5 {
	public static void main(String[] args) {//agregamos el main
		//agregamos el system.in, cambiamos a sc
		Scanner sc = new Scanner(System.in);
	    System.out.println("Introduzca un número: ");//corregimos comillas
	    int ni = sc.nextInt();//cambiamos a numero
	    int c = ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  ni /= 10;
	    }
	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado.");//agregamos la t en print
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
	    sc.close();//cerramos sc
	}
	

}