package com.je_chen.socket_client.Client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.List;

public class TCPNioClient{

    private InetSocketAddress inetSocketAddress;
    private SocketChannel socketChannel;

    public TCPNioClient(String host,int port) throws IOException {
        inetSocketAddress=new InetSocketAddress(host,port);
        socketChannel = SocketChannel.open(inetSocketAddress);
    }

    public void sendMessage(String message) throws IOException, InterruptedException {
        byte[] messageByte = message.getBytes();
        ByteBuffer byteBuffer = ByteBuffer.wrap(messageByte);
        socketChannel.write(byteBuffer);
        byteBuffer.clear();
        Thread.sleep(2000);
        socketChannel.close();
    }

    public void sendMessage(List<String> message) throws IOException{

    }

}
