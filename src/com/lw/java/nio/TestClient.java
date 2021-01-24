package com.lw.java.nio;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("我是发送数据的Client!".getBytes("UTF-8"));
        outputStream.close();
        outputStream.close();
        socket.close();
    }
}
