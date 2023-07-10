package chat.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/*
    WebSocket的設定
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    /**
     * configureMessageBroker 用來定義訊息代理的URL前綴(prefix)。
     * @param registry
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //enableSimpleBroker 定義Server回傳資料的URL前綴為 /chat (@SendTo)。
        registry.enableSimpleBroker("/chat");
        //setApplicationDestinationPrefixes 指定接收客戶端那邊 URL前綴為'/app'發送過來的消息(@MessageMapping)。
        registry.setApplicationDestinationPrefixes("/app");
    }

    /* 
            registerStompEndpoints 方法註冊 “/ws” 端點，啟用 Spring 的 STOMP 功能。
            setAllowedOrigins : 設定允許接收指定URL的訊息。
            withSockJS() : 指定使用 SockJS 協定，SockJs 是 JavaScript 使用 WebSocket 技術的套件。
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").setAllowedOrigins("http://172.20.27.74:4200").withSockJS();
    }
}
