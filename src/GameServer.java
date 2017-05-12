import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class GameServer {

    private static HttpServer httpServer;
    private static int port = 8000;

    public static void main (String[] args){

        try {
            
            // Create Server
            httpServer = HttpServer.create(new InetSocketAddress(port), 0);
            
            // Context + Handler

            // Create Default Executor
            httpServer.setExecutor(null);


        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Start the server
        httpServer.start();
        System.out.println("Started HttpServer on port 8000");

    }
}