package com.richard.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl") //faz com que use o auditAwareImpl
@OpenAPIDefinition(
	info = @Info(
		title = "Accounts microservice REST API Documentation",
		description = "EazyBank Accounts microservices REST API Documentation",
		version = "v1",
		contact = @Contact(
				name = "Richard",
				email = "rifernun@gmail.com"
		),
		license = @License(
				name = "Apache 2.0",
				url = "http://www.apache.org/licenses/LICENSE-2.0"
		)
	),
		externalDocs = @ExternalDocumentation(
				description = "Accounts microservice Documentation",
				url = "url.com"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}
}
