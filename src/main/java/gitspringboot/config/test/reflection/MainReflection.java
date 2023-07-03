package gitspringboot.config.test.reflection;
//https://blog.csdn.net/lililuni/article/details/83449088?spm=1001.2101.3001.6661.1&utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7Edefault-1-83449088-blog-84832343.pc_relevant_multi_platform_whitelistv2&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7Edefault-1-83449088-blog-84832343.pc_relevant_multi_platform_whitelistv2&utm_relevant_index=1
//https://zhuanlan.zhihu.com/p/434960481

//我们经常会使用new 类名（）来获取一个类对象，当我们执行类加载时的编译期就会将该类进行加载，而我们反射获取类对象时，
// 会在程序的运行期间进行类的加载。如下图所示，反射需要自己去构建Class、创建构造函数和通过构造函数创建对象。


import gitspringboot.modules.firstModule.entity.User;

import java.lang.reflect.*;

public class MainReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        System.out.println("---------------------------1、反射：每个类在JVM中，有一个实例对象Class：获取JVM中的实例--------------------------");
        First first = new First("qsp", 18);
        System.out.println("---------------------------1、反射：加载类，获取JVM中的对象Class--------------------------");
//        1、class
        System.out.println(First.class);
//        2、实体
        System.out.println(first.getClass());
//        3、forName
        Class cls = Class.forName("gitspringboot.config.test.reflection.First");
        System.out.println(cls);
//        4、类加载器
//        ClassLoader classLoader = MainReflection.getClass().getClassLoader();

        boolean same = User.class == cls;
        System.out.println(same);

        System.out.println("----------------------------2、printClassInfo得到实例的属性----------------------------");
        printClassInfo(First.class);


        System.out.println("----------------------------3、获取所有构造方法,并实例化对象----------------------------");
        printClassConstructor(First.class);


        System.out.println("----------------------------4、获取所有方法，并使用方法----------------------------");
        printClassMethod(First.class, first);


        System.out.println("----------------------------5、获取实例字段方法，并赋值----------------------------");
        printClassField(First.class, first);


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

/**
 *      1、f.get(first)会得到一个IllegalAccessException，这是因为name被定义为一个private字段，
       正常情况下，Main类无法访问Person类的private字段。
      要修复错误，可以将private改为public，或者，在调用Object value = f.get(p);前，先写一句；
 2、 setAccessible(true)可能会失败。如果JVM运行期存在SecurityManager，那么它会根据规则进行检查，有可能阻止setAccessible(true)
 **/

        System.out.println("//////获取所有字段,并获取字段信息（每个字段看做一张表）///////////");
        Field[] fa = cls.getDeclaredFields();
        for (Field f: fa){
            //防止prited类型
            f.setAccessible(true);
            System.out.println(f.get(first));
            System.out.println("字段名称：" + f.getName());
            System.out.println("字段类型：" + f.getType());

            System.out.println("字段类型：" + f.getModifiers());
            System.out.println(Modifier.isFinal(f.getModifiers()));
            System.out.println(Modifier.isPublic(f.getModifiers()));
            System.out.println(Modifier.isProtected(f.getModifiers()));
            System.out.println(Modifier.isPrivate(f.getModifiers()));
            System.out.println(Modifier.isStatic(f.getModifiers()));
        }

        //实体字段赋值
        //通过cls获取/设置对象字段值
        Field n = cls.getField("name");
        //修改实例的值
        n.set(first, "Xiao Hong");
        System.out.println(n.get(first));

    }

    /**
     * 获取构造方法
     * @param cls
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    public static void printClassConstructor(Class cls) throws NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Constructor[] conArray = cls.getDeclaredConstructors();
        for(Constructor c : conArray){
            System.out.println(c);
        }

        System.out.println("newInstance：实例化无参构造函数");
        First f = (First) cls.newInstance();
        f.setAge(15);
        f.name = "f";
        Method method = cls.getMethod("hello",String.class);
        method.invoke(f,"我是invoke");
        System.out.println(f.name + ":" + f.getAge());

        System.out.println("getConstructor：实例化有参构造函数");
        Constructor c = cls.getConstructor(String.class, Integer.class);
        System.out.println(f.hello("反射方法f"));

        First ff = (First) c.newInstance("ff",46);
        System.out.println(ff.name + ":" + ff.getAge());
        System.out.println(ff.hello("反射方法ff"));
    }

    public static void printClassMethod(Class cls, Object first) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = cls.getMethod("hello",String.class);
        String msg = (String) method.invoke(first,"我是invoke");
        System.out.println(msg);
    }

}
