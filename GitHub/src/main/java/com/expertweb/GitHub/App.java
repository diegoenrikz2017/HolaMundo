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

        for (int i = 0; i < arreglo.length; i++) {
			System.out.println("Mensaje:" + arreglo[i]);
		}
    }
}
