package Spring_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("registry")
@Scope("prototype")
public class Registry {
    private Patient patient;
    private PatientCard patientCard;
    private BildingPlan bildingPlan;
    private DoctorSchedule doctorSchedule;

    public Patient getPatient() {
        return patient;
    }

    @Autowired
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public PatientCard getPatientCard() {
        return patientCard;
    }

    @Autowired
    public void setPatientCard(PatientCard patientCard) {
        this.patientCard = patientCard;
    }

    public BildingPlan getBildingPlan() {
        return bildingPlan;
    }

    @Autowired
    public void setBildingPlan(BildingPlan bildingPlan) {
        this.bildingPlan = bildingPlan;
    }

    public DoctorSchedule getDoctorSchedule() {
        return doctorSchedule;
    }

    @Autowired
    public void setDoctorSchedule(DoctorSchedule doctorSchedule) {
        this.doctorSchedule = doctorSchedule;
    }

    public void doDirection(Patient patient){
        this.patient = patient;
        doDirection();
    }

    public void doDirection(){
        System.out.println("Patient go to doctor");
        System.out.println("\tPatient: " + this.patient);
        System.out.println("\tPatient card: "+ patientCard);
        System.out.println("\tBilding plan: " + bildingPlan);
        System.out.println("\tDosctor schedule: " + doctorSchedule);
    }
}
