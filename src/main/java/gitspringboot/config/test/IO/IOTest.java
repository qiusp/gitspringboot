package gitspringboot.config.test.IO;

import java.io.File;
import java.io.IOException;

public class IOTest {


    /**
     * 获取路劲
     */
    public void getPath() throws IOException {
        File f =new File("E:\\test");
        System.out.println(f.getPath());
//        File对象是否是一个已存在的文件
        System.out.println(f.isFile());
//        判断该File对象是否是一个已存在的目录
        System.out.println(f.isDirectory());

//        boolean canRead()：是否可读；
//        boolean canWrite()：是否可写；
//        boolean canExecute()：是否可执行；
//        long length()：文件字节大小。
    }

    /**
     * 创建文件夹(目录)
     * boolean mkdir()：创建当前File对象表示的目录；
     * boolean mkdirs()：创建当前File对象表示的目录，并在必要时将不存在的父目录也创建出来；
     * boolean delete()：删除当前File对象表示的目录，当前目录必须为空才能删除成功。
     */
    public void createNewDir(String dirPath, boolean isDeleteDir){
        System.out.println("-----------------文件夹处理--------------");
        File f = new File(dirPath);
        //是否为已存在的文件
        if (!f.isDirectory()){
            if(f.mkdirs()){
                System.out.println("文件夹创建成功");
            }
        }else {
            System.out.println("文件夹已存在");
        }

        if(isDeleteDir){
            f.delete();
        }

    }

    /**
     * 创建和删除文件
     * 当File对象表示一个文件时
     * createNewFile()创建一个新文件，
     * 用delete()删除该文件
     * @param filePath
     * @param isDeleteFile
     * @throws IOException
     */
    public void createNewFile(String filePath, boolean isDeleteFile) throws IOException {
        System.out.println("------------文件处理--------");

        File f =new File(filePath);
//路劲不存在
        //是否为已存在的文件夹
        if (f.isFile()){
            System.out.println("文件已存在");
        }else if(f.createNewFile()){
            System.out.println("文件创建成功");
        }

        //删除文件
        if (isDeleteFile){
            System.out.println("文件删除");
            f.delete();
        }
    }

    /**
     * 创建临时文件
     * File对象提供了createTempFile()来创建一个临时文件，以及deleteOnExit()在JVM退出时自动删除该文件
     * File f = File.createTempFile("tmp-", ".txt"); // 提供临时文件的前缀和后缀
     */

    /**
     * 获取文件夹下所有文件
     * 当File对象表示一个目录时，可以使用list()和listFiles()列出目录下的文件和子目录名。listFiles()提供了一系列重载方法，可以过滤不想要的文件和目录
     */
    public void getFileList(File[] fArray){

    }

}
