package model.dao;

import model.impl.SellerDaoJDBC;

// macete pra nao precisar expor a implementação

public class DaoFactory {
    
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();	
	}
}
