package gitspringboot.config.test.testinterface;

/**
 * @author Administrator
 */
public class InterfaceClass implements Person {

    public String name;

    public InterfaceClass(String name){
        this.name = name;
    }

    @Override
    public void run() {
        if (Person.field.equals(this.name)){
            System.out.println("实现接口");
        }
    }
}

class Test implements Person{

    @Override
    public void run() {
        System.out.println("test");
    }
}
