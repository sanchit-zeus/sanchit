package pakage1;


public class DemoA {

	public static void main(String[] args) {
		String test = "HeLLo";
		String x=test.toUpperCase();
		System.out.println("1. "+x);
		
		System.out.println("2. "+test.toLowerCase());
		
		boolean result= test.contains("el");
		System.out.println("3. "+result);
//		byte e [] = test.getBytes();
//		char ee[] = test.toCharArray();
		int index = test.indexOf("l");
		System.out.println("4. "+index);
		
		index = test.lastIndexOf("l");
		System.out.println("5. "+index);
		
		result = test.isEmpty();
		System.out.println("6. "+result);
		
		int len = test.length();
		System.out.println("7. "+len);
		
		test = test.replace('l', 'w');
		System.out.println("8. "+test);
		
		String arr [] = "A-10, Roop Nagar, Delhi-7".split(",");
		System.out.println("9. "+arr[0]);
		
		String subString = test.substring(2,4); // index, position
		test = "    Hello     How    ".trim();
		System.out.println("10. "+test);
		
		
		result = test.endsWith("lo");
		System.out.println("11. "+test);
		
		result= test.startsWith("He");
		System.out.println("12. "+test);
		
		test = test+"Hi"+"How";
		System.out.println("13. "+test);
		//test.concat("Hi").concat("How");
		
		char t = test.charAt(0); //test[i]
		String temp = String.valueOf(t);
		System.out.println("14. "+temp);
		
		System.out.println("15. "+"AMIT".compareToIgnoreCase("Amit"));
		
		String name = new String("Amit");  // 2 or 1
		String name2 = "Amit".intern();  // 1 or 0
		if(name.equals(name2)) {
			System.out.println("16. Value are same");
		}
		else {
			System.out.println("16. Value are not same");
		}
		//name = name +" Srivastava ";
		if(name==name2) {
			System.out.println("17. Same Ref");
		}
		else {
			System.out.println("17. Not Same Ref");
		}

	}

}
