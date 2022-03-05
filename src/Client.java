import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException{
    
        System.out.println("Client Started");
        Socket socket = new Socket("localhost",1234);
    }
          
}
