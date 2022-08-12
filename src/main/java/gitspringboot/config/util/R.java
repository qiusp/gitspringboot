package gitspringboot.config.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//统一返回结果
@Data
@AllArgsConstructor
public class R<T> implements Serializable {
    /**
     * 是否返回成功
     */
    private boolean success;

    /**
     * 错误状态
     */
    private int code;

    /***
     * 错误信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 时间戳
     */
    private long timestamp ;

    public R (){
        this.timestamp = System.currentTimeMillis();
    }
    /**
     * 成功的操作
     */
    public static <T> R<T> ok() {
        return  ok(null);
    }

    /**
     * 成 功 操 作 , 携 带 数 据
     */
    public static <T> R<T> ok(T data){
        return ok(RCode.RC100.getMessage(),data);
    }

    /**
     * 成 功 操 作, 携 带 消 息
     */
    public static <T> R<T> ok(String message) {
        return ok(message, null);
    }

    /**
     * 成 功 操 作, 携 带 消 息 和 携 带 数 据
     */
    public static <T> R<T> ok(String message, T data) {
        return ok(RCode.RC200.getCode(), message, data);
    }

    /**
     * 成 功 操 作, 携 带 自 定 义 状 态 码 和 消 息
     */
    public static <T> R<T> ok(int code, String message) {
        return ok(code, message, null);
    }

    public static <T> R<T> ok(int code,String message,T data) {
        R<T> R = new R<T>();
        R.setCode(code);
        R.setMsg(message);
        R.setSuccess(true);
        R.setData(data);
        return R;
    }

    /**
     * 失 败 操 作, 默 认 数 据
     */
    public static <T> R<T> failure() {
        return failure(RCode.RC100.getMessage());
    }

    /**
     * 失 败 操 作, 携 带 自 定 义 消 息
     */
    public static <T> R<T> failure(String message) {
        return failure(message, null);
    }

    /**
     * 失 败 操 作, 携 带 自 定 义 消 息 和 数 据
     */
    public static <T> R<T> failure(String message, T data) {
        return failure(RCode.RC999.getCode(), message, data);
    }

    /**
     * 失 败 操 作, 携 带 自 定 义 状 态 码 和 自 定 义 消 息
     */
    public static <T> R<T> failure(int code, String message) {
        return failure(RCode.RC999.getCode(), message, null);
    }

    /**
     * 失 败 操 作, 携 带 自 定 义 状 态 码 , 消 息 和 数 据
     */
    public static <T> R<T> failure(int code, String message, T data) {
        R<T> R = new R<T>();
        R.setCode(code);
        R.setMsg(message);
        R.setSuccess(false);
        R.setData(data);
        return R;
    }

    /**
     * Boolean 返 回 操 作, 携 带 默 认 返 回 值
     */
    public static <T> R<T> decide(boolean b) {
        return decide(b, RCode.RC100.getMessage(), RCode.RC999.getMessage());
    }

    /**
     * Boolean 返 回 操 作, 携 带 自 定 义 消 息
     */
    public static <T> R<T> decide(boolean b, String success, String failure) {
        if (b) {
            return ok(success);
        } else {
            return failure(failure);
        }
    }
}
