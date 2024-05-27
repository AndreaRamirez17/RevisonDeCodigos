package com.rcdo5; //se agrega el paquete

public class Codigo6 { //Cambiamos el nombre a mayusculas

	public static void main(String[] args) {//se agrega el main

		int[] n = new int[20];//se agrega new

	    for (int i = 0; i < 20; i++) {//se agrega un + al contador 
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");//se agrega el out
	    }
	    
	    System.out.println("¿Qué números quiere resaltar? \n");//se agrega ln al print y se mueve de lugar el salto de linea
	    //agregamos mas system out para que se vea de forma mas limpia
	    System.out.println("1 – los múltiplos de 5");
        System.out.println("2 – los múltiplos de 7");
        System.out.print("Seleccione una opción: ");
	    int opcion = Integer.parseInt(System.console().readLine());//se añade un parentesis

	    int multiplo = (opcion == 1) ? 5 : 7;//cambiamos de orden los operadores

	    for(int e : n) {//cambiamos char por int 
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }//se cierra el if
	       else {
	        System.out.print(e + " ");//cambiamos in por out
	      }
	    }

	}
}