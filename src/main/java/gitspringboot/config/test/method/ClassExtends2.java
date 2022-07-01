package gitspringboot.config.test.method;

//类
//用final修饰的字段在初始化后不能被修改
//类中定义当前类的方法，相当于构造函数

//继承，继承类
//1、this
//2、super
//3、extends
//4、
//在Java中，任何class的构造方法，第一行语句必须是调用父类的构造方法。如果没有明确地调用父类的构造方法，编译器会帮我们自动加一句super();
//在Java中，没有明确写extends的类，编译器会自动加上extends Object。所以，任何类，除了Object，都会继承自某个类
//Java只允许一个class继承自一个类，因此，一个类有且仅有一个父类。只有Object特殊，它没有父类。
//5、
//继承中的protected和private，instanceof，final
//继承有个特点，就是子类无法访问父类的private字段或者private方法。比如：不可以name = 100，可以test = "ssss";
//protected关键字可以把字段和方法的访问权限控制在继承树内部，一个protected字段和方法可以被其子类，以及子类的子类所访问
//instanceof操作符，可以先判断一个实例究竟是不是某种类型
//final修饰的类，无法被继承
//6、
//方法重写@Override
//用final修饰的方法不能被Override

//继承，继承接口-->多态，不同类继承同一个类（动物-->猫，狗。。。。不同对象类）


public class ClassExtends2 extends TestSubMethod1 {
    private int score;

    public ClassExtends2(){
//        子类无法访问父类的private字段或者private方法
        this.setAge(100);
        this.score = 110;
        this.test = "ssss";
        System.out.println("我是子类构造函数，继承的时候，默认先走父类的构造方法");
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String subMethod(){
        return "我是子类方法";
    }

    @Override
    public void extendsMethod() {
        System.out.println("我重写了父类的方法");
        System.out.println("并且通过super调用父类方法");
        super.extendsMethod();
    }

//    用final修饰的方法不能被Override
//    public void finalMethod(){
//        System.out.println("我是子类的final方法");
//    }

    public void finalMethod(String s){
        System.out.println("我是子类的final方法:"+ s);
    }

    //相当于构造函数
    public ClassExtends2 classExtends(){
        return null;
    }
}
