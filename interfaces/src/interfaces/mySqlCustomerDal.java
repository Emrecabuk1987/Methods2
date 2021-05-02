package interfaces;

public class mySqlCustomerDal implements ICustomerDal,IRepository {

	@Override
	public void Add() {
		System.out.println("My sql eklendi");
		
	}

}
