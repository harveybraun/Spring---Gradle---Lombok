package braun.harvey.exemplo;

import model.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Descreve a Classe ExemploApplication
 *
 * @author Harvey Braun
 * @version 1.0
 * @since 18/04/2020 - 14:00
 */
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

