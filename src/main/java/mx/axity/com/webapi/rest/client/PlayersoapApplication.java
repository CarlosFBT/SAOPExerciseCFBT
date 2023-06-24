package mx.axity.com.webapi.rest.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value= {"dnd.axity"})
public class PlayersoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayersoapApplication.class, args);
	}

}
