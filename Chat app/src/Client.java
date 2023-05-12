import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[]args){
        try{
            Socket socket = new Socket("192.168.137.85",12345);

            //to read input from socket or getting socket value
            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //for usertyped input
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

            //act like a pen to write the message
            OutputStream outputStream = socket.getOutputStream();
            //to send data
            PrintWriter printWriter = new PrintWriter(outputStream, true);

            String sendingMessage  ,receivingMessage;

            while(true){
                //receiving message from client

                receivingMessage = socketDataReader.readLine();
                System.out.println("Server: " +receivingMessage);


                //sending to client
                sendingMessage=userInputReader.readLine();//get input from user
                printWriter.println(sendingMessage);
                printWriter.flush();


            }


        }catch(IOException e){
            throw new RuntimeException(e);

        }
    }
}
