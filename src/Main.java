import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// Socket (String Host, int port)
// Creates a stream socket and connects it to the specified port on the named host
public class Main {
    public static void main(String[] args) throws IOException {
        Socket clinetSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        String hostname = args[0];
        int serverPort = 80;

        System.out.println("Trying to get a page from "+hostname);
        try{
            System.out.println("Create a socket");
            clinetSocket = new Socket(hostname, serverPort);

            out = new PrintWriter(clinetSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clinetSocket.getInputStream()));
        }
        catch(UnknownHostException e){
            System.err.println("Unknown host");
            System.exit(1);
        }
        catch (IOException e){
         System.err.println("I/O exception");
         System.exit(1);
        }
        String inputLine;
    }
}