package org.fasttrackit.webappbackend;

import org.fasttrackit.webappbackend.model.Transaction;
import org.fasttrackit.webappbackend.model.TransactionType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebappBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(WebappBackendApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Transaction transaction = Transaction.builder()
				.id("123AAA")
				.product("TABLE")
				.type(TransactionType.SELL)
				.amount(200)
				.build();
		System.out.println(transaction);
	}
}


