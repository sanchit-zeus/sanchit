package pakage1;

public class TestProduct {

	public static void main(String[] args) {
		Product mobile=new Product();
		mobile.setId(01);
		mobile.setName("Nokia");
		mobile.setPrice(2500);
		mobile.setQuantity(56);
		mobile.print();
		
//		System.out.println("ID: "+mobile.getId());
//		System.out.println("Name: "+mobile.getName());
//		System.out.println("Price: "+mobile.getPrice());
//		System.out.println("Availability: "+mobile.getQuantity());
//		
		System.out.println();
		
		Product laptop=new Product();
		laptop.setId(02);
		laptop.setName("H.P");
		laptop.setPrice(50000);
		laptop.setQuantity(78);
		laptop.print();
		
//		System.out.println("ID: "+laptop.getId());
//		System.out.println("Name: "+laptop.getName());
//		System.out.println("Price: "+laptop.getPrice());
//		System.out.println("Availability: "+laptop.getQuantity());


	}

}
