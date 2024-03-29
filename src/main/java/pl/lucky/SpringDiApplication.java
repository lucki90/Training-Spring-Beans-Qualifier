package pl.lucky;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.lucky.beans.printers.MessagePrinter;

@Configuration
@ComponentScan
public class SpringDiApplication {

    public static void main(String[] args) {
//        /**PODEJSCIE KORZYSTAJĄCE Z XML KONFIGURACYJNYCH - BEANS-CONFIG.XML ZAMIAST ADNOTACJI NP. @Configuration, @Bean**/
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("pl.lucky.beans-config.xml");
//        /**Podejscie z adnotacjami i z plikiem konfiguracyjnym**/
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplictionConfig.class);
//        /**Podejscie z adnotacjami (Nie mamy definicji tworzonych beanów iwec mozemy pozbyć się ApplicationConfig)**/
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringDiApplication.class);
        MessagePrinter printer = ctx.getBean(MessagePrinter.class);
        printer.print();
        ctx.close();
    }
}
