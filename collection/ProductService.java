import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProductService {
	Scanner sc = new Scanner(System.in);
	int pid;

	Product1 storeProduct(List l) {
		System.out.println("enter id");
		int id = sc.nextInt();
		int id1 = 0;
		do {
			Iterator<Product1> itr = l.iterator();
			while (itr.hasNext()) {
				Product1 p1 = itr.next();
				id1=p1.getPid();
			if(id1==id)
			{
				System.out.println("enter unique id");
				id=sc.nextInt();
			}
			}
		} while (id==id1);
		
		System.out.println("enter Productname");
		String name = sc.next();
		System.out.println("enter price");
		double price = 0;
		do {
			price = sc.nextDouble();
			if (price > 500) {
				break;
			} else {
				System.out.println("enter price greater than 500");
			}

		} while (price < 500);
		Product1 p = new Product1(id, name, price);
		return p;
	}

	void searchProductById(List l) {
		System.out.println("enter product id to search");
		pid = sc.nextInt();
		Iterator<Product1> itr = l.iterator();
		while (itr.hasNext()) {
			Product1 p1 = itr.next();
			if (p1.getPid() == pid) {
				System.out.println("id: " + p1.getPid() + " name: " + p1.getPname() + " price: " + p1.getPrice());
				break;
			}

		}

	}

	void findProductPriceById(List l) {
		System.out.println("enter product id to find price ");
		pid = sc.nextInt();
		Iterator<Product1> itr = l.iterator();
		while (itr.hasNext()) {
			Product1 p1 = itr.next();
			if (p1.getPid() == pid) {
				System.out.println(" price=" + p1.getPrice());
				break;
			}

		}
	}

	void retriveAll(List list) {
		Iterator<Product1> itr = list.iterator();
		while (itr.hasNext()) {// hasNext();
			System.out.println(itr.next());// next();

		}
	}

	void deleteProductById(List l) {
		System.out.println("enter product id delete product");
		pid = sc.nextInt();
		Iterator<Product1> itr = l.iterator();
		while (itr.hasNext()) {
			Product1 p1 = itr.next();
			if (p1.getPid() == pid) {
				itr.remove();
				System.out.println("product deleted");
				break;
			}

		}
	}

	void updateProductPriceById(List l) {
		System.out.println("enter product id ");
		pid = sc.nextInt();
		Iterator<Product1> itr = l.iterator();
		System.out.println("enter price");
		double price = 0;
		while (itr.hasNext()) {
			Product1 p1 = itr.next();
			if (p1.getPid() == pid) {

				do {
					price = sc.nextDouble();
					if (price > p1.getPrice()) {
						p1.setPrice(price);

						System.out.println("price updated");
						break;
					} else {
						System.out.println("enter price greater than "+p1.getPrice());	
					}

				} while (price < p1.getPrice());
			}

			break;
		}
	}
}
