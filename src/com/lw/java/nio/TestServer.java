package com.lw.java.nio;

import javax.swing.*;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketOption;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Set;

public class TestServer {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress("localhost", 8888));
        ServerSocket serverSocket = serverSocketChannel.socket();
        Set<SocketOption<?>> socketOptions1 = serverSocketChannel.supportedOptions();
        SocketChannel socketChannel = serverSocketChannel.accept();
        Set<SocketOption<?>> socketOptions2 = socketChannel.supportedOptions();
        System.out.println(socketOptions1.size());
        System.out.println(socketOptions2.size());

        serverSocketChannel.configureBlocking(false);
        Selector selector = Selector.open();
        SelectionKey key = serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println(serverSocketChannel.isRegistered());
    }
}
