package gitspringboot.config.test.stream;

//所有中间操作都是懒执行，即只有在终端操作执行时才会执行，执行中间操作实际上并不执行任何操作，
//而是创建一个新的流，当遍历该流时，它包含与给定谓词匹配的原始流的元素。因此在执行终端操作之前，流的遍历不会开始。
//这是非常重要的特性，对于无限流尤其重要——因为它允许我们创建只有在调用终端操作时才实际调用的流

import gitspringboot.modules.firstModule.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class operationStream<T> {
    public static void main(String[] args){

        List<User> users = new ArrayList<>();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        users.add(user1.setId(1L).setUserName("qsp").setPassWord("123").setAge(1));
        users.add(user2.setId(2L).setUserName("qsp0").setPassWord("1234").setAge(2));
        users.add(user3.setId(3L).setUserName("qsp1").setPassWord("12345").setAge(3));
        users.add(user4.setId(4L).setUserName("qsp1").setPassWord("123456").setAge(4));

        Stream<User> userParallelStream = users.parallelStream();

        //1.filter过滤
        Stream<User> userStream = users.stream();//用完后立即关闭，不可再用
        List<User> users1 = userStream.filter(u1-> u1.getUserName().equals("qsp1")).collect(Collectors.toList());
        System.out.println("filter :"+ users1);


        //2.Map
        //获取某个元素
        Stream<User> userStreamMap0 = users.stream();
        List<String> names = userStreamMap0.map(User::getUserName).distinct().collect(Collectors.toList());
        System.out.println("map0 :"+ names);


        //对某个元素操作
        Stream<User> userStreamMap1 = users.stream();
        List<Integer> ages = userStreamMap1.map(map1 -> map1.getAge() + 2).collect(Collectors.toList());
        System.out.println("map1 :"+ ages);


        //求和：reduce、sum
        Stream<User> userStreamReduce = users.stream();
        Optional<Integer> sumAge = userStreamReduce.map(reduces-> reduces.getAge()).reduce(Integer::sum);

        Stream<User> userStreamReduce1 = users.stream();
        Optional<Integer> maxAge = userStreamReduce1.map(reduces-> reduces.getAge()).reduce(Integer::max);

        List<Integer> numberList = Arrays.asList(1,2,3,4,5);
        Optional<Integer> sumNumber = numberList.stream().reduce((x,y) -> x+y);

        List<Integer> numberList1 = Arrays.asList(1,2,3,4,5);
        Optional<Integer> maxNumber = numberList1.stream().reduce((x,y) -> x>y? x:y);
        System.out.println("sumAge :"+ sumAge + " ;" + "maxAge :"+ maxAge + " ;" + "sumNumber :"+ sumNumber + " ;" + "maxNumber :"+ maxNumber + " ;");




    }
}
