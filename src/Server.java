import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("Server Started\nWaiting for clients...");

        ServerSocket serverSocket = new ServerSocket(1234);
        Socket socket = serverSocket.accept();

        System.out.println("conneceted");
    }
}
