package org.bolt.netty.nio;

import java.nio.ByteBuffer;

public class NioTest5 {

    public static void main(String[] args) {

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.putInt(100);
        byteBuffer.putLong(200L);
        byteBuffer.putDouble(1000.00d);
        byteBuffer.putChar('徐');
        byteBuffer.putChar('英');
        byteBuffer.putChar('俊');

        byteBuffer.flip();

        System.out.println(byteBuffer.getInt());
        System.out.println(byteBuffer.getLong());
        //System.out.println(byteBuffer.getDouble());
        System.out.println(byteBuffer.getChar());
        System.out.println(byteBuffer.getChar());
        System.out.println(byteBuffer.getChar());

    }
}
