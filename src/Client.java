import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException{
    
        System.out.println("Client Started");

        Socket socket = new Socket("localhost",1234);

        System.out.println("conneceted");

        // read data
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        // Writes data to socket
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        // read data from socket
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        

        while (true) {
            System.out.print("Enter some text: ");
            String name = userInput.readLine();

            out.println(name);
            
            System.out.println(in.readLine());

            if(name.toLowerCase().equals("exit")){
                break;
            }
        }
    }
          
}
