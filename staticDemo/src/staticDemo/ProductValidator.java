package staticDemo;

public class ProductValidator {

	static {
		System.out.println("statik constructor");
	}
	public ProductValidator() {
		System.out.println("constructor");
	}
	
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}
	public void bise() {
		
	}
	
	public static class BaskaBirClass {
		public static void Sil() {
			
		}
	}
//bir metodu static yaptığımızda klass ismiyle direk çağırılır			
//javada ana classlar static oluşamıyor  ancak ; 
//içersinde oluşturulan classlar static oluşabiliyor buna inner class denir.
	
	
}
