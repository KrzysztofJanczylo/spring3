package pl.sda;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.nowy.Book;

public class Zad9 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("my_beans.xml");

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        Book book = (Book) context.getBean("book");
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor().getLastname());

    }

}
