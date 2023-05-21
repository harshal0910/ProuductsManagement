package utils;

import java.time.LocalDate;
import java.util.Set;

import core.Product;
import core.category;
import custom_exception.ProductHandlingException;

public class ProductUtils {

	public static void checkForDuplicate(int pid,Set<Product>productSet) throws ProductHandlingException {
		
		Product  newProduct=new Product(pid);
		if(productSet.contains(newProduct)) {
			throw new ProductHandlingException("dupp id...");
		}
		System.out.println("no dupp id");
	}
	
	
	public static category parseAndValidateCategory(String cat) throws Exception{
		return category.valueOf(cat.toUpperCase());
	}
	
	
	public static LocalDate parseAndValidateDate(String date) throws Exception {
		LocalDate validDate=LocalDate.parse(date);
		if(LocalDate.now().isBefore(validDate))
			return validDate;
		return null;
	}
	
	
	public static Product validateAllInputs(int pid,String name,String desc,int quantity, double price,String cat,String date,Set<Product>productSet) throws Exception {
		
		checkForDuplicate(pid,productSet);
		category validCategory=parseAndValidateCategory(cat);
		LocalDate validDate=parseAndValidateDate(date);
		System.out.println("ss");
		return new Product(pid,name,desc,quantity,price,validCategory,validDate);
	}
}
