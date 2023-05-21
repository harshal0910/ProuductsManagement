package tester;

import static utils.ProductUtils.validateAllInputs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import static utils.IOUtitls.*;

import core.Product;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {

			 //System.out.println("Enter file name:");
			 //Set<Product>productSet=restoreData(sc.next());
			 Set<Product> productSet = new HashSet<>();
			boolean exit = false;

			while (!exit) {
				try {
					System.out.println("1.Enter new product\n2.Display details\n3.Delete product by name\n4.sort\n5.Restore data from file\n6.store data in file");
					System.out.println("Enter new choice...");
					switch (sc.nextInt()) {

					case 1:
						System.out.println("Enter product details");
						Product newProduct = validateAllInputs(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(),
								sc.nextDouble(), sc.next(), sc.next(), productSet);
						productSet.add(newProduct);
						System.out.println("new product added successfully...");
						break;
					case 2:
						System.out.println("Products details");
						for (Product p : productSet) {
							System.out.println(p);
						}
						break;

					case 3:
						System.out.println("Enter name");
						Iterator<Product> itr = productSet.iterator();
						while (itr.hasNext()) {
							newProduct = (Product) itr.next();
							if (newProduct.getName().equals( sc.next())) {
								itr.remove();
							}
						}
						break;
						
					case 4:
						TreeSet<Product>newSet=new TreeSet<>(productSet);
						for(Product p:newSet) {
							System.out.println(p);
						}
						break;
					case 5:
						//System.out.println("Enter file name");
						productSet=restoreData("product_details");
						break;
						
					case 6:
						//System.out.println("Enter fileName");
						storeData("product_details",productSet);
						exit=true;
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
