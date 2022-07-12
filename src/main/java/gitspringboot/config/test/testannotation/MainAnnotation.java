package gitspringboot.config.test.testannotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainAnnotation {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException {
        Class CLA = testAnnotation.class;
        Method method = CLA.getMethod("result");
        System.out.println(method.isAnnotationPresent(FirstAnnotation.class));
        FirstAnnotation firstAnnotation = method.getAnnotation(FirstAnnotation.class);
        String val = firstAnnotation.value();
        System.out.println(firstAnnotation);


        Person person = new Person();
        person.name = "55555555555555555555555555";
        System.out.println(person.name);
        check(person);
    }

    /**
     * 配合注解实现校验
     * @param person
     * 没看出注解存在什么特别的优势或者说好用的地方？？
     *
     * 如上文例子所示，如果Person类包含了name、city等类似的n个String类型的成员
     *
     * 如果你在构造方法里检查，需要写n个判断
     *
     * 如果用注解的话，只需要在每个成员前加上注解，然后写一个检查方法就可以检查所有的成员是否满足条件
     *
     * 还有就是如果在构造方法里判断的话，实例化后用setter赋值也是没法check的，除非在每个setter里也写判断
     *
     * 这样写代码量肯定剧增，而且除此之外如果想要修改条件的话，需要在构造方法和setter里分别去改，不如注解修改条件方便
     */
    public static void check(Person person) throws IllegalAccessException {
        for (Field field : person.getClass().getFields()){
            //获取Range注解JVM实例
            Range range = field.getAnnotation(Range.class);
            if (range != null){
                //获取对象字段值
                Object value = field.get(person);
                //判断字段类型
                if(value instanceof String){
                    String s = (String) value;
                    //结合注解校验
                    if(s.length() < range.min() || s.length() > range.max()){
                        throw new IllegalArgumentException("Invalid field: " + field.getName());
                    }
                }
            }
        }
    }
}
