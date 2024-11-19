package com.project.registration;

public class RegistrationDAOImpl implements RegistrationDAO {

	@Override
	public void addCustomer(Registration rto) {
		HibernateTemplate.save(rto);
		
	}

	@Override
	public void updateCustomer(Registration rto) {
		// TODO Auto-generated method stub
		HibernateTemplate.update(rto);
		
	}

	@Override
	public void deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		HibernateTemplate.delete(Registration.class, cid);
		
	}

	@Override
	public Registration getCustomerByCid(int cid) {
		// TODO Auto-generated method stub
		Registration reg=(Registration) HibernateTemplate.load(Registration.class, cid);
		return reg;
	}
	

}
