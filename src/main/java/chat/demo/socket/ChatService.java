package chat.demo.socket;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//@ServerEndpoint("/chat")
//@CrossOrigin
public class ChatService {

//    static List<ChatService> userList = new ArrayList<>();
//
//    Session session;
//
//    @OnOpen
//    public void onOpen(Session session){
//        System.out.println("有人進來囉~ ");
//        System.out.println(session.getId());
//        this.session = session;
//        userList.add(this);
//    }
//
//    @OnMessage
//    public void onMessage(String message) throws IOException{
//        System.out.println("有訊息喔~");
//        System.out.println(message);
//        for (ChatService cs : userList) {
//            if(cs.session.isOpen()){
//                //synchronized  用於多執行續的時候，確保同一時間只會有一個執行續在使用 cs 的物件，其他執行續會依序列隊等待執行。
//                synchronized (cs){
//                    try {
//                        cs.session.getBasicRemote().sendText(message);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//    }
//
//    @OnClose
//    public void onClose(Session session){
//        System.out.println("有人離開囉~ ");
//        System.out.println(session.getId());
//        for (ChatService cs : userList){
//            if(cs.session.getId().equals(session.getId())){
//                userList.remove(cs);
//                break;
//            }
//        }
//    }
}

