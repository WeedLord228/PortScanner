package com.company;

import java.io.IOException;
import java.net.*;

public class TCPWorker {
    private static Socket socket;

    public static boolean tcpCheck(String host, int port) throws IOException {
        boolean result = false;
        try {
            InetSocketAddress socketAddress = new InetSocketAddress(InetAddress.getByName(host), port);
            socket = new Socket();
            socket.connect(socketAddress, 100);
            result = true;
            socket.close();
        } catch (UnknownHostException e) {
            System.out.println("Неправильное имя хоста или адрес");
        } catch (SocketTimeoutException e) {
            System.out.println("Не смог подключиться");
            result = false;
        } catch (IOException e) {
            System.err.println("Не смог подключиться");
        }
        return result;
    }
}
