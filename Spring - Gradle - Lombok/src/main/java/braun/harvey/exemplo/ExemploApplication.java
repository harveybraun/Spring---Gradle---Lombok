package braun.harvey.exemplo;

import model.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploApplication.class, args);

		System.out.println("Pessoa\n");

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Harvey Braun");
		
		System.out.println(pessoa);
	}

}

