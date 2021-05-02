package interfaces;

public class Main {

	public static void main(String[] args) {
		
	//1.seçenek	CustomerManager customerManager = new CustomerManager();
	//1.seçenek	customerManager.customerDal = new OracleCustomerDal();
	//1.seçenek	customerManager.add();

		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
	}

}
//interface'ler implementation kabul ediliyor inheritance kabul edilmiyor
// bir class birden fazla interface kullanılabiliyor.
//interface'lerde referans tutucudur.