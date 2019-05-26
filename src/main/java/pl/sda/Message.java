package pl.sda;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Message {

    @Value("#{'Ala ma kotkę'}")
    private String text;

    @Getter @Setter
    @Value("#{student1.getIndexN}")
    private boolean isExamPass;
}
