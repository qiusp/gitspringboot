package gitspringboot.config.test.IO;

import gitspringboot.modules.firstModule.firstmodule.entity.User;

import java.io.*;

/**
 * read
 * write
 * try 省去close
 *
 * flush()：
 * 在某些情况下，我们必须手动调用flush()方法。举个栗子：
 * 小明正在开发一款在线聊天软件，当用户输入一句话后，就通过OutputStream的write()方法写入网络流。小明测试的时候发现，发送方输入后，接收方根本收不到任何信息，怎么肥四？
 * 原因就在于写入网络流是先写入内存缓冲区，等缓冲区满了才会一次性发送到网络。如果缓冲区大小是4K，则发送方要敲几千个字符后，操作系统才会把缓冲区的内容发送出去，这个时候，接收方会一次性收到大量消息
 */
public class Streams {
    public static void InoutStreams(){
        String s;
        byte[] data = { 72, 101, 108, 108, 111, 33 };
        try (InputStream inputStream = new FileInputStream("E:\\TestMusuDir\\TestDir\\TestFile111.txt")){
//        try (InputStream inputStream = new ByteArrayInputStream(data)){
            System.out.println("--------------InputStream----------------");
            s = readtxt(inputStream);
            System.out.println(s);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readtxt(InputStream inputStream) throws IOException {
        int n;
        StringBuilder sb = new StringBuilder();
        while ((n = inputStream.read())!=-1){
            sb.append((char) n);
        }
        return sb.toString();
    }

    public static void OutputSteams(){
        try (OutputStream outputStream = new FileOutputStream("E:\\TestMusuDir\\TestDir\\TestFile111.txt")){
            System.out.println("--------------OutputStream----------------");
            outputStream.write("Hello".getBytes("UTF-8"));
            System.out.println("写入成功");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void SerObject(){
        User user = new User();
        user.setUserName("qsp");
        user.setPassWord("123456");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("E:\\TestMusuDir\\TestDir\\TestFile111.txt"))){
            System.out.println("--------------ObjectOutputStream----------------");
            outputStream.writeObject(user);
            System.out.println("写入成功");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
