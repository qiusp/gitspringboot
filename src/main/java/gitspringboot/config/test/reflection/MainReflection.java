package gitspringboot.config.test.reflection;
//https://blog.csdn.net/lililuni/article/details/83449088?spm=1001.2101.3001.6661.1&utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7Edefault-1-83449088-blog-84832343.pc_relevant_multi_platform_whitelistv2&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7Edefault-1-83449088-blog-84832343.pc_relevant_multi_platform_whitelistv2&utm_relevant_index=1
//https://zhuanlan.zhihu.com/p/434960481

//我们经常会使用new 类名（）来获取一个类对象，当我们执行类加载时的编译期就会将该类进行加载，而我们反射获取类对象时，
// 会在程序的运行期间进行类的加载。如下图所示，反射需要自己去构建Class、创建构造函数和通过构造函数创建对象。


import gitspringboot.modules.entity.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        System.out.println("---------------------------1、反射：同一个类在JVM中，有一个共同的实例对象：获取JVM中的实例--------------------------");
        First first = new First("qsp", 18);
//        1、class
        System.out.println(First.class);
//        2、实体
        System.out.println(first.getClass());
//        3、
        Class cls = Class.forName("gitspringboot.config.test.reflection.First");
        System.out.println(cls);

        boolean same = User.class == cls;
        System.out.println(same);


        System.out.println("----------------------------2、printClassInfo得到实例的属性----------------------------");
        printClassInfo(First.class);

        System.out.println("----------------------------3、获取实例字段方法----------------------------");
        printClassField(First.class, first);

        System.out.println("----------------------------4、获取所有构造方法----------------------------");
        printClassConstructor(First.class);
    }

    /**
     * 获取JVM实例属性
     * @param cls
     */
     public static void printClassInfo(Class cls) {
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is array: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
        System.out.println("is primitive: " + cls.isPrimitive());
    }

    /**
     * cls为Object的JVM实例，JVM实例获取实际对象属性值
     * @param cls
     * @param first
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    public static void printClassField(Class cls, Object first) throws NoSuchFieldException, IllegalAccessException {

        //获取Field信息
        Field f = cls.getDeclaredField("age");
        System.out.println(f.getName());
        System.out.println(f.getType());
        System.out.println(f.getModifiers());

        //获取实体值
/**
 *      1、f.get(first)会得到一个IllegalAccessException，这是因为name被定义为一个private字段，
       正常情况下，Main类无法访问Person类的private字段。
      要修复错误，可以将private改为public，或者，在调用Object value = f.get(p);前，先写一句；
 2、 setAccessible(true)可能会失败。如果JVM运行期存在SecurityManager，那么它会根据规则进行检查，有可能阻止setAccessible(true)
 **/
        f.setAccessible(true);
        System.out.println(f.get(first));

        //通过cls获取/设置对象字段值
        Field n = cls.getField("name");
        //修改实例的值
        n.set(first, "Xiao Hong");
        System.out.println(n.get(first));


        System.out.println("//////获取所有字段,并获取字段名称///////////");
        Field[] fa = cls.getDeclaredFields();
        for (Field a: fa){
            System.out.println(a.getName());
        }

    }


    public static void printClassConstructor(Class cls) throws NoSuchFieldException, IllegalAccessException {
        Constructor[] conArray = cls.getDeclaredConstructors();
        for(Constructor c : conArray){
            System.out.println(c);
        }

        System.out.println("获取所有方法");
        Method[] methods = cls.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }

    }

}
