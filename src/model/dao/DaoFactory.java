package model.dao;

import db.DB;
import model.impl.DepartmentDaoJDBC;
import model.impl.SellerDaoJDBC;

// macete pra nao precisar expor a implementação

public class DaoFactory {
    
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());	
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());	
	}
}
