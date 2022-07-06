package gitspringboot.modules.wrapper;


public class EntityToVo<T, O>{

    public static EntityToVo build() {
        return new EntityToVo<>();
    }

    public T tovo(O o){
        T t = null;
//        t = <T> BeanUtil.copyProperties(o, t, String.valueOf(2));

        return t;
    }
}
