import java.net.*;
import java.io.*;
import java.util.*;

class HttpServer{
    public static void main(String[] args){	
	try{
	    ServerSocket ss = new ServerSocket(Integer.parseInt(args[0]));
	    System.out.println("web server starting");
	}catch(ArrayIndexOutOfBoundsException e){
	    System.err.println("Usage: java HttpServer <port>");
	}catch(Exception e){
		System.err.println("Exception: " + e);
	    }
    }
}