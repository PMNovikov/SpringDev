package Spring_01;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("patient")
@Scope("prototype")
public class Patient {
    private String name;
    private int id;


    public Patient() {
        name = "Boris";
        Random rnd = new Random();
        id = rnd.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Pateint " + name + ", id: " + id;
    }

}
