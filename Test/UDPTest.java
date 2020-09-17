package com.je_chen.socket_client.Test;

import com.je_chen.socket_client.Client.UDPSocketClient;

import java.io.IOException;

public class UDPTest {

    public static void main(String[] argv){
        UDPSocketClient udp_socketClient = new UDPSocketClient();
        try {
            udp_socketClient.setPort(5555);
            udp_socketClient.setDatagramSocket();
            udp_socketClient.run("Hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
