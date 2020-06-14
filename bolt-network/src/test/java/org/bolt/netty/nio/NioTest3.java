package org.bolt.netty.nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest3 {

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/gongwenzhou/IdeaProjects/bolt/bolt-network/src/test/resources/NioTest3.txt");
        FileChannel channel = fileOutputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1000);

        byte[] msg = "hello,Netty,Hbase,Flink,Spark".getBytes();
        for (int i = 0; i < msg.length; i++) {
            buffer.put(msg[i]);
        }


        buffer.flip();
        channel.write(buffer);

        fileOutputStream.close();
    }
}
