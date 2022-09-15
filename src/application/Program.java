package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TESTE 1:  seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("=== TESTE 2:  seller findByDepartment ===");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
        System.out.println("=== TESTE 3:  seller findByAll ===");
		
		list = sellerDao.findall();
		for(Seller obj : list) {
			System.out.println(obj);
		}
        
		System.out.println("=== TESTE 4:  seller findByAll ===");
		Seller newSeller = new Seller(null, "Gred", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = " + newSeller.getId());
		
		System.out.println("=== TESTE 5:  seller Update ===");
		seller = sellerDao.findById(1);
		seller.setName("Marta Waine");
		seller.setEmail("waine@gmail.com");
		seller.setBirthDate(new Date());
		seller.setBaseSalary(2000.0);
		sellerDao.update(seller);
		System.out.println("Update completed");
	}
}