package Spring_01;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("bildingPlan")
@Scope("prototype")
public class BildingPlan {
    int id;

    public BildingPlan() {
        Random rnd = new Random();
        id = rnd.nextInt();
    }

    public String toString(){
        return "Bilding plan #" + id;
    }
}
