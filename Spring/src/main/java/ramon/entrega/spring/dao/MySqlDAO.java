package ramon.entrega.spring.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import ramon.entrega.spring.configuration.SpringConfiguration;
import ramon.entrega.spring.model.Triangulo;

public class MySqlDAO {

	public boolean insertarTriangulo(Triangulo t) {
    	AbstractApplicationContext ctx = null;
    	try {
    		ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
    		DataSource ds = ctx.getBean("dataSource", DataSource.class);
    		JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
    		String query = "INSERT INTO triangulos (base, altura, area, perimetro) ";
    		query += "VALUES (?,?,?,?)";
    		jdbcTemplate.update(query, t.getBase(), t.getAltura(), t.getArea(), t.getPerimetro());
    		return true;
    		
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if(ctx!=null)
				ctx.close();
		}
    	
    	
    }
	
}
