package com.bigbearg.yuantu.Utils;

import android.util.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ScoketHelper {

    private static Socket socket;

    public static void getData(){
            try {
                // 创建一个Socket对象，并指定服务端的IP及端口号
                Log.d("HAHA","开始了");
                socket = new Socket("122.5.51.134",10002);
                // 获取Socket的OutputStream对象用于发送数据。
                Log.d("HAHA",socket.isConnected()+"连接状态");
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("%%!!login!classid!{'uid':'张三','psw':'12345'}".getBytes("utf-8"));
                outputStream.flush();
                Log.d("HAHA",socket.isConnected()+"连接状态");
                InputStream inputStream = socket.getInputStream();
                Log.d("HAHA",socket.isConnected()+"连接状态");
                byte buffer[] = new byte[1024 * 4];
                int temp = 0;
                // 从InputStream当中读取客户端所发送的数据
                while ((temp = inputStream.read(buffer)) != -1) {
                    Log.d("HAHA",new String(buffer, 0, temp));
                    Log.d("HAHA",socket.isConnected()+"连接状态");
                }
                Log.d("HAHA","结束了");
                socket.close();
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
}
