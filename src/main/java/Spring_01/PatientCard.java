package Spring_01;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("patientCard")
@Scope("prototype")
public class PatientCard {
    private final Patient patient;
    private final int id;

    public PatientCard(Patient patient) {
        this.patient = patient;
        Random rnd = new Random();
        id = rnd.nextInt();
    }

    public String toString()
    {
        return "Patient " + patient.getName() + " card #" + id;
    }
}
