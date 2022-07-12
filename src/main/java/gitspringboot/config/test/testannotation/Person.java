package gitspringboot.config.test.testannotation;

public class Person {
    @Range(min = 1,max = 5)
    public String name;

    @Range(max = 10)
    public String city;
}
