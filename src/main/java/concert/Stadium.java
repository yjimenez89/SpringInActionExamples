package concert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created by ihack on 11/10/2016.
 */

@Component
public class Stadium {

    private Performance performance;

    @Autowired
    public Stadium(Performance performance) {
        this.performance = performance;
    }

    public void startConcert() {
        performance.perform();
    }
}
