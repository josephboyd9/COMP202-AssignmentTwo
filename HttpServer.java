import java.net.*;
import java.io.*;
import java.util.*;

class HttpServer{
    public static void main(String[] args){	
	try{
	    ServerSocket ss = new ServerSocket(8080);
	    System.out.println("web server starting");
	}catch(Exception e){
		System.err.println("Exception: " + e);
	    }
    }
}