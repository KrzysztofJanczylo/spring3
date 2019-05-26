package pl.sda.nowy;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Setter
@Getter
public class Author {

    private String name = "Marek";
    private String lastname = "Kochanowski";
}
