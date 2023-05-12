import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(12345);
            Socket socket = serverSocket.accept();
            System.out.println("A client is connected");

           // InputStream inputStream = ;
           // InputStream inputStream= new
           // InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());


            //to read input from socket or getting socket value
            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //for usertyped input
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

            //act like a pen to write the message
            OutputStream outputStream = socket.getOutputStream();
            //to send data
            PrintWriter printWriter = new PrintWriter(outputStream, true);

            String sendingMessage ,receivingMessage;

            while(true){
                //sending to client
                sendingMessage=userInputReader.readLine();//get input from user
                printWriter.println(sendingMessage);
                printWriter.flush();

                //receiving message from client

                receivingMessage = socketDataReader.readLine();
                System.out.println("Client: " + receivingMessage);
            }


        }catch(IOException e){
            throw new RuntimeException(e);

        }
    }
}