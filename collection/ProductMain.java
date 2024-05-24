import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService p = new ProductService();
		int i;
		List<Product1> list = new ArrayList<Product1>();
		do {
			int x = 0;
			System.out.println("===============================================================");
			System.out.println("1. add product");
			System.out.println("2. search product by id");
			System.out.println("3. find product price by id");
			System.out.println("4. retrive all");
			System.out.println("5. delete product detail");
			System.out.println("6. update");
			System.out.println("enter your choice");
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("----------Add Product---------");
				list.add(p.storeProduct(list));
				break;
			case 2:
				System.out.println("----------Search product by Id---------");
				p.searchProductById(list);
				break;
			case 3:
				System.out.println("----------Find price by product Id---------");
				p.findProductPriceById(list);
				break;
			case 4:
				System.out.println("----------Retriving All Products---------");
				p.retriveAll(list);
				break;
			case 5:
				System.out.println("----------Delete Product by product Id---------");
				p.deleteProductById(list);
				break;
			case 6:
				System.out.println("----------update price by product Id---------");
				p.updateProductPriceById(list);
				break;

			default:
				System.out.println("wrong input");
				break;
			}

		} while (i > 0);
	}
}
