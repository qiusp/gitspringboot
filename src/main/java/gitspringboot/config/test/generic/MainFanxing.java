package gitspringboot.config.test.generic;

import java.lang.reflect.Field;

public class MainFanxing {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        UserInfo userInfo = new UserInfo<>("邱绍平", 18);
        userInfo.setSex("男");
        System.out.println(userInfo.getName());
        System.out.println(userInfo.getinfo());
        System.out.println("------------------------------------对象参数--------------------------------");

        re(userInfo);

        System.out.println("------------------------------------泛型参数--------------------------------");
        TranferObj<UserInfo> userInfoshixian = new TranferObj<>();
//        userInfoshixian.r(userInfo);
    }

    public static void re(UserInfo userInfo) throws IllegalAccessException, NoSuchFieldException {
        Class cls = userInfo.getClass();
        Field[] fArray = cls.getDeclaredFields();
        for (Field f: fArray){
            f.setAccessible(true);
            System.out.println(f.getName());
            System.out.println(f.get(userInfo));
        }

    }

}
