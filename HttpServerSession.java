import java.net.*;
import java.io.*;
import java.util.*;

class HttpServerSession extends Thread{
    private Socket socket;
    public void run(){
	
    }

    HttpServerSession(Socket s){
	socket = s;
    }
}