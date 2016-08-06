package in.incubateapp.Model;

/**
 * Created by Brekkishhh on 06-08-2016.
 */
public class Chat {

    public String user;
    public String lastMess;
    public String time;

    public Chat(String user, String lastMess, String time) {
        this.user = user;
        this.lastMess = lastMess;
        this.time = time;
    }
}
