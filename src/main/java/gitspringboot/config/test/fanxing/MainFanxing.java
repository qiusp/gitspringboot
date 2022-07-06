package gitspringboot.config.test.fanxing;

import gitspringboot.modules.entity.User;

public class MainFanxing {
    public static void main(String[] args) throws ClassNotFoundException {
        UserInfo userInfo = new UserInfo<>("qsp", 18);
        userInfo.setSex("男");
        System.out.println(userInfo.getName());
        System.out.println(userInfo.getinfo());
        System.out.println(userInfo.aClass(userInfo));


    }
}
