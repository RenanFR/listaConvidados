package listaconvidados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//Indica que é uma classe de configuração/inicialização
//Base p/ busca dos Beans	
public class ConfigAplicacao {
	public static void main(String[] args) {
		SpringApplication.run(ConfigAplicacao.class, args);
		//Inicializa a aplicação por meio do main com os argumentos/classe configuração
	}
}
