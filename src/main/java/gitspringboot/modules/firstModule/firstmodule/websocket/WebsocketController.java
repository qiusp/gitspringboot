package gitspringboot.modules.firstModule.firstmodule.websocket;

import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Component
@ServerEndpoint("/websocket/chat")
public class WebsocketController {


    /**
     * 当前在线的总人数
     */
    private static final AtomicLong ONLINE_COUNT = new AtomicLong(0L);

    /**
     * 所有在线的人数的
     */
    private static final Map<String, Session> ALL_ONLINE_INFO = new HashMap<String, Session>();

    /**
     * websocket被打开的方法
     *
     * @param session 会话
     */
    @OnOpen
    public void open(Session session) {
        // 获取sessionId，让后将session存入到Map中
        final String id = session.getId();
        ALL_ONLINE_INFO.put(id, session);
        // 在线人数自加1并发送给所有的客户端
        final long onlineCount = ONLINE_COUNT.incrementAndGet();
        this.sendMessage(0, onlineCount + "");
    }

    /**
     * websocket被退出
     *
     * @param session 会话
     */
    @OnClose
    public void close(Session session) {
        // 将session从缓存当中移除
        final String id = session.getId();
        ALL_ONLINE_INFO.remove(id);
        // 在线人数自减1并发送给所有的客户端
        final long onlineCount = ONLINE_COUNT.decrementAndGet();
        this.sendMessage(0, onlineCount + "");
    }


    /**
     * 当收到客户端发送过来的消息时触发
     *
     * @param message 客户端发送过来的消息
     * @param session 客户端的session会话
     */
    @OnMessage
    public void message(String message, Session session) throws IOException {
        // 将消息发送到所有的客户端
        this.sendMessage(1, message);
    }

    /**
     * 发送消息给所有用户
     *
     * @param type    消息类型；0=更新在线人数,1=发送的消息
     * @param message 消息实体
     */
    private void sendMessage(int type, String message) {
        // 拼接成JSON，让后前端可以解析
        String targetMessage = "{\"type\":" + type + ",\"message\":\"" + message + "\"}";
        // 遍历并发给所有的客户端
        ALL_ONLINE_INFO.values().forEach(session -> {
            try {
                session.getBasicRemote().sendText(targetMessage);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

}
