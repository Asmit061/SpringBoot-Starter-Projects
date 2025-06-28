package com.example.h2_database;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

@SpringBootApplication
@Log
public class H2DatabaseApplication implements CommandLineRunner {

	private final DataSource datasource;

	public H2DatabaseApplication(DataSource datasource) {
		this.datasource = datasource;
	}
	public static void main(String[] args) {
		SpringApplication.run(H2DatabaseApplication.class, args);
	}

	@Override
	public void run(final String ... args){
		log.info("datasource = " + datasource.toString());
		final JdbcTemplate jdbctemplate = new JdbcTemplate(datasource);
		jdbctemplate.execute("select 1");
	}
}
