package ramon.entrega.spring.services;

import ramon.entrega.spring.dao.MySqlDAO;
import ramon.entrega.spring.model.Triangulo;

public class Service {

	private static Service instance = null;
	private MySqlDAO dao;
	 
	private Service() {
		dao = new MySqlDAO();
	}
	
    public static Service getInstance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }
    
    public boolean insertarTriangulo(Triangulo t) {
    	return dao.insertarTriangulo(t);   	
    }
    
	
}
