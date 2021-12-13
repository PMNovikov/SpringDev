package Spring_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Patient patient = context.getBean("patient", Patient.class);
        patient.setName("Boris Jonson");
        System.out.println("Patient: " + patient.toString());
        Registry registry = context.getBean("registry", Registry.class);
        registry.doDirection(patient);
        Registry registry2 = context.getBean("registry", Registry.class);
        registry2.doDirection(patient);
    }
}
