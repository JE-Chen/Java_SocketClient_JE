package com.je_chen.socket_client.Client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSocketClient {

    DatagramSocket datagramSocket;

    public void setDatagramSocket() throws SocketException {
        datagramSocket = new DatagramSocket();
    }

    public void close(){
        datagramSocket.close();
    }

    public void run(String message) throws IOException {
        InetAddress address =InetAddress.getLocalHost();
        byte[] buffer = message.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(buffer,buffer.length,address,5555);
        datagramSocket.send(datagramPacket);
    }
}
