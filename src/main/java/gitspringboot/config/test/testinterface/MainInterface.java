package gitspringboot.config.test.testinterface;

public class MainInterface {

    public static void main(String[] args){
        InterfaceClass interfaceClass = new InterfaceClass("interface");
        interfaceClass.run();

        Test test = new Test();
        test.run();
    }

}
