package ajw.xtext.tests

import entities.Branch
import entities.EntitiesAccessor
import entities.Tree
import java.sql.Connection
import java.sql.DriverManager
import java.util.logging.Logger
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence
import junit.framework.TestCase

abstract class BaseAccessorTest extends TestCase {

    private EntityManagerFactory emFactory; 

    protected EntityManager em;

    private Connection connection;
    
    protected EntitiesAccessor accessor;
    
	override protected setUp() throws Exception {
		super.setUp()
		try {
            Class::forName("org.hsqldb.jdbcDriver");
            connection =DriverManager::getConnection("jdbc:hsqldb:mem:unit-testing-jpa", "sa", "");
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("Exception during HSQL database startup.");
        }
        try {
            emFactory = Persistence::createEntityManagerFactory("testPU");
            em = emFactory.createEntityManager();
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("Exception during JPA EntityManager instantiation.");
        }
        
        accessor = new EntitiesAccessor(em);
	}
	
	override protected tearDown() throws Exception {
		super.tearDown()
		
        if (em != null) {
            em.close();
        }
        if (emFactory != null) {
            emFactory.close();
        }
       
        try {
            connection.createStatement().execute("SHUTDOWN");
        } catch (Exception ex) {}
	}
	
	
	
	def protected EntitiesAccessor getAccessor () {
		return this.accessor;
	}
	
}
