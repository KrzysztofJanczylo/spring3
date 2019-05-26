package pl.sda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zad8 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("my_beans.xml");

//        Student student1 = (Student) context.getBean("student1");
//        System.out.println(student1);

        Message mes1 = (Message) context.getBean("mes1");
        System.out.println(mes1.getText());

        System.out.println(mes1.isExamPass());


    }
}
