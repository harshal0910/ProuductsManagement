package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

import core.Product;

public class IOUtitls {
	
	@SuppressWarnings("unchecked")
	public static HashSet<Product> restoreData(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		HashSet<Product>productSet=null;
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName))){
			productSet=(HashSet<Product>)in.readObject();
			return productSet;
		}
		catch(Exception e) {
			return productSet;
		}
	}
	
	
	public static void storeData(String fileName,Set<Product>productSet) throws FileNotFoundException, IOException {
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName))){
			out.writeObject(productSet);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
