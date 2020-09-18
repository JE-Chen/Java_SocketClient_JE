package com.je_chen.socket_client.Test;

import com.je_chen.socket_client.Client.TCPNioClient;

import java.io.IOException;

public class NioTest {

    public static void main(String[] argv){
        try {
            TCPNioClient tcpNioClient = new TCPNioClient("localhost",5555);
            tcpNioClient.sendMessage("Hello Server");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
