package com.springBoot.soheil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@EnableAutoConfiguration(
		exclude = {
				HibernateJpaAutoConfiguration.class
		})
public class SoheilApplication implements CommandLineRunner {

	@Autowired
	ProductDao productDao;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {

		SpringApplication.run(SoheilApplication.class, args);
		/*
		ConfigurableApplicationContext context =
		Product product = context.getBean(Product.class);
		product.setName("Mehran");
		product.setLastName("MEHRNIA");
		product.setId(1598753);
		System.out.println(product.toString());
		 */
	}

	@Override
	public void run(String... args) throws Exception {
		productDao.persist();
	}
}
