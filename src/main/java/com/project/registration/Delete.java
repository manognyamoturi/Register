package com.project.registration;

public class Delete {

	public static void main(String[] args) {
		RegistrationDAO custDAO=DAOFactory.getRegisterDAO();
		
		custDAO.deleteCustomer(2);
	}
}