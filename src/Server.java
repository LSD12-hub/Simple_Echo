import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("Server Started\nWaiting for client...");

        ServerSocket serverSocket = new ServerSocket(1234);
        Socket socket = serverSocket.accept();

        System.out.println("Connection Established");

        //read data
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //write data
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        

        while (true) {
            String text = in.readLine();

            if(text.toLowerCase().equals("exit")) {
                out.println("thank you for you time");
                break;
            }

            out.println("[SERVER] Says " + text);
        }
    }
}
