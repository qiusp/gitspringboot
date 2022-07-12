package gitspringboot.config.test.generic;

import java.lang.reflect.Field;

/**
 * 不同对象转换
 * @author Administrator
 */
// 传入参数后，通过反射获取对象信息，通过反射动态创建新的对象，再进行赋值
    //同一个类中，不同类型的对象的对象处理：解析1、不同类型的对象：泛型，对象处理：反射
public class TranferObj<T>{

    public <E> E r(T t, Class<E> c) throws IllegalAccessException, InstantiationException {
        //数据源对象
        Class cls = t.getClass();

        //反射创建对象
        E eObject = (E) c.newInstance();

        Field[] fArray = cls.getDeclaredFields();
        for (Field tField: fArray){
            tField.setAccessible(true);
            tField.get(t);
            System.out.println(tField);
            System.out.println(tField.getName());
            System.out.println(tField.get(t));

            try {
                //通过字段名获取对象中的某个字段，并设置值
                //获取public修饰或private修饰的字段
                Field eField = c.getDeclaredField(tField.getName());
                if (eField == null){
                    eField = c.getField(tField.getName());
                }
                //设置为可读
                eField.setAccessible(true);
                eField.set(eObject, tField.get(t));
                System.out.println(eObject);
            }catch (Exception s){
                System.out.println(s);
            }

        }
        return eObject;
    }
}
