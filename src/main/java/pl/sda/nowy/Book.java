package pl.sda.nowy;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Setter
@Getter
public class Book {

    private String title= "TTTTyyytttllleee";

    @Autowired
    private Author author;

}
