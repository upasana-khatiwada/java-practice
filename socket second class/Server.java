
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main (String[]args){
        System.out.println("Server");
        try{
            ServerSocket ss = new ServerSocket(12345);
            //serverSocket.accept();
            Socket socket = ss.accept();
            System.out.println("A client has connected");

            OutputStream outputStream = socket.getOutputStream();

            Scanner scanner = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(outputStream , true);
            //System.out.println("enter anything: ");


            while(true){
                String print = scanner.nextLine();
                //System.out.println(" ");
                //pw.println("Hello world");
                pw.println(print);
            }



        }
        catch(IOException e){
            System.out.println("Cannot connect to Client");
            throw new RuntimeException(e);
        }

    }
}
