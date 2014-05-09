package business;

import org.primefaces.push.annotation.OnMessage;
import org.primefaces.push.annotation.PushEndpoint;
import org.primefaces.push.impl.JSONEncoder;


/**
 * Created by jpicklyk on 5/5/14.
 */
@PushEndpoint("/browser")
public class PushResource {

    @OnMessage(encoders = {JSONEncoder.class})
    public SeriesData onMessage(SeriesData data) {
        return data;
    }

}
