package gitspringboot.config.test.fanxing;

public class UserInfo<T,O> {
    private T name;
    private T sex;
    private O age;

    public UserInfo(T name, O age){
        this.name = name;
        this.age = age;
    }

    public T getName(){
        return this.name;
    }

    public O getAge(){
        return this.age;
    }

    public void setSex(T sex){
        this.sex = sex;
    }

    public T getinfo(){
        return (T) (this.name.toString() + this.sex.toString());
    }

    public Class aClass(T t){
        //获取到T.class
        return t.getClass();
    }
}
