package business;

import java.util.Date;
import org.primefaces.push.EventBus;
import org.primefaces.push.EventBusFactory;

import javax.ejb.Singleton;
import java.util.Random;

/**
 * Created by jpicklyk on 5/5/14.
 */
@Singleton
public class PushController {

    public void pushData() {
        Random rand = new Random();
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssa");
        //String date = LocalDateTime.now().format(formatter);
        SeriesData data = new SeriesData(new Date().getTime(),rand.nextInt(5));
        
        EventBus eventBus = EventBusFactory.getDefault().eventBus();
        eventBus.publish("/browser", data);

    }
}
