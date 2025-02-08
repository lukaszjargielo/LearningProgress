package pl.futurejava.Spring_jdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringJdbcApplication.class, args);
	}

	@Bean
	public CommandLineRunner runApp(JdbcTemplate template) {
		return (args -> {
			System.out.println("Application works!");
			String sqlInsert = "SELECT id, login, display_name, year_of_birth from user";

			List<Map<String, Object>> rows = template.queryForList(sqlInsert);

			for(var row : rows) {
				System.out.println(row.get("id"));
				System.out.println(row.get("login"));
				System.out.println(row.get("display_name"));
				System.out.println(row.get("year_of_birth"));
				System.out.println();
			}
		});
	}
}
