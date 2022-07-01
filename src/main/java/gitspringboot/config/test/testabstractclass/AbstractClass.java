package gitspringboot.config.test.testabstractclass;

//1、abstract抽象类
//1、本身没有实现任何方法语句
//2、无法被实例化，只能用于被继承
//3、抽象类可以强迫子类实现其定义的抽象方法，抽象方法实际上相当于定义了“规范”

//1、可不可以用private修饰
//2、可不可以有实现的方法
//3、怎么定义变量，变量有什么作用
//4、抽象类和类和接口的关系
//5、有没有构造函数
abstract class AbstractClass {
    private final int i = 0;
    public abstract void run();
}
