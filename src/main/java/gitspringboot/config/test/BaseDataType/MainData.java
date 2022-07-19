package gitspringboot.config.test.BaseDataType;

/**
 * 因为Java在内存中总是使用Unicode表示字符，所以，一个英文字符和一个中文字符都用一个char类型表示，它们都占用两个字节。
 */
public class MainData {
    public static void main(String[] args){
        int a = 'A';
        System.out.println("Unicodde编码是：" + a);

        //\\u+Unicode编码来表示一个字符,十六进制0041 = 十进制65
        char c = '\u0041';
        System.out.println("Unicodde编码是：" + c);

    }
}

