import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket =new DatagramSocket();
        String message = "Hello world";
        //generate address
        InetAddress address = InetAddress.getByName("localhost");
      //message , message length ,tesko address and port
        DatagramPacket packet = new DatagramPacket(message.getBytes(),message.length(),address,12345);

        //sending packets via socket
        System.out.println("Sending message....");
        socket.send(packet);

    }
}