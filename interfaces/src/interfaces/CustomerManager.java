package interfaces;

public class CustomerManager {

//1.seçenek	ICustomerDal customerDal;
	private ICustomerDal customerDal;
	
	public CustomerManager (ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	public void add() {
		//iş kodları yazılır
		//örneğin müşteri ismi hatali değil ise
		//yazdığımız kurallar geçerli ise git oracle veri tabanına ekle gibi.
		
		customerDal.Add();
	}
}
