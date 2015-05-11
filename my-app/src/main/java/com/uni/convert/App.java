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
        WriteFile(args[0], args[0] + ".out.rdf");
    }
    
    
    private static void WriteFile(String thing, String path){
    	try{
    		PrintWriter p = new PrintWriter(path); 
    		p.write("Todo");
    		p.close();
    	}catch(Exception ex){
    		//fuckoff reeeeeeeeeeeee
    	}
    }
    
}
