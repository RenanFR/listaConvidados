package listaconvidados;

import javax.sql.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication//Indica que é uma classe de configuração/inicialização
//Base p/ busca dos Beans	
public class ConfigAplicacao {
	public static void main(String[] args) {
		SpringApplication.run(ConfigAplicacao.class, args);
		//Inicializa a aplicação por meio do main com os argumentos/classe configuração
	}
	@Bean//Cria um objeto gerenciado pelo framework
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/boot");
		dataSource.setUsername("root"); 
		dataSource.setPassword("root");
		return dataSource;
	}
}
