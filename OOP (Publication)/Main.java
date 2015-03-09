import static javax.xml.ws.Endpoint.publish;

/**
 * Created by Дмитрий on 03.03.2015.
 */
public class Main {
    public static void main(String[]args){
        Publication [] myPublication = new Publication[] {new News (), new Announcement(), new Article()};


        Publication.publish(myPublication);

    }


}
