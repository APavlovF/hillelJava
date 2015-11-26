package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by APavlov on 26.11.2015.
 */
public class SocketThread implements Runnable {
    private Socket socket;

    public SocketThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             Socket localSocket = socket) {  //replace closing socket process

            while (true) {
                String message = reader.readLine();
                if (message == null) {
                    System.out.println("disconnect");
                    break;
                }
                System.out.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } /*finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}
