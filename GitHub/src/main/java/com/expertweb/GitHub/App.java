package com.expertweb.GitHub;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	// desarrolladores que intervienen con github
        System.out.println( "Hello World!" );
        
        String [] arreglo = {"hola","mundo","expertweb","test", "github"};
        
        System.out.println("Segundo Desarrollador");

        for (String arreglos:arreglo) {
			System.out.println("Mensaje:" + arreglos);
			System.out.println("Primer Desarrollador");
		}
    }
}
