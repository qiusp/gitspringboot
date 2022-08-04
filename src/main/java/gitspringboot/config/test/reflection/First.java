
package gitspringboot.config.test.reflection;

public class First {
    public String name;
    private Integer age;

    public First(){

    }
    public First(String name,Integer age){
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String hello(String msg){
        return msg;
    }
}
