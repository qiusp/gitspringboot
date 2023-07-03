package gitspringboot.config.test.method;


import gitspringboot.modules.firstModule.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTestMethod {

    public static void main(String[] args){
        TestSubMethod1 testSubMethod = new TestSubMethod1();
        System.out.println(testSubMethod.getName());
        System.out.println("TestSubMethod.class 有什么作用：" + TestSubMethod1.class);
        System.out.println("-----------------------------------------------------------");
        TestSubMethod1 testSubMethod1 = new TestSubMethod1("有参构造函数，已完成赋值");
        System.out.println(testSubMethod1.getName());
        System.out.println("----------------------------继承构造函数-------------------------------");
        ClassExtends2 classExtends = new ClassExtends2();
        System.out.println("name已在父类的无参构造函数中赋值：" + classExtends.getName());
        System.out.println("this指的是子类和父类：" + classExtends.getAge());
        System.out.println("this指的是子类和父类：" + ClassExtends2.class);
        System.out.println("----------------------------继承super-------------------------------");
        classExtends.extendsMethod();
        classExtends.finalMethod();
        classExtends.finalMethod("2");

        System.out.println("----------------------------new-------------------------------");
        //如果需要一个只用一次的类，可以省去再写一个子类的方式
        User user = new User(){
            @Override
            public void test() {
                super.test();
                System.out.println("子类的方法");
            }

        };
        user.test();

        Map<String, String> map = new HashMap<String,String>(){
            {
                put("name","qsp");
                put("name","qqq");
            }
        };

        List<Integer> list = new ArrayList<Integer>(){
            {
                add(1);
                add(2);
            }
        };

    }
}
