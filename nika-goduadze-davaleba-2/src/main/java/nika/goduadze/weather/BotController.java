package nika.goduadze.weather;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/chatbot")
public class BotController {

    @OnOpen
    public void open()
    {
        System.out.println("Connection Open");
    }

    @OnMessage
    public String message(String msg) throws Exception {

        System.out.println(msg);
        Bot bot = new Bot(msg);
        return bot.getBotResponse();
    }

    @OnClose
    public void close()
    {
        System.out.println("Closed");
    }

    @OnError
    public void error(Throwable t)
    {
        System.out.println("error" + t.getMessage());
    }
}
