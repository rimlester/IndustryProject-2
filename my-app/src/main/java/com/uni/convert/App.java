package com.uni.convert;

import java.io.File;
import java.io.PrintWriter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	if(args.length == 0){
    		throw new Exception("Not enough arguments");
    	}
        System.out.println( "Hello World!" );
    }
    
    
    private static void WriteFile(String thing){
    	try{
    		PrintWriter p = new PrintWriter(thing + ".out.rdf"); 
    		p.write("Todo");
    		p.close();
    	}catch(Exception ex){
    		//fuckoff reeeeeeeeeeeee
    	}
    	
    }
}
