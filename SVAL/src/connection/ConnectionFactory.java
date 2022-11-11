package connection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author kevin
 */
public class ConnectionFactory {
    
    /**
     * 
     * @return 
     */
    public static EntityManagerFactory getemf() {
        return Persistence.createEntityManagerFactory("LivrariaPU");
    }

}
