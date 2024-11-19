package com.project.registration;

public interface RegistrationDAO {
	public void addCustomer(Registration rto); 
	public void updateCustomer(Registration rto); 
	public void deleteCustomer(int cid); 
	public Registration getCustomerByCid(int cid);

}
