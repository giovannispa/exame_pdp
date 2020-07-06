package connection;

import interfaces.CategoriaDAO;
import interfaces.FornecedorDAO;
import interfaces.ProdutoDAO;


public abstract class DAOFactory {
    public static final int SQLITE = 1;
    public static final int MYSQL = 2;
    public static final int MONGODB = 3;
    
    public abstract CategoriaDAO getCategoriaDAO();
    public abstract ProdutoDAO getProdutoDAO();
    public abstract FornecedorDAO getFornecedorDAO();
        
    public static DAOFactory getDAOFactory(int driver){
	
	switch(driver){
            case SQLITE:
                return new SqliteFactory();
            case MYSQL:
                return new MysqlFactory();
            //case MONGODB:
                //return new MongoDbFacoty();
            default:
                return null;
	}
    }
}
