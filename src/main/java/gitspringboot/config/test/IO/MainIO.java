package gitspringboot.config.test.IO;

import java.io.IOException;

public class MainIO {
    public static void main(String[] args) throws IOException {
        IOTest ioTest = new IOTest();
        ioTest.getPath();

        String DirPath = "E:\\TestMusuDir\\TestDir";
        ioTest.createNewDir(DirPath,false);

        String path = "E:\\TestMusuDir\\TestDir\\TestFile111.txt";
        ioTest.createNewFile(path, false);

        Streams.InoutStreams();
//        Streams.OutputSteams();
        Streams.SerObject();
    }
}
