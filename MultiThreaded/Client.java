import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public Runnable getRunnable() {
        return new Runnable() {
            @Override
            public void run() {
                int port = 8010;
                try {
                    InetAddress address = InetAddress.getByName("localhost");
                    try (
                        // Fix: Using try-with-resources for automatic resource management
                        Socket socket = new Socket(address, port);
                        PrintWriter toSocket = new PrintWriter(socket.getOutputStream(), true);
                        BufferedReader fromSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()))
                    ) {
                        toSocket.println("Hello from the client"); // Send message to server
                        String line = fromSocket.readLine();       // Read response from server
                        System.out.println("Response from Server: " + line);
                    } catch (IOException e) {
                        System.err.println("Error during socket communication: " + e.getMessage());
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    System.err.println("Failed to connect to server: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        };
    }

    public static void main(String[] args) {
        Client client = new Client();
        for (int i = 0; i < 100; i++) {
            try {
                // Fix: Added meaningful thread names for better debugging
                Thread thread = new Thread(client.getRunnable(), "Client-Thread-" + i);
                thread.start();
            } catch (Exception ex) {
                // Fix: Print an error message instead of silent return
                System.err.println("Error starting thread: " + ex.getMessage());
                ex.printStackTrace();
                //return;
            }
        }
        //return;
    }

}
