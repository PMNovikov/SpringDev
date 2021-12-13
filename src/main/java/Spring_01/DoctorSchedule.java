package Spring_01;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("doctorSchedule")
@Scope("prototype")
public class DoctorSchedule {
    private int id;

    public DoctorSchedule() {
        Random rnd = new Random();
        id = rnd.nextInt();
    }

    public String toString(){
        return "Doctor schedule: " + id;
    }
}
