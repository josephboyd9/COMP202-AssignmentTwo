import java.net.*;
import java.io.*;
import java.util.*;

class HttpServer{
    public static void main(String[] args){	
	try{
	    ServerSocket ss = new ServerSocket(Integer.parseInt(args[0]));
	    Socket client = ss.accept();
	    HttpServerSession session = new HttpServerSession(client);
	    session.start();
	    String ip = client.getInetAddress().getHostAddress();
	    System.out.println("Connection established at ip: " + ip);
	    client.close();
	}catch(ArrayIndexOutOfBoundsException e){
	    System.err.println("Usage: java HttpServer <port>");
	}catch(Exception e){
		System.err.println("Exception: " + e);
	    }
    }
}
class HttpServerSession extends Thread{
    private Socket socket;
    private String request;
    public void run(){
	try{
	    BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	    /* when the client disconnects, readLine returns null */
	    if(reader.readLine()!=null){
		request = reader.readLine();
		System.out.println(request);
	    }
	}catch(Exception e){
	    System.err.println("ServerSession exception: "+e);
	}
    }

    HttpServerSession(Socket s){
	socket = s;
    }
}