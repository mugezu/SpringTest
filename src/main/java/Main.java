import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;

/**
 * Created by user on 09.10.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        AbstractApplicationContext context = new FileSystemXmlApplicationContext("C://Users//user//IdeaProjects//TestSpring//config.xml");
     //  AbstractApplicationContext context = new ClassPathXmlApplicationContext(".//config.xml");

        A ww= (A)context.getBean("A");
        ww.Hello();
        ww.KK();
    }
}
