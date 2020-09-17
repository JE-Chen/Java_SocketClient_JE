package com.je_chen.socket_client.Test;

import com.je_chen.socket_client.Client.UDPSocketClient;

import java.io.IOException;

public class UDPTest {

    public static void main(String[] argv){
        UDPSocketClient udp_socketClient = new UDPSocketClient();
        try {
            udp_socketClient.run("Hello Server");
            Thread.sleep(3000);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
