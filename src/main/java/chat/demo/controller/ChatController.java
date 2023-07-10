package chat.demo.controller;

import chat.demo.bean.Greeting;
import chat.demo.bean.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin
public class ChatController {
    
    /**
     * @MessageMapping("/chatIn") 指定URL接收客戶端傳送過來的訊息。
     * @SendTo("/chat/out") 回傳訊息到指定的URL。 
     */
    @MessageMapping("/chatIn")
    @SendTo("/chat/out")
    public Greeting chat(Message message) throws Exception{
        System.out.println("有人進來囉~  message : " + message.getMessage());
        return new Greeting("訊息 : " + message.getMessage());
    }
}
