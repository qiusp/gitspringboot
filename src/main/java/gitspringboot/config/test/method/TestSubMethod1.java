package gitspringboot.config.test.method;

//@AllArgsConstructor //有参构造函数
//@NoArgsConstructor//无参构造函数

//一、构造方法：
//1、普通方法相比，构造方法没有返回值（也没有void），调用构造方法，必须用new操作符。
//2、默认有无参构造，可以不写无参
//3、this指的是当前类

//二、方法重载
//1、参数不同
//2、方法名和返回类型相同

public class TestSubMethod1 {
    private String name;
    private int age;

    protected String test;

//    有参构造函数
    public TestSubMethod1(String name, int age){
        this.name = name;
        this.age = age;
    }

//    有参构造函数,方法重载
    public TestSubMethod1(String name){
        this.name = name;
    }


//    午餐构造函数，方法重载
    public TestSubMethod1(){
        this("无参调用有参，在无参函数中完成赋值");
        System.out.println("父类方法中的构造函数,默认new无参构造");
    }

    public String getName(){
        return this.name;
    }

    public void extendsMethod(){
        System.out.println("我是父类方法");
    }

    public final void finalMethod(){
        System.out.println("我是父类的final方法");
    }


    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    //相当于构造函数
    public TestSubMethod1 testSubMethod(){
        return null;
    }

}
