package ramon.entrega.spring.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfiguration {

	private static String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/spring";
	private static String DB_NAME = "spring";
	private static String USUARIO = "root";
	private static String PASSWORD = "";
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(DRIVER);
		ds.setUrl(URL);
		ds.setUsername(USUARIO);
		ds.setPassword(PASSWORD);
		return ds;
	}
	
}
