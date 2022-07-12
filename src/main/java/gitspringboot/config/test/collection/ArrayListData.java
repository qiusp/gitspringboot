package gitspringboot.config.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListData {
    public void test(){
        //        创建集合
        List<String> list = new ArrayList<>();
        List<String> Copylist = new ArrayList<>();

        System.out.println("-----------------添加--------------");
        list.add("数组1");
        list.add("11");

        System.out.println("-----------------删除--------------");
        list.remove("11");


        System.out.println("-----------------转数组-------------");
        String[] array = list.toArray(new String[3]);
        returndata(list);

        System.out.println("-----------------深浅拷贝-------------");
        Copylist=list;

    }

    public void returndata(List<String> list){
        System.out.println("-----------------遍历1--------------");
        for (String s: list){
            System.out.println(s);
        }

        list.forEach(l->{
            System.out.println(l);
        });

        System.out.println("-----------------判断是最后一个元素index/indexof-------------");

        System.out.println("-----------------是否包含某个元素contains-------------");
        if (list.contains("s")){
            return;
        }

    }
}
