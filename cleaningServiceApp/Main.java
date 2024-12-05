package cleaningServiceApp;

import cleaningServiceApp.config.Database;
import cleaningServiceApp.view.TerminalView;
import cleaningServiceApp.view.TerminalViewImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "cleaningServiceApp")
public class Main {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        TerminalView terminalView = context.getBean(TerminalViewImpl.class);
        terminalView.handleInput();
    }

    @Bean
    Database database (){
        Database database = new Database("pemesanan_cleaning_service", "root","", "localhost","3306");
        database.setup();
        return database;
    }
}
