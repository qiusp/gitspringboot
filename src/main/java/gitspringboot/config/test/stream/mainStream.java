package gitspringboot.config.test.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Stream操作分为中间操作和终端操作。每个Stream操作由数据源、零个或多个中间操作和一个终端操作组成。
public class mainStream {
    public static void main(String[] args){
        //Map
        Stream<Map.Entry<Object, Object>> mapStream = new HashMap<>().entrySet().stream();

        //数组
        int[] array = {1,2};
        IntStream arrayStream = Arrays.stream(array);
        IntStream subArrayStream = Arrays.stream(array, 0 ,1);

        //List(Arrays.asList + 数组)
        List<String> list = Arrays.asList(new String[]{"1","2"});
        //串行
        Stream<String> listStream = list.stream();
        //并行
        Stream<String> parallelListStream = list.parallelStream();

        //使用Stream的静态方法
        Stream<String> streamOf = Stream.of("1","2");
        //通过Java 8 函数式接口Supplier<T>创建无限流
        Stream<UUID> streamGenerate = Stream.generate(UUID::randomUUID);
        System.out.println("UUID:" + streamGenerate.limit(5).collect(Collectors.toSet()));
        //通过Java 8 函数式接口UnaryOperator<T>创建无限流
        Stream<Integer> streamIterate = Stream.iterate(0, x -> x + 1);
    }
}
