package pl.sda;

import lombok.*;
import pl.sda.Person;

@Getter @Setter
public class Student extends Person {

    private Long indexNumber;

    @Override
    public String toString() {
        return  "STUDENT [  " + getName() +
                " " + getLastname() +
                " " + indexNumber + "  ]"
                ;
    }
}
